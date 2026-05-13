package com.zepto;

import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class mi2 {
    public SecretKeySpec a = null;
    public Cipher b = null;

    public String a(String str) {
        return new String(this.b.doFinal(fm2.b(str)), StandardCharsets.UTF_8);
    }

    public String b(String str) {
        return fm2.c(this.b.doFinal(str.getBytes()));
    }

    public String c(String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (str == null || str.equals("")) {
            return "";
        }
        e(str2, str3);
        return a(str);
    }

    public String d(String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (str == null || str.equals("")) {
            return "";
        }
        f(str2, str3);
        return b(str);
    }

    public void e(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        this.a = new SecretKeySpec(str.getBytes(), "AES");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(str2.length() * 8, str2.getBytes(StandardCharsets.UTF_8));
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        this.b = cipher;
        cipher.init(2, this.a, gCMParameterSpec);
    }

    public void f(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            this.a = new SecretKeySpec(str.getBytes(), "AES");
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(str2.length() * 8, str2.getBytes(StandardCharsets.UTF_8));
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            this.b = cipher;
            cipher.init(1, this.a, gCMParameterSpec);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidAlgorithmParameterException("Invalid Algorithm Parameter Exception");
        } catch (InvalidKeyException unused2) {
            throw new InvalidKeyException("Invalid Key");
        } catch (NoSuchAlgorithmException unused3) {
            throw new NoSuchAlgorithmException("Invalid Java Version");
        } catch (NoSuchPaddingException unused4) {
            throw new NoSuchPaddingException("NO SuchPAdding Exception");
        }
    }
}
