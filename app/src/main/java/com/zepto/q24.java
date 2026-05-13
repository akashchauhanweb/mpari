package com.zepto;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.zepto.g24;
import com.zepto.r24;
import com.zepto.y14;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class q24 {
    public static final a c = new a(null);
    public static final ThreadLocal d = new ThreadLocal();
    public final Context a;
    public final h34 b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u24 a(TypedValue value, u24 u24Var, u24 expectedNavType, String str, String foundType) throws XmlPullParserException {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(expectedNavType, "expectedNavType");
            Intrinsics.checkNotNullParameter(foundType, "foundType");
            if (u24Var == null || u24Var == expectedNavType) {
                return u24Var == null ? expectedNavType : u24Var;
            }
            throw new XmlPullParserException("Type is " + str + " but found " + foundType + ": " + value.data);
        }
    }

    public q24(Context context, h34 navigatorProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.a = context;
        this.b = navigatorProvider;
    }

    public final j24 a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        h34 h34Var = this.b;
        String name = xmlResourceParser.getName();
        Intrinsics.checkNotNullExpressionValue(name, "parser.name");
        j24 j24VarA = h34Var.d(name).a();
        j24VarA.i0(this.a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (Intrinsics.areEqual("argument", name2)) {
                    f(resources, j24VarA, attributeSet, i);
                } else if (Intrinsics.areEqual("deepLink", name2)) {
                    g(resources, j24VarA, attributeSet);
                } else if (Intrinsics.areEqual("action", name2)) {
                    c(resources, j24VarA, attributeSet, xmlResourceParser, i);
                } else if (Intrinsics.areEqual("include", name2) && (j24VarA instanceof k24)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, z15.i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((k24) j24VarA).o0(b(typedArrayObtainAttributes.getResourceId(z15.j, 0)));
                    Unit unit = Unit.INSTANCE;
                    typedArrayObtainAttributes.recycle();
                } else if (j24VarA instanceof k24) {
                    ((k24) j24VarA).o0(a(resources, xmlResourceParser, attributeSet, i));
                }
            }
        }
        return j24VarA;
    }

    public final k24 b(int i) {
        int next;
        Resources res = this.a.getResources();
        XmlResourceParser xml = res.getXml(i);
        Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + res.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        Intrinsics.checkNotNullExpressionValue(res, "res");
        Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
        j24 j24VarA = a(res, xml, attrs, i);
        if (j24VarA instanceof k24) {
            return (k24) j24VarA;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }

    public final void c(Resources resources, j24 j24Var, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException, IOException {
        int depth;
        Context context = this.a;
        int[] NavAction = a25.a;
        Intrinsics.checkNotNullExpressionValue(NavAction, "NavAction");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NavAction, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(a25.b, 0);
        x14 x14Var = new x14(typedArrayObtainStyledAttributes.getResourceId(a25.c, 0), null, null, 6, null);
        r24.a aVar = new r24.a();
        aVar.d(typedArrayObtainStyledAttributes.getBoolean(a25.f, false));
        aVar.j(typedArrayObtainStyledAttributes.getBoolean(a25.l, false));
        aVar.g(typedArrayObtainStyledAttributes.getResourceId(a25.i, -1), typedArrayObtainStyledAttributes.getBoolean(a25.j, false), typedArrayObtainStyledAttributes.getBoolean(a25.k, false));
        aVar.b(typedArrayObtainStyledAttributes.getResourceId(a25.d, -1));
        aVar.c(typedArrayObtainStyledAttributes.getResourceId(a25.e, -1));
        aVar.e(typedArrayObtainStyledAttributes.getResourceId(a25.g, -1));
        aVar.f(typedArrayObtainStyledAttributes.getResourceId(a25.h, -1));
        x14Var.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && Intrinsics.areEqual("argument", xmlResourceParser.getName())) {
                e(resources, bundle, attributeSet, i);
            }
        }
        if (!bundle.isEmpty()) {
            x14Var.d(bundle);
        }
        j24Var.j0(resourceId, x14Var);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final y14 d(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException {
        y14.a aVar = new y14.a();
        int i2 = 0;
        aVar.c(typedArray.getBoolean(a25.q, false));
        ThreadLocal threadLocal = d;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(a25.p);
        Object objJ = null;
        u24 u24VarA = string != null ? p24.a(u24.c, string, resources.getResourcePackageName(i)) : null;
        int i3 = a25.o;
        if (typedArray.getValue(i3, typedValue)) {
            u24 u24Var = u24.e;
            if (u24VarA == u24Var) {
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    i2 = i4;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + u24VarA.b() + ". Must be a reference to a resource.");
                }
                objJ = Integer.valueOf(i2);
            } else {
                int i5 = typedValue.resourceId;
                if (i5 != 0) {
                    if (u24VarA != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + u24VarA.b() + ". You must use a \"" + u24Var.b() + "\" type to reference other resources.");
                    }
                    u24VarA = u24Var;
                    objJ = Integer.valueOf(i5);
                } else if (u24VarA == u24.m) {
                    objJ = typedArray.getString(i3);
                } else {
                    int i6 = typedValue.type;
                    if (i6 == 3) {
                        String string2 = typedValue.string.toString();
                        if (u24VarA == null) {
                            u24VarA = u24.c.b(string2);
                        }
                        objJ = u24VarA.j(string2);
                    } else if (i6 == 4) {
                        u24VarA = c.a(typedValue, u24VarA, u24.i, string, "float");
                        objJ = Float.valueOf(typedValue.getFloat());
                    } else if (i6 == 5) {
                        u24VarA = c.a(typedValue, u24VarA, u24.d, string, "dimension");
                        objJ = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i6 == 18) {
                        u24VarA = c.a(typedValue, u24VarA, u24.k, string, "boolean");
                        objJ = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i6 < 16 || i6 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        u24 u24Var2 = u24.i;
                        if (u24VarA == u24Var2) {
                            u24VarA = c.a(typedValue, u24VarA, u24Var2, string, "float");
                            objJ = Float.valueOf(typedValue.data);
                        } else {
                            u24VarA = c.a(typedValue, u24VarA, u24.d, string, "integer");
                            objJ = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        }
        if (objJ != null) {
            aVar.b(objJ);
        }
        if (u24VarA != null) {
            aVar.d(u24VarA);
        }
        return aVar.a();
    }

    public final void e(Resources resources, Bundle bundle, AttributeSet attributeSet, int i) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a25.m);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = typedArrayObtainAttributes.getString(a25.n);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        Intrinsics.checkNotNullExpressionValue(string, "array.getString(R.stylea…uments must have a name\")");
        y14 y14VarD = d(typedArrayObtainAttributes, resources, i);
        if (y14VarD.b()) {
            y14VarD.d(string, bundle);
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    public final void f(Resources resources, j24 j24Var, AttributeSet attributeSet, int i) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a25.m);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = typedArrayObtainAttributes.getString(a25.n);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        Intrinsics.checkNotNullExpressionValue(string, "array.getString(R.stylea…uments must have a name\")");
        j24Var.m(string, d(typedArrayObtainAttributes, resources, i));
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    public final void g(Resources resources, j24 j24Var, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a25.r);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = typedArrayObtainAttributes.getString(a25.u);
        String string2 = typedArrayObtainAttributes.getString(a25.s);
        String string3 = typedArrayObtainAttributes.getString(a25.t);
        if ((string == null || string.length() == 0) && ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0))) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        g24.a aVar = new g24.a();
        if (string != null) {
            String packageName = this.a.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            aVar.d(StringsKt__StringsJVMKt.replace$default(string, "${applicationId}", packageName, false, 4, (Object) null));
        }
        if (string2 != null && string2.length() != 0) {
            String packageName2 = this.a.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName2, "context.packageName");
            aVar.b(StringsKt__StringsJVMKt.replace$default(string2, "${applicationId}", packageName2, false, 4, (Object) null));
        }
        if (string3 != null) {
            String packageName3 = this.a.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName3, "context.packageName");
            aVar.c(StringsKt__StringsJVMKt.replace$default(string3, "${applicationId}", packageName3, false, 4, (Object) null));
        }
        j24Var.n(aVar.a());
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }
}
