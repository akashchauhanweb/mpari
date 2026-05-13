package com.zepto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class go3 {
    public static final go3 c = new a("DEFAULT", 0);
    public static final go3 e = new go3("STRING", 1) { // from class: com.zepto.go3.b
        {
            a aVar = null;
        }
    };
    public static final /* synthetic */ go3[] f = a();

    public enum a extends go3 {
        public a(String str, int i) {
            super(str, i, null);
        }
    }

    public go3(String str, int i) {
    }

    public static /* synthetic */ go3[] a() {
        return new go3[]{c, e};
    }

    public static go3 valueOf(String str) {
        return (go3) Enum.valueOf(go3.class, str);
    }

    public static go3[] values() {
        return (go3[]) f.clone();
    }

    public /* synthetic */ go3(String str, int i, a aVar) {
        this(str, i);
    }
}
