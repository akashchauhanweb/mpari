package com.zepto;

import android.util.Log;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DFCModel.ApiMessage;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DFCModel.DFCModel;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DuplicateFitnessCertificateDownload;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.lc5;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class n51 extends zq7 {
    public final m51 d;
    public final oy3 e;
    public final oy3 f;

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ n51 b;
        public final /* synthetic */ DuplicateFitnessCertificateDownload c;

        public a(String str, n51 n51Var, DuplicateFitnessCertificateDownload duplicateFitnessCertificateDownload) {
            this.a = str;
            this.b = n51Var;
            this.c = duplicateFitnessCertificateDownload;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.i().k(th != null ? th.toString() : null);
            Log.e("Error3", "Error " + th);
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            DFCModel dFCModel;
            if (response != null) {
                try {
                    dFCModel = (DFCModel) response.body();
                } catch (Exception e) {
                    this.b.i().k("Error");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error ");
                    e.printStackTrace();
                    sb.append(Unit.INSTANCE);
                    Log.e("Error2", sb.toString());
                    return;
                }
            } else {
                dFCModel = null;
            }
            Intrinsics.checkNotNull(dFCModel);
            Log.e("dataDFC", dFCModel.getData().toString());
            ApiMessage apiMessage = dFCModel.getApiMessage();
            if (!StringsKt__StringsJVMKt.equals$default(apiMessage != null ? apiMessage.getDeveloperMessage() : null, "Success", false, 2, null)) {
                this.b.i().k(dFCModel.getApiMessage().getDeveloperMessage().toString());
                return;
            }
            Log.e("dataDFC", dFCModel.getData().toString());
            byte[] bArrDecode = Base64.getDecoder().decode(dFCModel.getData());
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            String str = this.a + '_' + System.currentTimeMillis();
            if (this.b.k(bArrDecode, str, this.c)) {
                this.b.h().k(str);
            } else {
                this.b.h().k("Error");
            }
        }
    }

    public n51(m51 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
    }

    public final oy3 h() {
        return this.e;
    }

    public final oy3 i() {
        return this.f;
    }

    public final void j(String applNo, DuplicateFitnessCertificateDownload duplicateFitnessCertificateDownload) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(duplicateFitnessCertificateDownload, "duplicateFitnessCertificateDownload");
        String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.u(applNo).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        aVar.d(ls3VarB, string);
        this.d.a(applNo).enqueue(new a(applNo, this, duplicateFitnessCertificateDownload));
    }

    public final boolean k(byte[] bArr, String str, DuplicateFitnessCertificateDownload duplicateFitnessCertificateDownload) throws Throwable {
        try {
            System.currentTimeMillis();
            File filesDir = duplicateFitnessCertificateDownload.getFilesDir();
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

    public final void l(byte[] bArr, File file) throws Throwable {
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
}
