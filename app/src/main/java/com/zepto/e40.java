package com.zepto;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e40 {
    public static final z12 a = new g40();

    public static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((bArr.length / 4) * 3);
        try {
            a.c(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new re1("unable to decode base64 data: " + e.getMessage(), e);
        }
    }

    public static byte[] b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static byte[] c(byte[] bArr, int i, int i2) {
        z12 z12Var = a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(z12Var.a(i2));
        try {
            z12Var.b(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new b22("exception encoding base64 string: " + e.getMessage(), e);
        }
    }
}
