package com.zepto;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public class pi2 extends AsyncTask {
    public Context a;
    public ProgressDialog b;

    public pi2(Context context) {
        this.a = context;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String doInBackground(ResultItemSubmit... resultItemSubmitArr) {
        ResultItemSubmit resultItemSubmit = resultItemSubmitArr[0];
        c(this.a, resultItemSubmit.getApplicationNo(), resultItemSubmit);
        if (TextUtils.isEmpty(resultItemSubmit.getApplicationNo())) {
            return null;
        }
        return resultItemSubmit.getApplicationNo();
    }

    public final String c(Context context, String str, ResultItemSubmit resultItemSubmit) {
        bu1 bu1Var = new bu1(bl4.k, 50.0f, 50.0f, 50.0f, 50.0f);
        try {
            String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/mParivahan_doc";
            File file = new File(str2, "AcknowledgementSlip");
            if (!file.exists() && !file.mkdirs()) {
                Log.d("PDF_SUMMARY", "Failed to create directory!");
            }
            String str3 = file.getPath() + "/" + str + ".pdf";
            Log.e("PDF_DIR_PATH", file.getPath());
            File file2 = new File(str2, "FONTS");
            if (!file2.exists() && !file2.mkdirs()) {
                Log.d("mparivahan", "Failed to create font directory");
            }
            String str4 = file2.getPath() + "/number.ttf";
            Log.v("FONT_PATH", str4);
            bk4.c(new File(str4), context);
            s40 s40VarG = ck4.g(str4, "Identity-H", false);
            pq4 pq4VarD = pq4.D(bu1Var, new FileOutputStream(str3));
            bu1Var.a();
            bu1Var.f("NIC");
            bu1Var.g();
            fl4 fl4Var = new fl4(new fl4(bk4.b(), ck4.h(s40VarG, 8.0f, 0, new e90(0, 0, 0, KotlinVersion.MAX_COMPONENT_VALUE))));
            fl4Var.x0(0);
            bu1Var.d(fl4Var);
            bu1Var.k("Acknowledgement Slip");
            bu1Var.j("Acknowledgement Slip");
            fl4 fl4Var2 = new fl4(new fl4("Acknowledgement Slip", ck4.h(s40VarG, 14.0f, 1, new e90(0, 0, 0, KotlinVersion.MAX_COMPONENT_VALUE))));
            fl4Var2.x0(1);
            bu1Var.d(fl4Var2);
            bu1Var.d(new fl4("\n"));
            bu1Var.d(ck4.f(resultItemSubmit, "Transaction No :", "result", "Receipt", "result.getReceiptNumber()", ck4.h(s40VarG, 8.0f, 0, new e90(0, 0, 0, KotlinVersion.MAX_COMPONENT_VALUE)), false));
            bu1Var.d(ck4.d("Transaction No :", "result", "Receipt", "result.getReceiptNumber()", ck4.h(s40VarG, 8.0f, 1, new e90(0, 0, 0, KotlinVersion.MAX_COMPONENT_VALUE)), true));
            bu1Var.d(ck4.e(resultItemSubmit, "Transaction No :", "result", "Receipt", "result.getReceiptNumber()", ck4.h(s40VarG, 8.0f, 1, new e90(0, 0, 0, KotlinVersion.MAX_COMPONENT_VALUE)), true));
            bu1Var.d(ck4.c(resultItemSubmit, "Transaction No :", "result", "Receipt", "result.getReceiptNumber()", ck4.h(s40VarG, 8.0f, 1, new e90(0, 0, 0, KotlinVersion.MAX_COMPONENT_VALUE)), true));
            fl4 fl4Var3 = new fl4(new fl4(resultItemSubmit.getReferenceLink(), ck4.h(s40VarG, 8.0f, 1, new e90(0, 0, 0, KotlinVersion.MAX_COMPONENT_VALUE))));
            fl4Var3.x0(1);
            bu1Var.d(fl4Var3);
            bu1Var.d(new fl4("\n"));
            bu1Var.d(ck4.a("Transaction No :", "result", "Receipt", "result.getReceiptNumber()", ck4.h(s40VarG, 8.0f, 1, new e90(0, 0, 0, KotlinVersion.MAX_COMPONENT_VALUE)), false));
            bu1Var.d(ck4.b(resultItemSubmit, "Transaction No :", "result", "Receipt", "result.getReceiptNumber()", ck4.h(s40VarG, 8.0f, 1, new e90(0, 0, 0, KotlinVersion.MAX_COMPONENT_VALUE)), false));
            bu1Var.close();
            pq4VarD.close();
            Log.e("Tag-123", str3);
            return str3;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final /* synthetic */ void d(Dialog dialog, Context context, String str, View view) {
        dialog.dismiss();
        f(context, str);
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        ProgressDialog progressDialog = this.b;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        g(this.a, "Acknowledgement slip successfully saved in storage", str);
    }

    public final void f(Context context, String str) {
        Uri uriF = FileProvider.f(context, "com.nic.mparivahan.provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/mParivahan_DOC/AcknowledgementSlip/" + str + ".pdf"));
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(uriF);
        Log.e("create pdf uri path==>", sb.toString());
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            context.startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(context, "No Application available to view pdf", 1).show();
        }
    }

    public void g(final Context context, String str, final String str2) {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validation_diloge);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        TextView textView = (TextView) dialog.findViewById(R.id.text2);
        TextView textView2 = (TextView) dialog.findViewById(R.id.ok);
        textView.setText(str);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oi2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d(dialog, context, str2, view);
            }
        });
        dialog.show();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        ProgressDialog progressDialog = new ProgressDialog(this.a);
        this.b = progressDialog;
        progressDialog.setMessage("Please wait..");
        this.b.setCancelable(true);
        this.b.setProgressStyle(0);
        this.b.show();
    }
}
