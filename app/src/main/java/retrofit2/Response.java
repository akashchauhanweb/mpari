package retrofit2;

import com.zepto.kc5;
import com.zepto.kx4;
import com.zepto.ld5;
import com.zepto.nd5;
import com.zepto.pl2;
import java.util.Objects;
import retrofit2.OkHttpCall;

/* JADX INFO: loaded from: classes3.dex */
public final class Response<T> {
    private final T body;
    private final nd5 errorBody;
    private final ld5 rawResponse;

    private Response(ld5 ld5Var, T t, nd5 nd5Var) {
        this.rawResponse = ld5Var;
        this.body = t;
        this.errorBody = nd5Var;
    }

    public static <T> Response<T> error(int i, nd5 nd5Var) {
        Objects.requireNonNull(nd5Var, "body == null");
        if (i >= 400) {
            return error(nd5Var, new ld5.a().b(new OkHttpCall.NoContentResponseBody(nd5Var.contentType(), nd5Var.contentLength())).g(i).m("Response.error()").p(kx4.HTTP_1_1).r(new kc5.a().j("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 400: " + i);
    }

    public static <T> Response<T> success(T t) {
        return success(t, new ld5.a().g(200).m("OK").p(kx4.HTTP_1_1).r(new kc5.a().j("http://localhost/").b()).c());
    }

    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.n();
    }

    public nd5 errorBody() {
        return this.errorBody;
    }

    public pl2 headers() {
        return this.rawResponse.U();
    }

    public boolean isSuccessful() {
        return this.rawResponse.d0();
    }

    public String message() {
        return this.rawResponse.e0();
    }

    public ld5 raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    public static <T> Response<T> success(int i, T t) {
        if (i >= 200 && i < 300) {
            return success(t, new ld5.a().g(i).m("Response.success()").p(kx4.HTTP_1_1).r(new kc5.a().j("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i);
    }

    public static <T> Response<T> error(nd5 nd5Var, ld5 ld5Var) {
        Objects.requireNonNull(nd5Var, "body == null");
        Objects.requireNonNull(ld5Var, "rawResponse == null");
        if (!ld5Var.d0()) {
            return new Response<>(ld5Var, null, nd5Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> Response<T> success(T t, pl2 pl2Var) {
        Objects.requireNonNull(pl2Var, "headers == null");
        return success(t, new ld5.a().g(200).m("OK").p(kx4.HTTP_1_1).k(pl2Var).r(new kc5.a().j("http://localhost/").b()).c());
    }

    public static <T> Response<T> success(T t, ld5 ld5Var) {
        Objects.requireNonNull(ld5Var, "rawResponse == null");
        if (ld5Var.d0()) {
            return new Response<>(ld5Var, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
}
