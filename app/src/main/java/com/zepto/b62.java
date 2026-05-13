package com.zepto;

import java.io.Closeable;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public abstract class b62 extends sz0 implements Closeable {
    public static final a e = new a(null);

    public static final class a extends AbstractCoroutineContextKey {

        /* JADX INFO: renamed from: com.zepto.b62$a$a, reason: collision with other inner class name */
        public static final class C0067a extends Lambda implements Function1 {
            public static final C0067a c = new C0067a();

            public C0067a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b62 invoke(CoroutineContext.Element element) {
                if (element instanceof b62) {
                    return (b62) element;
                }
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
            super(sz0.c, C0067a.c);
        }
    }
}
