package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DownloadAppoinForms.DownloadAppoinmentScreen;
import com.nic.mparivahan.VahanServices.DownloadAppoinForms.DownloadFormHomeScreen;
import com.nic.mparivahan.VahanServices.DownloadAppoinForms.DownloadNocHomeScreen;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DuplicateFitnessCertificateDownload;
import com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplication;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanVerifyPendingTransaction;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanWithdraw;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerBuyerSelectionActivity;
import com.nic.mparivahan.VahanServices.VahanView.VahanDownloadReceiptActivity;
import com.nic.mparivahan.VahanServices.VahanView.VahanMainViewScreen;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class h42 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;
    public final String f;
    public String g;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;
        public final LinearLayout v;
        public final ImageView w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.es_sarathi_service_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.layout_es_sarathi);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (LinearLayout) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.es_image);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (ImageView) viewFindViewById3;
        }

        public final ImageView O() {
            return this.w;
        }

        public final TextView P() {
            return this.u;
        }

        public final LinearLayout Q() {
            return this.v;
        }
    }

    public h42(ArrayList mList, Context mContext, String State_code) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(State_code, "State_code");
        this.d = mList;
        this.e = mContext;
        this.f = State_code;
        this.g = "T";
    }

    public static final void C(h42 this$0, Enabledservice mModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mModel, "$mModel");
        this$0.E(mModel.getServCode(), this$0.e, mModel.getServName().toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        final Enabledservice enabledservice = (Enabledservice) obj;
        holder.P().setText(ta3.a.U(this.e, enabledservice.getServCode(), enabledservice.getServName()));
        F(enabledservice.getServCode(), holder);
        holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g42
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h42.C(this.a, enabledservice, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.es_sarathi_adapter, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void E(String service_code, Context context, String service_name) {
        Intrinsics.checkNotNullParameter(service_code, "service_code");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(service_name, "service_name");
        if (service_code.equals("3")) {
            new vh7(context).h(VContant.DUPLICATE_RC, VContant.DUPLICATE_RC_CODE);
            Intent intent = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent.putExtra("state_code", this.f);
            context.startActivity(intent);
            return;
        }
        if (service_code.equals("4")) {
            new vh7(context).h(VContant.CHANGE_OF_ADDRESS, VContant.CHANGE_OF_ADDRESS_CODE);
            Intent intent2 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent2.putExtra("state_code", this.f);
            context.startActivity(intent2);
            return;
        }
        if (service_code.equals(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
            new vh7(context).h(VContant.HYPOTHECATION_ADDITION, VContant.HYPOTHECATION_ADDITION_CODE);
            Intent intent3 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent3.putExtra("state_code", this.f);
            context.startActivity(intent3);
            return;
        }
        if (service_code.equals(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE)) {
            new vh7(context).h(VContant.HYPOTHICATION_TERMINATION, VContant.HYPOTHICATION_TERMINATION_CODE);
            Intent intent4 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent4.putExtra("state_code", this.f);
            context.startActivity(intent4);
            return;
        }
        if (service_code.equals(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE)) {
            new vh7(context).h(VContant.HYPOTHECATION_CONTINUATION, VContant.HYPOTHECATION_CONTINUATION_CODE);
            Intent intent5 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent5.putExtra("state_code", this.f);
            context.startActivity(intent5);
            return;
        }
        if (service_code.equals(VContant.RCPARTICULAR_PURPOSE_CODE)) {
            new vh7(context).h(VContant.RCPARTICULAR, VContant.RCPARTICULAR_CODE);
            Intent intent6 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent6.putExtra("state_code", this.f);
            context.startActivity(intent6);
            return;
        }
        if (service_code.equals(VContant.RETENTION_REGISTRATION_PURPOSE_CODE)) {
            new vh7(context).h(VContant.RETENTION_REGISTRATION, VContant.RETENTION_REGISTRATION_NUMBER_CODE);
            Intent intent7 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent7.putExtra("state_code", this.f);
            context.startActivity(intent7);
            return;
        }
        if (service_code.equals(VContant.NOC_PURPOSE_CODE)) {
            new vh7(context).h(VContant.NOC, VContant.NOC_CODE);
            Intent intent8 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent8.putExtra("state_code", this.f);
            context.startActivity(intent8);
            return;
        }
        if (service_code.equals("901")) {
            try {
                Intent intent9 = new Intent(this.e, (Class<?>) VahanDownloadReceiptActivity.class);
                intent9.putExtra("service_name", ta3.a.U(this.e, service_code, service_name));
                this.e.startActivity(intent9);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (service_code.equals("902")) {
            try {
                this.e.startActivity(new Intent(this.e, (Class<?>) VahanVerifyPendingTransaction.class));
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (service_code.equals("903")) {
            try {
                Intent intent10 = new Intent(this.e, (Class<?>) DownloadFormHomeScreen.class);
                intent10.putExtra("service_name", service_name);
                this.e.startActivity(intent10);
                return;
            } catch (Exception e3) {
                e3.printStackTrace();
                return;
            }
        }
        if (service_code.equals("907")) {
            try {
                Intent intent11 = new Intent(this.e, (Class<?>) DownloadNocHomeScreen.class);
                intent11.putExtra("service_name", service_name);
                this.e.startActivity(intent11);
                return;
            } catch (Exception e4) {
                e4.printStackTrace();
                return;
            }
        }
        if (service_code.equals("910")) {
            try {
                Intent intent12 = new Intent(this.e, (Class<?>) DuplicateFitnessCertificateDownload.class);
                intent12.putExtra("service_name", service_name);
                this.e.startActivity(intent12);
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        if (service_code.equals(VContant.Tax_PURPOSE_CODE) || service_code.equals("101")) {
            new vh7(context).h(VContant.PAY_TAX, VContant.PAY_TAX_CODE);
            Intent intent13 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent13.putExtra("state_code", this.f);
            context.startActivity(intent13);
            return;
        }
        if (service_code.equals("906")) {
            new vh7(context).h(VContant.PAY_TAXASS, VContant.PAY_TAX_ASS_CODE);
            Intent intent14 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent14.putExtra("state_code", this.f);
            context.startActivity(intent14);
            return;
        }
        if (service_code.equals("102")) {
            try {
                NaxpToKenService.INSTANCE.a(context);
            } catch (Exception unused) {
            }
            context.startActivity(new Intent(context, (Class<?>) VahanWithdraw.class));
            return;
        }
        if (service_code.equals("103")) {
            try {
                NaxpToKenService.INSTANCE.a(context);
            } catch (Exception unused2) {
            }
            context.startActivity(new Intent(context, (Class<?>) VahanApplication.class));
            return;
        }
        if (service_code.equals("104")) {
            try {
                NaxpToKenService.INSTANCE.a(context);
            } catch (Exception unused3) {
            }
            context.startActivity(new Intent(context, (Class<?>) VahanUpdateMobiActivity.class));
            return;
        }
        if (service_code.equals(VContant.RC_CACELLATION_PURPOSE_CODE)) {
            new vh7(context).h(VContant.RC_CANCALATION, VContant.RC_CANCELLATION_CODE);
            Intent intent15 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent15.putExtra("state_code", this.f);
            context.startActivity(intent15);
            return;
        }
        if (service_code.equals(VContant.RC_SURRENDER_PURPOSE_CODE)) {
            new vh7(context).h(VContant.RC_SURRENDER, VContant.RC_SURRENDER_RC_CODE);
            Intent intent16 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent16.putExtra("state_code", this.f);
            context.startActivity(intent16);
            return;
        }
        if (service_code.equals(VContant.RC_RELEASE_PURPOSE_CODE)) {
            new vh7(context).h(VContant.RC_RELEASE, VContant.RC_RELEASE_CODE);
            Intent intent17 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent17.putExtra("state_code", this.f);
            context.startActivity(intent17);
            return;
        }
        if (service_code.equals(VContant.DUPLICATE_PERMIT_PURPOSE_CODE)) {
            new vh7(context).h(VContant.DUPLICATE_PERMIT, VContant.DUPLICATE_PERMIT_CODE);
            Intent intent18 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent18.putExtra("state_code", this.f);
            context.startActivity(intent18);
            return;
        }
        if (service_code.equals(VContant.DUPLICATE_FITNESS_PURPOSE_CODE)) {
            new vh7(context).h(VContant.DUPLICATE_FITNESS, VContant.DUPLICATE_FITNESS_CODE);
            Intent intent19 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent19.putExtra("state_code", this.f);
            context.startActivity(intent19);
            return;
        }
        if (service_code.equals(VContant.TempPermit_PURPOSE_CODE)) {
            new vh7(context).h(VContant.Temp_Permit, VContant.TEMPERMIT_CODE);
            Intent intent20 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent20.putExtra("state_code", this.f);
            context.startActivity(intent20);
            return;
        }
        if (service_code.equals(VContant.RenewalNpAuthorization_CODE)) {
            new vh7(context).h(VContant.NP_Permit, VContant.NP_CODE);
            Intent intent21 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent21.putExtra("state_code", this.f);
            context.startActivity(intent21);
            return;
        }
        if (service_code.equals(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
            new vh7(context).h(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
            Intent intent22 = new Intent(context, (Class<?>) SellerBuyerSelectionActivity.class);
            intent22.putExtra("state_code", this.f);
            context.startActivity(intent22);
            return;
        }
        if (service_code.equals(VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE)) {
            new vh7(context).h(VContant.PERMIT_RENEWAL, VContant.PERMIT_RENEWAL_CODE);
            Intent intent23 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent23.putExtra("state_code", this.f);
            context.startActivity(intent23);
            return;
        }
        if (service_code.equals(VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE)) {
            new vh7(context).h(VContant.COMPOUND_FEE, VContant.COMPOUND_FEE_CODE);
            Intent intent24 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent24.putExtra("state_code", this.f);
            context.startActivity(intent24);
            return;
        }
        if (service_code.equals(VContant.NOMINEE_PURPOSE_CODE)) {
            new vh7(context).h(VContant.Nominee_Addition, VContant.Nominee_CODE);
            Intent intent25 = new Intent(context, (Class<?>) NomineeMainViewScreen.class);
            intent25.putExtra("state_code", this.f);
            context.startActivity(intent25);
            return;
        }
        if (service_code.equals(VContant.MISELL_PURPOSE_CODE)) {
            new vh7(context).h(VContant.MISELL_PAYMENT, VContant.MISELL_CODE);
            Intent intent26 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent26.putExtra("state_code", this.f);
            context.startActivity(intent26);
            return;
        }
        if (service_code.equals(VContant.ALTERATION_PURPOSE_CODE)) {
            new vh7(context).h(VContant.ALTERATION, VContant.ALTERATION_CODE);
            Intent intent27 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent27.putExtra("state_code", this.f);
            context.startActivity(intent27);
            return;
        }
        if (service_code.equals("904")) {
            Intent intent28 = new Intent(context, (Class<?>) DownloadAppoinmentScreen.class);
            intent28.putExtra("service_name", service_name);
            context.startActivity(intent28);
            return;
        }
        if (service_code.equals(VContant.UPDATE_MOBILE_PURPOSE_CODE)) {
            new vh7(context).h(VContant.UPDATE_MOBILE, VContant.UPDATE_MOBILE_CODE);
            Intent intent29 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent29.putExtra("state_code", this.f);
            context.startActivity(intent29);
            return;
        }
        if (service_code.equals(VContant.MULTISERVICE_PURPOSE_CODE)) {
            new vh7(context).h(VContant.MULTI_SELECT_SERVICE, VContant.MULTI_SELECT_SERVICE_CODE);
            Intent intent30 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent30.putExtra("state_code", this.f);
            context.startActivity(intent30);
            return;
        }
        if (service_code.equals(VContant.SPEICAL_PERMIT_PURPOSE_CODE)) {
            new vh7(context).h(VContant.SPEICAL_PERMIT, VContant.SPEICAL_PERMIT_CODE);
            Intent intent31 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent31.putExtra("state_code", this.f);
            context.startActivity(intent31);
            return;
        }
        if (StringsKt__StringsJVMKt.equals(service_code, VContant.PERMIT_TRANSFER_PURPOSE_CODE, true)) {
            new vh7(context).h(VContant.TRANSFER_OF_PERMIT, VContant.TRANSFER_PERMIT_CODE);
            Intent intent32 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent32.putExtra("state_code", this.f);
            context.startActivity(intent32);
            return;
        }
        if (StringsKt__StringsJVMKt.equals(service_code, "41", true)) {
            new vh7(context).h(VContant.TRANSFER_OF_PERMIT, VContant.TRANSFER_PERMIT_SURRENDER_CODE);
            Intent intent33 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent33.putExtra("state_code", this.f);
            context.startActivity(intent33);
            return;
        }
        if (StringsKt__StringsJVMKt.equals(service_code, VContant.PERMIT_TRANSFER_DEATH_PURPOSE_CODE, true)) {
            new vh7(context).h(VContant.TRANSFER_OF_PERMIT, VContant.TRANSFER_PERMIT_DEATH_CODE);
            Intent intent34 = new Intent(context, (Class<?>) VahanMainViewScreen.class);
            intent34.putExtra("state_code", this.f);
            context.startActivity(intent34);
        }
    }

    public final void F(String service_code, a holder) {
        Intrinsics.checkNotNullParameter(service_code, "service_code");
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (service_code.equals("3")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.duplicate_rc));
        }
        if (service_code.equals("4")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.mvvm_ic_addres));
        }
        if (service_code.equals(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.addition));
        }
        if (service_code.equals(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.term));
        }
        if (service_code.equals(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_con));
        }
        if (service_code.equals(VContant.RCPARTICULAR_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.rc_partucalar));
        }
        if (service_code.equals(VContant.NOC_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.duplicate_rc));
        }
        if (service_code.equals(VContant.Tax_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.bill));
        }
        if (service_code.equals("102")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.vahan_dispose));
        }
        if (service_code.equals("103")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.vahan_app_status));
        }
        if (service_code.equals("104")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.smartphone));
        }
        if (service_code.equals("901")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.print_rece));
        }
        if (service_code.equals("902")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.vahan_verify_payment));
        }
        if (service_code.equals("903")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.downloadforms));
        }
        if (service_code.equals("904")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ackslip));
            return;
        }
        if (service_code.equals(VContant.RC_CACELLATION_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.rc_release));
            return;
        }
        if (service_code.equals(VContant.RC_SURRENDER_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.rc_release));
            return;
        }
        if (service_code.equals(VContant.RC_RELEASE_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.rc_release));
            return;
        }
        if (service_code.equals(VContant.DUPLICATE_PERMIT_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.duplicatepermit));
            return;
        }
        if (service_code.equals(VContant.DUPLICATE_FITNESS_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.duplicatefitness));
            return;
        }
        if (service_code.equals(VContant.TempPermit_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.renewalpermit));
            return;
        }
        if (service_code.equals(VContant.RenewalNpAuthorization_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.renewalpermit));
            return;
        }
        if (service_code.equals(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.transferofowner));
            return;
        }
        if (service_code.equals(VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.permit_renewal));
            return;
        }
        if (service_code.equals(VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.hand));
            return;
        }
        if (service_code.equals(VContant.NOMINEE_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.nominee));
            return;
        }
        if (service_code.equals(VContant.MISELL_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.hand));
            return;
        }
        if (service_code.equals(VContant.ALTERATION_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.altration));
        } else if (service_code.equals("906")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.tax_assasment));
        } else if (service_code.equals("907")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.download_noc));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
