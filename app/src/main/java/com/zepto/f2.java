package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class f2 extends g2 {
    public static Logger s;
    public static final /* synthetic */ r43.a t = null;
    public static final /* synthetic */ r43.a u = null;
    public static final /* synthetic */ r43.a v = null;
    public static final /* synthetic */ r43.a w = null;
    public static final /* synthetic */ r43.a x = null;
    public q40 q;
    public ByteBuffer r;

    static {
        n();
        s = Logger.getLogger(f2.class.getName());
    }

    public f2(String str) {
        super(str);
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("AbstractDescriptorBox.java", f2.class);
        t = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.nio.ByteBuffer"), 42);
        u = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"), 58);
        v = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.lang.String"), 62);
        w = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "", "void"), 66);
        x = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "", "void"), 70);
    }

    @Override // com.zepto.c2
    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.r = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        try {
            this.r.rewind();
            this.q = ve4.a(-1, this.r);
        } catch (IOException e) {
            s.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e);
        } catch (IndexOutOfBoundsException e2) {
            s.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e2);
        }
    }

    @Override // com.zepto.c2
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.r.rewind();
        byteBuffer.put(this.r);
    }

    @Override // com.zepto.c2
    public long c() {
        return this.r.limit() + 4;
    }

    public void u(ByteBuffer byteBuffer) {
        vc5.b().c(o72.d(x, this, this, byteBuffer));
        this.r = byteBuffer;
    }

    public void v(q40 q40Var) {
        vc5.b().c(o72.d(w, this, this, q40Var));
        this.q = q40Var;
    }
}
