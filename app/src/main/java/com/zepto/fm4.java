package com.zepto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class fm4 implements y62 {
    public i90 c = new tv0();
    public i90 e = new tv0();
    public List f = new ArrayList();
    public List g = new ArrayList();
    public List h = new ArrayList();
    public StringBuilder i = new StringBuilder();
    public String j;
    public String k;
    public String l;
    public n86 m;
    public lo6 n;
    public boolean o;
    public char[] p;
    public int q;
    public int r;
    public int s;

    public class a implements y62 {
        public List c = new ArrayList();
        public String e;
        public String f;
        public int g;
        public int h;

        public a(int i, int i2) {
            this.g = i;
            this.h = i2;
        }

        @Override // com.zepto.y62
        public y62 M(int i) {
            return V(i, 0);
        }

        @Override // com.zepto.y62
        public y62 V(int i, int i2) {
            return fm4.this.new a(this.g + i, this.h - i2);
        }

        @Override // com.zepto.y62
        public String a(String str) {
            String strB = b();
            return strB != null ? fm4.this.D(strB, str) : str;
        }

        @Override // com.zepto.y62
        public String b() {
            if (this.e == null) {
                this.e = j();
            }
            return this.e;
        }

        @Override // com.zepto.y62
        public String e(String str) {
            String strB = b();
            return strB != null ? fm4.this.O(strB, str) : str;
        }

        @Override // com.zepto.y62
        public boolean f() {
            fm4 fm4Var = fm4.this;
            return fm4Var.o && this.h >= fm4Var.h.size() - 1;
        }

        @Override // com.zepto.y62
        public String getFirst() {
            return (String) fm4.this.h.get(this.g);
        }

        @Override // com.zepto.y62
        public int getIndex() {
            return ((Integer) fm4.this.f.get(this.g)).intValue();
        }

        @Override // com.zepto.y62
        public String getLast() {
            return (String) fm4.this.h.get(this.h);
        }

        @Override // com.zepto.y62
        public String getPrefix() {
            return (String) fm4.this.g.get(this.g);
        }

        @Override // com.zepto.y62
        public boolean isEmpty() {
            return this.g == this.h;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            if (this.c.isEmpty()) {
                for (int i = this.g; i <= this.h; i++) {
                    String str = (String) fm4.this.h.get(i);
                    if (str != null) {
                        this.c.add(str);
                    }
                }
            }
            return this.c.iterator();
        }

        public final String j() {
            int i = 0;
            int iIndexOf = 0;
            while (i < this.g) {
                iIndexOf = fm4.this.j.indexOf(47, iIndexOf + 1);
                i++;
            }
            int iIndexOf2 = iIndexOf;
            while (i <= this.h) {
                iIndexOf2 = fm4.this.j.indexOf(47, iIndexOf2 + 1);
                if (iIndexOf2 == -1) {
                    iIndexOf2 = fm4.this.j.length();
                }
                i++;
            }
            return fm4.this.j.substring(iIndexOf + 1, iIndexOf2);
        }

        public final String m() {
            int i = fm4.this.r;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 > this.h) {
                    break;
                }
                fm4 fm4Var = fm4.this;
                if (i >= fm4Var.q) {
                    i++;
                    break;
                }
                int i4 = i + 1;
                if (fm4Var.p[i] == '/' && (i2 = i2 + 1) == this.g) {
                    i = i4;
                    i3 = i;
                } else {
                    i = i4;
                }
            }
            return new String(fm4.this.p, i3, (i - 1) - i3);
        }

        public String toString() {
            if (this.f == null) {
                this.f = m();
            }
            return this.f;
        }

        @Override // com.zepto.y62
        public boolean x() {
            return this.h - this.g >= 1;
        }
    }

    public fm4(String str, lo6 lo6Var, hf2 hf2Var) throws bm4 {
        this.m = hf2Var.c();
        this.n = lo6Var;
        this.l = str;
        g0(str);
    }

    public final void B(String str) {
        String strSubstring;
        int iIndexOf = str.indexOf(58);
        if (iIndexOf > 0) {
            strSubstring = str.substring(0, iIndexOf);
            str = str.substring(iIndexOf + 1);
        } else {
            strSubstring = null;
        }
        String strE = this.m.e(str);
        this.g.add(strSubstring);
        this.h.add(strE);
    }

    public String D(String str, String str2) {
        String strA = this.m.a(str2);
        if (a0(str)) {
            return strA;
        }
        return str + "/@" + strA;
    }

    @Override // com.zepto.y62
    public y62 M(int i) {
        return V(i, 0);
    }

    public String O(String str, String str2) {
        String strE = this.m.e(str2);
        if (a0(strE)) {
            return str;
        }
        if (a0(str)) {
            return strE;
        }
        return str + "/" + strE + "[1]";
    }

    public final void P() throws bm4 {
        int i = 0;
        if (this.p[this.s - 1] == '[') {
            while (true) {
                int i2 = this.s;
                if (i2 >= this.q) {
                    break;
                }
                char[] cArr = this.p;
                this.s = i2 + 1;
                char c = cArr[i2];
                if (!T(c)) {
                    break;
                } else {
                    i = ((i * 10) + c) - 48;
                }
            }
        }
        char[] cArr2 = this.p;
        int i3 = this.s;
        this.s = i3 + 1;
        if (cArr2[i3 - 1] != ']') {
            throw new bm4("Invalid index for path '%s' in %s", this.l, this.n);
        }
        this.f.add(Integer.valueOf(i));
    }

    public final boolean T(char c) {
        return Character.isDigit(c);
    }

    @Override // com.zepto.y62
    public y62 V(int i, int i2) {
        int size = (this.h.size() - 1) - i2;
        return size >= i ? new a(i, size) : new a(i, i);
    }

    @Override // com.zepto.y62
    public String a(String str) {
        if (a0(this.j)) {
            return this.m.a(str);
        }
        String strD = (String) this.c.b(str);
        if (strD == null && (strD = D(this.j, str)) != null) {
            this.c.a(str, strD);
        }
        return strD;
    }

    public final boolean a0(String str) {
        return str == null || str.length() == 0;
    }

    @Override // com.zepto.y62
    public String b() {
        return this.j;
    }

    public final boolean d0(char c) {
        return Character.isLetterOrDigit(c);
    }

    @Override // com.zepto.y62
    public String e(String str) {
        if (a0(this.j)) {
            return this.m.e(str);
        }
        String strO = (String) this.e.b(str);
        if (strO == null && (strO = O(this.j, str)) != null) {
            this.e.a(str, strO);
        }
        return strO;
    }

    public final boolean e0(char c) {
        return c == '_' || c == '-' || c == ':';
    }

    @Override // com.zepto.y62
    public boolean f() {
        return this.o;
    }

    public final boolean f0(char c) {
        return d0(c) || e0(c);
    }

    public final void g0(String str) throws bm4 {
        if (str != null) {
            int length = str.length();
            this.q = length;
            char[] cArr = new char[length];
            this.p = cArr;
            str.getChars(0, length, cArr, 0);
        }
        h0();
    }

    @Override // com.zepto.y62
    public String getFirst() {
        return (String) this.h.get(0);
    }

    @Override // com.zepto.y62
    public int getIndex() {
        return ((Integer) this.f.get(0)).intValue();
    }

    @Override // com.zepto.y62
    public String getLast() {
        return (String) this.h.get(this.h.size() - 1);
    }

    @Override // com.zepto.y62
    public String getPrefix() {
        return (String) this.g.get(0);
    }

    public final void h0() throws bm4 {
        char c = this.p[this.s];
        if (c == '/') {
            throw new bm4("Path '%s' in %s references document root", this.l, this.n);
        }
        if (c == '.') {
            j0();
        }
        while (this.s < this.q) {
            if (this.o) {
                throw new bm4("Path '%s' in %s references an invalid attribute", this.l, this.n);
            }
            i0();
        }
        k0();
        u();
    }

    public final void i0() throws bm4 {
        char c = this.p[this.s];
        if (c == '/') {
            throw new bm4("Invalid path expression '%s' in %s", this.l, this.n);
        }
        if (c == '@') {
            m();
        } else {
            w();
        }
        j();
    }

    @Override // com.zepto.y62
    public boolean isEmpty() {
        return a0(this.j);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.h.iterator();
    }

    public final void j() {
        if (this.h.size() > this.f.size()) {
            this.f.add(1);
        }
    }

    public final void j0() throws bm4 {
        char[] cArr = this.p;
        if (cArr.length > 1) {
            int i = this.s;
            if (cArr[i + 1] != '/') {
                throw new bm4("Path '%s' in %s has an illegal syntax", this.l, this.n);
            }
            this.s = i + 1;
        }
        int i2 = this.s + 1;
        this.s = i2;
        this.r = i2;
    }

    public final void k0() {
        int i = this.s;
        int i2 = i - 1;
        char[] cArr = this.p;
        if (i2 >= cArr.length) {
            this.s = i - 1;
        } else if (cArr[i - 1] == '/') {
            this.s = i - 1;
        }
    }

    public final void m() throws bm4 {
        char c;
        int i = this.s + 1;
        this.s = i;
        do {
            int i2 = this.s;
            if (i2 >= this.q) {
                if (i2 <= i) {
                    throw new bm4("Attribute reference in '%s' for %s is empty", this.l, this.n);
                }
                this.o = true;
                n(i, i2 - i);
                return;
            }
            char[] cArr = this.p;
            this.s = i2 + 1;
            c = cArr[i2];
        } while (f0(c));
        throw new bm4("Illegal character '%s' in attribute for '%s' in %s", Character.valueOf(c), this.l, this.n);
    }

    public final void n(int i, int i2) {
        String str = new String(this.p, i, i2);
        if (i2 > 0) {
            r(str);
        }
    }

    public final void r(String str) {
        String strA = this.m.a(str);
        this.g.add(null);
        this.h.add(strA);
    }

    public String toString() {
        int i = this.s;
        int i2 = this.r;
        int i3 = i - i2;
        if (this.k == null) {
            this.k = new String(this.p, i2, i3);
        }
        return this.k;
    }

    public final void u() {
        int size = this.h.size();
        int i = size - 1;
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) this.g.get(i2);
            String str2 = (String) this.h.get(i2);
            int iIntValue = ((Integer) this.f.get(i2)).intValue();
            if (i2 > 0) {
                this.i.append('/');
            }
            if (this.o && i2 == i) {
                this.i.append('@');
                this.i.append(str2);
            } else {
                if (str != null) {
                    this.i.append(str);
                    this.i.append(':');
                }
                this.i.append(str2);
                this.i.append('[');
                this.i.append(iIntValue);
                this.i.append(']');
            }
        }
        this.j = this.i.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        z(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w() throws com.zepto.bm4 {
        /*
            r5 = this;
            int r0 = r5.s
            r1 = 0
        L3:
            int r2 = r5.s
            int r3 = r5.q
            if (r2 >= r3) goto L46
            char[] r3 = r5.p
            int r4 = r2 + 1
            r5.s = r4
            char r2 = r3[r2]
            boolean r3 = r5.f0(r2)
            if (r3 != 0) goto L43
            r3 = 64
            if (r2 != r3) goto L22
            int r2 = r5.s
            int r2 = r2 + (-1)
            r5.s = r2
            goto L46
        L22:
            r3 = 91
            if (r2 != r3) goto L2a
            r5.P()
            goto L46
        L2a:
            r3 = 47
            if (r2 != r3) goto L2f
            goto L46
        L2f:
            com.zepto.bm4 r0 = new com.zepto.bm4
            java.lang.Character r1 = java.lang.Character.valueOf(r2)
            java.lang.String r2 = r5.l
            com.zepto.lo6 r3 = r5.n
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "Illegal character '%s' in element for '%s' in %s"
            r0.<init>(r2, r1)
            throw r0
        L43:
            int r1 = r1 + 1
            goto L3
        L46:
            r5.z(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.fm4.w():void");
    }

    @Override // com.zepto.y62
    public boolean x() {
        return this.h.size() > 1;
    }

    public final void z(int i, int i2) {
        String str = new String(this.p, i, i2);
        if (i2 > 0) {
            B(str);
        }
    }
}
