package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.DLVirtualAlertScreen;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.tu5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class im1 extends RecyclerView.h {
    public final Context d;
    public final ArrayList e;
    public final mq6 f;

    public static final class a extends RecyclerView.d0 {
        public TextView A;
        public final TextView u;
        public final TextView v;
        public ProgressBar w;
        public TextView x;
        public AppCompatImageView y;
        public AppCompatImageView z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.doc_number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.doc_expiry_date);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.progress_bar);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (ProgressBar) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.service_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (TextView) viewFindViewById4;
            View viewFindViewById5 = this.a.findViewById(R.id.viewmore);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.y = (AppCompatImageView) viewFindViewById5;
            View viewFindViewById6 = this.a.findViewById(R.id.refresh);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.z = (AppCompatImageView) viewFindViewById6;
            View viewFindViewById7 = this.a.findViewById(R.id.notify);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.A = (TextView) viewFindViewById7;
        }

        public final TextView O() {
            return this.v;
        }

        public final TextView P() {
            return this.u;
        }

        public final TextView Q() {
            return this.A;
        }

        public final ProgressBar R() {
            return this.w;
        }

        public final AppCompatImageView S() {
            return this.z;
        }

        public final TextView T() {
            return this.x;
        }

        public final AppCompatImageView U() {
            return this.y;
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ a b;
        public final /* synthetic */ Ref.ObjectRef c;
        public final /* synthetic */ int d;

        public b(a aVar, Ref.ObjectRef objectRef, int i) {
            this.b = aVar;
            this.c = objectRef;
            this.d = i;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.R().setVisibility(8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            try {
                DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(im1.this.d);
                this.b.R().setVisibility(8);
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                tu5.a aVar = tu5.a;
                String str = (String) this.c.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DLServiceResponseModleV1.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                DLServiceResponseModleV1 dLServiceResponseModleV1 = (DLServiceResponseModleV1) objFromJson;
                databaseHelperD0.P0(StringsKt__StringsKt.trim((CharSequence) dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
                im1.this.k(this.d);
            } catch (Exception unused) {
                this.b.R().setVisibility(8);
            }
        }
    }

    public im1(Context context, ArrayList mList, mq6 updatedl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(updatedl, "updatedl");
        this.d = context;
        this.e = mList;
        this.f = updatedl;
    }

    public static final void H(DLDocument dLDocument, im1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (dLDocument.getDldetails() != null) {
            Intent intent = new Intent(this$0.d, (Class<?>) DLVirtualAlertScreen.class);
            intent.putExtra("Flag", true);
            this$0.d.startActivity(intent);
        }
    }

    public static final void I(a holder, im1 this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        holder.R().setVisibility(0);
        this$0.f.a("", Integer.valueOf(i));
    }

    public final void D(String change_color, TextView textView) {
        Intrinsics.checkNotNullParameter(change_color, "change_color");
        Intrinsics.checkNotNullParameter(textView, "textView");
        if (StringsKt__StringsKt.contains((CharSequence) change_color, (CharSequence) "Expired", true)) {
            textView.setTextColor(yy0.c(this.d, R.color.danger));
        } else if (StringsKt__StringsKt.contains((CharSequence) change_color, (CharSequence) "Expiring", true)) {
            textView.setTextColor(yy0.c(this.d, R.color.vehicle_fit));
        } else {
            textView.setTextColor(yy0.c(this.d, R.color.vehicle_fit));
        }
    }

    public final String E(String str) {
        try {
            Date date = new Date();
            Date date2 = new SimpleDateFormat("dd-MMM-yyyy").parse(str);
            if (date2.before(date)) {
                return "Expired on " + str;
            }
            if (!date2.after(date)) {
                return "Expired on " + str;
            }
            if (F(str) > 30) {
                return str + ' ';
            }
            if (F(str) <= 7) {
                return "Expiring on " + str;
            }
            return "Expiring on " + str;
        } catch (ParseException e) {
            e.printStackTrace();
            return "Expiring on" + str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return String.valueOf(str);
        }
    }

    public final int F(String str) {
        try {
            Date date = new Date();
            long time = new SimpleDateFormat("dd-MMM-yyyy").parse(str).getTime();
            long time2 = date.getTime();
            return (int) ((time > time2 ? time - time2 : time2 - time) / ((long) 86400000));
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c7 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0009, B:6:0x0039, B:13:0x0077, B:15:0x007d, B:18:0x0085, B:20:0x008b, B:56:0x01fd, B:21:0x012e, B:23:0x0142, B:25:0x0148, B:27:0x014e, B:30:0x015c, B:32:0x0162, B:34:0x0168, B:36:0x016e, B:38:0x0178, B:40:0x0182, B:42:0x0188, B:44:0x018e, B:46:0x01a6, B:48:0x01ac, B:49:0x01b0, B:50:0x01c7, B:52:0x01dd, B:54:0x01e3, B:55:0x01e7, B:9:0x0044, B:11:0x0054, B:12:0x006c), top: B:60:0x0009 }] */
    /* JADX WARN: Type inference failed for: r5v13, types: [T, java.lang.String] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(final com.zepto.im1.a r14, final int r15) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.im1.p(com.zepto.im1$a, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this.d);
        if (databaseHelperD0.D() == null) {
            Log.e("Alerts - else", "Alerts--23");
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.dl_expiry_adapter, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new a(viewInflate);
        }
        try {
            if (databaseHelperD0.D().size() > 0) {
                View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.dlexpire1, parent, false);
                Intrinsics.checkNotNull(viewInflate2);
                return new a(viewInflate2);
            }
            Log.e("Alerts - else -1", "Alerts--23");
            View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.dl_expiry_adapter, parent, false);
            Intrinsics.checkNotNull(viewInflate3);
            return new a(viewInflate3);
        } catch (Exception unused) {
            View viewInflate4 = LayoutInflater.from(parent.getContext()).inflate(R.layout.dl_expiry_adapter, parent, false);
            Intrinsics.checkNotNull(viewInflate4);
            return new a(viewInflate4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.e.size();
    }
}
