package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c20 extends c2 {
    public static final /* synthetic */ r43.a A = null;
    public static final /* synthetic */ r43.a B = null;
    public static final /* synthetic */ r43.a C = null;
    public static final /* synthetic */ r43.a D = null;
    public static final /* synthetic */ r43.a E = null;
    public static final /* synthetic */ r43.a F = null;
    public static final /* synthetic */ r43.a G = null;
    public static final /* synthetic */ r43.a H = null;
    public static final /* synthetic */ r43.a I = null;
    public static final /* synthetic */ r43.a J = null;
    public static final /* synthetic */ r43.a K = null;
    public static final /* synthetic */ r43.a L = null;
    public static final /* synthetic */ r43.a M = null;
    public static final /* synthetic */ r43.a N = null;
    public static final /* synthetic */ r43.a O = null;
    public static final /* synthetic */ r43.a P = null;
    public static final /* synthetic */ r43.a Q = null;
    public static final /* synthetic */ r43.a n = null;
    public static final /* synthetic */ r43.a o = null;
    public static final /* synthetic */ r43.a p = null;
    public static final /* synthetic */ r43.a q = null;
    public static final /* synthetic */ r43.a r = null;
    public static final /* synthetic */ r43.a s = null;
    public static final /* synthetic */ r43.a t = null;
    public static final /* synthetic */ r43.a u = null;
    public static final /* synthetic */ r43.a v = null;
    public static final /* synthetic */ r43.a w = null;
    public static final /* synthetic */ r43.a x = null;
    public static final /* synthetic */ r43.a y = null;
    public static final /* synthetic */ r43.a z = null;
    public d20 m;

    static {
        n();
    }

    public c20() {
        super("avcC");
        this.m = new d20();
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("AvcConfigurationBox.java", c20.class);
        n = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 44);
        o = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 48);
        x = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"), 84);
        y = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"), 88);
        z = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"), 92);
        A = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"), 96);
        B = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 100);
        C = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "", "void"), 104);
        D = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 108);
        E = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"), 112);
        F = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 116);
        G = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"), 120);
        p = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 52);
        H = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 124);
        I = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"), 128);
        J = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "boolean"), 132);
        K = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "", "void"), 136);
        L = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "long"), 147);
        M = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 153);
        N = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 158);
        O = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 162);
        P = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), 167);
        Q = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.lang.String"), 172);
        q = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 56);
        r = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 60);
        s = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 64);
        t = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 68);
        u = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "", "void"), 72);
        v = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"), 76);
        w = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "", "void"), 80);
    }

    @Override // com.zepto.c2
    public void a(ByteBuffer byteBuffer) {
        this.m = new d20(byteBuffer);
    }

    @Override // com.zepto.c2
    public void b(ByteBuffer byteBuffer) {
        vc5.b().c(o72.d(M, this, this, byteBuffer));
        this.m.a(byteBuffer);
    }

    @Override // com.zepto.c2
    public long c() {
        vc5.b().c(o72.c(L, this, this));
        return this.m.b();
    }

    public void o(int i) {
        vc5.b().c(o72.d(x, this, this, iz0.d(i)));
        this.m.d = i;
    }

    public void p(int i) {
        vc5.b().c(o72.d(v, this, this, iz0.d(i)));
        this.m.b = i;
    }

    public void q(int i) {
        vc5.b().c(o72.d(G, this, this, iz0.d(i)));
        this.m.k = i;
    }

    public void r(int i) {
        vc5.b().c(o72.d(E, this, this, iz0.d(i)));
        this.m.j = i;
    }

    public void s(int i) {
        vc5.b().c(o72.d(C, this, this, iz0.d(i)));
        this.m.i = i;
    }

    public void t(int i) {
        vc5.b().c(o72.d(u, this, this, iz0.d(i)));
        this.m.a = i;
    }

    public String toString() {
        vc5.b().c(o72.c(Q, this, this));
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.m + '}';
    }

    public void u(int i) {
        vc5.b().c(o72.d(y, this, this, iz0.d(i)));
        this.m.e = i;
    }

    public void v(List list) {
        vc5.b().c(o72.d(A, this, this, list));
        this.m.g = list;
    }

    public void w(int i) {
        vc5.b().c(o72.d(w, this, this, iz0.d(i)));
        this.m.c = i;
    }

    public void x(List list) {
        vc5.b().c(o72.d(z, this, this, list));
        this.m.f = list;
    }
}
