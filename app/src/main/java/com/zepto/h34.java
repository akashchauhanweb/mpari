package com.zepto;

import com.zepto.g34;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class h34 {
    public static final a b = new a(null);
    public static final Map c = new LinkedHashMap();
    public final Map a = new LinkedHashMap();

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class navigatorClass) {
            Intrinsics.checkNotNullParameter(navigatorClass, "navigatorClass");
            String strValue = (String) h34.c.get(navigatorClass);
            if (strValue == null) {
                g34.b bVar = (g34.b) navigatorClass.getAnnotation(g34.b.class);
                strValue = bVar != null ? bVar.value() : null;
                if (!b(strValue)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + navigatorClass.getSimpleName()).toString());
                }
                h34.c.put(navigatorClass, strValue);
            }
            Intrinsics.checkNotNull(strValue);
            return strValue;
        }

        public final boolean b(String str) {
            return str != null && str.length() > 0;
        }
    }

    public final g34 b(g34 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        return c(b.a(navigator.getClass()), navigator);
    }

    public g34 c(String name, g34 navigator) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (!b.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        g34 g34Var = (g34) this.a.get(name);
        if (Intrinsics.areEqual(g34Var, navigator)) {
            return navigator;
        }
        boolean z = false;
        if (g34Var != null && g34Var.c()) {
            z = true;
        }
        if (!(!z)) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + g34Var).toString());
        }
        if (!navigator.c()) {
            return (g34) this.a.put(name, navigator);
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public g34 d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!b.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        g34 g34Var = (g34) this.a.get(name);
        if (g34Var != null) {
            return g34Var;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    public final Map e() {
        return MapsKt__MapsKt.toMap(this.a);
    }
}
