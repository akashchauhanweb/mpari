package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ty1 extends f2 {
    public static final /* synthetic */ r43.a A = null;
    public static final /* synthetic */ r43.a B = null;
    public static final /* synthetic */ r43.a y = null;
    public static final /* synthetic */ r43.a z = null;

    static {
        n();
    }

    public ty1() {
        super("esds");
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("ESDescriptorBox.java", ty1.class);
        y = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"), 33);
        z = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "", "void"), 37);
        A = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "", "boolean"), 42);
        B = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "", "int"), 53);
    }

    public boolean equals(Object obj) {
        vc5.b().c(o72.d(A, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.r;
        ByteBuffer byteBuffer2 = ((ty1) obj).r;
        return byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2);
    }

    public int hashCode() {
        vc5.b().c(o72.c(B, this, this));
        ByteBuffer byteBuffer = this.r;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public void w(sy1 sy1Var) {
        vc5.b().c(o72.d(z, this, this, sy1Var));
        super.v(sy1Var);
    }
}
