package com.zepto;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jy0 {
    public static final Set a;
    public static final Map b;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        j22 j22Var = j22.h;
        linkedHashSet.add(j22Var);
        j22 j22Var2 = j22.i;
        linkedHashSet.add(j22Var2);
        j22 j22Var3 = j22.j;
        linkedHashSet.add(j22Var3);
        j22 j22Var4 = j22.m;
        linkedHashSet.add(j22Var4);
        j22 j22Var5 = j22.n;
        linkedHashSet.add(j22Var5);
        j22 j22Var6 = j22.o;
        linkedHashSet.add(j22Var6);
        j22 j22Var7 = j22.k;
        linkedHashSet.add(j22Var7);
        j22 j22Var8 = j22.l;
        linkedHashSet.add(j22Var8);
        j22 j22Var9 = j22.p;
        linkedHashSet.add(j22Var9);
        a = Collections.unmodifiableSet(linkedHashSet);
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(j22Var4);
        hashSet2.add(j22Var5);
        hashSet3.add(j22Var6);
        hashSet3.add(j22Var);
        hashSet3.add(j22Var7);
        hashSet3.add(j22Var9);
        hashSet4.add(j22Var2);
        hashSet5.add(j22Var3);
        hashSet5.add(j22Var8);
        map.put(128, Collections.unmodifiableSet(hashSet));
        map.put(192, Collections.unmodifiableSet(hashSet2));
        map.put(256, Collections.unmodifiableSet(hashSet3));
        map.put(384, Collections.unmodifiableSet(hashSet4));
        map.put(Integer.valueOf(ConstantsKt.MINIMUM_BLOCK_SIZE), Collections.unmodifiableSet(hashSet5));
        b = Collections.unmodifiableMap(map);
    }

    public static void a(SecretKey secretKey, j22 j22Var) throws i63 {
        try {
            int iC = w80.c(secretKey.getEncoded());
            if (iC == 0 || j22Var.b() == iC) {
                return;
            }
            throw new i63("The Content Encryption Key (CEK) length for " + j22Var + " must be " + j22Var.b() + " bits");
        } catch (o03 e) {
            throw new i63("The Content Encryption Key (CEK) is too long: " + e.getMessage());
        }
    }

    public static m33 b(o33 o33Var, byte[] bArr, byte[] bArr2, SecretKey secretKey, h40 h40Var, q33 q33Var) throws f33 {
        vz vzVarC;
        byte[] bArrE;
        if (bArr2 == null) {
            return b(o33Var, bArr, h.b(o33Var), secretKey, h40Var, q33Var);
        }
        a(secretKey, o33Var.g());
        byte[] bArrA = yg1.a(o33Var, bArr);
        if (o33Var.g().equals(j22.h) || o33Var.g().equals(j22.i) || o33Var.g().equals(j22.j)) {
            byte[] bArrE2 = l.e(q33Var.b());
            vzVarC = l.c(secretKey, bArrE2, bArrA, bArr2, q33Var.c(), q33Var.e());
            bArrE = bArrE2;
        } else if (o33Var.g().equals(j22.m) || o33Var.g().equals(j22.n) || o33Var.g().equals(j22.o)) {
            gy0 gy0Var = new gy0(n.d(q33Var.b()));
            vzVarC = n.c(secretKey, gy0Var, bArrA, bArr2, q33Var.c());
            bArrE = (byte[]) gy0Var.a();
        } else if (o33Var.g().equals(j22.k) || o33Var.g().equals(j22.l)) {
            bArrE = l.e(q33Var.b());
            vzVarC = l.d(o33Var, secretKey, h40Var, bArrE, bArrA, q33Var.c(), q33Var.e());
        } else {
            if (!o33Var.g().equals(j22.p)) {
                throw new f33(go.b(o33Var.g(), a));
            }
            gy0 gy0Var2 = new gy0(null);
            vzVarC = rz7.a(secretKey, gy0Var2, bArrA, bArr2);
            bArrE = (byte[]) gy0Var2.a();
        }
        return new m33(o33Var, h40Var, h40.d(bArrE), h40.d(vzVarC.b()), h40.d(vzVarC.a()));
    }

    public static SecretKey c(j22 j22Var, SecureRandom secureRandom) throws f33 {
        Set set = a;
        if (!set.contains(j22Var)) {
            throw new f33(go.b(j22Var, set));
        }
        byte[] bArr = new byte[w80.a(j22Var.b())];
        secureRandom.nextBytes(bArr);
        return new SecretKeySpec(bArr, "AES");
    }
}
