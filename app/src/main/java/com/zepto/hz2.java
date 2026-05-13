package com.zepto;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hz2 {
    public final int a = 12610;
    public final int b = 4;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public Surface f;

    public hz2(Surface surface) {
        surface.getClass();
        this.f = surface;
        b();
    }

    public final void a() {
        boolean z = false;
        while (EGL14.eglGetError() != 12288) {
            z = true;
        }
        if (z) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }

    public final void b() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.c = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            this.c = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.c, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, this.b, this.a, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        this.d = EGL14.eglCreateContext(this.c, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        a();
        if (this.d == null) {
            throw new RuntimeException("null context");
        }
        this.e = EGL14.eglCreateWindowSurface(this.c, eGLConfigArr[0], this.f, new int[]{12344}, 0);
        a();
        if (this.e == null) {
            throw new RuntimeException("surface was null");
        }
    }

    public final void c() {
        EGLDisplay eGLDisplay = this.c;
        EGLSurface eGLSurface = this.e;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final void d() {
        if (Intrinsics.areEqual(EGL14.eglGetCurrentContext(), this.d)) {
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(this.c, this.e);
        EGL14.eglDestroyContext(this.c, this.d);
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final void e(long j) {
        EGLExt.eglPresentationTimeANDROID(this.c, this.e, j);
    }

    public final boolean f() {
        return EGL14.eglSwapBuffers(this.c, this.e);
    }
}
