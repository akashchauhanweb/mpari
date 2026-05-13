package com.zepto;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class p78 extends jm8 {
    public final rh8 a;
    public final /* synthetic */ i88 b;

    public p78(i88 i88Var, rh8 rh8Var) {
        this.b = i88Var;
        this.a = rh8Var;
    }

    @Override // com.zepto.pm8
    public final void F(Bundle bundle, Bundle bundle2) {
        this.b.d.s(this.a);
        i88.g.d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.zepto.pm8
    public final void V(Bundle bundle, Bundle bundle2) {
        this.b.d.s(this.a);
        i88.g.d("onRemoveModule()", new Object[0]);
    }

    @Override // com.zepto.pm8
    public void Y(Bundle bundle, Bundle bundle2) {
        this.b.e.s(this.a);
        i88.g.d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // com.zepto.pm8
    public final void b(Bundle bundle) {
        this.b.d.s(this.a);
        i88.g.d("onCancelDownloads()", new Object[0]);
    }

    public void c0(Bundle bundle) {
        this.b.d.s(this.a);
        int i = bundle.getInt("error_code");
        i88.g.b("onError(%d)", Integer.valueOf(i));
        this.a.d(new ay(i));
    }

    @Override // com.zepto.pm8
    public final void f(int i, Bundle bundle) {
        this.b.d.s(this.a);
        i88.g.d("onCancelDownload(%d)", Integer.valueOf(i));
    }

    @Override // com.zepto.pm8
    public void f0(int i, Bundle bundle) {
        this.b.d.s(this.a);
        i88.g.d("onStartDownload(%d)", Integer.valueOf(i));
    }

    @Override // com.zepto.pm8
    public final void i0(int i, Bundle bundle) {
        this.b.d.s(this.a);
        i88.g.d("onGetSession(%d)", Integer.valueOf(i));
    }

    @Override // com.zepto.pm8
    public void j0(Bundle bundle, Bundle bundle2) {
        this.b.d.s(this.a);
        i88.g.d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // com.zepto.pm8
    public void l(Bundle bundle, Bundle bundle2) {
        this.b.d.s(this.a);
        i88.g.d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // com.zepto.pm8
    public void n(List list) {
        this.b.d.s(this.a);
        i88.g.d("onGetSessionStates", new Object[0]);
    }

    @Override // com.zepto.pm8
    public final void o0(Bundle bundle, Bundle bundle2) {
        this.b.d.s(this.a);
        i88.g.d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.zepto.pm8
    public final void u(Bundle bundle, Bundle bundle2) {
        this.b.d.s(this.a);
        i88.g.d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }
}
