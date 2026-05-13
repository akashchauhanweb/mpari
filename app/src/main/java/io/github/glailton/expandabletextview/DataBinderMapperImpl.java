package io.github.glailton.expandabletextview;

import android.util.SparseIntArray;
import android.view.View;
import com.zepto.id1;
import com.zepto.jd1;
import com.zepto.lq7;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DataBinderMapperImpl extends id1 {
    public static final SparseIntArray a = new SparseIntArray(0);

    @Override // com.zepto.id1
    public List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // com.zepto.id1
    public lq7 b(jd1 jd1Var, View view, int i) {
        if (a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // com.zepto.id1
    public lq7 c(jd1 jd1Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
