package androidx.databinding;

import android.util.Log;
import android.view.View;
import com.zepto.id1;
import com.zepto.jd1;
import com.zepto.lq7;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MergedDataBinderMapper extends id1 {
    public Set a = new HashSet();
    public List b = new CopyOnWriteArrayList();
    public List c = new CopyOnWriteArrayList();

    @Override // com.zepto.id1
    public lq7 b(jd1 jd1Var, View view, int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            lq7 lq7VarB = ((id1) it.next()).b(jd1Var, view, i);
            if (lq7VarB != null) {
                return lq7VarB;
            }
        }
        if (e()) {
            return b(jd1Var, view, i);
        }
        return null;
    }

    @Override // com.zepto.id1
    public lq7 c(jd1 jd1Var, View[] viewArr, int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            lq7 lq7VarC = ((id1) it.next()).c(jd1Var, viewArr, i);
            if (lq7VarC != null) {
                return lq7VarC;
            }
        }
        if (e()) {
            return c(jd1Var, viewArr, i);
        }
        return null;
    }

    public void d(id1 id1Var) {
        if (this.a.add(id1Var.getClass())) {
            this.b.add(id1Var);
            Iterator it = id1Var.a().iterator();
            while (it.hasNext()) {
                d((id1) it.next());
            }
        }
    }

    public final boolean e() {
        boolean z = false;
        for (String str : this.c) {
            try {
                Class<?> cls = Class.forName(str);
                if (id1.class.isAssignableFrom(cls)) {
                    d((id1) cls.newInstance());
                    this.c.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e);
            } catch (InstantiationException e2) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e2);
            }
        }
        return z;
    }
}
