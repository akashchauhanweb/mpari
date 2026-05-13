package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class j65 extends i65 {
    public j65(float f, float f2) {
        super(0.0f, 0.0f, f, f2);
    }

    @Override // com.zepto.i65
    public void E(p40 p40Var) {
        M();
    }

    @Override // com.zepto.i65
    public void H(float f) {
        M();
    }

    @Override // com.zepto.i65
    public void I(float f) {
        M();
    }

    @Override // com.zepto.i65
    public void J(float f) {
        M();
    }

    @Override // com.zepto.i65
    public void L(float f) {
        M();
    }

    public final void M() {
        throw new UnsupportedOperationException(dt3.b("rectanglereadonly.this.rectangle.is.read.only", new Object[0]));
    }

    @Override // com.zepto.i65
    public void a(i65 i65Var) {
        M();
    }

    @Override // com.zepto.i65
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("RectangleReadOnly: ");
        stringBuffer.append(A());
        stringBuffer.append('x');
        stringBuffer.append(o());
        stringBuffer.append(" (rot: ");
        stringBuffer.append(this.h);
        stringBuffer.append(" degrees)");
        return stringBuffer.toString();
    }

    public j65(float f, float f2, int i) {
        super(0.0f, 0.0f, f, f2);
        super.K(i);
    }
}
