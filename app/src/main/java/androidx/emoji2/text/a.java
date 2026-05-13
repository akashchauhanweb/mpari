package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.c;
import com.zepto.fe2;
import com.zepto.lu4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.emoji2.text.a$a, reason: collision with other inner class name */
    public static class C0009a {
        public final b a;

        public C0009a(b bVar) {
            this.a = bVar == null ? e() : bVar;
        }

        public static b e() {
            return Build.VERSION.SDK_INT >= 28 ? new d() : new c();
        }

        public final c.AbstractC0011c a(Context context, fe2 fe2Var) {
            if (fe2Var == null) {
                return null;
            }
            return new e(context, fe2Var);
        }

        public final List b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        public c.AbstractC0011c c(Context context) {
            return a(context, h(context));
        }

        public final fe2 d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new fe2(str, str2, "emojicompat-emoji-font", b(this.a.b(packageManager, str2)));
        }

        public final boolean f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        public final ProviderInfo g(PackageManager packageManager) {
            Iterator it = this.a.c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfoA = this.a.a((ResolveInfo) it.next());
                if (f(providerInfoA)) {
                    return providerInfoA;
                }
            }
            return null;
        }

        public fe2 h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            lu4.h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfoG = g(packageManager);
            if (providerInfoG == null) {
                return null;
            }
            try {
                return d(providerInfoG, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }
    }

    public static class b {
        public abstract ProviderInfo a(ResolveInfo resolveInfo);

        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public abstract List c(PackageManager packageManager, Intent intent, int i);
    }

    public static class c extends b {
        @Override // androidx.emoji2.text.a.b
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.a.b
        public List c(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    public static class d extends c {
        @Override // androidx.emoji2.text.a.b
        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static e a(Context context) {
        return (e) new C0009a(null).c(context);
    }
}
