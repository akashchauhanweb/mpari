package com.zepto;

import android.os.Environment;
import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.FancyServices.FancyFeesModel.FancyFeesModel;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.lc5;
import com.zepto.ze1;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class g82 extends zq7 {
    public final f82 d;
    public final oy3 e;
    public final oy3 f;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ String b;
        public final /* synthetic */ g82 c;

        public a(Ref.ObjectRef objectRef, String str, g82 g82Var) {
            this.a = objectRef;
            this.b = str;
            this.c = g82Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.c.i().k(th != null ? th.toString() : null);
            Log.e("Error3", "Error " + th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response != null) {
                try {
                    if (response.code() == 200) {
                        SecurityModle securityModle = (SecurityModle) response.body();
                        ze1.a aVar = ze1.a;
                        String str = (String) this.a.element;
                        Intrinsics.checkNotNull(securityModle);
                        String data = securityModle.getData();
                        Intrinsics.checkNotNull(data);
                        Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) FancyFeesModel.class);
                        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                        FancyFeesModel fancyFeesModel = (FancyFeesModel) objFromJson;
                        Log.e("fancyFeeModel", fancyFeesModel.toString());
                        String status = fancyFeesModel.getStatus();
                        Boolean boolValueOf = status != null ? Boolean.valueOf(status.equals("SUCCESS")) : null;
                        Intrinsics.checkNotNull(boolValueOf);
                        if (!boolValueOf.booleanValue()) {
                            if (gd1.a.m(fancyFeesModel.getStatus())) {
                                this.c.i().k("Error");
                                return;
                            } else {
                                this.c.i().k(fancyFeesModel.getMessage().toString());
                                return;
                            }
                        }
                        byte[] bArrDecode = Base64.getDecoder().decode(fancyFeesModel.getData());
                        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                        String str2 = this.b + '_' + System.currentTimeMillis();
                        if (this.c.k(bArrDecode, str2)) {
                            this.c.h().k(str2);
                            return;
                        } else {
                            this.c.h().k("");
                            return;
                        }
                    }
                } catch (Exception e) {
                    this.c.i().k("Error");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error ");
                    e.printStackTrace();
                    sb.append(Unit.INSTANCE);
                    Log.e("Error2", sb.toString());
                    return;
                }
            }
            this.c.i().k("Error");
        }
    }

    public g82(f82 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k(byte[] bArr, String str) throws Throwable {
        try {
            System.currentTimeMillis();
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + '/' + (str + ".pdf"));
            if (file.exists()) {
                file.delete();
            }
            l(bArr, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private final void l(byte[] bArr, File file) throws Throwable {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bufferedOutputStream2.write(bArr);
                Log.e("checkFancy", toString());
                try {
                    bufferedOutputStream2.flush();
                    bufferedOutputStream2.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final oy3 h() {
        return this.e;
    }

    public final oy3 i() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void j(String stateCode, String receipt_no) {
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(receipt_no, "receipt_no");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.f(receipt_no, stateCode).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(objectRef, receipt_no, this));
    }
}
