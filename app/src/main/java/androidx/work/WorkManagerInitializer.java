package androidx.work;

import android.content.Context;
import androidx.work.a;
import com.zepto.iy7;
import com.zepto.qy2;
import com.zepto.rn3;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements qy2 {
    public static final String a = rn3.i("WrkMgrInitializer");

    @Override // com.zepto.qy2
    public List a() {
        return Collections.emptyList();
    }

    @Override // com.zepto.qy2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public iy7 b(Context context) {
        rn3.e().a(a, "Initializing WorkManager with default configuration.");
        iy7.d(context, new a.C0027a().a());
        return iy7.c(context);
    }
}
