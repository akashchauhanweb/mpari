package com.zepto;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.temp.InsertedDocBeanItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class au1 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;
    public final String f;
    public final String g;

    public static final class a extends RecyclerView.d0 {
        public final TextView A;
        public final TextView B;
        public final TextView C;
        public final TextView u;
        public final TextView v;
        public final TextView w;
        public final TextView x;
        public final LinearLayout y;
        public final TextView z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.document_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.proof);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.issued_by);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (TextView) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.issued_date);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (TextView) viewFindViewById4;
            View viewFindViewById5 = this.a.findViewById(R.id.browse_button);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.y = (LinearLayout) viewFindViewById5;
            View viewFindViewById6 = this.a.findViewById(R.id.document_name_text);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.z = (TextView) viewFindViewById6;
            View viewFindViewById7 = this.a.findViewById(R.id.proof_text);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.A = (TextView) viewFindViewById7;
            View viewFindViewById8 = this.a.findViewById(R.id.issue_by_text);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            this.B = (TextView) viewFindViewById8;
            View viewFindViewById9 = this.a.findViewById(R.id.issue_date_text);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
            this.C = (TextView) viewFindViewById9;
        }

        public final LinearLayout O() {
            return this.y;
        }

        public final TextView P() {
            return this.u;
        }

        public final TextView Q() {
            return this.z;
        }

        public final TextView R() {
            return this.B;
        }

        public final TextView S() {
            return this.C;
        }

        public final TextView T() {
            return this.w;
        }

        public final TextView U() {
            return this.x;
        }

        public final TextView V() {
            return this.v;
        }

        public final TextView W() {
            return this.A;
        }
    }

    public static final class b extends WebViewClient {
        public final /* synthetic */ ProgressDialog a;

        public b(ProgressDialog progressDialog) {
            this.a = progressDialog;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            this.a.dismiss();
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.a.show();
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            this.a.dismiss();
            super.onReceivedError(view, request, error);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String strValueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            if (webView != null) {
                webView.loadUrl(strValueOf);
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public au1(ArrayList mList, Context mContext, String mAppNumber, String stateCode) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mAppNumber, "mAppNumber");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        this.d = mList;
        this.e = mContext;
        this.f = mAppNumber;
        this.g = stateCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void E(InsertedDocBeanItem mModel, au1 this$0, Ref.ObjectRef mSession, View view) {
        String strSubstring;
        Intrinsics.checkNotNullParameter(mModel, "$mModel");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mSession, "$mSession");
        try {
            String fileNmae = mModel.getFileNmae();
            Integer numValueOf = fileNmae != null ? Integer.valueOf(StringsKt__StringsKt.indexOf$default((CharSequence) fileNmae, ".", 0, false, 6, (Object) null)) : null;
            Intrinsics.checkNotNull(numValueOf);
            if (numValueOf.intValue() > 0) {
                new dt4();
                String fileNmae2 = mModel.getFileNmae();
                if (fileNmae2 != null) {
                    String fileNmae3 = mModel.getFileNmae();
                    Intrinsics.checkNotNull(fileNmae3);
                    strSubstring = fileNmae2.substring(0, StringsKt__StringsKt.lastIndexOf$default((CharSequence) fileNmae3, ".", 0, false, 6, (Object) null));
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    strSubstring = null;
                }
                String str = st6.m() + strSubstring + "&folderName=" + this$0.f + "&stateCode=" + this$0.g + "&status=NP&j_key=vVl%2FAz1yGsjOAG18WDeScg%3D%3D&j_securityKey=" + APIController.a().sarthiDMSKey();
                Log.d("DMS_URL_FOR_IMAGE", str);
                String fileNmae4 = mModel.getFileNmae();
                Boolean boolValueOf = fileNmae4 != null ? Boolean.valueOf(StringsKt__StringsKt.contains$default((CharSequence) fileNmae4, (CharSequence) ".pdf", false, 2, (Object) null)) : null;
                Intrinsics.checkNotNull(boolValueOf);
                if (boolValueOf.booleanValue()) {
                    Log.d("gaurav1", mModel.getFileNmae());
                    final Dialog dialog = new Dialog(this$0.e);
                    dialog.setContentView(R.layout.view_docs_adapter);
                    Window window = dialog.getWindow();
                    Intrinsics.checkNotNull(window);
                    window.setBackgroundDrawable(new ColorDrawable(-1));
                    View viewFindViewById = dialog.findViewById(R.id.aboutUsWv);
                    Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.webkit.WebView");
                    WebView webView = (WebView) viewFindViewById;
                    View viewFindViewById2 = dialog.findViewById(R.id.messageButton);
                    Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) viewFindViewById2;
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.loadUrl(str);
                    textView.setText(((wa3) mSession.element).b("btn_ok", this$0.e.getString(R.string.ok_txt)));
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yt1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            au1.F(dialog, view2);
                        }
                    });
                    return;
                }
                final Dialog dialog2 = new Dialog(this$0.e);
                dialog2.setContentView(R.layout.view_docs_adapter);
                Window window2 = dialog2.getWindow();
                Intrinsics.checkNotNull(window2);
                window2.setBackgroundDrawable(new ColorDrawable(-1));
                View viewFindViewById3 = dialog2.findViewById(R.id.aboutUsWv);
                Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.webkit.WebView");
                WebView webView2 = (WebView) viewFindViewById3;
                View viewFindViewById4 = dialog2.findViewById(R.id.messageButton);
                Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView2 = (TextView) viewFindViewById4;
                textView2.setText(((wa3) mSession.element).b("btn_ok", this$0.e.getString(R.string.ok_txt)));
                textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zt1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        au1.G(dialog2, view2);
                    }
                });
                try {
                    ProgressDialog progressDialog = new ProgressDialog(this$0.e);
                    progressDialog.setMessage(new wa3(this$0.e).b("label_challan_please_wait", this$0.e.getString(R.string.please_wait)));
                    webView2.loadData("<html><body><img src=\"" + str + "\" width=\"100%\" height=\"100%\"\"/></body></html>", "text/html", null);
                    webView2.setWebViewClient(new b(progressDialog));
                } catch (Exception unused) {
                    Context context = this$0.e;
                    Toast.makeText(context, ((wa3) mSession.element).b("service_is_not_present", context.getString(R.string.no_Details_are_avail)), 0).show();
                }
                dialog2.show();
            }
        } catch (Exception unused2) {
        }
    }

    public static final void F(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void G(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.zepto.wa3] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new wa3(this.e);
        Object obj = this.d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        final InsertedDocBeanItem insertedDocBeanItem = (InsertedDocBeanItem) obj;
        holder.Q().setText(((wa3) objectRef.element).b("Document_Name_Text", this.e.getString(R.string.doc_name)));
        holder.W().setText(((wa3) objectRef.element).b("proof_lbl", this.e.getString(R.string.proof)));
        holder.R().setText(((wa3) objectRef.element).b("issued_by", this.e.getString(R.string.issued_by)));
        holder.S().setText(((wa3) objectRef.element).b("doi", this.e.getString(R.string.issue_dates_dls)));
        holder.P().setText(insertedDocBeanItem.getDocName());
        holder.V().setText(insertedDocBeanItem.getDocName());
        String issueAuthDesg = insertedDocBeanItem.getIssueAuthDesg();
        if (issueAuthDesg == null || issueAuthDesg.length() == 0 || Intrinsics.areEqual(insertedDocBeanItem.getIssueAuthDesg(), "null")) {
            holder.T().setText("NA");
        } else {
            holder.T().setText(insertedDocBeanItem.getIssueAuthDesg());
        }
        String issueDate = insertedDocBeanItem.getIssueDate();
        if (issueDate == null || issueDate.length() == 0 || Intrinsics.areEqual(insertedDocBeanItem.getIssueDate(), "null")) {
            holder.U().setText("NA");
        } else {
            holder.U().setText(insertedDocBeanItem.getIssueDate());
        }
        holder.O().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                au1.E(insertedDocBeanItem, this, objectRef, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.doc_list_adapter, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
