package com.zepto;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hf6 {
    public final int c;
    public FloatBuffer e;
    public final float[] i;
    public int j;
    public int l;
    public int m;
    public int n;
    public int o;
    public final int a = 4;
    public final int b = 4 * 5;
    public final int d = 3;
    public final String f = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    public final String g = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    public final float[] h = new float[16];
    public int k = -12345;

    public hf6() {
        float[] fArr = new float[16];
        this.i = fArr;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(20 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        Intrinsics.checkNotNullExpressionValue(floatBufferAsFloatBuffer, "allocateDirect(\n        …eOrder()).asFloatBuffer()");
        this.e = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        Matrix.setIdentityM(fArr, 0);
    }

    public final void a(String op) {
        Intrinsics.checkNotNullParameter(op, "op");
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new RuntimeException(op + ": glError " + iGlGetError);
    }

    public final int b() {
        int iE;
        int iE2 = e(35633, this.f);
        if (iE2 == 0 || (iE = e(35632, this.g)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            return 0;
        }
        GLES20.glAttachShader(iGlCreateProgram, iE2);
        a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iE);
        a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    public final void c(SurfaceTexture st) {
        Intrinsics.checkNotNullParameter(st, "st");
        a("onDrawFrame start");
        st.getTransformMatrix(this.i);
        GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.j);
        a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.k);
        this.e.position(this.c);
        GLES20.glVertexAttribPointer(this.n, 3, 5126, false, this.b, (Buffer) this.e);
        a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.n);
        a("glEnableVertexAttribArray maPositionHandle");
        this.e.position(this.d);
        GLES20.glVertexAttribPointer(this.o, 2, 5126, false, this.b, (Buffer) this.e);
        a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.o);
        a("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.h, 0);
        GLES20.glUniformMatrix4fv(this.l, 1, false, this.h, 0);
        GLES20.glUniformMatrix4fv(this.m, 1, false, this.i, 0);
        GLES20.glDrawArrays(5, 0, 4);
        a("glDrawArrays");
        GLES20.glFinish();
    }

    public final int d() {
        return this.k;
    }

    public final int e(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        a("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public final void f() {
        int iB = b();
        this.j = iB;
        if (iB == 0) {
            throw new RuntimeException("failed creating program");
        }
        this.n = GLES20.glGetAttribLocation(iB, "aPosition");
        a("glGetAttribLocation aPosition");
        if (this.n == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        this.o = GLES20.glGetAttribLocation(this.j, "aTextureCoord");
        a("glGetAttribLocation aTextureCoord");
        if (this.o == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.l = GLES20.glGetUniformLocation(this.j, "uMVPMatrix");
        a("glGetUniformLocation uMVPMatrix");
        if (this.l == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        this.m = GLES20.glGetUniformLocation(this.j, "uSTMatrix");
        a("glGetUniformLocation uSTMatrix");
        if (this.m == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.k = i;
        GLES20.glBindTexture(36197, i);
        a("glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        a("glTexParameter");
    }
}
