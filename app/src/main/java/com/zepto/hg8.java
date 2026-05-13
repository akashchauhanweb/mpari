package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class hg8 {
    public static final z68 h = new z68("SliceMetadataManager");
    public final s98 b;
    public final String c;
    public final int d;
    public final long e;
    public final String f;
    public final byte[] a = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
    public int g = -1;

    public hg8(s98 s98Var, String str, int i, long j, String str2) {
        this.b = s98Var;
        this.c = str;
        this.d = i;
        this.e = j;
        this.f = str2;
    }

    public final int a() throws IOException {
        File fileA = this.b.A(this.c, this.d, this.e, this.f);
        if (!fileA.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(fileA);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new bc8("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final gg8 b() throws IOException {
        File fileA = this.b.A(this.c, this.d, this.e, this.f);
        if (!fileA.exists()) {
            throw new bc8("Slice checkpoint file does not exist.");
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(fileA);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                throw new bc8("Slice checkpoint file corrupt.");
            }
            try {
                int i = Integer.parseInt(properties.getProperty("fileStatus"));
                String property = properties.getProperty("fileName");
                long j = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                long j2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                int i2 = Integer.parseInt(properties.getProperty("previousChunk"));
                this.g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                return new da8(i, property, j, j2, i2);
            } catch (NumberFormatException e) {
                throw new bc8("Slice checkpoint file corrupt.", e);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final File c() {
        return new File(n(), String.format("%s-NAM.dat", Integer.valueOf(this.g)));
    }

    public final void d(InputStream inputStream, long j) throws IOException {
        int i;
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                i = inputStream.read(this.a);
                if (i > 0) {
                    randomAccessFile.write(this.a, 0, i);
                }
            } while (i == 8192);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void e(long j, byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void f(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(c().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void g(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", VContant.MAINSCREEN);
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void h(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", VContant.APPLICATION_SCREEN);
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File fileZ = this.b.z(this.c, this.d, this.e, this.f);
            if (fileZ.exists()) {
                fileZ.delete();
            }
            fileOutputStream = new FileOutputStream(fileZ);
            try {
                fileOutputStream.write(bArr);
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        } finally {
        }
    }

    public final void i(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void j(byte[] bArr) {
        this.g++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(n(), String.format("%s-LFH.dat", Integer.valueOf(this.g))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e) {
            throw new bc8("Could not write metadata file.", e);
        }
    }

    public final void k(byte[] bArr, InputStream inputStream) throws IOException {
        this.g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr);
            int i = inputStream.read(this.a);
            while (i > 0) {
                fileOutputStream.write(this.a, 0, i);
                i = inputStream.read(this.a);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void l(byte[] bArr, int i, int i2) throws IOException {
        this.g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr, 0, i2);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final boolean m() {
        File fileA = this.b.A(this.c, this.d, this.e, this.f);
        if (!fileA.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(fileA);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                h.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e) {
            h.b("Could not read checkpoint while checking if extraction finished. %s", e);
            return false;
        }
    }

    public final File n() {
        File fileB = this.b.B(this.c, this.d, this.e, this.f);
        if (!fileB.exists()) {
            fileB.mkdirs();
        }
        return fileB;
    }

    public final File o() throws IOException {
        File fileA = this.b.A(this.c, this.d, this.e, this.f);
        fileA.getParentFile().mkdirs();
        fileA.createNewFile();
        return fileA;
    }
}
