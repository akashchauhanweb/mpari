package com.zepto;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class m70 extends Provider {
    public static String c = "BouncyCastle Security Provider v1.70";
    public static final ox4 e = new n70();
    public static final Map f = new HashMap();
    public static final Class g = eq0.a(m70.class, "java.security.cert.PKIXRevocationChecker");
    public static final String[] h = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
    public static final String[] i = {"SipHash", "SipHash128", "Poly1305"};
    public static final String[] j = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015", "Zuc"};
    public static final String[] k = {"X509", "IES", "COMPOSITE"};
    public static final String[] l = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};
    public static final String[] m = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka"};
    public static final String[] n = {"BC", "BCFKS", "PKCS12"};
    public static final String[] o = {"DRBG"};

    public class a implements PrivilegedAction {
        public a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            m70.this.e();
            return null;
        }
    }

    public m70() {
        super("BC", 1.7d, c);
        AccessController.doPrivileged(new a());
    }

    public void b(p0 p0Var, fy fyVar) {
        Map map = f;
        synchronized (map) {
            map.put(p0Var, fyVar);
        }
    }

    public final void c(String str, String[] strArr) {
        for (int i2 = 0; i2 != strArr.length; i2++) {
            Class clsA = eq0.a(m70.class, str + strArr[i2] + "$Mappings");
            if (clsA != null) {
                try {
                    wb0.a(clsA.newInstance());
                    throw null;
                } catch (Exception e2) {
                    throw new InternalError("cannot create instance of " + str + strArr[i2] + "$Mappings : " + e2);
                }
            }
        }
    }

    public final void d() {
        b(hk4.r, new l56());
        b(hk4.v, new i14());
        b(hk4.w, new c08());
        b(k13.a, new c08());
        b(hk4.F, new f08());
        b(k13.b, new f08());
        b(hk4.m, new qr3());
        b(hk4.n, new kr3());
        b(hk4.a, new b45());
        b(hk4.X, new fy4());
        b(hk4.Y, new fy4());
        b(gk4.I0, new ea3());
    }

    public final void e() {
        String str;
        String str2;
        c("org.bouncycastle.jcajce.provider.digest.", m);
        c("org.bouncycastle.jcajce.provider.symmetric.", h);
        c("org.bouncycastle.jcajce.provider.symmetric.", i);
        c("org.bouncycastle.jcajce.provider.symmetric.", j);
        c("org.bouncycastle.jcajce.provider.asymmetric.", k);
        c("org.bouncycastle.jcajce.provider.asymmetric.", l);
        c("org.bouncycastle.jcajce.provider.keystore.", n);
        c("org.bouncycastle.jcajce.provider.drbg.", o);
        d();
        put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        Class cls = g;
        put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        if (cls != null) {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
        } else {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
        }
        put("CertPathBuilder.RFC3280", str2);
        put("CertPathValidator.PKIX", str);
        put("CertPathBuilder.PKIX", str2);
        put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }
}
