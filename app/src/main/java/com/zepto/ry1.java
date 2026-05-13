package com.zepto;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class ry1 extends IllegalStateException {
    public ry1(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(Task task) {
        if (!task.n()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excJ = task.j();
        return new ry1("Complete with: ".concat(excJ != null ? "failure" : task.o() ? "result ".concat(String.valueOf(task.k())) : task.m() ? "cancellation" : "unknown issue"), excJ);
    }
}
