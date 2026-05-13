package com.zepto;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.zip.GZIPInputStream;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class rb8 {
    public static final z68 g = new z68("ExtractChunkTaskHandler");
    public final byte[] a = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
    public final s98 b;
    public final lc8 c;
    public final lc8 d;
    public final mc8 e;
    public final vf8 f;

    public rb8(s98 s98Var, lc8 lc8Var, lc8 lc8Var2, mc8 mc8Var, vf8 vf8Var) {
        this.b = s98Var;
        this.c = lc8Var;
        this.d = lc8Var2;
        this.e = mc8Var;
        this.f = vf8Var;
    }

    public final void a(ob8 ob8Var) {
        InputStream sequenceInputStream;
        ng8 ng8VarE;
        File fileC;
        long length;
        int iMin;
        int iMax;
        long j;
        s98 s98Var = this.b;
        String str = ob8Var.b;
        int i = ob8Var.c;
        long j2 = ob8Var.d;
        String str2 = ob8Var.f;
        hg8 hg8Var = new hg8(s98Var, str, i, j2, str2);
        File fileB = s98Var.B(str, i, j2, str2);
        if (!fileB.exists()) {
            fileB.mkdirs();
        }
        try {
            InputStream inputStream = ob8Var.l;
            InputStream gZIPInputStream = ob8Var.g != 1 ? inputStream : new GZIPInputStream(inputStream, ConstantsKt.DEFAULT_BUFFER_SIZE);
            try {
                if (ob8Var.h > 0) {
                    gg8 gg8VarB = hg8Var.b();
                    int iB = gg8VarB.b();
                    int i2 = ob8Var.h;
                    if (iB != i2 - 1) {
                        throw new bc8(String.format("Trying to resume with chunk number %s when previously processed chunk was number %s.", Integer.valueOf(i2), Integer.valueOf(gg8VarB.b())), ob8Var.a);
                    }
                    int iA = gg8VarB.a();
                    if (iA == 1) {
                        g.a("Resuming zip entry from last chunk during file %s.", gg8VarB.e());
                        File file = new File(gg8VarB.e());
                        if (!file.exists()) {
                            throw new bc8("Partial file specified in checkpoint does not exist. Corrupt directory.", ob8Var.a);
                        }
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                        randomAccessFile.seek(gg8VarB.c());
                        long jD = gg8VarB.d();
                        while (true) {
                            iMin = (int) Math.min(jD, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                            iMax = Math.max(gZIPInputStream.read(this.a, 0, iMin), 0);
                            if (iMax > 0) {
                                randomAccessFile.write(this.a, 0, iMax);
                            }
                            j = jD - ((long) iMax);
                            if (j <= 0 || iMax <= 0) {
                                break;
                            } else {
                                jD = j;
                            }
                        }
                        long length2 = randomAccessFile.length();
                        randomAccessFile.close();
                        if (iMax != iMin) {
                            g.a("Chunk has ended while resuming the previous chunks file content.", new Object[0]);
                            hg8Var.g(file.getCanonicalPath(), length2, j, ob8Var.h);
                        }
                        sequenceInputStream = gZIPInputStream;
                    } else if (iA == 2) {
                        g.a("Resuming zip entry from last chunk during local file header.", new Object[0]);
                        File fileZ = this.b.z(ob8Var.b, ob8Var.c, ob8Var.d, ob8Var.f);
                        if (!fileZ.exists()) {
                            throw new bc8("Checkpoint extension file not found.", ob8Var.a);
                        }
                        sequenceInputStream = new SequenceInputStream(new FileInputStream(fileZ), gZIPInputStream);
                    } else {
                        if (iA != 3) {
                            throw new bc8(String.format("Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s.", Integer.valueOf(gg8VarB.a())), ob8Var.a);
                        }
                        g.a("Resuming central directory from last chunk.", new Object[0]);
                        hg8Var.d(gZIPInputStream, gg8VarB.c());
                        if (!ob8Var.a()) {
                            throw new bc8("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", ob8Var.a);
                        }
                    }
                    sequenceInputStream = null;
                } else {
                    sequenceInputStream = gZIPInputStream;
                }
                if (sequenceInputStream != null) {
                    ka8 ka8Var = new ka8(sequenceInputStream);
                    File fileB2 = b(ob8Var);
                    do {
                        ng8VarE = ka8Var.e();
                        if (!ng8VarE.e() && !ka8Var.j()) {
                            if (!ng8VarE.h() || ng8VarE.g()) {
                                hg8Var.k(ng8VarE.f(), ka8Var);
                            } else {
                                hg8Var.j(ng8VarE.f());
                                File file2 = new File(fileB2, ng8VarE.c());
                                file2.getParentFile().mkdirs();
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                int i3 = ka8Var.read(this.a, 0, ConstantsKt.DEFAULT_BUFFER_SIZE);
                                while (i3 > 0) {
                                    fileOutputStream.write(this.a, 0, i3);
                                    i3 = ka8Var.read(this.a, 0, ConstantsKt.DEFAULT_BUFFER_SIZE);
                                }
                                fileOutputStream.close();
                            }
                        }
                        if (ka8Var.m()) {
                            break;
                        }
                    } while (!ka8Var.j());
                    if (ka8Var.j()) {
                        g.a("Writing central directory metadata.", new Object[0]);
                        hg8Var.k(ng8VarE.f(), sequenceInputStream);
                    }
                    if (!ob8Var.a()) {
                        if (ng8VarE.e()) {
                            g.a("Writing slice checkpoint for partial local file header.", new Object[0]);
                            hg8Var.h(ng8VarE.f(), ob8Var.h);
                        } else if (ka8Var.j()) {
                            g.a("Writing slice checkpoint for central directory.", new Object[0]);
                            hg8Var.f(ob8Var.h);
                        } else {
                            if (ng8VarE.a() == 0) {
                                g.a("Writing slice checkpoint for partial file.", new Object[0]);
                                fileC = new File(b(ob8Var), ng8VarE.c());
                                length = ng8VarE.b() - ka8Var.d();
                                if (fileC.length() != length) {
                                    throw new bc8("Partial file is of unexpected size.");
                                }
                            } else {
                                g.a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                fileC = hg8Var.c();
                                length = fileC.length();
                            }
                            hg8Var.g(fileC.getCanonicalPath(), length, ka8Var.d(), ob8Var.h);
                        }
                    }
                }
                gZIPInputStream.close();
                if (ob8Var.a()) {
                    try {
                        hg8Var.i(ob8Var.h);
                    } catch (IOException e) {
                        g.b("Writing extraction finished checkpoint failed with %s.", e.getMessage());
                        throw new bc8("Writing extraction finished checkpoint failed.", e, ob8Var.a);
                    }
                }
                g.d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(ob8Var.h), ob8Var.f, ob8Var.b, Integer.valueOf(ob8Var.a));
                ((zm8) this.c.a()).a(ob8Var.a, ob8Var.b, ob8Var.f, ob8Var.h);
                try {
                    ob8Var.l.close();
                } catch (IOException unused) {
                    g.e("Could not close file for chunk %s of slice %s of pack %s.", Integer.valueOf(ob8Var.h), ob8Var.f, ob8Var.b);
                }
                if (ob8Var.k == 3) {
                    k98 k98Var = (k98) this.d.a();
                    String str3 = ob8Var.b;
                    long j3 = ob8Var.j;
                    k98Var.j(AssetPackState.h(str3, 3, 0, j3, j3, this.e.b(str3, ob8Var), 1, ob8Var.e, this.f.a(ob8Var.b)));
                }
            } finally {
                try {
                    gZIPInputStream.close();
                } catch (Throwable unused2) {
                }
            }
        } catch (IOException e2) {
            g.b("IOException during extraction %s.", e2.getMessage());
            throw new bc8(String.format("Error extracting chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(ob8Var.h), ob8Var.f, ob8Var.b, Integer.valueOf(ob8Var.a)), e2, ob8Var.a);
        }
    }

    public final File b(ob8 ob8Var) {
        File fileC = this.b.C(ob8Var.b, ob8Var.c, ob8Var.d, ob8Var.f);
        if (!fileC.exists()) {
            fileC.mkdirs();
        }
        return fileC;
    }
}
