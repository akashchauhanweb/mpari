package com.nic.mparivahan.dlservices.ui.dms;

import android.app.Application;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Environment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;
import com.nic.mparivahan.dlservices.data.model.temp.ProofList;
import com.nic.mparivahan.dlservices.data.model.temp.ResponseBean;
import com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse;
import com.zepto.d86;
import com.zepto.dt4;
import com.zepto.mf4;
import com.zepto.st6;
import com.zepto.wa3;
import com.zepto.xo1;
import com.zepto.yf2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends RecyclerView.h {
    public final Context d;
    public final Application e;
    public final ArrayList f;
    public final InterfaceC0060a g;
    public Calendar h;

    /* JADX INFO: renamed from: com.nic.mparivahan.dlservices.ui.dms.a$a, reason: collision with other inner class name */
    public interface InterfaceC0060a {
        void a(int i);

        void b(int i, DocumentListItem documentListItem);

        void c(int i, DocumentListItem documentListItem);
    }

    public static final class b extends RecyclerView.d0 {
        public final EditText A;
        public final EditText B;
        public final EditText C;
        public final EditText D;
        public final EditText E;
        public final LinearLayout F;
        public final LinearLayout G;
        public final LinearLayout H;
        public final ImageView I;
        public final ImageView J;
        public final TextView K;
        public final TextView L;
        public final TextView M;
        public final LinearLayout u;
        public final ImageView v;
        public final TextView w;
        public final TextView x;
        public final LinearLayout y;
        public final TextView z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.u = (LinearLayout) view.findViewById(R.id.view_or_uploaded_doc_ll);
            this.v = (ImageView) view.findViewById(R.id.doc_selected_iv);
            this.w = (TextView) view.findViewById(R.id.doc_selected_tv);
            this.x = (TextView) view.findViewById(R.id.txt_edit);
            this.y = (LinearLayout) view.findViewById(R.id.edit_doc_ll);
            this.z = (TextView) view.findViewById(R.id.title);
            this.A = (EditText) view.findViewById(R.id.proff_spinner);
            this.B = (EditText) view.findViewById(R.id.issue_design);
            this.C = (EditText) view.findViewById(R.id.contact_number);
            this.D = (EditText) view.findViewById(R.id.document_number);
            this.E = (EditText) view.findViewById(R.id.issued_date);
            this.F = (LinearLayout) view.findViewById(R.id.browse_button);
            this.G = (LinearLayout) view.findViewById(R.id.capture_button);
            this.H = (LinearLayout) view.findViewById(R.id.ll_layout);
            this.I = (ImageView) view.findViewById(R.id.arrow_down);
            this.J = (ImageView) view.findViewById(R.id.arrow_up);
            this.K = (TextView) view.findViewById(R.id.doc_documents);
            this.L = (TextView) view.findViewById(R.id.doc_capture);
            this.M = (TextView) view.findViewById(R.id.doc_gallary);
        }

        private final void g0(DocumentListItem documentListItem) {
            String contactNo;
            String issueDate;
            try {
                this.z.setText(documentListItem.getName());
                this.A.setText(documentListItem.getDocName());
                this.B.setText(documentListItem.getIssueAuthDesg());
                if (documentListItem.getIssueDate() == null || (issueDate = documentListItem.getIssueDate()) == null || issueDate.length() == 0 || Intrinsics.areEqual(documentListItem.getIssueDate(), "null")) {
                    this.E.setText("");
                } else {
                    this.E.setText(documentListItem.getIssueDate());
                }
                if (documentListItem.getContactNo() == null || (contactNo = documentListItem.getContactNo()) == null || contactNo.length() == 0 || Intrinsics.areEqual(documentListItem.getContactNo(), "null")) {
                    this.C.setText("");
                } else {
                    this.C.setText(documentListItem.getContactNo());
                }
                this.D.setText(documentListItem.getDocNo());
                if (!documentListItem.getIsDocInsertedStatus()) {
                    if (!documentListItem.getIsBrowseStatus()) {
                        this.u.setVisibility(8);
                        this.y.setVisibility(8);
                        this.G.setVisibility(0);
                        this.F.setVisibility(0);
                        return;
                    }
                    String fileNmae = documentListItem.getFileNmae();
                    if (fileNmae == null || !StringsKt__StringsKt.contains$default((CharSequence) fileNmae, (CharSequence) ".pdf", false, 2, (Object) null)) {
                        this.v.setBackgroundResource(R.drawable.ga);
                    } else {
                        this.v.setBackgroundResource(R.drawable.pdf);
                    }
                    this.u.setVisibility(0);
                    this.y.setVisibility(0);
                    this.G.setVisibility(8);
                    this.F.setVisibility(8);
                    return;
                }
                this.B.setFocusable(false);
                this.B.setFocusableInTouchMode(false);
                this.D.setFocusable(false);
                this.D.setFocusableInTouchMode(false);
                this.C.setFocusable(false);
                this.C.setFocusableInTouchMode(false);
                this.G.setVisibility(8);
                this.F.setVisibility(8);
                this.u.setVisibility(0);
                String fileNmae2 = documentListItem.getFileNmae();
                if (fileNmae2 != null && StringsKt__StringsKt.contains$default((CharSequence) fileNmae2, (CharSequence) ".pdf", false, 2, (Object) null)) {
                    this.v.setBackgroundResource(R.drawable.pdf);
                }
                if (StringsKt__StringsJVMKt.equals(documentListItem.getRemarks(), "Reject", true)) {
                    this.F.setVisibility(0);
                    this.G.setVisibility(0);
                }
            } catch (Exception unused) {
            }
        }

        public final void O(DocumentListItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            g0(item);
        }

        public final ImageView P() {
            return this.I;
        }

        public final ImageView Q() {
            return this.J;
        }

        public final LinearLayout R() {
            return this.F;
        }

        public final LinearLayout S() {
            return this.G;
        }

        public final EditText T() {
            return this.C;
        }

        public final LinearLayout U() {
            return this.y;
        }

        public final EditText V() {
            return this.D;
        }

        public final EditText W() {
            return this.A;
        }

        public final TextView X() {
            return this.L;
        }

        public final TextView Y() {
            return this.K;
        }

        public final TextView Z() {
            return this.M;
        }

        public final EditText a0() {
            return this.B;
        }

        public final EditText b0() {
            return this.E;
        }

        public final LinearLayout c0() {
            return this.H;
        }

        public final TextView d0() {
            return this.x;
        }

        public final LinearLayout e0() {
            return this.u;
        }

        public final TextView f0() {
            return this.w;
        }
    }

    public static final class c implements TextWatcher {
        public final /* synthetic */ DocumentListItem a;
        public final /* synthetic */ b b;

        public c(DocumentListItem documentListItem, b bVar) {
            this.a = documentListItem;
            this.b = bVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Intrinsics.checkNotNullParameter(editable, "editable");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            DocumentListItem documentListItem = this.a;
            if (documentListItem != null) {
                documentListItem.setIssueAuthDesg(this.b.a0().getText().toString());
            }
            DocumentListItem documentListItem2 = this.a;
            Log.e("issue-aut", String.valueOf(documentListItem2 != null ? documentListItem2.getIssueAuthDesg() : null));
        }
    }

    public static final class d implements TextWatcher {
        public final /* synthetic */ DocumentListItem a;
        public final /* synthetic */ b b;

        public d(DocumentListItem documentListItem, b bVar) {
            this.a = documentListItem;
            this.b = bVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Intrinsics.checkNotNullParameter(editable, "editable");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            DocumentListItem documentListItem = this.a;
            if (documentListItem == null) {
                return;
            }
            documentListItem.setDocNo(this.b.V().getText().toString());
        }
    }

    public static final class e implements TextWatcher {
        public final /* synthetic */ DocumentListItem a;
        public final /* synthetic */ b b;

        public e(DocumentListItem documentListItem, b bVar) {
            this.a = documentListItem;
            this.b = bVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Intrinsics.checkNotNullParameter(editable, "editable");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            DocumentListItem documentListItem = this.a;
            if (documentListItem == null) {
                return;
            }
            documentListItem.setContactNo(this.b.T().getText().toString());
        }
    }

    public static final class f implements TextWatcher {
        public final /* synthetic */ DocumentListItem a;
        public final /* synthetic */ b b;

        public f(DocumentListItem documentListItem, b bVar) {
            this.a = documentListItem;
            this.b = bVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Intrinsics.checkNotNullParameter(editable, "editable");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            DocumentListItem documentListItem = this.a;
            if (documentListItem == null) {
                return;
            }
            documentListItem.setIssueDate(this.b.b0().getText().toString());
        }
    }

    public static final class g extends Lambda implements Function1 {
        public final /* synthetic */ b e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b bVar, int i) {
            super(1);
            this.e = bVar;
            this.f = i;
        }

        public final void a(UploadDocListResponse uploadDocListResponse) {
            Integer statusCode;
            ResponseBean responseBean = uploadDocListResponse.getResponseBean();
            if (responseBean == null || (statusCode = responseBean.getStatusCode()) == null || statusCode.intValue() != 200) {
                return;
            }
            a aVar = a.this;
            List<ProofList> proofList = uploadDocListResponse.getProofList();
            EditText editTextW = this.e.W();
            Intrinsics.checkNotNullExpressionValue(editTextW, "<get-docType>(...)");
            aVar.Y(proofList, editTextW, this.f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UploadDocListResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h implements d86.b {
        public final /* synthetic */ EditText a;
        public final /* synthetic */ a b;
        public final /* synthetic */ int c;
        public final /* synthetic */ List d;

        public h(EditText editText, a aVar, int i, List list) {
            this.a = editText;
            this.b = aVar;
            this.c = i;
            this.d = list;
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            ProofList proofList;
            ProofList proofList2;
            ProofList proofList3;
            this.a.setText(str);
            ArrayList arrayListL = this.b.L();
            String code = null;
            DocumentListItem documentListItem = arrayListL != null ? (DocumentListItem) arrayListL.get(this.c) : null;
            if (documentListItem != null) {
                List list = this.d;
                documentListItem.setDocName((list == null || (proofList3 = (ProofList) list.get(i)) == null) ? null : proofList3.getName());
            }
            ArrayList arrayListL2 = this.b.L();
            DocumentListItem documentListItem2 = arrayListL2 != null ? (DocumentListItem) arrayListL2.get(this.c) : null;
            if (documentListItem2 != null) {
                List list2 = this.d;
                documentListItem2.setProofCode((list2 == null || (proofList2 = (ProofList) list2.get(i)) == null) ? null : proofList2.getId());
            }
            ArrayList arrayListL3 = this.b.L();
            DocumentListItem documentListItem3 = arrayListL3 != null ? (DocumentListItem) arrayListL3.get(this.c) : null;
            if (documentListItem3 == null) {
                return;
            }
            List list3 = this.d;
            if (list3 != null && (proofList = (ProofList) list3.get(i)) != null) {
                code = proofList.getCode();
            }
            documentListItem3.setDocCode(code);
        }
    }

    public static final class i implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public i(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        @Override // com.zepto.mf4
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof mf4) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public a(Context context, Application application, ArrayList arrayList, InterfaceC0060a itemListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(itemListener, "itemListener");
        this.d = context;
        this.e = application;
        this.f = arrayList;
        this.g = itemListener;
        this.h = Calendar.getInstance();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void N(DocumentListItem documentListItem, b holder, a this$0, Ref.ObjectRef mSession, int i2, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mSession, "$mSession");
        if (documentListItem == null || !documentListItem.getIsDocInsertedStatus() || StringsKt__StringsJVMKt.equals(documentListItem.getRemarks(), "Reject", true)) {
            if (holder.W().getText().toString().length() <= 0) {
                Context context = this$0.d;
                Toast.makeText(context, ((wa3) mSession.element).b("select_doc_type", context.getString(R.string.sel_doc_type)), 0).show();
            } else if (documentListItem != null) {
                this$0.g.b(i2, documentListItem);
            }
        }
    }

    public static final void O(a this$0, int i2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.g.a(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void P(DocumentListItem documentListItem, a this$0, int i2, Ref.ObjectRef mSession, b holder, View view) throws IOException {
        String strSubstring;
        DocumentListItem documentListItem2;
        DocumentListItem documentListItem3;
        String fileNmae;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mSession, "$mSession");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Integer numValueOf = (documentListItem == null || (fileNmae = documentListItem.getFileNmae()) == null) ? null : Integer.valueOf(StringsKt__StringsKt.indexOf$default((CharSequence) fileNmae, ".", 0, false, 6, (Object) null));
        Intrinsics.checkNotNull(numValueOf);
        if (numValueOf.intValue() > 0) {
            dt4 dt4Var = new dt4();
            if (!documentListItem.getIsDocInsertedStatus()) {
                String fileNmae2 = documentListItem.getFileNmae();
                if (fileNmae2 == null || !StringsKt__StringsKt.contains$default((CharSequence) fileNmae2, (CharSequence) ".pdf", false, 2, (Object) null)) {
                    LinearLayout linearLayoutE0 = holder.e0();
                    Intrinsics.checkNotNullExpressionValue(linearLayoutE0, "<get-uploadImgLL>(...)");
                    dt4Var.c(linearLayoutE0, "", documentListItem.getFileToUpload(), this$0.d);
                    return;
                }
                String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
                File file = new File(str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(str + documentListItem.getFileNmae());
                if (!file2.exists()) {
                    byte[] bArrDecode = Base64.decode(documentListItem.getFileToUpload(), 0);
                    Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write(bArrDecode);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
                Uri uriF = FileProvider.f(this$0.d, "com.nic.mparivahan.provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/" + documentListItem.getFileNmae()));
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(uriF, "application/pdf");
                    intent.setFlags(67108864);
                    intent.addFlags(1);
                    this$0.d.startActivity(intent);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            String fileNmae3 = documentListItem.getFileNmae();
            if (fileNmae3 != null) {
                String fileNmae4 = documentListItem.getFileNmae();
                Intrinsics.checkNotNull(fileNmae4);
                strSubstring = fileNmae3.substring(0, StringsKt__StringsKt.lastIndexOf$default((CharSequence) fileNmae4, ".", 0, false, 6, (Object) null));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(st6.m());
            sb.append(strSubstring);
            sb.append("&folderName=");
            ArrayList arrayList = this$0.f;
            sb.append((arrayList == null || (documentListItem3 = (DocumentListItem) arrayList.get(i2)) == null) ? null : documentListItem3.getApplication_no());
            sb.append("&stateCode=");
            ArrayList arrayList2 = this$0.f;
            sb.append((arrayList2 == null || (documentListItem2 = (DocumentListItem) arrayList2.get(i2)) == null) ? null : documentListItem2.getStateCode());
            sb.append("&status=NP&j_key=vVl%2FAz1yGsjOAG18WDeScg%3D%3D&j_securityKey=");
            sb.append(APIController.a().sarthiDMSKey());
            String string = sb.toString();
            String fileNmae5 = documentListItem.getFileNmae();
            if (fileNmae5 == null || !StringsKt__StringsKt.contains$default((CharSequence) fileNmae5, (CharSequence) ".pdf", false, 2, (Object) null)) {
                final Dialog dialog = new Dialog(this$0.d);
                dialog.setContentView(R.layout.dms_view);
                Window window = dialog.getWindow();
                Intrinsics.checkNotNull(window);
                window.setBackgroundDrawable(new ColorDrawable(-1));
                View viewFindViewById = dialog.findViewById(R.id.aboutUsWv);
                Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.webkit.WebView");
                WebView webView = (WebView) viewFindViewById;
                View viewFindViewById2 = dialog.findViewById(R.id.messageButton);
                Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) viewFindViewById2;
                textView.setText(((wa3) mSession.element).b("btn_ok", this$0.d.getString(R.string.ok_txt)));
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rt1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        com.nic.mparivahan.dlservices.ui.dms.a.Q(dialog, view2);
                    }
                });
                try {
                    webView.loadData("<html><body><img src=\"" + string + "\" width=\"100%\" height=\"100%\"\"/></body></html>", "text/html", null);
                } catch (Exception unused2) {
                    Context context = this$0.d;
                    Toast.makeText(context, ((wa3) mSession.element).b("service_is_not_present", context.getString(R.string.no_Details_are_avail)), 0).show();
                }
                dialog.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void R(DocumentListItem documentListItem, a this$0, final b holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        if (documentListItem == null || !documentListItem.getIsDocInsertedStatus()) {
            DatePickerDialog datePickerDialog = new DatePickerDialog(this$0.d, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.st1
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    com.nic.mparivahan.dlservices.ui.dms.a.S(holder, datePicker, i2, i3, i4);
                }
            }, this$0.h.get(1), this$0.h.get(2), this$0.h.get(5));
            datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
            datePickerDialog.show();
        }
    }

    public static final void S(b holder, DatePicker datePicker, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        EditText editTextB0 = holder.b0();
        StringBuilder sb = new StringBuilder();
        sb.append(i4);
        sb.append('-');
        sb.append(i3 + 1);
        sb.append('-');
        sb.append(i2);
        editTextB0.setText(sb.toString());
    }

    public static final void T(DocumentListItem documentListItem, a this$0, b holder, int i2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        if (documentListItem == null || !documentListItem.getIsDocInsertedStatus()) {
            new xo1(this$0.e, documentListItem != null ? documentListItem.getStateCode() : null, documentListItem != null ? documentListItem.getId() : null).b().h(new i(this$0.new g(holder, i2)));
        }
    }

    public static final void U(b holder, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        holder.Q().setVisibility(0);
        holder.P().setVisibility(8);
        holder.c0().setVisibility(0);
    }

    public static final void V(b holder, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        holder.P().setVisibility(0);
        holder.Q().setVisibility(8);
        holder.c0().setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void W(DocumentListItem documentListItem, b holder, a this$0, Ref.ObjectRef mSession, int i2, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mSession, "$mSession");
        if (documentListItem == null || !documentListItem.getIsDocInsertedStatus() || StringsKt__StringsJVMKt.equals(documentListItem.getRemarks(), "Reject", true)) {
            if (holder.W().getText().toString().length() <= 0) {
                Context context = this$0.d;
                Toast.makeText(context, ((wa3) mSession.element).b("select_doc_type", context.getString(R.string.sel_doc_type)), 0).show();
            } else if (documentListItem != null) {
                this$0.g.c(i2, documentListItem);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(List list, EditText editText, int i2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((ProofList) it.next()).getName()));
            }
        }
        Context context = this.d;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        d86 d86VarA = d86.INSTANCE.a("Select Documents", arrayList);
        d86VarA.k2(((yf2) context).I0(), "DocumentsPicker");
        d86VarA.n2(new h(editText, this, i2, list));
    }

    public final ArrayList L() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.zepto.wa3] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void p(final b holder, final int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ArrayList arrayList = this.f;
        final DocumentListItem documentListItem = arrayList != null ? (DocumentListItem) arrayList.get(i2) : null;
        if (documentListItem != null) {
            holder.O(documentListItem);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new wa3(this.d);
        holder.W().setHint(((wa3) objectRef.element).b("select_documents", this.d.getString(R.string.select_documents)));
        holder.a0().setHint(((wa3) objectRef.element).b("issuer", this.d.getString(R.string.issuer)));
        holder.V().setHint(((wa3) objectRef.element).b("doc_number", this.d.getString(R.string.doc_number)));
        holder.T().setHint(((wa3) objectRef.element).b("con_number", this.d.getString(R.string.con_number)));
        holder.b0().setHint(((wa3) objectRef.element).b("d_i_d", this.d.getString(R.string.d_i_d)));
        holder.Y().setText(((wa3) objectRef.element).b("doc_documents", this.d.getString(R.string.documents)));
        holder.Z().setText(((wa3) objectRef.element).b("label_gallery", this.d.getString(R.string.gallery)));
        holder.X().setText(((wa3) objectRef.element).b("label_capture", this.d.getString(R.string.capture)));
        holder.f0().setText(((wa3) objectRef.element).b("label_view", "View"));
        holder.d0().setText(((wa3) objectRef.element).b("label_edit", "Edit"));
        holder.a0().addTextChangedListener(new c(documentListItem, holder));
        holder.V().addTextChangedListener(new d(documentListItem, holder));
        holder.T().addTextChangedListener(new e(documentListItem, holder));
        holder.b0().addTextChangedListener(new f(documentListItem, holder));
        holder.b0().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.nic.mparivahan.dlservices.ui.dms.a.R(documentListItem, this, holder, view);
            }
        });
        holder.W().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.nic.mparivahan.dlservices.ui.dms.a.T(documentListItem, this, holder, i2, view);
            }
        });
        holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.nic.mparivahan.dlservices.ui.dms.a.U(holder, view);
            }
        });
        holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.nic.mparivahan.dlservices.ui.dms.a.V(holder, view);
            }
        });
        final DocumentListItem documentListItem2 = documentListItem;
        holder.S().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.nic.mparivahan.dlservices.ui.dms.a.W(documentListItem2, holder, this, objectRef, i2, view);
            }
        });
        holder.R().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ot1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.nic.mparivahan.dlservices.ui.dms.a.N(documentListItem2, holder, this, objectRef, i2, view);
            }
        });
        holder.U().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.nic.mparivahan.dlservices.ui.dms.a.O(this.a, i2, view);
            }
        });
        final DocumentListItem documentListItem3 = documentListItem;
        holder.e0().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IOException {
                com.nic.mparivahan.dlservices.ui.dms.a.P(documentListItem3, this, i2, objectRef, holder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public b r(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_dl_renewal_doc, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new b(viewInflate);
    }

    public final void Z(int i2) {
        ArrayList arrayList = this.f;
        if (arrayList != null) {
        }
        n(i2);
        ArrayList arrayList2 = this.f;
        if (arrayList2 != null) {
            m(i2, arrayList2.size());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList arrayList = this.f;
        Integer numValueOf = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
        Intrinsics.checkNotNull(numValueOf);
        return numValueOf.intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long f(int i2) {
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g(int i2) {
        return i2;
    }
}
