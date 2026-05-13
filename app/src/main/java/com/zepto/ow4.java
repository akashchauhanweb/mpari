package com.zepto;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ow4 {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static void A(InputStream inputStream) {
        d22.h(inputStream);
        int iJ = d22.j(inputStream);
        if (iJ == 6 || iJ == 7) {
            return;
        }
        while (iJ > 0) {
            d22.j(inputStream);
            for (int iJ2 = d22.j(inputStream); iJ2 > 0; iJ2--) {
                d22.h(inputStream);
            }
            iJ--;
        }
    }

    public static boolean B(OutputStream outputStream, byte[] bArr, pj1[] pj1VarArr) throws IOException {
        if (Arrays.equals(bArr, qw4.a)) {
            N(outputStream, pj1VarArr);
            return true;
        }
        if (Arrays.equals(bArr, qw4.b)) {
            M(outputStream, pj1VarArr);
            return true;
        }
        if (Arrays.equals(bArr, qw4.d)) {
            K(outputStream, pj1VarArr);
            return true;
        }
        if (Arrays.equals(bArr, qw4.c)) {
            L(outputStream, pj1VarArr);
            return true;
        }
        if (!Arrays.equals(bArr, qw4.e)) {
            return false;
        }
        J(outputStream, pj1VarArr);
        return true;
    }

    public static void C(OutputStream outputStream, pj1 pj1Var) throws IOException {
        int iIntValue = 0;
        for (int i : pj1Var.h) {
            Integer numValueOf = Integer.valueOf(i);
            d22.p(outputStream, numValueOf.intValue() - iIntValue);
            iIntValue = numValueOf.intValue();
        }
    }

    public static mz7 D(pj1[] pj1VarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d22.p(byteArrayOutputStream, pj1VarArr.length);
            int i = 2;
            for (pj1 pj1Var : pj1VarArr) {
                d22.q(byteArrayOutputStream, pj1Var.c);
                d22.q(byteArrayOutputStream, pj1Var.d);
                d22.q(byteArrayOutputStream, pj1Var.g);
                String strJ = j(pj1Var.a, pj1Var.b, qw4.a);
                int iK = d22.k(strJ);
                d22.p(byteArrayOutputStream, iK);
                i = i + 14 + iK;
                d22.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                mz7 mz7Var = new mz7(sb2.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return mz7Var;
            }
            throw d22.c("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(a);
        outputStream.write(bArr);
    }

    public static void F(OutputStream outputStream, pj1 pj1Var) throws IOException {
        I(outputStream, pj1Var);
        C(outputStream, pj1Var);
        H(outputStream, pj1Var);
    }

    public static void G(OutputStream outputStream, pj1 pj1Var, String str) throws IOException {
        d22.p(outputStream, d22.k(str));
        d22.p(outputStream, pj1Var.e);
        d22.q(outputStream, pj1Var.f);
        d22.q(outputStream, pj1Var.c);
        d22.q(outputStream, pj1Var.g);
        d22.n(outputStream, str);
    }

    public static void H(OutputStream outputStream, pj1 pj1Var) throws IOException {
        byte[] bArr = new byte[k(pj1Var.g)];
        for (Map.Entry entry : pj1Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                z(bArr, 2, iIntValue, pj1Var);
            }
            if ((iIntValue2 & 4) != 0) {
                z(bArr, 4, iIntValue, pj1Var);
            }
        }
        outputStream.write(bArr);
    }

    public static void I(OutputStream outputStream, pj1 pj1Var) throws IOException {
        int i = 0;
        for (Map.Entry entry : pj1Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                d22.p(outputStream, iIntValue - i);
                d22.p(outputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static void J(OutputStream outputStream, pj1[] pj1VarArr) throws IOException {
        d22.p(outputStream, pj1VarArr.length);
        for (pj1 pj1Var : pj1VarArr) {
            String strJ = j(pj1Var.a, pj1Var.b, qw4.e);
            d22.p(outputStream, d22.k(strJ));
            d22.p(outputStream, pj1Var.i.size());
            d22.p(outputStream, pj1Var.h.length);
            d22.q(outputStream, pj1Var.c);
            d22.n(outputStream, strJ);
            Iterator it = pj1Var.i.keySet().iterator();
            while (it.hasNext()) {
                d22.p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i : pj1Var.h) {
                d22.p(outputStream, i);
            }
        }
    }

    public static void K(OutputStream outputStream, pj1[] pj1VarArr) throws IOException {
        d22.r(outputStream, pj1VarArr.length);
        for (pj1 pj1Var : pj1VarArr) {
            int size = pj1Var.i.size() * 4;
            String strJ = j(pj1Var.a, pj1Var.b, qw4.d);
            d22.p(outputStream, d22.k(strJ));
            d22.p(outputStream, pj1Var.h.length);
            d22.q(outputStream, size);
            d22.q(outputStream, pj1Var.c);
            d22.n(outputStream, strJ);
            Iterator it = pj1Var.i.keySet().iterator();
            while (it.hasNext()) {
                d22.p(outputStream, ((Integer) it.next()).intValue());
                d22.p(outputStream, 0);
            }
            for (int i : pj1Var.h) {
                d22.p(outputStream, i);
            }
        }
    }

    public static void L(OutputStream outputStream, pj1[] pj1VarArr) throws IOException {
        byte[] bArrB = b(pj1VarArr, qw4.c);
        d22.r(outputStream, pj1VarArr.length);
        d22.m(outputStream, bArrB);
    }

    public static void M(OutputStream outputStream, pj1[] pj1VarArr) throws IOException {
        byte[] bArrB = b(pj1VarArr, qw4.b);
        d22.r(outputStream, pj1VarArr.length);
        d22.m(outputStream, bArrB);
    }

    public static void N(OutputStream outputStream, pj1[] pj1VarArr) throws IOException {
        O(outputStream, pj1VarArr);
    }

    public static void O(OutputStream outputStream, pj1[] pj1VarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(pj1VarArr));
        arrayList.add(c(pj1VarArr));
        arrayList.add(d(pj1VarArr));
        long length2 = ((long) qw4.a.length) + ((long) a.length) + 4 + ((long) (arrayList.size() * 16));
        d22.q(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            mz7 mz7Var = (mz7) arrayList.get(i);
            d22.q(outputStream, mz7Var.a.b());
            d22.q(outputStream, length2);
            if (mz7Var.d) {
                byte[] bArr = mz7Var.c;
                long length3 = bArr.length;
                byte[] bArrB = d22.b(bArr);
                arrayList2.add(bArrB);
                d22.q(outputStream, bArrB.length);
                d22.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(mz7Var.c);
                d22.q(outputStream, mz7Var.c.length);
                d22.q(outputStream, 0L);
                length = mz7Var.c.length;
            }
            length2 += (long) length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }

    public static int a(pj1 pj1Var) {
        Iterator it = pj1Var.i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    public static byte[] b(pj1[] pj1VarArr, byte[] bArr) throws IOException {
        int i = 0;
        int iK = 0;
        for (pj1 pj1Var : pj1VarArr) {
            iK += d22.k(j(pj1Var.a, pj1Var.b, bArr)) + 16 + (pj1Var.e * 2) + pj1Var.f + k(pj1Var.g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, qw4.c)) {
            int length = pj1VarArr.length;
            while (i < length) {
                pj1 pj1Var2 = pj1VarArr[i];
                G(byteArrayOutputStream, pj1Var2, j(pj1Var2.a, pj1Var2.b, bArr));
                F(byteArrayOutputStream, pj1Var2);
                i++;
            }
        } else {
            for (pj1 pj1Var3 : pj1VarArr) {
                G(byteArrayOutputStream, pj1Var3, j(pj1Var3.a, pj1Var3.b, bArr));
            }
            int length2 = pj1VarArr.length;
            while (i < length2) {
                F(byteArrayOutputStream, pj1VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw d22.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    public static mz7 c(pj1[] pj1VarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < pj1VarArr.length; i2++) {
            try {
                pj1 pj1Var = pj1VarArr[i2];
                d22.p(byteArrayOutputStream, i2);
                d22.p(byteArrayOutputStream, pj1Var.e);
                i = i + 4 + (pj1Var.e * 2);
                C(byteArrayOutputStream, pj1Var);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            mz7 mz7Var = new mz7(sb2.CLASSES, i, byteArray, true);
            byteArrayOutputStream.close();
            return mz7Var;
        }
        throw d22.c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    public static mz7 d(pj1[] pj1VarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < pj1VarArr.length; i2++) {
            try {
                pj1 pj1Var = pj1VarArr[i2];
                int iA = a(pj1Var);
                byte[] bArrE = e(pj1Var);
                byte[] bArrF = f(pj1Var);
                d22.p(byteArrayOutputStream, i2);
                int length = bArrE.length + 2 + bArrF.length;
                d22.q(byteArrayOutputStream, length);
                d22.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i = i + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            mz7 mz7Var = new mz7(sb2.METHODS, i, byteArray, true);
            byteArrayOutputStream.close();
            return mz7Var;
        }
        throw d22.c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    public static byte[] e(pj1 pj1Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, pj1Var);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] f(pj1 pj1Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, pj1Var);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    public static String h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    public static pj1 i(pj1[] pj1VarArr, String str) {
        if (pj1VarArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i = 0; i < pj1VarArr.length; i++) {
            if (pj1VarArr[i].b.equals(strH)) {
                return pj1VarArr[i];
            }
        }
        return null;
    }

    public static String j(String str, String str2, byte[] bArr) {
        String strA = qw4.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + qw4.a(bArr) + str2;
    }

    public static int k(int i) {
        return y(i * 2) / 8;
    }

    public static int l(int i, int i2, int i3) {
        if (i == 1) {
            throw d22.c("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw d22.c("Unexpected flag: " + i);
    }

    public static int[] m(InputStream inputStream, int i) {
        int[] iArr = new int[i];
        int iH = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iH += d22.h(inputStream);
            iArr[i2] = iH;
        }
        return iArr;
    }

    public static int n(BitSet bitSet, int i, int i2) {
        int i3 = bitSet.get(l(2, i, i2)) ? 2 : 0;
        return bitSet.get(l(4, i, i2)) ? i3 | 4 : i3;
    }

    public static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, d22.d(inputStream, bArr.length))) {
            return d22.d(inputStream, qw4.b.length);
        }
        throw d22.c("Invalid magic");
    }

    public static void p(InputStream inputStream, pj1 pj1Var) {
        int iAvailable = inputStream.available() - pj1Var.f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += d22.h(inputStream);
            pj1Var.i.put(Integer.valueOf(iH), 1);
            for (int iH2 = d22.h(inputStream); iH2 > 0; iH2--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw d22.c("Read too much data during profile line parse");
        }
    }

    public static pj1[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, pj1[] pj1VarArr) {
        if (Arrays.equals(bArr, qw4.f)) {
            if (Arrays.equals(qw4.a, bArr2)) {
                throw d22.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, pj1VarArr);
        }
        if (Arrays.equals(bArr, qw4.g)) {
            return t(inputStream, bArr2, pj1VarArr);
        }
        throw d22.c("Unsupported meta version");
    }

    public static pj1[] r(InputStream inputStream, byte[] bArr, pj1[] pj1VarArr) throws IOException {
        if (!Arrays.equals(bArr, qw4.f)) {
            throw d22.c("Unsupported meta version");
        }
        int iJ = d22.j(inputStream);
        byte[] bArrE = d22.e(inputStream, (int) d22.i(inputStream), (int) d22.i(inputStream));
        if (inputStream.read() > 0) {
            throw d22.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            pj1[] pj1VarArrS = s(byteArrayInputStream, iJ, pj1VarArr);
            byteArrayInputStream.close();
            return pj1VarArrS;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static pj1[] s(InputStream inputStream, int i, pj1[] pj1VarArr) {
        if (inputStream.available() == 0) {
            return new pj1[0];
        }
        if (i != pj1VarArr.length) {
            throw d22.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iH = d22.h(inputStream);
            iArr[i2] = d22.h(inputStream);
            strArr[i2] = d22.f(inputStream, iH);
        }
        for (int i3 = 0; i3 < i; i3++) {
            pj1 pj1Var = pj1VarArr[i3];
            if (!pj1Var.b.equals(strArr[i3])) {
                throw d22.c("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            pj1Var.e = i4;
            pj1Var.h = m(inputStream, i4);
        }
        return pj1VarArr;
    }

    public static pj1[] t(InputStream inputStream, byte[] bArr, pj1[] pj1VarArr) throws IOException {
        int iH = d22.h(inputStream);
        byte[] bArrE = d22.e(inputStream, (int) d22.i(inputStream), (int) d22.i(inputStream));
        if (inputStream.read() > 0) {
            throw d22.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            pj1[] pj1VarArrU = u(byteArrayInputStream, bArr, iH, pj1VarArr);
            byteArrayInputStream.close();
            return pj1VarArrU;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static pj1[] u(InputStream inputStream, byte[] bArr, int i, pj1[] pj1VarArr) {
        if (inputStream.available() == 0) {
            return new pj1[0];
        }
        if (i != pj1VarArr.length) {
            throw d22.c("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            d22.h(inputStream);
            String strF = d22.f(inputStream, d22.h(inputStream));
            long jI = d22.i(inputStream);
            int iH = d22.h(inputStream);
            pj1 pj1VarI = i(pj1VarArr, strF);
            if (pj1VarI == null) {
                throw d22.c("Missing profile key: " + strF);
            }
            pj1VarI.d = jI;
            int[] iArrM = m(inputStream, iH);
            if (Arrays.equals(bArr, qw4.e)) {
                pj1VarI.e = iH;
                pj1VarI.h = iArrM;
            }
        }
        return pj1VarArr;
    }

    public static void v(InputStream inputStream, pj1 pj1Var) {
        BitSet bitSetValueOf = BitSet.valueOf(d22.d(inputStream, d22.a(pj1Var.g * 2)));
        int i = 0;
        while (true) {
            int i2 = pj1Var.g;
            if (i >= i2) {
                return;
            }
            int iN = n(bitSetValueOf, i, i2);
            if (iN != 0) {
                Integer num = (Integer) pj1Var.i.get(Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                pj1Var.i.put(Integer.valueOf(i), Integer.valueOf(iN | num.intValue()));
            }
            i++;
        }
    }

    public static pj1[] w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, qw4.b)) {
            throw d22.c("Unsupported version");
        }
        int iJ = d22.j(inputStream);
        byte[] bArrE = d22.e(inputStream, (int) d22.i(inputStream), (int) d22.i(inputStream));
        if (inputStream.read() > 0) {
            throw d22.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            pj1[] pj1VarArrX = x(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return pj1VarArrX;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static pj1[] x(InputStream inputStream, String str, int i) {
        if (inputStream.available() == 0) {
            return new pj1[0];
        }
        pj1[] pj1VarArr = new pj1[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iH = d22.h(inputStream);
            int iH2 = d22.h(inputStream);
            pj1VarArr[i2] = new pj1(str, d22.f(inputStream, iH), d22.i(inputStream), 0L, iH2, (int) d22.i(inputStream), (int) d22.i(inputStream), new int[iH2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            pj1 pj1Var = pj1VarArr[i3];
            p(inputStream, pj1Var);
            pj1Var.h = m(inputStream, pj1Var.e);
            v(inputStream, pj1Var);
        }
        return pj1VarArr;
    }

    public static int y(int i) {
        return (i + 7) & (-8);
    }

    public static void z(byte[] bArr, int i, int i2, pj1 pj1Var) {
        int iL = l(i, i2, pj1Var.g);
        int i3 = iL / 8;
        bArr[i3] = (byte) ((1 << (iL % 8)) | bArr[i3]);
    }
}
