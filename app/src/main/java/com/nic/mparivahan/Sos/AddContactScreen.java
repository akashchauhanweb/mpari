package com.nic.mparivahan.Sos;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sos.AddContactScreen;
import com.nic.mparivahan.Sos.NetworkServices.SOSService;
import com.nic.mparivahan.Sos.SModle.ContactSaveSucess;
import com.nic.mparivahan.Sos.SModle.ContactUpdate;
import com.nic.mparivahan.Sos.SModle.DeletResult;
import com.nic.mparivahan.Sos.SModle.GetRelationMaster;
import com.nic.mparivahan.Sos.SModle.MparRelation;
import com.nic.mparivahan.Sos.SModle.MparSosContact;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.g6;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.pq;
import com.zepto.s46;
import com.zepto.ta3;
import com.zepto.u46;
import com.zepto.v46;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.z75;
import com.zepto.zx0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0002B\t¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001JD\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002J,\u0010\u0012\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0015J\b\u0010\u0016\u001a\u00020\rH\u0016J\u0010\u0010\u0017\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\u0010\u0010\u001a\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0018\u0010\u001d\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001bJ!\u0010\u001e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJJ\u0010(\u001a\u00020\u000f2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"2\"\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070$j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007`%2\u0006\u0010'\u001a\u00020\u000fR\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010Z\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR>\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070$j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007`%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR2\u0010#\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR2\u0010r\u001a\u0012\u0012\u0004\u0012\u00020\u001b0 j\b\u0012\u0004\u0012\u00020\u001b`\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010j\u001a\u0004\bp\u0010l\"\u0004\bq\u0010nR>\u0010v\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070$j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010d\u001a\u0004\bt\u0010f\"\u0004\bu\u0010hR\"\u0010~\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R%\u0010\u0082\u0001\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u007f\u0010y\u001a\u0005\b\u0080\u0001\u0010{\"\u0005\b\u0081\u0001\u0010}R&\u0010\u0086\u0001\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010y\u001a\u0005\b\u0084\u0001\u0010{\"\u0005\b\u0085\u0001\u0010}R\u001a\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u0092\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0095\u0001"}, d2 = {"Lcom/nic/mparivahan/Sos/AddContactScreen;", "Lcom/zepto/pq;", "", "Landroid/app/Dialog;", "mDialog", "Landroid/content/Context;", "context", "", "message", "soscRecordId", "mobile_no", "name", "reltion_contact", "", "V1", "", "position", "values", "W1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "w1", "contact_id", "z1", "b2", "Lcom/nic/mparivahan/Sos/SModle/MparSosContact;", "mcontact", "o2", "A1", "(Ljava/lang/Integer;Lcom/nic/mparivahan/Sos/SModle/MparSosContact;)V", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Sos/SModle/MparRelation;", "Lkotlin/collections/ArrayList;", "list", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "relationMasterHashMap", "relation_id", "K1", "Lcom/zepto/u46;", "C", "Lcom/zepto/u46;", "P1", "()Lcom/zepto/u46;", "n2", "(Lcom/zepto/u46;)V", "sosViewModle", "Lcom/nic/mparivahan/Sos/NetworkServices/SOSService;", "D", "Lcom/nic/mparivahan/Sos/NetworkServices/SOSService;", "sosService", "Lcom/nic/mparivahan/Sos/MovableFloatingActionButton;", "E", "Lcom/nic/mparivahan/Sos/MovableFloatingActionButton;", "B1", "()Lcom/nic/mparivahan/Sos/MovableFloatingActionButton;", "d2", "(Lcom/nic/mparivahan/Sos/MovableFloatingActionButton;)V", "addContactFloatingButton", "Landroidx/recyclerview/widget/RecyclerView;", "F", "Landroidx/recyclerview/widget/RecyclerView;", "D1", "()Landroidx/recyclerview/widget/RecyclerView;", "f2", "(Landroidx/recyclerview/widget/RecyclerView;)V", "contactRecyclerView", "Lcom/zepto/ws6;", "G", "Lcom/zepto/ws6;", "O1", "()Lcom/zepto/ws6;", "m2", "(Lcom/zepto/ws6;)V", "sessionManager", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "I1", "()Landroid/app/ProgressDialog;", "j2", "(Landroid/app/ProgressDialog;)V", "pDialog", "I", "J1", "()I", "setPos", "(I)V", "pos", "Lcom/zepto/zx0;", "J", "Lcom/zepto/zx0;", "E1", "()Lcom/zepto/zx0;", "g2", "(Lcom/zepto/zx0;)V", "contactadapter", "K", "Ljava/util/HashMap;", "M1", "()Ljava/util/HashMap;", "setRelationMasterHashMap", "(Ljava/util/HashMap;)V", "L", "Ljava/util/ArrayList;", "F1", "()Ljava/util/ArrayList;", "h2", "(Ljava/util/ArrayList;)V", "M", "G1", "setMcontactsosList", "mcontactsosList", "N", "getCapitalCities", "setCapitalCities", "capitalCities", "Landroid/widget/LinearLayout;", "O", "Landroid/widget/LinearLayout;", "C1", "()Landroid/widget/LinearLayout;", "e2", "(Landroid/widget/LinearLayout;)V", "add_to_contact_linear", "P", "L1", "k2", "recycle_linear", "Q", "H1", "i2", "nexgenarrow", "Lcom/zepto/g6;", "R", "Lcom/zepto/g6;", "binding", "Lcom/zepto/wa3;", "S", "Lcom/zepto/wa3;", "N1", "()Lcom/zepto/wa3;", "l2", "(Lcom/zepto/wa3;)V", "session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class AddContactScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public u46 sosViewModle;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public SOSService sosService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public MovableFloatingActionButton addContactFloatingButton;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public RecyclerView contactRecyclerView;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public int pos;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public zx0 contactadapter;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ArrayList list;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public LinearLayout add_to_contact_linear;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public LinearLayout recycle_linear;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public LinearLayout nexgenarrow;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public g6 binding;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public HashMap relationMasterHashMap = new HashMap();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ArrayList mcontactsosList = new ArrayList();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public HashMap capitalCities = new HashMap();

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            if (AddContactScreen.this.I1().isShowing()) {
                AddContactScreen.this.I1().dismiss();
            }
            Log.e("error", str.toString());
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(DeletResult deletResult) {
            Log.e("delet -- >", deletResult.toString());
            if (!StringsKt__StringsJVMKt.equals(deletResult.getStatusCode().toString(), "SOS001", true)) {
                AddContactScreen.this.I1().dismiss();
                AddContactScreen addContactScreen = AddContactScreen.this;
                Toast.makeText(addContactScreen, addContactScreen.N1().b("label_contact_failed_to_remove", "Failed to remove the contact"), 0).show();
                return;
            }
            AddContactScreen.this.I1().dismiss();
            AddContactScreen.this.E1().H(AddContactScreen.this.getPos());
            if (AddContactScreen.this.E1().C() == 0) {
                AddContactScreen.this.C1().setVisibility(0);
                AddContactScreen.this.L1().setVisibility(8);
            } else if (AddContactScreen.this.E1().C() >= 5) {
                AddContactScreen.this.L1().setVisibility(4);
                AddContactScreen.this.B1().setVisibility(4);
            } else {
                AddContactScreen.this.L1().setVisibility(0);
                AddContactScreen.this.B1().setVisibility(0);
            }
            AddContactScreen addContactScreen2 = AddContactScreen.this;
            Toast.makeText(addContactScreen2, addContactScreen2.N1().b("label_contact_removed_successfully", "Contact removed successfully"), 0).show();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DeletResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(GetRelationMaster getRelationMaster) {
            if (StringsKt__StringsJVMKt.equals(getRelationMaster.getStatusCode(), "MSTR001", true)) {
                AddContactScreen addContactScreen = AddContactScreen.this;
                List<MparRelation> mparRelation = getRelationMaster.getMparRelation();
                Intrinsics.checkNotNull(mparRelation, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Sos.SModle.MparRelation>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Sos.SModle.MparRelation> }");
                addContactScreen.h2((ArrayList) mparRelation);
                for (MparRelation mparRelation2 : AddContactScreen.this.F1()) {
                    Log.e("item", mparRelation2.getRelName());
                    AddContactScreen.this.getRelationMasterHashMap().put(Integer.valueOf(mparRelation2.getRelId()), mparRelation2.getRelName());
                }
                AddContactScreen.this.F1().add(0, new MparRelation(0, String.valueOf(AddContactScreen.this.N1().b("label_select_relation", "Select Relation")), 0));
            }
            AddContactScreen.this.P1().h(Long.parseLong(AddContactScreen.this.O1().k()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetRelationMaster) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            AddContactScreen.this.I1().dismiss();
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            AddContactScreen.this.I1().dismiss();
            try {
                AddContactScreen.this.getMcontactsosList().clear();
                JSONObject jSONObject = new JSONObject(str.toString());
                if (jSONObject.has("statusCode")) {
                    String string = jSONObject.getString("statusCode");
                    if (!StringsKt__StringsJVMKt.equals(string.toString(), "SOS001", true)) {
                        if (StringsKt__StringsJVMKt.equals(string, "SOS099", true)) {
                            AddContactScreen.this.C1().setVisibility(0);
                            AddContactScreen.this.B1().setVisibility(0);
                            AddContactScreen.this.D1().setVisibility(8);
                            AddContactScreen.this.L1().setVisibility(8);
                            return;
                        }
                        return;
                    }
                    JSONArray jSONArray = jSONObject.getJSONArray("sosContacts");
                    int length = jSONArray.length() - 1;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            int i2 = jSONObject2.getInt("soscRecordId");
                            String string2 = jSONObject2.getString("soscCreatedAt");
                            int i3 = jSONObject2.getInt("soscCtzId");
                            String string3 = jSONObject2.getString("soscMobile");
                            String string4 = jSONObject2.getString("soscName");
                            int i4 = jSONObject2.getInt("soscRelation");
                            int i5 = jSONObject2.getInt("soscStatus");
                            String string5 = jSONObject2.getString("soscUpdatedAt");
                            if (i5 == 1) {
                                Log.e("ContactListMaster --> ", "3");
                                Intrinsics.checkNotNull(string2);
                                Intrinsics.checkNotNull(string3);
                                Intrinsics.checkNotNull(string4);
                                Intrinsics.checkNotNull(string5);
                                AddContactScreen.this.getMcontactsosList().add(new MparSosContact(string2, i3, string3, string4, i2, i4, i5, string5));
                            }
                            if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    if (AddContactScreen.this.getMcontactsosList().size() <= 0) {
                        AddContactScreen.this.B1().setVisibility(0);
                        AddContactScreen.this.D1().setVisibility(8);
                        AddContactScreen.this.L1().setVisibility(8);
                        AddContactScreen.this.C1().setVisibility(0);
                        return;
                    }
                    Log.e("ContactListMaster --> ", VContant.MAINSCREEN);
                    AddContactScreen.this.C1().setVisibility(8);
                    AddContactScreen.this.D1().setVisibility(0);
                    AddContactScreen.this.L1().setVisibility(0);
                    AddContactScreen addContactScreen = AddContactScreen.this;
                    addContactScreen.g2(new zx0(addContactScreen.getMcontactsosList(), AddContactScreen.this.getRelationMasterHashMap(), AddContactScreen.this));
                    AddContactScreen.this.D1().setAdapter(AddContactScreen.this.E1());
                    if (AddContactScreen.this.getMcontactsosList().size() >= 5) {
                        AddContactScreen.this.B1().setVisibility(4);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            AddContactScreen.this.I1().dismiss();
            Log.e("error", str.toString());
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(ContactSaveSucess contactSaveSucess) {
            if (StringsKt__StringsJVMKt.equals(contactSaveSucess.getStatusCode().toString(), "SOS001", true)) {
                AddContactScreen addContactScreen = AddContactScreen.this;
                Toast.makeText(addContactScreen, addContactScreen.N1().b("label_contact_added_successfully", "Contact details added successfully"), 0).show();
                AddContactScreen.this.P1().h(Long.parseLong(AddContactScreen.this.O1().k()));
            } else if (StringsKt__StringsJVMKt.equals(contactSaveSucess.getStatusCode().toString(), "SOS006", true)) {
                AddContactScreen.this.I1().dismiss();
                AddContactScreen.this.b2(contactSaveSucess.getStatusDesc().toString());
            } else if (StringsKt__StringsJVMKt.equals(contactSaveSucess.getStatusCode(), "SOS005", true)) {
                AddContactScreen.this.I1().dismiss();
                AddContactScreen.this.b2(contactSaveSucess.getStatusDesc());
            } else {
                AddContactScreen.this.I1().dismiss();
                AddContactScreen addContactScreen2 = AddContactScreen.this;
                addContactScreen2.b2(addContactScreen2.N1().b("label_unable_add_contact", "Unable to add the contact details, Please try after some time!"));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ContactSaveSucess) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public h(Function1 function) {
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

    public static final void Q1(AddContactScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void R1(AddContactScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w1(this$0);
    }

    public static final void S1(AddContactScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I1().dismiss();
        Log.e("error", str.toString());
    }

    public static final void T1(AddContactScreen this$0, ContactUpdate contactUpdate) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (StringsKt__StringsJVMKt.equals(contactUpdate.getStatusCode().toString(), "SOS001", true)) {
            Toast.makeText(this$0, this$0.N1().b("label_contact_updated_successfully", "Contact details updated successfully"), 0).show();
            this$0.P1().h(Long.parseLong(this$0.O1().k()));
        } else if (StringsKt__StringsJVMKt.equals(contactUpdate.getStatusCode(), "SOS005", true)) {
            if (this$0.I1().isShowing()) {
                this$0.I1().dismiss();
            }
            this$0.b2(contactUpdate.getStatusDesc());
        }
    }

    public static final void U1(AddContactScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.I1().isShowing()) {
            this$0.I1().dismiss();
        }
        Toast.makeText(this$0, this$0.N1().b("label_contact_failed_to_remove", "Failed to remove the contact"), 0).show();
    }

    public static final void X1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void Y1(Dialog d2, Dialog mDialog, AddContactScreen this$0, String soscRecordId, String mobile_no, String name, String reltion_contact, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(mDialog, "$mDialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(soscRecordId, "$soscRecordId");
        Intrinsics.checkNotNullParameter(mobile_no, "$mobile_no");
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(reltion_contact, "$reltion_contact");
        d2.dismiss();
        mDialog.dismiss();
        this$0.I1().show();
        this$0.P1().u(Long.parseLong(soscRecordId), Long.parseLong(this$0.O1().k()), mobile_no, name, reltion_contact);
    }

    public static final void Z1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void a2(Dialog d2, AddContactScreen this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.I1().show();
        this$0.P1().g(String.valueOf(i));
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void p2(EditText full_name, EditText phone_number, AddContactScreen this$0, Spinner select_spinner, Dialog d2, MparSosContact mcontact, View view) {
        Intrinsics.checkNotNullParameter(full_name, "$full_name");
        Intrinsics.checkNotNullParameter(phone_number, "$phone_number");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(select_spinner, "$select_spinner");
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(mcontact, "$mcontact");
        String string = full_name.getText().toString();
        String string2 = phone_number.getText().toString();
        if (string.length() < 3) {
            Toast.makeText(this$0, this$0.N1().b("please_enter_valid_name", "Please enter the valid name"), 0).show();
            return;
        }
        if (string2.length() < 10) {
            Toast.makeText(this$0, this$0.N1().b("label_log_entr_vali_mobno", "Please enter the valid mobile number"), 0).show();
        } else {
            if (select_spinner.getSelectedItemPosition() == 0) {
                Toast.makeText(this$0, this$0.N1().b("label_please_select_relation", "Please select the relation"), 0).show();
                return;
            }
            Object selectedItem = select_spinner.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Sos.SModle.MparRelation");
            this$0.V1(d2, this$0, this$0.N1().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed)), String.valueOf(mcontact.getSoscRecordId()), string2, string, String.valueOf(((MparRelation) selectedItem).getRelId()));
        }
    }

    public static final void q2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void x1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void y1(EditText full_name, EditText phone_number, AddContactScreen this$0, Spinner select_spinner, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(full_name, "$full_name");
        Intrinsics.checkNotNullParameter(phone_number, "$phone_number");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(select_spinner, "$select_spinner");
        Intrinsics.checkNotNullParameter(d2, "$d");
        String string = full_name.getText().toString();
        String string2 = phone_number.getText().toString();
        if (string.length() < 3) {
            Toast.makeText(this$0, this$0.N1().b("please_enter_valid_name", "Please enter the valid name"), 0).show();
            return;
        }
        if (string2.length() < 10) {
            Toast.makeText(this$0, this$0.N1().b("label_log_entr_vali_mobno", "Please enter the valid mobile number"), 0).show();
            return;
        }
        if (!mt6.a.t(string2)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.N1().b("label_log_entr_vali_mobno", "Please enter the valid mobile number"), 1).show();
            return;
        }
        if (select_spinner.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.N1().b("label_please_select_relation", "Please select the relation"), 0).show();
            return;
        }
        Object selectedItem = select_spinner.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Sos.SModle.MparRelation");
        this$0.I1().show();
        this$0.P1().t(Long.parseLong(this$0.O1().k()), string, string2, String.valueOf(((MparRelation) selectedItem).getRelId()));
        d2.dismiss();
    }

    public void A1(Integer position, MparSosContact mcontact) {
        Intrinsics.checkNotNullParameter(mcontact, "mcontact");
        o2(this, mcontact);
    }

    public final MovableFloatingActionButton B1() {
        MovableFloatingActionButton movableFloatingActionButton = this.addContactFloatingButton;
        if (movableFloatingActionButton != null) {
            return movableFloatingActionButton;
        }
        Intrinsics.throwUninitializedPropertyAccessException("addContactFloatingButton");
        return null;
    }

    public final LinearLayout C1() {
        LinearLayout linearLayout = this.add_to_contact_linear;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("add_to_contact_linear");
        return null;
    }

    public final RecyclerView D1() {
        RecyclerView recyclerView = this.contactRecyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contactRecyclerView");
        return null;
    }

    public final zx0 E1() {
        zx0 zx0Var = this.contactadapter;
        if (zx0Var != null) {
            return zx0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contactadapter");
        return null;
    }

    public final ArrayList F1() {
        ArrayList arrayList = this.list;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("list");
        return null;
    }

    /* JADX INFO: renamed from: G1, reason: from getter */
    public final ArrayList getMcontactsosList() {
        return this.mcontactsosList;
    }

    public final LinearLayout H1() {
        LinearLayout linearLayout = this.nexgenarrow;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexgenarrow");
        return null;
    }

    public final ProgressDialog I1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    /* JADX INFO: renamed from: J1, reason: from getter */
    public final int getPos() {
        return this.pos;
    }

    public final int K1(ArrayList list, HashMap relationMasterHashMap, int relation_id) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(relationMasterHashMap, "relationMasterHashMap");
        try {
            return list.indexOf(new MparRelation(relation_id, String.valueOf(relationMasterHashMap.get(Integer.valueOf(relation_id))), 1));
        } catch (Exception unused) {
            return 0;
        }
    }

    public final LinearLayout L1() {
        LinearLayout linearLayout = this.recycle_linear;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recycle_linear");
        return null;
    }

    /* JADX INFO: renamed from: M1, reason: from getter */
    public final HashMap getRelationMasterHashMap() {
        return this.relationMasterHashMap;
    }

    public final wa3 N1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final ws6 O1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final u46 P1() {
        u46 u46Var = this.sosViewModle;
        if (u46Var != null) {
            return u46Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sosViewModle");
        return null;
    }

    public final void V1(final Dialog mDialog, Context context, String message, final String soscRecordId, final String mobile_no, final String name, final String reltion_contact) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(N1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(N1().b("button_proceed", "Proceed"));
        textView2.setText(N1().b("button_cancel", "Cancel"));
        ((TextView) viewFindViewById).setText(message);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddContactScreen.X1(dialog, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddContactScreen.Y1(dialog, mDialog, this, soscRecordId, mobile_no, name, reltion_contact, view);
            }
        });
        dialog.show();
    }

    public final void W1(Context context, String message, int position, final int values) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(N1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(N1().b("button_proceed", "Proceed"));
        textView2.setText(N1().b("button_cancel", "Cancel"));
        ((TextView) viewFindViewById).setText(message);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ci
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddContactScreen.Z1(dialog, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.di
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddContactScreen.a2(dialog, this, values, view);
            }
        });
        dialog.show();
    }

    public final void b2(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(N1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(N1().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddContactScreen.c2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void d2(MovableFloatingActionButton movableFloatingActionButton) {
        Intrinsics.checkNotNullParameter(movableFloatingActionButton, "<set-?>");
        this.addContactFloatingButton = movableFloatingActionButton;
    }

    public final void e2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.add_to_contact_linear = linearLayout;
    }

    public final void f2(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.contactRecyclerView = recyclerView;
    }

    public final void g2(zx0 zx0Var) {
        Intrinsics.checkNotNullParameter(zx0Var, "<set-?>");
        this.contactadapter = zx0Var;
    }

    public final void h2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.list = arrayList;
    }

    public final void i2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.nexgenarrow = linearLayout;
    }

    public final void j2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void k2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.recycle_linear = linearLayout;
    }

    public final void l2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void m2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void n2(u46 u46Var) {
        Intrinsics.checkNotNullParameter(u46Var, "<set-?>");
        this.sosViewModle = u46Var;
    }

    public final void o2(Context context, final MparSosContact mcontact) {
        Intrinsics.checkNotNullParameter(mcontact, "mcontact");
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.update_contact_details);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.save_button);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.closebutton);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById3 = dialog.findViewById(R.id.full_name);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.phone_number);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText2 = (EditText) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.select_spinner);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.Spinner");
        final Spinner spinner = (Spinner) viewFindViewById5;
        String soscName = mcontact.getSoscName();
        String soscMobile = mcontact.getSoscMobile();
        editText.setText(soscName.toString());
        editText2.setText(soscMobile.toString());
        View viewFindViewById6 = dialog.findViewById(R.id.tv_name);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById6).setText(N1().b("label_name", "Name"));
        ((TextView) dialog.findViewById(R.id.tv_phone_no)).setText(N1().b("label_phone_number", "Phone Number"));
        ((TextView) dialog.findViewById(R.id.tv_relation)).setText(N1().b("label_relation", "Relation"));
        ((TextView) dialog.findViewById(R.id.tv_update)).setText(N1().b("btn_Update", "Update"));
        ((TextView) dialog.findViewById(R.id.tv_close)).setText(N1().b("btn_dl_serv_close", "Close"));
        F1().add(0, new MparRelation(0, String.valueOf(N1().b("label_select_relation", "Select Relation")), 0));
        spinner.setAdapter((SpinnerAdapter) new z75(this, F1()));
        spinner.setSelection(K1(F1(), this.relationMasterHashMap, mcontact.getSoscRelation()));
        ((LinearLayout) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ni
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddContactScreen.q2(dialog, view);
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddContactScreen.p2(editText, editText2, this, spinner, dialog, mcontact, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        g6 g6VarC = g6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(g6VarC, "inflate(...)");
        this.binding = g6VarC;
        SOSService sOSService = null;
        if (g6VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g6VarC = null;
        }
        setContentView(g6VarC.b());
        l2(new wa3(this));
        ta3.a aVar = ta3.a;
        g6 g6Var = this.binding;
        if (g6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g6Var = null;
        }
        aVar.s(this, g6Var);
        this.sosService = SOSService.INSTANCE.a(this);
        View viewFindViewById = findViewById(R.id.add_person_fab);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        d2((MovableFloatingActionButton) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.contactRecyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        f2((RecyclerView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.add_to_contact_linear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        e2((LinearLayout) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.recycle_linear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        k2((LinearLayout) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.nexgenarrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        i2((LinearLayout) viewFindViewById5);
        D1().setLayoutManager(new LinearLayoutManager(this, 1, false));
        m2(new ws6(this));
        j2(new ProgressDialog(this));
        I1().setMessage(N1().b("label_challan_please_wait", "Please wait..."));
        I1().setCancelable(false);
        I1().setCanceledOnTouchOutside(false);
        H1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddContactScreen.Q1(this.a, view);
            }
        });
        B1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddContactScreen.R1(this.a, view);
            }
        });
        SOSService sOSService2 = this.sosService;
        if (sOSService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sosService");
        } else {
            sOSService = sOSService2;
        }
        n2((u46) new z(this, new v46(new s46(sOSService))).a(u46.class));
        I1().show();
        P1().q();
        P1().o().g(this, new h(new c()));
        P1().p().g(this, new h(new d()));
        P1().m().g(this, new h(new e()));
        P1().n().g(this, new h(new f()));
        P1().j().g(this, new h(new g()));
        P1().i().g(this, new mf4() { // from class: com.zepto.hi
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AddContactScreen.S1(this.a, (String) obj);
            }
        });
        P1().r().g(this, new mf4() { // from class: com.zepto.ii
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AddContactScreen.T1(this.a, (ContactUpdate) obj);
            }
        });
        P1().s().g(this, new h(new a()));
        P1().k().g(this, new h(new b()));
        P1().l().g(this, new mf4() { // from class: com.zepto.ji
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AddContactScreen.U1(this.a, (String) obj);
            }
        });
    }

    public final void w1(Context context) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.save_contact_diloge);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.save_button);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById2 = dialog.findViewById(R.id.closebutton);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById3 = dialog.findViewById(R.id.full_name);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.phone_number);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText2 = (EditText) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.select_spinner);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.Spinner");
        final Spinner spinner = (Spinner) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.tv_name);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById6).setText(N1().b("label_name", "Name"));
        editText.setHint(N1().b("label_log_entr_name", "Name"));
        ((TextView) dialog.findViewById(R.id.tv_phone_no)).setText(N1().b("label_phone_number", "Phone Number"));
        editText2.setHint(N1().b("label_log_entr_mob_no", "Please enter the mobile number"));
        ((TextView) dialog.findViewById(R.id.tv_relation)).setText(N1().b("label_relation", "Relation"));
        ((TextView) dialog.findViewById(R.id.tv_save)).setText(N1().b("label_save", "Save"));
        ((TextView) dialog.findViewById(R.id.tv_close)).setText(N1().b("btn_dl_serv_close", "Close"));
        spinner.setAdapter((SpinnerAdapter) new z75(this, F1()));
        ((LinearLayout) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.li
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddContactScreen.x1(dialog, view);
            }
        });
        ((LinearLayout) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddContactScreen.y1(editText, editText2, this, spinner, dialog, view);
            }
        });
        dialog.show();
    }

    public void z1(int position, int contact_id) {
        this.pos = position;
        W1(this, N1().b("label_want_to_proceed", getString(R.string.are_you_want_to_proceed)), position, contact_id);
    }
}
