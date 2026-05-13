package com.zepto;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uj4 implements SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture a;
    public Surface b;
    public final Object c = new Object();
    public boolean d;
    public hf6 e;

    public uj4() {
        e();
    }

    public final void a() {
        synchronized (this.c) {
            while (!this.d) {
                try {
                    this.c.wait(100);
                    if (!this.d) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.d = false;
            Unit unit = Unit.INSTANCE;
        }
        hf6 hf6Var = this.e;
        if (hf6Var != null) {
            hf6Var.a("before updateTexImage");
        }
        SurfaceTexture surfaceTexture = this.a;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    public final void b() {
        hf6 hf6Var = this.e;
        if (hf6Var != null) {
            SurfaceTexture surfaceTexture = this.a;
            Intrinsics.checkNotNull(surfaceTexture);
            hf6Var.c(surfaceTexture);
        }
    }

    public final Surface c() {
        return this.b;
    }

    public final void d() {
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
        }
        this.e = null;
        this.b = null;
        this.a = null;
    }

    public final void e() {
        hf6 hf6Var = new hf6();
        this.e = hf6Var;
        hf6Var.f();
        SurfaceTexture surfaceTexture = new SurfaceTexture(hf6Var.d());
        this.a = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.b = new Surface(this.a);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.c) {
            if (this.d) {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
            this.d = true;
            this.c.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }
}
