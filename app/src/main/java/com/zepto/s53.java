package com.zepto;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public class s53 implements Closeable {
    public final Reader c;
    public long l;
    public int m;
    public String n;
    public int[] o;
    public String[] q;
    public int[] r;
    public boolean e = false;
    public final char[] f = new char[1024];
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public int p = 1;

    public class a extends t53 {
        @Override // com.zepto.t53
        public void a(s53 s53Var) throws IOException {
            if (s53Var instanceof w53) {
                ((w53) s53Var).X0();
                return;
            }
            int iN = s53Var.k;
            if (iN == 0) {
                iN = s53Var.n();
            }
            if (iN == 13) {
                s53Var.k = 9;
                return;
            }
            if (iN == 12) {
                s53Var.k = 8;
                return;
            }
            if (iN == 14) {
                s53Var.k = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + s53Var.G0() + s53Var.m0());
        }
    }

    static {
        t53.a = new a();
    }

    public s53(Reader reader) {
        int[] iArr = new int[32];
        this.o = iArr;
        iArr[0] = 6;
        this.q = new String[32];
        this.r = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.c = reader;
    }

    private String P(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(Typography.dollar);
        int i = 0;
        while (true) {
            int i2 = this.p;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.o[i];
            if (i3 == 1 || i3 == 2) {
                int i4 = this.r[i];
                if (z && i4 > 0 && i == i2 - 1) {
                    i4--;
                }
                sb.append('[');
                sb.append(i4);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.q[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    public String A0() throws IOException {
        String strD0;
        int iN = this.k;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 14) {
            strD0 = F0();
        } else if (iN == 12) {
            strD0 = D0('\'');
        } else {
            if (iN != 13) {
                throw new IllegalStateException("Expected a name but was " + G0() + m0());
            }
            strD0 = D0(Typography.quote);
        }
        this.k = 0;
        this.q[this.p - 1] = strD0;
        return strD0;
    }

    public void B() throws IOException {
        int iN = this.k;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + G0() + m0());
        }
        int i = this.p;
        int i2 = i - 1;
        this.p = i2;
        this.q[i2] = null;
        int[] iArr = this.r;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.k = 0;
    }

    public final int B0(boolean z) throws IOException {
        char[] cArr = this.f;
        int i = this.g;
        int i2 = this.h;
        while (true) {
            if (i == i2) {
                this.g = i;
                if (!D(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m0());
                }
                i = this.g;
                i2 = this.h;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.i++;
                this.j = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.g = i3;
                    if (i3 == i2) {
                        this.g = i;
                        boolean zD = D(2);
                        this.g++;
                        if (!zD) {
                            return c;
                        }
                    }
                    j();
                    int i4 = this.g;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.g = i4 + 1;
                        if (!N0("*/")) {
                            throw R0("Unterminated comment");
                        }
                        i = this.g + 2;
                        i2 = this.h;
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.g = i4 + 1;
                        O0();
                        i = this.g;
                        i2 = this.h;
                    }
                } else {
                    if (c != '#') {
                        this.g = i3;
                        return c;
                    }
                    this.g = i3;
                    j();
                    O0();
                    i = this.g;
                    i2 = this.h;
                }
            }
            i = i3;
        }
    }

    public void C0() throws IOException {
        int iN = this.k;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 7) {
            this.k = 0;
            int[] iArr = this.r;
            int i = this.p - 1;
            iArr[i] = iArr[i] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + G0() + m0());
    }

    public final boolean D(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.f;
        int i4 = this.j;
        int i5 = this.g;
        this.j = i4 - i5;
        int i6 = this.h;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.h = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.h = 0;
        }
        this.g = 0;
        do {
            Reader reader = this.c;
            int i8 = this.h;
            int i9 = reader.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.h + i9;
            this.h = i2;
            if (this.i == 0 && (i3 = this.j) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.g++;
                this.j = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.g = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String D0(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f
            r1 = 0
        L3:
            int r2 = r9.g
            int r3 = r9.h
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5a
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.g = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4d
            r9.g = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L3e
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L3e:
            r1.append(r0, r3, r2)
            char r2 = r9.K0()
            r1.append(r2)
            int r2 = r9.g
            int r3 = r9.h
            goto L7
        L4d:
            r5 = 10
            if (r2 != r5) goto L58
            int r2 = r9.i
            int r2 = r2 + r6
            r9.i = r2
            r9.j = r7
        L58:
            r2 = r7
            goto L9
        L5a:
            if (r1 != 0) goto L6a
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6a:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.g = r2
            boolean r2 = r9.D(r6)
            if (r2 == 0) goto L78
            goto L3
        L78:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.R0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.s53.D0(char):java.lang.String");
    }

    public String E0() throws IOException {
        String str;
        int iN = this.k;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 10) {
            str = F0();
        } else if (iN == 8) {
            str = D0('\'');
        } else if (iN == 9) {
            str = D0(Typography.quote);
        } else if (iN == 11) {
            str = this.n;
            this.n = null;
        } else if (iN == 15) {
            str = Long.toString(this.l);
        } else {
            if (iN != 16) {
                throw new IllegalStateException("Expected a string but was " + G0() + m0());
            }
            str = new String(this.f, this.g, this.m);
            this.g += this.m;
        }
        this.k = 0;
        int[] iArr = this.r;
        int i = this.p - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        j();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String F0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.g
            int r4 = r3 + r2
            int r5 = r6.h
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.j()
            goto L5c
        L4e:
            char[] r3 = r6.f
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.D(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f
            int r4 = r6.g
            r0.append(r3, r4, r2)
            int r3 = r6.g
            int r3 = r3 + r2
            r6.g = r3
            r2 = 1
            boolean r2 = r6.D(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f
            int r3 = r6.g
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f
            int r3 = r6.g
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.g
            int r2 = r2 + r1
            r6.g = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.s53.F0():java.lang.String");
    }

    public v53 G0() throws IOException {
        int iN = this.k;
        if (iN == 0) {
            iN = n();
        }
        switch (iN) {
            case 1:
                return v53.BEGIN_OBJECT;
            case 2:
                return v53.END_OBJECT;
            case 3:
                return v53.BEGIN_ARRAY;
            case 4:
                return v53.END_ARRAY;
            case 5:
            case 6:
                return v53.BOOLEAN;
            case 7:
                return v53.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return v53.STRING;
            case 12:
            case 13:
            case 14:
                return v53.NAME;
            case 15:
            case 16:
                return v53.NUMBER;
            case 17:
                return v53.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final int H0() {
        String str;
        String str2;
        int i;
        char c = this.f[this.g];
        if (c == 't' || c == 'T') {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (c != 'n' && c != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.g + i2 >= this.h && !D(i2 + 1)) {
                return 0;
            }
            char c2 = this.f[this.g + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.g + length < this.h || D(length + 1)) && k0(this.f[this.g + length])) {
            return 0;
        }
        this.g += length;
        this.k = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        if (k0(r14) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
    
        if (r9 != 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
    
        if (r10 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009d, code lost:
    
        if (r13 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
    
        if (r11 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        if (r13 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a7, code lost:
    
        if (r13 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ab, code lost:
    
        r18.l = r11;
        r18.g += r8;
        r18.k = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b7, code lost:
    
        if (r9 == 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ba, code lost:
    
        if (r9 == 4) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bd, code lost:
    
        if (r9 != 7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c2, code lost:
    
        r18.m = r8;
        r18.k = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c8, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c9, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int I0() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.s53.I0():int");
    }

    public final void J0(int i) {
        int i2 = this.p;
        int[] iArr = this.o;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.o = Arrays.copyOf(iArr, i3);
            this.r = Arrays.copyOf(this.r, i3);
            this.q = (String[]) Arrays.copyOf(this.q, i3);
        }
        int[] iArr2 = this.o;
        int i4 = this.p;
        this.p = i4 + 1;
        iArr2[i4] = i;
    }

    public final char K0() throws IOException {
        int i;
        if (this.g == this.h && !D(1)) {
            throw R0("Unterminated escape sequence");
        }
        char[] cArr = this.f;
        int i2 = this.g;
        int i3 = i2 + 1;
        this.g = i3;
        char c = cArr[i2];
        if (c == '\n') {
            this.i++;
            this.j = i3;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            if (c == 't') {
                return '\t';
            }
            if (c != 'u') {
                throw R0("Invalid escape sequence");
            }
            if (i2 + 5 > this.h && !D(4)) {
                throw R0("Unterminated escape sequence");
            }
            int i4 = this.g;
            int i5 = i4 + 4;
            char c2 = 0;
            while (i4 < i5) {
                char c3 = this.f[i4];
                char c4 = (char) (c2 << 4);
                if (c3 >= '0' && c3 <= '9') {
                    i = c3 - '0';
                } else if (c3 >= 'a' && c3 <= 'f') {
                    i = c3 - 'W';
                } else {
                    if (c3 < 'A' || c3 > 'F') {
                        throw new NumberFormatException("\\u" + new String(this.f, this.g, 4));
                    }
                    i = c3 - '7';
                }
                c2 = (char) (c4 + i);
                i4++;
            }
            this.g += 4;
            return c2;
        }
        return c;
    }

    public final void L0(boolean z) {
        this.e = z;
    }

    public final void M0(char c) throws IOException {
        char[] cArr = this.f;
        do {
            int i = this.g;
            int i2 = this.h;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.g = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.g = i3;
                    K0();
                    i = this.g;
                    i2 = this.h;
                } else {
                    if (c2 == '\n') {
                        this.i++;
                        this.j = i3;
                    }
                    i = i3;
                }
            }
            this.g = i;
        } while (D(1));
        throw R0("Unterminated string");
    }

    public final boolean N0(String str) {
        int length = str.length();
        while (true) {
            if (this.g + length > this.h && !D(length)) {
                return false;
            }
            char[] cArr = this.f;
            int i = this.g;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.f[this.g + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.i++;
            this.j = i + 1;
            this.g++;
        }
    }

    public final void O0() {
        char c;
        do {
            if (this.g >= this.h && !D(1)) {
                return;
            }
            char[] cArr = this.f;
            int i = this.g;
            int i2 = i + 1;
            this.g = i2;
            c = cArr[i];
            if (c == '\n') {
                this.i++;
                this.j = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        j();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.g
            int r2 = r1 + r0
            int r3 = r4.h
            if (r2 >= r3) goto L51
            char[] r2 = r4.f
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.j()
        L4b:
            int r1 = r4.g
            int r1 = r1 + r0
            r4.g = r1
            return
        L51:
            int r1 = r1 + r0
            r4.g = r1
            r0 = 1
            boolean r0 = r4.D(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.s53.P0():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void Q0() throws IOException {
        int i = 0;
        do {
            int iN = this.k;
            if (iN == 0) {
                iN = n();
            }
            switch (iN) {
                case 1:
                    J0(3);
                    i++;
                    this.k = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.q[this.p - 1] = null;
                    }
                    this.p--;
                    i--;
                    this.k = 0;
                    break;
                case 3:
                    J0(1);
                    i++;
                    this.k = 0;
                    break;
                case 4:
                    this.p--;
                    i--;
                    this.k = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.k = 0;
                    break;
                case 8:
                    M0('\'');
                    this.k = 0;
                    break;
                case 9:
                    M0(Typography.quote);
                    this.k = 0;
                    break;
                case 10:
                    P0();
                    this.k = 0;
                    break;
                case 12:
                    M0('\'');
                    if (i == 0) {
                        this.q[this.p - 1] = "<skipped>";
                    }
                    this.k = 0;
                    break;
                case 13:
                    M0(Typography.quote);
                    if (i == 0) {
                        this.q[this.p - 1] = "<skipped>";
                    }
                    this.k = 0;
                    break;
                case 14:
                    P0();
                    if (i == 0) {
                        this.q[this.p - 1] = "<skipped>";
                    }
                    this.k = 0;
                    break;
                case 16:
                    this.g += this.m;
                    this.k = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.r;
        int i2 = this.p - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public final IOException R0(String str) throws gp3 {
        throw new gp3(str + m0());
    }

    public String U() {
        return P(true);
    }

    public String b() {
        return P(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.k = 0;
        this.o[0] = 8;
        this.p = 1;
        this.c.close();
    }

    public void d() throws IOException {
        int iN = this.k;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 3) {
            J0(1);
            this.r[this.p - 1] = 0;
            this.k = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + G0() + m0());
        }
    }

    public boolean d0() throws IOException {
        int iN = this.k;
        if (iN == 0) {
            iN = n();
        }
        return (iN == 2 || iN == 4 || iN == 17) ? false : true;
    }

    public void e() throws IOException {
        int iN = this.k;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 1) {
            J0(3);
            this.k = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + G0() + m0());
        }
    }

    public final boolean e0() {
        return this.e;
    }

    public final void j() throws IOException {
        if (!this.e) {
            throw R0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public final boolean k0(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        j();
        return false;
    }

    public final void m() throws IOException {
        B0(true);
        int i = this.g;
        this.g = i - 1;
        if (i + 4 <= this.h || D(5)) {
            int i2 = this.g;
            char[] cArr = this.f;
            if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == '\n') {
                this.g = i2 + 5;
            }
        }
    }

    public String m0() {
        return " at line " + (this.i + 1) + " column " + ((this.g - this.j) + 1) + " path " + b();
    }

    public int n() throws IOException {
        int iB0;
        int[] iArr = this.o;
        int i = this.p;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int iB02 = B0(true);
            if (iB02 != 44) {
                if (iB02 != 59) {
                    if (iB02 != 93) {
                        throw R0("Unterminated array");
                    }
                    this.k = 4;
                    return 4;
                }
                j();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5 && (iB0 = B0(true)) != 44) {
                    if (iB0 != 59) {
                        if (iB0 != 125) {
                            throw R0("Unterminated object");
                        }
                        this.k = 2;
                        return 2;
                    }
                    j();
                }
                int iB03 = B0(true);
                if (iB03 == 34) {
                    this.k = 13;
                    return 13;
                }
                if (iB03 == 39) {
                    j();
                    this.k = 12;
                    return 12;
                }
                if (iB03 == 125) {
                    if (i2 == 5) {
                        throw R0("Expected name");
                    }
                    this.k = 2;
                    return 2;
                }
                j();
                this.g--;
                if (!k0((char) iB03)) {
                    throw R0("Expected name");
                }
                this.k = 14;
                return 14;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int iB04 = B0(true);
                if (iB04 != 58) {
                    if (iB04 != 61) {
                        throw R0("Expected ':'");
                    }
                    j();
                    if (this.g < this.h || D(1)) {
                        char[] cArr = this.f;
                        int i3 = this.g;
                        if (cArr[i3] == '>') {
                            this.g = i3 + 1;
                        }
                    }
                }
            } else if (i2 == 6) {
                if (this.e) {
                    m();
                }
                this.o[this.p - 1] = 7;
            } else if (i2 == 7) {
                if (B0(false) == -1) {
                    this.k = 17;
                    return 17;
                }
                j();
                this.g--;
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iB05 = B0(true);
        if (iB05 == 34) {
            this.k = 9;
            return 9;
        }
        if (iB05 == 39) {
            j();
            this.k = 8;
            return 8;
        }
        if (iB05 != 44 && iB05 != 59) {
            if (iB05 == 91) {
                this.k = 3;
                return 3;
            }
            if (iB05 != 93) {
                if (iB05 == 123) {
                    this.k = 1;
                    return 1;
                }
                this.g--;
                int iH0 = H0();
                if (iH0 != 0) {
                    return iH0;
                }
                int iI0 = I0();
                if (iI0 != 0) {
                    return iI0;
                }
                if (!k0(this.f[this.g])) {
                    throw R0("Expected value");
                }
                j();
                this.k = 10;
                return 10;
            }
            if (i2 == 1) {
                this.k = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw R0("Unexpected value");
        }
        j();
        this.g--;
        this.k = 7;
        return 7;
    }

    public boolean p0() throws IOException {
        int iN = this.k;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 5) {
            this.k = 0;
            int[] iArr = this.r;
            int i = this.p - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iN == 6) {
            this.k = 0;
            int[] iArr2 = this.r;
            int i2 = this.p - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + G0() + m0());
    }

    public String toString() {
        return getClass().getSimpleName() + m0();
    }

    public void w() throws IOException {
        int iN = this.k;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + G0() + m0());
        }
        int i = this.p;
        this.p = i - 1;
        int[] iArr = this.r;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.k = 0;
    }

    public double x0() throws IOException {
        int iN = this.k;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 15) {
            this.k = 0;
            int[] iArr = this.r;
            int i = this.p - 1;
            iArr[i] = iArr[i] + 1;
            return this.l;
        }
        if (iN == 16) {
            this.n = new String(this.f, this.g, this.m);
            this.g += this.m;
        } else if (iN == 8 || iN == 9) {
            this.n = D0(iN == 8 ? '\'' : Typography.quote);
        } else if (iN == 10) {
            this.n = F0();
        } else if (iN != 11) {
            throw new IllegalStateException("Expected a double but was " + G0() + m0());
        }
        this.k = 11;
        double d = Double.parseDouble(this.n);
        if (!this.e && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new gp3("JSON forbids NaN and infinities: " + d + m0());
        }
        this.n = null;
        this.k = 0;
        int[] iArr2 = this.r;
        int i2 = this.p - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public int y0() throws IOException {
        int iN = this.k;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 15) {
            long j = this.l;
            int i = (int) j;
            if (j == i) {
                this.k = 0;
                int[] iArr = this.r;
                int i2 = this.p - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new NumberFormatException("Expected an int but was " + this.l + m0());
        }
        if (iN == 16) {
            this.n = new String(this.f, this.g, this.m);
            this.g += this.m;
        } else {
            if (iN != 8 && iN != 9 && iN != 10) {
                throw new IllegalStateException("Expected an int but was " + G0() + m0());
            }
            if (iN == 10) {
                this.n = F0();
            } else {
                this.n = D0(iN == 8 ? '\'' : Typography.quote);
            }
            try {
                int i3 = Integer.parseInt(this.n);
                this.k = 0;
                int[] iArr2 = this.r;
                int i4 = this.p - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.k = 11;
        double d = Double.parseDouble(this.n);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.n + m0());
        }
        this.n = null;
        this.k = 0;
        int[] iArr3 = this.r;
        int i6 = this.p - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public long z0() throws IOException {
        int iN = this.k;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 15) {
            this.k = 0;
            int[] iArr = this.r;
            int i = this.p - 1;
            iArr[i] = iArr[i] + 1;
            return this.l;
        }
        if (iN == 16) {
            this.n = new String(this.f, this.g, this.m);
            this.g += this.m;
        } else {
            if (iN != 8 && iN != 9 && iN != 10) {
                throw new IllegalStateException("Expected a long but was " + G0() + m0());
            }
            if (iN == 10) {
                this.n = F0();
            } else {
                this.n = D0(iN == 8 ? '\'' : Typography.quote);
            }
            try {
                long j = Long.parseLong(this.n);
                this.k = 0;
                int[] iArr2 = this.r;
                int i2 = this.p - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.k = 11;
        double d = Double.parseDouble(this.n);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.n + m0());
        }
        this.n = null;
        this.k = 0;
        int[] iArr3 = this.r;
        int i3 = this.p - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }
}
