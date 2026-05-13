package com.zepto;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.AddCov.View.CovApplication;
import com.nic.mparivahan.ClServices.View.NewCl.NewClOne;
import com.nic.mparivahan.ClServicesMainScreens.ClServicesMainScreen;
import com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.LLMainScreen.LLMain;
import com.nic.mparivahan.LLServices.editlearnerlicence.Activity.EditLearnerAppScreen;
import com.nic.mparivahan.NewDlScreen.Activity.LLNoCheckActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity;
import com.nic.mparivahan.ServiceWithdrawnScreen.Activity.ApplicationDetails;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenceDownloadActivity;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenseTestActivity;
import com.nic.mparivahan.dlservices.ui.ViewDocs.AppNumberScreen;
import com.nic.mparivahan.dlservices.ui.appcancel.ApplicationCancel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class y32 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;
    public final String f;

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

    public y32(ArrayList mList, Context mContext, String state_code) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        this.d = mList;
        this.e = mContext;
        this.f = state_code;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void G(Enabledservice mModel, final y32 this$0, final wa3 langSession, a holder, View view) {
        Intrinsics.checkNotNullParameter(mModel, "$mModel");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        String servCode = mModel.getServCode();
        switch (servCode.hashCode()) {
            case 49587:
                if (servCode.equals("201")) {
                    Intent intent = new Intent(this$0.e, (Class<?>) ApplicationStatusActivity.class);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "201");
                    this$0.e.startActivity(intent);
                    break;
                }
                break;
            case 49589:
                if (servCode.equals("203")) {
                    Intent intent2 = new Intent(this$0.e, (Class<?>) ApplicationDetails.class);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "203");
                    this$0.e.startActivity(intent2);
                    break;
                }
                break;
            case 49590:
                if (servCode.equals("204")) {
                    Intent intent3 = new Intent(this$0.e, (Class<?>) DlServicesMainScreen.class);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "204");
                    this$0.e.startActivity(intent3);
                    break;
                }
                break;
            case 51694:
                if (servCode.equals("460")) {
                    try {
                        Intent intent4 = new Intent(this$0.e, (Class<?>) ApplicationCancel.class);
                        new wl5(this$0.e).t(holder.P().getText().toString(), "460");
                        this$0.e.startActivity(intent4);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                    break;
                }
                break;
            case 52470:
                if (servCode.equals("501")) {
                    Intent intent5 = new Intent(this$0.e, (Class<?>) LearnerLicenceAadharScreen.class);
                    intent5.putExtra("state_code", this$0.f);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "501");
                    this$0.e.startActivity(intent5);
                    break;
                }
                break;
            case 52471:
                if (servCode.equals("502")) {
                    Intent intent6 = new Intent(this$0.e, (Class<?>) LLMain.class);
                    intent6.putExtra("state_code", this$0.f);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "502");
                    this$0.e.startActivity(intent6);
                    break;
                }
                break;
            case 52473:
                if (servCode.equals("504")) {
                    Intent intent7 = new Intent(this$0.e, (Class<?>) LLMain.class);
                    intent7.putExtra("state_code", this$0.f);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "504");
                    this$0.e.startActivity(intent7);
                    break;
                }
                break;
            case 52501:
                if (servCode.equals("511")) {
                    Intent intent8 = new Intent(this$0.e, (Class<?>) LLNoCheckActivity.class);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "511");
                    this$0.e.startActivity(intent8);
                    break;
                }
                break;
            case 52503:
                if (servCode.equals("513")) {
                    Intent intent9 = new Intent(this$0.e, (Class<?>) DlServicesMainScreen.class);
                    new wl5(this$0.e).t(holder.P().getText().toString(), VContant.APPLICATION_SCREEN);
                    this$0.e.startActivity(intent9);
                    break;
                }
                break;
            case 52504:
                if (servCode.equals("514")) {
                    Intent intent10 = new Intent(this$0.e, (Class<?>) DlServicesMainScreen.class);
                    new wl5(this$0.e).t(holder.P().getText().toString(), VContant.MAINSCREEN);
                    this$0.e.startActivity(intent10);
                    break;
                }
                break;
            case 52505:
                if (servCode.equals("515")) {
                    Intent intent11 = new Intent(this$0.e, (Class<?>) DlServicesMainScreen.class);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "3");
                    this$0.e.startActivity(intent11);
                    break;
                }
                break;
            case 52506:
                if (servCode.equals("516")) {
                    Intent intent12 = new Intent(this$0.e, (Class<?>) DlServicesMainScreen.class);
                    new wl5(this$0.e).t(holder.P().getText().toString(), VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
                    this$0.e.startActivity(intent12);
                    break;
                }
                break;
            case 52534:
                if (servCode.equals("523")) {
                    Intent intent13 = new Intent(this$0.e, (Class<?>) DlServicesMainScreen.class);
                    new wl5(this$0.e).t(holder.P().getText().toString(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE);
                    this$0.e.startActivity(intent13);
                    break;
                }
                break;
            case 52535:
                if (servCode.equals("524")) {
                    try {
                        Intent intent14 = new Intent(this$0.e, (Class<?>) DlServicesMainScreen.class);
                        new wl5(this$0.e).t(holder.P().getText().toString(), "524");
                        this$0.e.startActivity(intent14);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return;
                    }
                    break;
                }
                break;
            case 52536:
                if (servCode.equals("525")) {
                    Intent intent15 = new Intent(this$0.e, (Class<?>) DlServicesMainScreen.class);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "4");
                    this$0.e.startActivity(intent15);
                    break;
                }
                break;
            case 52537:
                if (servCode.equals("526")) {
                    Intent intent16 = new Intent(this$0.e, (Class<?>) DlServicesMainScreen.class);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "526");
                    this$0.e.startActivity(intent16);
                    break;
                }
                break;
            case 52601:
                if (servCode.equals("548")) {
                    try {
                        Intent intent17 = new Intent(this$0.e, (Class<?>) DlServicesMainScreen.class);
                        new wl5(this$0.e).t(holder.P().getText().toString(), "548");
                        this$0.e.startActivity(intent17);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        return;
                    }
                    break;
                }
                break;
            case 52625:
                if (servCode.equals("551")) {
                    try {
                        Intent intent18 = new Intent(this$0.e, (Class<?>) NewClOne.class);
                        new wl5(this$0.e).t(holder.P().getText().toString(), "551");
                        this$0.e.startActivity(intent18);
                    } catch (Exception e4) {
                        e4.printStackTrace();
                        return;
                    }
                    break;
                }
                break;
            case 52626:
                if (servCode.equals("552")) {
                    try {
                        Intent intent19 = new Intent(this$0.e, (Class<?>) ClServicesMainScreen.class);
                        new wl5(this$0.e).t(holder.P().getText().toString(), "552");
                        this$0.e.startActivity(intent19);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        return;
                    }
                    break;
                }
                break;
            case 52627:
                if (servCode.equals("553")) {
                    try {
                        Intent intent20 = new Intent(this$0.e, (Class<?>) ClServicesMainScreen.class);
                        new wl5(this$0.e).t(holder.P().getText().toString(), "553");
                        this$0.e.startActivity(intent20);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                        return;
                    }
                    break;
                }
                break;
            case 52628:
                if (servCode.equals("554")) {
                    try {
                        Intent intent21 = new Intent(this$0.e, (Class<?>) ClServicesMainScreen.class);
                        new wl5(this$0.e).t(holder.P().getText().toString(), "554");
                        this$0.e.startActivity(intent21);
                    } catch (Exception e7) {
                        e7.printStackTrace();
                        return;
                    }
                    break;
                }
                break;
            case 52633:
                if (servCode.equals("559")) {
                    try {
                        Intent intent22 = new Intent(this$0.e, (Class<?>) ClServicesMainScreen.class);
                        new wl5(this$0.e).t(holder.P().getText().toString(), "559");
                        this$0.e.startActivity(intent22);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        return;
                    }
                    break;
                }
                break;
            case 52690:
                if (servCode.equals("574")) {
                    Intent intent23 = new Intent(this$0.e, (Class<?>) LLMain.class);
                    intent23.putExtra("state_code", this$0.f);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "574");
                    this$0.e.startActivity(intent23);
                    break;
                }
                break;
            case 56314:
                if (servCode.equals("901")) {
                    try {
                        Intent intent24 = new Intent(this$0.e, (Class<?>) ApplicationStatusActivity.class);
                        new wl5(this$0.e).t(holder.P().getText().toString(), "901");
                        this$0.e.startActivity(intent24);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                        return;
                    }
                    break;
                }
                break;
            case 56315:
                if (servCode.equals("902")) {
                    Intent intent25 = new Intent(this$0.e, (Class<?>) ApplicationStatusActivity.class);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "902");
                    this$0.e.startActivity(intent25);
                    break;
                }
                break;
            case 56316:
                if (servCode.equals("903")) {
                    final Dialog dialog = new Dialog(this$0.e);
                    dialog.setContentView(R.layout.download_forms);
                    Window window = dialog.getWindow();
                    Intrinsics.checkNotNull(window);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    View viewFindViewById = dialog.findViewById(R.id.dec_form_one);
                    Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) viewFindViewById;
                    View viewFindViewById2 = dialog.findViewById(R.id.cancelIv);
                    Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
                    ImageView imageView = (ImageView) viewFindViewById2;
                    View viewFindViewById3 = dialog.findViewById(R.id.form_one);
                    Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView2 = (TextView) viewFindViewById3;
                    View viewFindViewById4 = dialog.findViewById(R.id.form_two);
                    Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView3 = (TextView) viewFindViewById4;
                    View viewFindViewById5 = dialog.findViewById(R.id.tv_title);
                    Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
                    textView.setText(langSession.b("label_form_1", "View Form 1-A"));
                    ((TextView) viewFindViewById5).setText(langSession.b("nex_parivahan", "NextGen mParivahan"));
                    textView2.setText(langSession.b("label_view_form_1", "View Form 1-A"));
                    textView3.setText(langSession.b("label_view_form_2", "View Form 2"));
                    if (StringsKt__StringsJVMKt.equals(new wl5(this$0.e).b(), "4", true)) {
                        textView3.setText(langSession.b("label_form_4", "View Form 4-A"));
                    } else {
                        textView3.setText(langSession.b("label_view_form_2", "View Form 2"));
                    }
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u32
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            y32.H(dialog, view2);
                        }
                    });
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v32
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            y32.I(dialog, this$0, langSession, view2);
                        }
                    });
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w32
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            y32.J(dialog, this$0, langSession, view2);
                        }
                    });
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x32
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            y32.K(dialog, this$0, langSession, view2);
                        }
                    });
                    dialog.show();
                    break;
                }
                break;
            case 56320:
                if (servCode.equals("907")) {
                    Intent intent26 = new Intent(this$0.e, (Class<?>) EditLearnerAppScreen.class);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "907");
                    this$0.e.startActivity(intent26);
                    break;
                }
                break;
            case 56321:
                if (servCode.equals("908")) {
                    Intent intent27 = new Intent(this$0.e, (Class<?>) AppNumberScreen.class);
                    intent27.putExtra("state_code", this$0.f);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "908");
                    this$0.e.startActivity(intent27);
                    break;
                }
                break;
            case 56322:
                if (servCode.equals("909")) {
                    Intent intent28 = new Intent(this$0.e, (Class<?>) CovApplication.class);
                    intent28.putExtra("state_code", this$0.f);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "909");
                    this$0.e.startActivity(intent28);
                    break;
                }
                break;
            case 56344:
                if (servCode.equals("910")) {
                    Intent intent29 = new Intent(this$0.e, (Class<?>) LearnerLicenseTestActivity.class);
                    intent29.putExtra("state_code", this$0.f);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "910");
                    this$0.e.startActivity(intent29);
                    break;
                }
                break;
            case 56468:
                if (servCode.equals(VContant.MULTISERVICE_PURPOSE_CODE)) {
                    Intent intent30 = new Intent(this$0.e, (Class<?>) DlServicesMainScreen.class);
                    wl5 wl5Var = new wl5(this$0.e);
                    String strB = langSession.b("dl_services", "DL Services");
                    Intrinsics.checkNotNull(strB);
                    wl5Var.t(strB, VContant.MULTISERVICE_PURPOSE_CODE);
                    this$0.e.startActivity(intent30);
                    break;
                }
                break;
            case 56499:
                if (servCode.equals("960")) {
                    Intent intent31 = new Intent(this$0.e, (Class<?>) LearnerLicenceDownloadActivity.class);
                    intent31.putExtra("state_code", this$0.f);
                    new wl5(this$0.e).t(holder.P().getText().toString(), "910");
                    this$0.e.startActivity(intent31);
                    break;
                }
                break;
        }
    }

    public static final void H(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void I(Dialog d, y32 this$0, wa3 langSession, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        d.dismiss();
        Intent intent = new Intent(this$0.e, (Class<?>) ApplicationStatusActivity.class);
        wl5 wl5Var = new wl5(this$0.e);
        String strB = langSession.b("View Form 1", "View Form 1");
        Intrinsics.checkNotNull(strB);
        wl5Var.t(strB, "1001");
        this$0.e.startActivity(intent);
    }

    public static final void J(Dialog d, y32 this$0, wa3 langSession, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        d.dismiss();
        Intent intent = new Intent(this$0.e, (Class<?>) ApplicationStatusActivity.class);
        wl5 wl5Var = new wl5(this$0.e);
        String strB = langSession.b("label_view_form_1", "View Form 1-A");
        Intrinsics.checkNotNull(strB);
        wl5Var.t(strB, "1000");
        this$0.e.startActivity(intent);
    }

    public static final void K(Dialog d, y32 this$0, wa3 langSession, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        d.dismiss();
        Intent intent = new Intent(this$0.e, (Class<?>) ApplicationStatusActivity.class);
        wl5 wl5Var = new wl5(this$0.e);
        String strB = langSession.b("label_view_form_2", "View Form 2");
        Intrinsics.checkNotNull(strB);
        wl5Var.t(strB, "1002");
        this$0.e.startActivity(intent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void p(final a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final wa3 wa3Var = new wa3(this.e);
        Object obj = this.d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        final Enabledservice enabledservice = (Enabledservice) obj;
        if (Intrinsics.areEqual(enabledservice.getServCode(), "513")) {
            holder.P().setText(wa3Var.b("check_dl_serv_dupl_dl", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "514")) {
            holder.P().setText(wa3Var.b("check_dl_serv_renewal_dl", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "515")) {
            holder.P().setText(wa3Var.b("check_dl_serv_change_addr", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "516")) {
            holder.P().setText(wa3Var.b("check_dl_serv_replacement_dl", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "523")) {
            holder.P().setText(wa3Var.b("check_dl_serv_extract_dl", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "525")) {
            holder.P().setText(wa3Var.b("check_dl_serv_intern_dl_perm", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "524")) {
            holder.P().setText(wa3Var.b("hill_region_title", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "548")) {
            holder.P().setText(wa3Var.b("change_birth_dl", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "551")) {
            holder.P().setText(wa3Var.b("new_cl", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "559")) {
            holder.P().setText(wa3Var.b("change_name_in_cl", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "504")) {
            holder.P().setText(wa3Var.b("coa_ll", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "203")) {
            holder.P().setText(wa3Var.b("service_withdraw", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "201")) {
            holder.P().setText(wa3Var.b("label_application_status", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "553")) {
            holder.P().setText(wa3Var.b("coa_in_cl", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "554")) {
            holder.P().setText(wa3Var.b("duplicate_cl", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "204")) {
            holder.P().setText(wa3Var.b("label_dl_serv_update_mob", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "902")) {
            holder.P().setText(wa3Var.b("btn_Download_Appointment_Slip", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "901")) {
            holder.P().setText(wa3Var.b("btn_challan_print_receipt", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "903")) {
            holder.P().setText(wa3Var.b("download_forms", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "502")) {
            holder.P().setText(wa3Var.b("duplicate_ll", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "552")) {
            holder.P().setText(wa3Var.b("renewal_of_cl", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "511")) {
            holder.P().setText(wa3Var.b("new_driving_licence", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "908")) {
            holder.P().setText(wa3Var.b("view_docs", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "909")) {
            holder.P().setText(wa3Var.b("add_class_of_vehicle", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "526")) {
            holder.P().setText(wa3Var.b("change_name_dl", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "460")) {
            holder.P().setText(wa3Var.b("app_cancel_service", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "907")) {
            holder.P().setText(wa3Var.b("edit_app_in_ll", enabledservice.getServName()));
        } else if (Intrinsics.areEqual(enabledservice.getServCode(), "574")) {
            holder.P().setText(wa3Var.b("change_name_in_ll", enabledservice.getServName()));
        } else {
            holder.P().setText(enabledservice.getServName());
        }
        M(enabledservice.getServCode(), holder);
        holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y32.G(enabledservice, this, wa3Var, holder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.es_sarathi_adapter, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void M(String servCode, a holder) {
        Intrinsics.checkNotNullParameter(servCode, "servCode");
        Intrinsics.checkNotNullParameter(holder, "holder");
        switch (servCode.hashCode()) {
            case 49587:
                if (servCode.equals("201")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.check_list));
                    return;
                }
                break;
            case 49590:
                if (servCode.equals("204")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.smartphone));
                    return;
                }
                break;
            case 52473:
                if (servCode.equals("504")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.cao_new));
                    return;
                }
                break;
            case 52503:
                if (servCode.equals("513")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_newdriving));
                    return;
                }
                break;
            case 52504:
                if (servCode.equals("514")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_learnerr));
                    return;
                }
                break;
            case 52505:
                if (servCode.equals("515")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.mvvm_ic_addres));
                    return;
                }
                break;
            case 52506:
                if (servCode.equals("516")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_exxtract));
                    return;
                }
                break;
            case 52534:
                if (servCode.equals("523")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.mvvm_ic_addres));
                    return;
                }
                break;
            case 52535:
                if (servCode.equals("524")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.endorsedl));
                    return;
                }
                break;
            case 52536:
                if (servCode.equals("525")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.mvvm_dl));
                    return;
                }
                break;
            case 52537:
                if (servCode.equals("526")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.coname));
                    return;
                }
                break;
            case 52601:
                if (servCode.equals("548")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.codob));
                    return;
                }
                break;
            case 52625:
                if (servCode.equals("551")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.newcl));
                    return;
                }
                break;
            case 52627:
                if (servCode.equals("553")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.cao_new));
                    return;
                }
                break;
            case 52633:
                if (servCode.equals("559")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.coname));
                    return;
                }
                break;
            case 52690:
                if (servCode.equals("574")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.coname));
                    return;
                }
                break;
            case 53430:
                if (servCode.equals("600")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.dispose_icon));
                    return;
                }
                break;
            case 56314:
                if (servCode.equals("901")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.print_receipt));
                    return;
                }
                break;
            case 56315:
                if (servCode.equals("902")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ackslip));
                    return;
                }
                break;
            case 56318:
                if (servCode.equals("905")) {
                    holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.check_list));
                    return;
                }
                break;
        }
        holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_learnerr));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
