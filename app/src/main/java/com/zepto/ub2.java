package com.zepto;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class ub2 implements xm6 {
    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public File b(String str) {
        return new File(str);
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String a(File file) {
        return file.getPath();
    }
}
