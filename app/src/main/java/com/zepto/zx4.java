package com.zepto;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class zx4 implements c52 {
    public XmlPullParser a;
    public b52 b;

    public static class b extends k52 {
        public b() {
        }

        @Override // com.zepto.k52, com.zepto.b52
        public boolean W() {
            return true;
        }
    }

    public static class c extends p42 {
        public final XmlPullParser a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public c(XmlPullParser xmlPullParser, int i) {
            this.b = xmlPullParser.getAttributeNamespace(i);
            this.c = xmlPullParser.getAttributePrefix(i);
            this.e = xmlPullParser.getAttributeValue(i);
            this.d = xmlPullParser.getAttributeName(i);
            this.a = xmlPullParser;
        }

        @Override // com.zepto.bz
        public Object a() {
            return this.a;
        }

        @Override // com.zepto.bz
        public String b() {
            return this.b;
        }

        @Override // com.zepto.bz
        public boolean c() {
            return false;
        }

        @Override // com.zepto.bz
        public String getName() {
            return this.d;
        }

        @Override // com.zepto.bz
        public String getPrefix() {
            return this.c;
        }

        @Override // com.zepto.bz
        public String getValue() {
            return this.e;
        }
    }

    public static class d extends s42 {
        public final XmlPullParser c;
        public final String e;
        public final String f;
        public final String g;
        public final int h;

        public d(XmlPullParser xmlPullParser) {
            this.e = xmlPullParser.getNamespace();
            this.h = xmlPullParser.getLineNumber();
            this.f = xmlPullParser.getPrefix();
            this.g = xmlPullParser.getName();
            this.c = xmlPullParser;
        }

        @Override // com.zepto.s42, com.zepto.b52
        public int L() {
            return this.h;
        }

        @Override // com.zepto.b52
        public String getName() {
            return this.g;
        }
    }

    public static class e extends k52 {
        public final XmlPullParser c;
        public final String e;

        public e(XmlPullParser xmlPullParser) {
            this.e = xmlPullParser.getText();
            this.c = xmlPullParser;
        }

        @Override // com.zepto.k52, com.zepto.b52
        public boolean g() {
            return true;
        }

        @Override // com.zepto.k52, com.zepto.b52
        public String getValue() {
            return this.e;
        }
    }

    public zx4(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
    }

    private b52 d() throws XmlPullParserException, IOException {
        int next = this.a.next();
        if (next != 1) {
            return next == 2 ? e() : next == 4 ? f() : next == 3 ? c() : d();
        }
        return null;
    }

    public final c a(int i) {
        return new c(this.a, i);
    }

    public final d b(d dVar) {
        int attributeCount = this.a.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            c cVarA = a(i);
            if (!cVarA.c()) {
                dVar.add(cVarA);
            }
        }
        return dVar;
    }

    public final b c() {
        return new b();
    }

    public final d e() {
        d dVar = new d(this.a);
        return dVar.isEmpty() ? b(dVar) : dVar;
    }

    public final e f() {
        return new e(this.a);
    }

    @Override // com.zepto.c52
    public b52 next() {
        b52 b52Var = this.b;
        if (b52Var == null) {
            return d();
        }
        this.b = null;
        return b52Var;
    }

    @Override // com.zepto.c52
    public b52 peek() {
        if (this.b == null) {
            this.b = next();
        }
        return this.b;
    }
}
