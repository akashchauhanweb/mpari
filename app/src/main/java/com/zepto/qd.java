package com.zepto;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import com.zepto.g34;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@g34.b("activity")
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J0\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/zepto/qd;", "Lcom/zepto/g34;", "Lcom/zepto/qd$b;", "l", "", "k", "destination", "Landroid/os/Bundle;", "args", "Lcom/zepto/r24;", "navOptions", "Lcom/zepto/g34$a;", "navigatorExtras", "Lcom/zepto/j24;", "m", "Landroid/content/Context;", "c", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Landroid/app/Activity;", "d", "Landroid/app/Activity;", "hostActivity", "<init>", "(Landroid/content/Context;)V", "e", "a", "b", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,531:1\n179#2,2:532\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n*L\n48#1:532,2\n*E\n"})
public class qd extends g34 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Activity hostActivity;

    public static class b extends j24 {
        public Intent o;
        public String p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g34 activityNavigator) {
            super(activityNavigator);
            Intrinsics.checkNotNullParameter(activityNavigator, "activityNavigator");
        }

        @Override // com.zepto.j24
        public boolean equals(Object obj) {
            Intent intent;
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            return super.equals(obj) && ((intent = this.o) == null ? ((b) obj).o == null : intent.filterEquals(((b) obj).o)) && Intrinsics.areEqual(this.p, ((b) obj).p);
        }

        @Override // com.zepto.j24
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.o;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.p;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // com.zepto.j24
        public void i0(Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            super.i0(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, z15.a);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            x0(s0(context, typedArrayObtainAttributes.getString(z15.f)));
            String string = typedArrayObtainAttributes.getString(z15.b);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                u0(new ComponentName(context, string));
            }
            t0(typedArrayObtainAttributes.getString(z15.c));
            String strS0 = s0(context, typedArrayObtainAttributes.getString(z15.d));
            if (strS0 != null) {
                v0(Uri.parse(strS0));
            }
            w0(s0(context, typedArrayObtainAttributes.getString(z15.e)));
            typedArrayObtainAttributes.recycle();
        }

        @Override // com.zepto.j24
        public boolean n0() {
            return false;
        }

        public final String o0() {
            Intent intent = this.o;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final ComponentName p0() {
            Intent intent = this.o;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        public final String q0() {
            return this.p;
        }

        public final Intent r0() {
            return this.o;
        }

        public final String s0(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            return StringsKt__StringsJVMKt.replace$default(str, "${applicationId}", packageName, false, 4, (Object) null);
        }

        public final b t0(String str) {
            if (this.o == null) {
                this.o = new Intent();
            }
            Intent intent = this.o;
            Intrinsics.checkNotNull(intent);
            intent.setAction(str);
            return this;
        }

        @Override // com.zepto.j24
        public String toString() {
            ComponentName componentNameP0 = p0();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (componentNameP0 != null) {
                sb.append(" class=");
                sb.append(componentNameP0.getClassName());
            } else {
                String strO0 = o0();
                if (strO0 != null) {
                    sb.append(" action=");
                    sb.append(strO0);
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        }

        public final b u0(ComponentName componentName) {
            if (this.o == null) {
                this.o = new Intent();
            }
            Intent intent = this.o;
            Intrinsics.checkNotNull(intent);
            intent.setComponent(componentName);
            return this;
        }

        public final b v0(Uri uri) {
            if (this.o == null) {
                this.o = new Intent();
            }
            Intent intent = this.o;
            Intrinsics.checkNotNull(intent);
            intent.setData(uri);
            return this;
        }

        public final b w0(String str) {
            this.p = str;
            return this;
        }

        public final b x0(String str) {
            if (this.o == null) {
                this.o = new Intent();
            }
            Intent intent = this.o;
            Intrinsics.checkNotNull(intent);
            intent.setPackage(str);
            return this;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public static final c c = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public qd(Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Iterator it = SequencesKt__SequencesKt.generateSequence(context, (Function1<? super Context, ? extends Context>) ((Function1<? super Object, ? extends Object>) c.c)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.hostActivity = (Activity) next;
    }

    @Override // com.zepto.g34
    public boolean k() {
        Activity activity = this.hostActivity;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // com.zepto.g34
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    @Override // com.zepto.g34
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public j24 d(b destination, Bundle args, r24 navOptions, g34.a navigatorExtras) {
        Intent intent;
        int intExtra;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.r0() == null) {
            throw new IllegalStateException(("Destination " + destination.P() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.r0());
        if (args != null) {
            intent2.putExtras(args);
            String strQ0 = destination.q0();
            if (strQ0 != null && strQ0.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(strQ0);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!args.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + args + " to fill data pattern " + strQ0);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(args.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        if (this.hostActivity == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.h()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.hostActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.P());
        Resources resources = this.context.getResources();
        if (navOptions != null) {
            int iC = navOptions.c();
            int iD = navOptions.d();
            if ((iC <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(iC), "animator")) && (iD <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(iD), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", iC);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", iD);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(iC) + " and popExit resource " + resources.getResourceName(iD) + " when launching " + destination);
            }
        }
        this.context.startActivity(intent2);
        if (navOptions == null || this.hostActivity == null) {
            return null;
        }
        int iA = navOptions.a();
        int iB = navOptions.b();
        if ((iA <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(iA), "animator")) && (iB <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(iB), "animator"))) {
            if (iA < 0 && iB < 0) {
                return null;
            }
            this.hostActivity.overridePendingTransition(RangesKt___RangesKt.coerceAtLeast(iA, 0), RangesKt___RangesKt.coerceAtLeast(iB, 0));
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(iA) + " and exit resource " + resources.getResourceName(iB) + "when launching " + destination);
        return null;
    }
}
