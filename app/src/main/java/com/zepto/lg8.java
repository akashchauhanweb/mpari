package com.zepto;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class lg8 {
    public static final z68 b = new z68("VerifySliceTaskHandler");
    public final s98 a;

    public lg8(s98 s98Var) {
        this.a = s98Var;
    }

    public final void a(kg8 kg8Var) {
        File fileC = this.a.C(kg8Var.b, kg8Var.c, kg8Var.d, kg8Var.e);
        if (!fileC.exists()) {
            throw new bc8(String.format("Cannot find unverified files for slice %s.", kg8Var.e), kg8Var.a);
        }
        b(kg8Var, fileC);
        File fileD = this.a.D(kg8Var.b, kg8Var.c, kg8Var.d, kg8Var.e);
        if (!fileD.exists()) {
            fileD.mkdirs();
        }
        if (!fileC.renameTo(fileD)) {
            throw new bc8(String.format("Failed to move slice %s after verification.", kg8Var.e), kg8Var.a);
        }
    }

    public final void b(kg8 kg8Var, File file) {
        try {
            File fileB = this.a.B(kg8Var.b, kg8Var.c, kg8Var.d, kg8Var.e);
            if (!fileB.exists()) {
                throw new bc8(String.format("Cannot find metadata files for slice %s.", kg8Var.e), kg8Var.a);
            }
            try {
                if (!ve8.a(jg8.a(file, fileB)).equals(kg8Var.f)) {
                    throw new bc8(String.format("Verification failed for slice %s.", kg8Var.e), kg8Var.a);
                }
                b.d("Verification of slice %s of pack %s successful.", kg8Var.e, kg8Var.b);
            } catch (IOException e) {
                throw new bc8(String.format("Could not digest file during verification for slice %s.", kg8Var.e), e, kg8Var.a);
            } catch (NoSuchAlgorithmException e2) {
                throw new bc8("SHA256 algorithm not supported.", e2, kg8Var.a);
            }
        } catch (IOException e3) {
            throw new bc8(String.format("Could not reconstruct slice archive during verification for slice %s.", kg8Var.e), e3, kg8Var.a);
        }
    }
}
