package com.zepto;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes3.dex */
public class px4 extends BasicPermission {
    public final String c;
    public final int e;

    public px4(String str, String str2) {
        super(str, str2);
        this.c = str2;
        this.e = a(str2);
    }

    public final int a(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(i86.e(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (strNextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (strNextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (strNextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (strNextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (strNextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (strNextToken.equals("all")) {
                i |= 63;
            }
        }
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof px4)) {
            return false;
        }
        px4 px4Var = (px4) obj;
        return this.e == px4Var.e && getName().equals(px4Var.getName());
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public String getActions() {
        return this.c;
    }

    public int hashCode() {
        return getName().hashCode() + this.e;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public boolean implies(Permission permission) {
        if (!(permission instanceof px4) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = this.e;
        int i2 = ((px4) permission).e;
        return (i & i2) == i2;
    }
}
