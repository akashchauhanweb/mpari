package com.zepto;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/zepto/d86;", "Lcom/zepto/sj1;", "Landroid/os/Bundle;", "savedInstanceState", "", "C0", "Landroid/app/Dialog;", "d2", "Lcom/zepto/d86$b;", "listener", "n2", "", "", "t0", "Ljava/util/List;", "items", "u0", "Ljava/lang/String;", "title", "v0", "Lcom/zepto/d86$b;", "<init>", "()V", "w0", "a", "b", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStringPickerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringPickerDialog.kt\ncom/nic/mparivahan/dlservices/widget/StringPickerDialog\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,60:1\n37#2,2:61\n*S KotlinDebug\n*F\n+ 1 StringPickerDialog.kt\ncom/nic/mparivahan/dlservices/widget/StringPickerDialog\n*L\n32#1:61,2\n*E\n"})
public final class d86 extends sj1 {

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public final List items = new ArrayList();

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public String title;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public b listener;

    /* JADX INFO: renamed from: com.zepto.d86$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d86 a(String str, List items) {
            Intrinsics.checkNotNullParameter(items, "items");
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("items", (ArrayList) items);
            bundle.putString("title", str);
            d86 d86Var = new d86();
            d86Var.L1(bundle);
            return d86Var;
        }
    }

    public interface b {
        void a(String str, int i);
    }

    public static final void m2(d86 this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        b bVar = this$0.listener;
        if (bVar != null) {
            Intrinsics.checkNotNull(bVar);
            bVar.a((String) this$0.items.get(i), i);
        }
    }

    @Override // com.zepto.sj1, com.zepto.sf2
    public void C0(Bundle savedInstanceState) {
        super.C0(savedInstanceState);
        Bundle bundleT = t();
        Intrinsics.checkNotNull(bundleT);
        ArrayList<String> stringArrayList = bundleT.getStringArrayList("items");
        if (stringArrayList != null) {
            this.items.clear();
            this.items.addAll(stringArrayList);
        }
        this.title = bundleT.getString("title");
    }

    @Override // com.zepto.sj1
    public Dialog d2(Bundle savedInstanceState) {
        a.C0001a c0001a = new a.C0001a(E1());
        if (!TextUtils.isEmpty(this.title)) {
            c0001a.o(this.title);
        }
        c0001a.f((CharSequence[]) this.items.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.zepto.c86
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                d86.m2(this.a, dialogInterface, i);
            }
        });
        androidx.appcompat.app.a aVarA = c0001a.a();
        Intrinsics.checkNotNullExpressionValue(aVarA, "create(...)");
        return aVarA;
    }

    public final void n2(b listener) {
        this.listener = listener;
    }
}
