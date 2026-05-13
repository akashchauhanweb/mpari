package com.zepto;

import android.net.Uri;
import android.os.Build;
import com.zepto.lx0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gz7 {
    public static final gz7 a = new gz7();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[by7.values().length];
            try {
                iArr[by7.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[by7.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[by7.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[by7.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[by7.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[by7.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
            int[] iArr2 = new int[x30.values().length];
            try {
                iArr2[x30.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[x30.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
            int[] iArr3 = new int[s44.values().length];
            try {
                iArr3[s44.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[s44.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[s44.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[s44.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[s44.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            c = iArr3;
            int[] iArr4 = new int[ij4.values().length];
            try {
                iArr4[ij4.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[ij4.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            d = iArr4;
        }
    }

    public static final int a(x30 backoffPolicy) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i = a.b[backoffPolicy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Set b(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        Intrinsics.checkNotNullExpressionValue(uri, "uri");
                        linkedHashSet.add(new lx0.c(uri, z));
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(objectInputStream, null);
                } finally {
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            Unit unit2 = Unit.INSTANCE;
            CloseableKt.closeFinally(byteArrayInputStream, null);
            return linkedHashSet;
        } finally {
        }
    }

    public static final x30 c(int i) {
        if (i == 0) {
            return x30.EXPONENTIAL;
        }
        if (i == 1) {
            return x30.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
    }

    public static final s44 d(int i) {
        if (i == 0) {
            return s44.NOT_REQUIRED;
        }
        if (i == 1) {
            return s44.CONNECTED;
        }
        if (i == 2) {
            return s44.UNMETERED;
        }
        if (i == 3) {
            return s44.NOT_ROAMING;
        }
        if (i == 4) {
            return s44.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return s44.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
    }

    public static final ij4 e(int i) {
        if (i == 0) {
            return ij4.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return ij4.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to OutOfQuotaPolicy");
    }

    public static final by7 f(int i) {
        if (i == 0) {
            return by7.ENQUEUED;
        }
        if (i == 1) {
            return by7.RUNNING;
        }
        if (i == 2) {
            return by7.SUCCEEDED;
        }
        if (i == 3) {
            return by7.FAILED;
        }
        if (i == 4) {
            return by7.BLOCKED;
        }
        if (i == 5) {
            return by7.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to State");
    }

    public static final int g(s44 networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i = a.c[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            i2 = 4;
            if (i == 4) {
                return 3;
            }
            if (i != 5) {
                if (Build.VERSION.SDK_INT >= 30 && networkType == s44.TEMPORARILY_UNMETERED) {
                    return 5;
                }
                throw new IllegalArgumentException("Could not convert " + networkType + " to int");
            }
        }
        return i2;
    }

    public static final int h(ij4 policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i = a.d[policy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final byte[] i(Set triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                Iterator it = triggers.iterator();
                while (it.hasNext()) {
                    lx0.c cVar = (lx0.c) it.next();
                    objectOutputStream.writeUTF(cVar.a().toString());
                    objectOutputStream.writeBoolean(cVar.b());
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(objectOutputStream, null);
                CloseableKt.closeFinally(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int j(by7 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (a.a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
