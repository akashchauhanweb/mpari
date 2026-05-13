package com.zepto;

import android.os.Environment;
import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.FancyServices.AllotmentLetterModel.AllotmentLetterModel;
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
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class ro extends zq7 {
    public final qo d;
    public final oy3 e;
    public final oy3 f;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ro c;

        public a(Ref.ObjectRef objectRef, String str, ro roVar) {
            this.a = objectRef;
            this.b = str;
            this.c = roVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.c.h().k(String.valueOf(th));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.c.h().k("Error");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error ");
                    e.printStackTrace();
                    sb.append(Unit.INSTANCE);
                    Log.e("Error2", sb.toString());
                    return;
                }
            } else {
                securityModle = null;
            }
            ze1.a aVar = ze1.a;
            String str = (String) this.a.element;
            Intrinsics.checkNotNull(securityModle);
            String data = securityModle.getData();
            Intrinsics.checkNotNull(data);
            Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) AllotmentLetterModel.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            AllotmentLetterModel allotmentLetterModel = (AllotmentLetterModel) objFromJson;
            if (!StringsKt__StringsJVMKt.equals(allotmentLetterModel.getStatus(), "SUCCESS", true)) {
                if (gd1.a.m(allotmentLetterModel.getStatus())) {
                    this.c.h().k("Error");
                    return;
                } else {
                    this.c.h().k(allotmentLetterModel.getStatus().toString());
                    return;
                }
            }
            String str2 = this.b + '_' + System.currentTimeMillis();
            byte[] bArrDecode = Base64.getDecoder().decode(allotmentLetterModel.getData());
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            if (this.c.k(bArrDecode, str2)) {
                this.c.i().k(str2);
            } else {
                this.c.h().k("Error");
            }
        }
    }

    public ro(qo repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
    }

    private final void l(byte[] bArr, File file) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedOutputStream.write(bArr);
            try {
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.flush();
                    bufferedOutputStream2.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    public final oy3 h() {
        return this.f;
    }

    public final oy3 i() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void j(String recptNumber) throws JSONException {
        Intrinsics.checkNotNullParameter(recptNumber, "recptNumber");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("receiptNo", recptNumber);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(objectRef, recptNumber, this));
    }

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
}
