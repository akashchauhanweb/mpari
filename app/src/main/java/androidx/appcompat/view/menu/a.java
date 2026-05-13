package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements i {
    public Context a;
    public Context b;
    public e c;
    public LayoutInflater d;
    public LayoutInflater e;
    public i.a f;
    public int g;
    public int h;
    public j i;
    public int j;

    public a(Context context, int i, int i2) {
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    public void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z) {
        i.a aVar = this.f;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public int c() {
        return this.j;
    }

    public abstract void d(g gVar, j.a aVar);

    @Override // androidx.appcompat.view.menu.i
    public void e(Context context, e eVar) {
        this.b = context;
        this.e = LayoutInflater.from(context);
        this.c = eVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.i
    public boolean g(l lVar) {
        i.a aVar = this.f;
        e eVar = lVar;
        if (aVar == null) {
            return false;
        }
        if (lVar == null) {
            eVar = this.c;
        }
        return aVar.c(eVar);
    }

    public j.a h(ViewGroup viewGroup) {
        return (j.a) this.d.inflate(this.h, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.i
    public void i(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.c;
        int i = 0;
        if (eVar != null) {
            eVar.t();
            ArrayList arrayListG = this.c.G();
            int size = arrayListG.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                g gVar = (g) arrayListG.get(i3);
                if (t(i2, gVar)) {
                    View childAt = viewGroup.getChildAt(i2);
                    g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                    View viewQ = q(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewQ.setPressed(false);
                        viewQ.jumpDrawablesToCurrentState();
                    }
                    if (viewQ != childAt) {
                        a(viewQ, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!o(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean l(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean m(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void n(i.a aVar) {
        this.f = aVar;
    }

    public boolean o(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public i.a p() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View q(g gVar, View view, ViewGroup viewGroup) {
        j.a aVarH = view instanceof j.a ? (j.a) view : h(viewGroup);
        d(gVar, aVarH);
        return (View) aVarH;
    }

    public j r(ViewGroup viewGroup) {
        if (this.i == null) {
            j jVar = (j) this.d.inflate(this.g, viewGroup, false);
            this.i = jVar;
            jVar.b(this.c);
            i(true);
        }
        return this.i;
    }

    public void s(int i) {
        this.j = i;
    }

    public abstract boolean t(int i, g gVar);
}
