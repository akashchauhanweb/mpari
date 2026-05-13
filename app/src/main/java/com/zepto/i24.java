package com.zepto;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class i24 {
    public final Uri a;
    public final String b;
    public final String c;

    public static final class a {
        public static final C0090a d = new C0090a(null);
        public Uri a;
        public String b;
        public String c;

        /* JADX INFO: renamed from: com.zepto.i24$a$a, reason: collision with other inner class name */
        public static final class C0090a {
            public C0090a() {
            }

            public /* synthetic */ C0090a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Uri uri) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                a aVar = new a(null);
                aVar.b(uri);
                return aVar;
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i24 a() {
            return new i24(this.a, this.b, this.c);
        }

        public final a b(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.a = uri;
            return this;
        }
    }

    public i24(Uri uri, String str, String str2) {
        this.a = uri;
        this.b = str;
        this.c = str2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public Uri c() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (c() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(c()));
        }
        if (a() != null) {
            sb.append(" action=");
            sb.append(a());
        }
        if (b() != null) {
            sb.append(" mimetype=");
            sb.append(b());
        }
        sb.append(" }");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i24(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        Intrinsics.checkNotNullParameter(intent, "intent");
    }
}
