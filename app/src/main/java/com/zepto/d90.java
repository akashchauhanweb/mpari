package com.zepto;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public class d90 extends s40 {
    public static Properties H = new Properties();
    public static Properties I = new Properties();
    public static Hashtable J = new Hashtable();
    public static Hashtable K = new Hashtable();
    public static boolean L = false;
    public String A;
    public boolean B;
    public char[] C;
    public k03 D;
    public k03 E;
    public HashMap F;
    public boolean G;
    public String y;
    public String z;

    public d90(String str, String str2, boolean z) throws cu1 {
        this.z = "";
        this.B = false;
        this.G = false;
        N();
        this.e = 2;
        String strI = s40.i(str);
        if (!M(strI, str2)) {
            throw new cu1(dt3.b("font.1.with.2.encoding.is.not.a.cjk.font", str, str2));
        }
        if (strI.length() < str.length()) {
            this.z = str.substring(strI.length());
            str = strI;
        }
        this.y = str;
        this.j = "UnicodeBigUnmarked";
        this.G = str2.endsWith("V");
        this.A = str2;
        if (str2.startsWith("Identity-")) {
            this.B = true;
            String property = H.getProperty(str);
            String strSubstring = property.substring(0, property.indexOf(95));
            char[] cArrO = (char[]) J.get(strSubstring);
            if (cArrO == null) {
                cArrO = O(strSubstring);
                if (cArrO == null) {
                    throw new cu1(dt3.b("the.cmap.1.does.not.exist.as.a.resource", strSubstring));
                }
                cArrO[32767] = '\n';
                J.put(strSubstring, cArrO);
            }
            this.C = cArrO;
        } else {
            char[] cArr = (char[]) J.get(str2);
            if (cArr == null) {
                String property2 = I.getProperty(str2);
                if (property2 == null) {
                    throw new cu1(dt3.b("the.resource.cjkencodings.properties.does.not.contain.the.encoding.1", str2));
                }
                StringTokenizer stringTokenizer = new StringTokenizer(property2);
                String strNextToken = stringTokenizer.nextToken();
                char[] cArrO2 = (char[]) J.get(strNextToken);
                if (cArrO2 == null) {
                    cArrO2 = O(strNextToken);
                    J.put(strNextToken, cArrO2);
                }
                cArr = cArrO2;
                if (stringTokenizer.hasMoreTokens()) {
                    char[] cArrO3 = O(stringTokenizer.nextToken());
                    for (int i = 0; i < 65536; i++) {
                        if (cArrO3[i] == 0) {
                            cArrO3[i] = cArr[i];
                        }
                    }
                    J.put(str2, cArrO3);
                    cArr = cArrO3;
                }
            }
            this.C = cArr;
        }
        HashMap map = (HashMap) K.get(str);
        this.F = map;
        if (map == null) {
            HashMap mapP = P(str);
            this.F = mapP;
            K.put(str, mapP);
        }
        this.E = (k03) this.F.get("W");
        this.D = (k03) this.F.get("W2");
    }

    public static String C(int[] iArr, k03 k03Var) {
        if (iArr.length == 0) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        int iB = 0;
        while (true) {
            if (i >= iArr.length) {
                break;
            }
            i2 = iArr[i];
            iB = k03Var.b(i2);
            if (iB != 0) {
                i++;
                break;
            }
            i++;
        }
        if (iB == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        stringBuffer.append(i2);
        char c = 0;
        while (i < iArr.length) {
            int i3 = iArr[i];
            int iB2 = k03Var.b(i3);
            if (iB2 != 0) {
                if (c == 0) {
                    int i4 = i2 + 1;
                    if (i3 == i4 && iB2 == iB) {
                        c = 2;
                    } else if (i3 == i4) {
                        stringBuffer.append('[');
                        stringBuffer.append(iB);
                        c = 1;
                    } else {
                        stringBuffer.append('[');
                        stringBuffer.append(iB);
                        stringBuffer.append(']');
                        stringBuffer.append(i3);
                    }
                    i2 = i3;
                    iB = iB2;
                } else if (c != 1) {
                    if (c == 2 && (i3 != i2 + 1 || iB2 != iB)) {
                        stringBuffer.append(' ');
                        stringBuffer.append(i2);
                        stringBuffer.append(' ');
                        stringBuffer.append(iB);
                        stringBuffer.append(' ');
                        stringBuffer.append(i3);
                        c = 0;
                    }
                    i2 = i3;
                    iB = iB2;
                } else {
                    int i5 = i2 + 1;
                    if (i3 == i5 && iB2 == iB) {
                        stringBuffer.append(']');
                        stringBuffer.append(i2);
                        c = 2;
                        i2 = i3;
                        iB = iB2;
                    } else if (i3 == i5) {
                        stringBuffer.append(' ');
                        stringBuffer.append(iB);
                        i2 = i3;
                        iB = iB2;
                    } else {
                        stringBuffer.append(' ');
                        stringBuffer.append(iB);
                        stringBuffer.append(']');
                        stringBuffer.append(i3);
                        c = 0;
                        i2 = i3;
                        iB = iB2;
                    }
                }
            }
            i++;
        }
        if (c == 0) {
            stringBuffer.append('[');
            stringBuffer.append(iB);
            stringBuffer.append("]]");
        } else if (c == 1) {
            stringBuffer.append(' ');
            stringBuffer.append(iB);
            stringBuffer.append("]]");
        } else if (c == 2) {
            stringBuffer.append(' ');
            stringBuffer.append(i2);
            stringBuffer.append(' ');
            stringBuffer.append(iB);
            stringBuffer.append(']');
        }
        return stringBuffer.toString();
    }

    public static String D(int[] iArr, k03 k03Var, k03 k03Var2) {
        if (iArr.length == 0) {
            return null;
        }
        int i = 0;
        int iB = 0;
        int iB2 = 0;
        int i2 = 0;
        while (true) {
            if (i >= iArr.length) {
                break;
            }
            i2 = iArr[i];
            iB = k03Var.b(i2);
            if (iB != 0) {
                i++;
                break;
            }
            iB2 = k03Var2.b(i2);
            i++;
        }
        if (iB == 0) {
            return null;
        }
        if (iB2 == 0) {
            iB2 = 1000;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        stringBuffer.append(i2);
        char c = 0;
        while (i < iArr.length) {
            int i3 = iArr[i];
            int iB3 = k03Var.b(i3);
            if (iB3 != 0) {
                int iB4 = k03Var2.b(i2);
                int i4 = iB4 == 0 ? 1000 : iB4;
                if (c != 0) {
                    if (c == 2 && (i3 != i2 + 1 || iB3 != iB || i4 != iB2)) {
                        stringBuffer.append(' ');
                        stringBuffer.append(i2);
                        stringBuffer.append(' ');
                        stringBuffer.append(-iB);
                        stringBuffer.append(' ');
                        stringBuffer.append(iB2 / 2);
                        stringBuffer.append(' ');
                        stringBuffer.append(880);
                        stringBuffer.append(' ');
                        stringBuffer.append(i3);
                        c = 0;
                    }
                } else if (i3 == i2 + 1 && iB3 == iB && i4 == iB2) {
                    c = 2;
                } else {
                    stringBuffer.append(' ');
                    stringBuffer.append(i2);
                    stringBuffer.append(' ');
                    stringBuffer.append(-iB);
                    stringBuffer.append(' ');
                    stringBuffer.append(iB2 / 2);
                    stringBuffer.append(' ');
                    stringBuffer.append(880);
                    stringBuffer.append(' ');
                    stringBuffer.append(i3);
                }
                iB2 = i4;
                i2 = i3;
                iB = iB3;
            }
            i++;
        }
        stringBuffer.append(' ');
        stringBuffer.append(i2);
        stringBuffer.append(' ');
        stringBuffer.append(-iB);
        stringBuffer.append(' ');
        stringBuffer.append(iB2 / 2);
        stringBuffer.append(' ');
        stringBuffer.append(880);
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }

    public static k03 E(String str) {
        k03 k03Var = new k03();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        while (stringTokenizer.hasMoreTokens()) {
            k03Var.d(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
        }
        return k03Var;
    }

    public static boolean M(String str, String str2) {
        N();
        String property = H.getProperty(str);
        if (property != null) {
            if (!str2.equals("Identity-H") && !str2.equals("Identity-V")) {
                if (property.indexOf("_" + str2 + "_") >= 0) {
                }
            }
            return true;
        }
        return false;
    }

    public static void N() {
        if (L) {
            return;
        }
        synchronized (K) {
            if (L) {
                return;
            }
            try {
                InputStream inputStreamQ = s40.q("com/itextpdf/text/pdf/fonts/cjkfonts.properties");
                H.load(inputStreamQ);
                inputStreamQ.close();
                InputStream inputStreamQ2 = s40.q("com/itextpdf/text/pdf/fonts/cjkencodings.properties");
                I.load(inputStreamQ2);
                inputStreamQ2.close();
            } catch (Exception unused) {
                H = new Properties();
                I = new Properties();
            }
            L = true;
        }
    }

    public static char[] O(String str) {
        try {
            InputStream inputStreamQ = s40.q("com/itextpdf/text/pdf/fonts/" + (str + ".cmap"));
            char[] cArr = new char[65536];
            for (int i = 0; i < 65536; i++) {
                cArr[i] = (char) ((inputStreamQ.read() << 8) + inputStreamQ.read());
            }
            inputStreamQ.close();
            return cArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public static HashMap P(String str) {
        try {
            InputStream inputStreamQ = s40.q("com/itextpdf/text/pdf/fonts/" + (str + ".properties"));
            Properties properties = new Properties();
            properties.load(inputStreamQ);
            inputStreamQ.close();
            k03 k03VarE = E(properties.getProperty("W"));
            properties.remove("W");
            k03 k03VarE2 = E(properties.getProperty("W2"));
            properties.remove("W2");
            HashMap map = new HashMap();
            Enumeration enumerationKeys = properties.keys();
            while (enumerationKeys.hasMoreElements()) {
                Object objNextElement = enumerationKeys.nextElement();
                map.put((String) objNextElement, properties.getProperty((String) objNextElement));
            }
            map.put("W", k03VarE);
            map.put("W2", k03VarE2);
            return map;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.zepto.s40
    public void B(pq4 pq4Var, gp4 gp4Var, Object[] objArr) {
        k03 k03Var = (k03) objArr[0];
        uo4 uo4VarK = K();
        gp4 gp4VarA = uo4VarK != null ? pq4Var.n(uo4VarK).a() : null;
        uo4 uo4VarG = G(gp4VarA, k03Var);
        if (uo4VarG != null) {
            gp4VarA = pq4Var.n(uo4VarG).a();
        }
        pq4Var.o(J(gp4VarA), gp4Var);
    }

    public final float F(int i) {
        StringTokenizer stringTokenizer = new StringTokenizer((String) this.F.get("FontBBox"), " []\r\n\t\f");
        String strNextToken = stringTokenizer.nextToken();
        for (int i2 = 0; i2 < i; i2++) {
            strNextToken = stringTokenizer.nextToken();
        }
        return Integer.parseInt(strNextToken);
    }

    public final uo4 G(gp4 gp4Var, k03 k03Var) {
        uo4 uo4Var = new uo4(lp4.u3);
        uo4Var.r(lp4.v9, lp4.R0);
        uo4Var.r(lp4.Y, new lp4(this.y + this.z));
        uo4Var.r(lp4.w3, gp4Var);
        int[] iArrF = k03Var.f();
        String strC = C(iArrF, this.E);
        if (strC != null) {
            uo4Var.r(lp4.db, new jp4(strC));
        }
        if (this.G) {
            String strD = D(iArrF, this.D, this.E);
            if (strD != null) {
                uo4Var.r(lp4.eb, new jp4(strD));
            }
        } else {
            uo4Var.r(lp4.t2, new op4(1000));
        }
        uo4 uo4Var2 = new uo4();
        uo4Var2.r(lp4.c8, new hq4((String) this.F.get("Registry"), null));
        uo4Var2.r(lp4.K6, new hq4((String) this.F.get("Ordering"), null));
        uo4Var2.r(lp4.w9, new jp4((String) this.F.get("Supplement")));
        uo4Var.r(lp4.U0, uo4Var2);
        return uo4Var;
    }

    public int H(int i) {
        return this.B ? i : this.C[i];
    }

    public final float I(String str) {
        return Integer.parseInt((String) this.F.get(str));
    }

    public final uo4 J(gp4 gp4Var) {
        uo4 uo4Var = new uo4(lp4.u3);
        uo4Var.r(lp4.v9, lp4.ta);
        String str = this.y;
        if (this.z.length() > 0) {
            str = str + "-" + this.z.substring(1);
        }
        uo4Var.r(lp4.Y, new lp4(str + "-" + this.A));
        uo4Var.r(lp4.E2, new lp4(this.A));
        uo4Var.r(lp4.R1, new ko4(gp4Var));
        return uo4Var;
    }

    public final uo4 K() {
        uo4 uo4Var = new uo4(lp4.w3);
        uo4Var.r(lp4.N, new jp4((String) this.F.get("Ascent")));
        uo4Var.r(lp4.D0, new jp4((String) this.F.get("CapHeight")));
        uo4Var.r(lp4.S1, new jp4((String) this.F.get("Descent")));
        uo4Var.r(lp4.p3, new jp4((String) this.F.get("Flags")));
        uo4Var.r(lp4.v3, new jp4((String) this.F.get("FontBBox")));
        uo4Var.r(lp4.B3, new lp4(this.y + this.z));
        uo4Var.r(lp4.Q4, new jp4((String) this.F.get("ItalicAngle")));
        uo4Var.r(lp4.j9, new jp4((String) this.F.get("StemV")));
        uo4 uo4Var2 = new uo4();
        uo4Var2.r(lp4.a7, new hq4((String) this.F.get("Panose"), null));
        uo4Var.r(lp4.r9, uo4Var2);
        return uo4Var;
    }

    public String[][] L() {
        return new String[][]{new String[]{"", "", "", this.y}};
    }

    @Override // com.zepto.s40
    public String[][] k() {
        return L();
    }

    @Override // com.zepto.s40
    public float l(int i, float f) {
        float F;
        switch (i) {
            case 1:
            case 9:
                return (I("Ascent") * f) / 1000.0f;
            case 2:
                return (I("CapHeight") * f) / 1000.0f;
            case 3:
            case 10:
                return (I("Descent") * f) / 1000.0f;
            case 4:
                return I("ItalicAngle");
            case 5:
                F = F(0);
                break;
            case 6:
                F = F(1);
                break;
            case 7:
                F = F(2);
                break;
            case 8:
                F = F(3);
                break;
            case 11:
            default:
                return 0.0f;
            case 12:
                F = F(2) - F(0);
                break;
        }
        return (f * F) / 1000.0f;
    }

    @Override // com.zepto.s40
    public String n() {
        return this.y;
    }

    @Override // com.zepto.s40
    public int[] o(int i, String str) {
        return null;
    }

    @Override // com.zepto.s40
    public int p(int i, String str) {
        return 0;
    }

    @Override // com.zepto.s40
    public int t(int i) {
        return this.B ? this.C[i] : i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r2v0 ??, r2v1 ??, r2v6 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // com.zepto.s40
    public int u(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r2v0 ??, r2v1 ??, r2v6 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    @Override // com.zepto.s40
    public int v(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (!this.B) {
                cCharAt = this.C[cCharAt];
            }
            int iB = this.G ? this.D.b(cCharAt) : this.E.b(cCharAt);
            i = iB > 0 ? i + iB : i + 1000;
        }
        return i;
    }
}
