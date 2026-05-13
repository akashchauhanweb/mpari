package retrofit2;

import com.zepto.a80;
import com.zepto.cg6;
import com.zepto.da0;
import com.zepto.ga0;
import com.zepto.kc5;
import com.zepto.ld5;
import com.zepto.ls3;
import com.zepto.nd5;
import com.zepto.pf2;
import com.zepto.u70;
import com.zepto.zf4;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final da0.a callFactory;
    private volatile boolean canceled;
    private Throwable creationFailure;
    private boolean executed;
    private da0 rawCall;
    private final RequestFactory requestFactory;
    private final Converter<nd5, T> responseConverter;

    public static final class ExceptionCatchingResponseBody extends nd5 {
        private final nd5 delegate;
        private final a80 delegateSource;
        IOException thrownException;

        public ExceptionCatchingResponseBody(nd5 nd5Var) {
            this.delegate = nd5Var;
            this.delegateSource = zf4.d(new pf2(nd5Var.source()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // com.zepto.pf2, com.zepto.y46
                public long read(u70 u70Var, long j) throws IOException {
                    try {
                        return super.read(u70Var, j);
                    } catch (IOException e) {
                        ExceptionCatchingResponseBody.this.thrownException = e;
                        throw e;
                    }
                }
            });
        }

        @Override // com.zepto.nd5, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // com.zepto.nd5
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // com.zepto.nd5
        public ls3 contentType() {
            return this.delegate.contentType();
        }

        @Override // com.zepto.nd5
        public a80 source() {
            return this.delegateSource;
        }

        public void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public static final class NoContentResponseBody extends nd5 {
        private final long contentLength;
        private final ls3 contentType;

        public NoContentResponseBody(ls3 ls3Var, long j) {
            this.contentType = ls3Var;
            this.contentLength = j;
        }

        @Override // com.zepto.nd5
        public long contentLength() {
            return this.contentLength;
        }

        @Override // com.zepto.nd5
        public ls3 contentType() {
            return this.contentType;
        }

        @Override // com.zepto.nd5
        public a80 source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(RequestFactory requestFactory, Object[] objArr, da0.a aVar, Converter<nd5, T> converter) {
        this.requestFactory = requestFactory;
        this.args = objArr;
        this.callFactory = aVar;
        this.responseConverter = converter;
    }

    private da0 createRawCall() throws IOException {
        da0 da0VarA = this.callFactory.a(this.requestFactory.create(this.args));
        if (da0VarA != null) {
            return da0VarA;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private da0 getRawCall() throws IOException {
        da0 da0Var = this.rawCall;
        if (da0Var != null) {
            return da0Var;
        }
        Throwable th = this.creationFailure;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            da0 da0VarCreateRawCall = createRawCall();
            this.rawCall = da0VarCreateRawCall;
            return da0VarCreateRawCall;
        } catch (IOException | Error | RuntimeException e) {
            Utils.throwIfFatal(e);
            this.creationFailure = e;
            throw e;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        da0 da0Var;
        this.canceled = true;
        synchronized (this) {
            da0Var = this.rawCall;
        }
        if (da0Var != null) {
            da0Var.cancel();
        }
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        da0 da0Var;
        Throwable th;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            try {
                if (this.executed) {
                    throw new IllegalStateException("Already executed.");
                }
                this.executed = true;
                da0Var = this.rawCall;
                th = this.creationFailure;
                if (da0Var == null && th == null) {
                    try {
                        da0 da0VarCreateRawCall = createRawCall();
                        this.rawCall = da0VarCreateRawCall;
                        da0Var = da0VarCreateRawCall;
                    } catch (Throwable th2) {
                        th = th2;
                        Utils.throwIfFatal(th);
                        this.creationFailure = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            da0Var.cancel();
        }
        da0Var.n(new ga0() { // from class: retrofit2.OkHttpCall.1
            private void callFailure(Throwable th4) {
                try {
                    callback.onFailure(OkHttpCall.this, th4);
                } catch (Throwable th5) {
                    Utils.throwIfFatal(th5);
                    th5.printStackTrace();
                }
            }

            @Override // com.zepto.ga0
            public void onFailure(da0 da0Var2, IOException iOException) {
                callFailure(iOException);
            }

            @Override // com.zepto.ga0
            public void onResponse(da0 da0Var2, ld5 ld5Var) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(ld5Var));
                    } catch (Throwable th4) {
                        Utils.throwIfFatal(th4);
                        th4.printStackTrace();
                    }
                } catch (Throwable th5) {
                    Utils.throwIfFatal(th5);
                    callFailure(th5);
                }
            }
        });
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        da0 rawCall;
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            rawCall = getRawCall();
        }
        if (this.canceled) {
            rawCall.cancel();
        }
        return parseResponse(rawCall.execute());
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            try {
                da0 da0Var = this.rawCall;
                if (da0Var == null || !da0Var.isCanceled()) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    public Response<T> parseResponse(ld5 ld5Var) throws IOException {
        nd5 nd5VarD = ld5Var.d();
        ld5 ld5VarC = ld5Var.m0().b(new NoContentResponseBody(nd5VarD.contentType(), nd5VarD.contentLength())).c();
        int iN = ld5VarC.n();
        if (iN < 200 || iN >= 300) {
            try {
                return Response.error(Utils.buffer(nd5VarD), ld5VarC);
            } finally {
                nd5VarD.close();
            }
        }
        if (iN == 204 || iN == 205) {
            nd5VarD.close();
            return Response.success((Object) null, ld5VarC);
        }
        ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(nd5VarD);
        try {
            return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), ld5VarC);
        } catch (RuntimeException e) {
            exceptionCatchingResponseBody.throwIfCaught();
            throw e;
        }
    }

    @Override // retrofit2.Call
    public synchronized kc5 request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return getRawCall().request();
    }

    @Override // retrofit2.Call
    public synchronized cg6 timeout() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create call.", e);
        }
        return getRawCall().timeout();
    }

    @Override // retrofit2.Call
    public OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.requestFactory, this.args, this.callFactory, this.responseConverter);
    }
}
