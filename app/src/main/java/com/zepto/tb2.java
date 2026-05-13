package com.zepto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface tb2 {
    public static final a b = new a(null);
    public static final tb2 a = new a.C0121a();

    public static final class a {

        /* JADX INFO: renamed from: com.zepto.tb2$a$a, reason: collision with other inner class name */
        public static final class C0121a implements tb2 {
            @Override // com.zepto.tb2
            public void a(File file) throws IOException {
                Intrinsics.checkNotNullParameter(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // com.zepto.tb2
            public y46 b(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return zf4.j(file);
            }

            @Override // com.zepto.tb2
            public d36 c(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return ag4.g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return ag4.g(file, false, 1, null);
                }
            }

            @Override // com.zepto.tb2
            public void d(File directory) throws IOException {
                Intrinsics.checkNotNullParameter(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    Intrinsics.checkNotNullExpressionValue(file, "file");
                    if (file.isDirectory()) {
                        d(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // com.zepto.tb2
            public d36 e(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return zf4.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return zf4.a(file);
                }
            }

            @Override // com.zepto.tb2
            public boolean f(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.exists();
            }

            @Override // com.zepto.tb2
            public void g(File from, File to) throws IOException {
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to, "to");
                a(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // com.zepto.tb2
            public long h(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.length();
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    void a(File file);

    y46 b(File file);

    d36 c(File file);

    void d(File file);

    d36 e(File file);

    boolean f(File file);

    void g(File file, File file2);

    long h(File file);
}
