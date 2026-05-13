package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCCertificateDownload;
import com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCCertificateModel.PUCCCertificateModel;
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
public final class sk4 extends zq7 {
    public final uk4 d;
    public final oy3 e;
    public final oy3 f;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ String b;
        public final /* synthetic */ sk4 c;
        public final /* synthetic */ PUCCCertificateDownload d;

        public a(Ref.ObjectRef objectRef, String str, sk4 sk4Var, PUCCCertificateDownload pUCCCertificateDownload) {
            this.a = objectRef;
            this.b = str;
            this.c = sk4Var;
            this.d = pUCCCertificateDownload;
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
                        SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                        ze1.a aVar = ze1.a;
                        String str = (String) this.a.element;
                        Intrinsics.checkNotNull(securityModle);
                        String data = securityModle.getData();
                        Intrinsics.checkNotNull(data);
                        Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) PUCCCertificateModel.class);
                        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                        PUCCCertificateModel pUCCCertificateModel = (PUCCCertificateModel) objFromJson;
                        String statusDescr = pUCCCertificateModel.getStatusDescr();
                        Boolean boolValueOf = statusDescr != null ? Boolean.valueOf(statusDescr.equals("Success")) : null;
                        Intrinsics.checkNotNull(boolValueOf);
                        if (!boolValueOf.booleanValue()) {
                            if (gd1.a.m(pUCCCertificateModel.getStatusDescr())) {
                                this.c.i().k("Error");
                                return;
                            } else {
                                this.c.i().k(pUCCCertificateModel.getStatusDescr().toString());
                                return;
                            }
                        }
                        byte[] bArrDecode = Base64.getDecoder().decode(pUCCCertificateModel.getPdfData());
                        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                        String str2 = this.b + '_' + System.currentTimeMillis();
                        if (this.c.k(bArrDecode, str2, this.d)) {
                            this.c.h().k(str2);
                            return;
                        } else {
                            this.c.h().k("Error");
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

    public sk4(uk4 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
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
    public final void j(String regNo, String chasisNo, PUCCCertificateDownload pucc) {
        Intrinsics.checkNotNullParameter(regNo, "regNo");
        Intrinsics.checkNotNullParameter(chasisNo, "chasisNo");
        Intrinsics.checkNotNullParameter(pucc, "pucc");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.p0(regNo, chasisNo).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(objectRef, regNo, this, pucc));
    }

    public final boolean k(byte[] bArr, String str, PUCCCertificateDownload pUCCCertificateDownload) throws Throwable {
        try {
            System.currentTimeMillis();
            File filesDir = pUCCCertificateDownload.getFilesDir();
            File file = new File(filesDir, "fitness_pdf_file.pdf");
            Log.e("filepath", filesDir.getPath().toString());
            if (file.exists()) {
                file.delete();
            }
            l(bArr, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
