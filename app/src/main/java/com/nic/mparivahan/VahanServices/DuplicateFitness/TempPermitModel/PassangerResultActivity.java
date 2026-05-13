package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.PassangerResultActivity;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.VaSplPassengerdto;
import com.zepto.le;
import com.zepto.pq;
import com.zepto.rl4;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R2\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/PassangerResultActivity;", "Lcom/zepto/pq;", "", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "p1", "Lcom/zepto/le;", "C", "Lcom/zepto/le;", "w1", "()Lcom/zepto/le;", "A1", "(Lcom/zepto/le;)V", "binding", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/VaSplPassengerdto;", "Lkotlin/collections/ArrayList;", "D", "Ljava/util/ArrayList;", "getListPassengerdto", "()Ljava/util/ArrayList;", "setListPassengerdto", "(Ljava/util/ArrayList;)V", "listPassengerdto", "Lcom/zepto/rl4;", "E", "Lcom/zepto/rl4;", "v1", "()Lcom/zepto/rl4;", "z1", "(Lcom/zepto/rl4;)V", "adapter", "", "F", "Ljava/lang/String;", "getSeatingCap", "()Ljava/lang/String;", "setSeatingCap", "(Ljava/lang/String;)V", "seatingCap", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class PassangerResultActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public le binding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public rl4 adapter;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ArrayList listPassengerdto = new ArrayList();

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String seatingCap = "";

    public static final void q1(Ref.ObjectRef genderSelect, RadioButton femail, RadioButton other, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(genderSelect, "$genderSelect");
        Intrinsics.checkNotNullParameter(femail, "$femail");
        Intrinsics.checkNotNullParameter(other, "$other");
        if (z) {
            genderSelect.element = "Male";
            femail.setChecked(false);
            other.setChecked(false);
        }
    }

    public static final void r1(Ref.ObjectRef genderSelect, RadioButton mail, RadioButton other, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(genderSelect, "$genderSelect");
        Intrinsics.checkNotNullParameter(mail, "$mail");
        Intrinsics.checkNotNullParameter(other, "$other");
        if (z) {
            genderSelect.element = "Female";
            mail.setChecked(false);
            other.setChecked(false);
        }
    }

    public static final void s1(Ref.ObjectRef genderSelect, RadioButton mail, RadioButton femail, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(genderSelect, "$genderSelect");
        Intrinsics.checkNotNullParameter(mail, "$mail");
        Intrinsics.checkNotNullParameter(femail, "$femail");
        if (z) {
            genderSelect.element = "Other";
            mail.setChecked(false);
            femail.setChecked(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void u1(EditText full_name, EditText ageEt, EditText address_edit, PassangerResultActivity this$0, Ref.ObjectRef genderSelect, View view) {
        Intrinsics.checkNotNullParameter(full_name, "$full_name");
        Intrinsics.checkNotNullParameter(ageEt, "$ageEt");
        Intrinsics.checkNotNullParameter(address_edit, "$address_edit");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(genderSelect, "$genderSelect");
        String string = full_name.getText().toString();
        String string2 = ageEt.getText().toString();
        String string3 = address_edit.getText().toString();
        if (string.length() < 4) {
            Toast.makeText(this$0, "Please enter the valid Name", 0).show();
            return;
        }
        if (string2.length() < 1) {
            Toast.makeText(this$0, "Please enter the Age", 0).show();
            return;
        }
        if (string3.length() < 4) {
            Toast.makeText(this$0, "Please enter the valid Address", 0).show();
            return;
        }
        if (Integer.parseInt(this$0.seatingCap) > this$0.listPassengerdto.size()) {
            this$0.listPassengerdto.add(new VaSplPassengerdto(string3, Integer.parseInt(string2), (String) genderSelect.element, string, this$0.listPassengerdto.size() + 1));
            this$0.v1().j();
            this$0.w1().g.setVisibility(0);
            this$0.w1().m.setVisibility(8);
            full_name.setText("");
            ageEt.setText("");
            address_edit.setText("");
            Toast.makeText(this$0, "Passanger Sucessfully Added in the List", 0).show();
        }
    }

    public static final void x1(PassangerResultActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Integer.parseInt(this$0.seatingCap) > this$0.listPassengerdto.size()) {
            this$0.p1(this$0);
        }
    }

    public static final void y1(PassangerResultActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent();
        intent.putExtra("input", this$0.listPassengerdto);
        this$0.setResult(78, intent);
    }

    public final void A1(le leVar) {
        Intrinsics.checkNotNullParameter(leVar, "<set-?>");
        this.binding = leVar;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("input", this.listPassengerdto);
        setResult(78, intent);
        super.onBackPressed();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passanger_result);
        le leVarC = le.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(leVarC, "inflate(...)");
        A1(leVarC);
        setContentView(w1().b());
        w1().k.setText("Add Passanger List");
        w1().g.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.listPassengerdto.clear();
        Serializable serializableExtra = getIntent().getSerializableExtra("PassagerList");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.VaSplPassengerdto>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.VaSplPassengerdto> }");
        this.listPassengerdto = (ArrayList) serializableExtra;
        this.seatingCap = String.valueOf(getIntent().getStringExtra("SeatingCap"));
        z1(new rl4(this.listPassengerdto, this));
        w1().g.setAdapter(v1());
        if (this.listPassengerdto.size() > 0) {
            w1().g.setVisibility(0);
            w1().m.setVisibility(8);
        }
        w1().f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sl4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PassangerResultActivity.x1(this.a, view);
            }
        });
        w1().h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tl4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PassangerResultActivity.y1(this.a, view);
            }
        });
    }

    public final void p1(Context context) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.add_passanger_diloge);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "Male";
        View viewFindViewById = dialog.findViewById(R.id.full_name);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.ageEt);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText2 = (EditText) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.address);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText3 = (EditText) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.mail);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.RadioButton");
        final RadioButton radioButton = (RadioButton) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.femail);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.RadioButton");
        final RadioButton radioButton2 = (RadioButton) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.other);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.RadioButton");
        final RadioButton radioButton3 = (RadioButton) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.closebutton);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById8 = dialog.findViewById(R.id.save_button);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.LinearLayout");
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.ul4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PassangerResultActivity.q1(objectRef, radioButton2, radioButton3, compoundButton, z);
            }
        });
        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.vl4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PassangerResultActivity.r1(objectRef, radioButton, radioButton3, compoundButton, z);
            }
        });
        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.wl4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PassangerResultActivity.s1(objectRef, radioButton, radioButton2, compoundButton, z);
            }
        });
        ((LinearLayout) viewFindViewById7).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xl4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PassangerResultActivity.t1(dialog, view);
            }
        });
        ((LinearLayout) viewFindViewById8).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yl4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PassangerResultActivity.u1(editText, editText2, editText3, this, objectRef, view);
            }
        });
        dialog.show();
    }

    public final rl4 v1() {
        rl4 rl4Var = this.adapter;
        if (rl4Var != null) {
            return rl4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    public final le w1() {
        le leVar = this.binding;
        if (leVar != null) {
            return leVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void z1(rl4 rl4Var) {
        Intrinsics.checkNotNullParameter(rl4Var, "<set-?>");
        this.adapter = rl4Var;
    }
}
