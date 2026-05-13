package com.zepto;

import java.util.List;
import java.util.RandomAccess;
import kotlin.UByte;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class th4 extends AbstractList implements RandomAccess {
    public static final a f = new a(null);
    public final t80[] c;
    public final int[] e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, long j, u70 u70Var, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            aVar.a((i4 & 1) != 0 ? 0L : j, u70Var, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        public final void a(long j, u70 u70Var, int i, List list, int i2, int i3, List list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            u70 u70Var2;
            int i8 = i;
            if (!(i2 < i3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i9 = i2; i9 < i3; i9++) {
                if (!(((t80) list.get(i9)).t() >= i8)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            t80 t80Var = (t80) list.get(i2);
            t80 t80Var2 = (t80) list.get(i3 - 1);
            int i10 = -1;
            if (i8 == t80Var.t()) {
                int iIntValue = ((Number) list2.get(i2)).intValue();
                int i11 = i2 + 1;
                t80 t80Var3 = (t80) list.get(i11);
                i4 = i11;
                i5 = iIntValue;
                t80Var = t80Var3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (t80Var.e(i8) == t80Var2.e(i8)) {
                int iMin = Math.min(t80Var.t(), t80Var2.t());
                int i12 = 0;
                for (int i13 = i8; i13 < iMin && t80Var.e(i13) == t80Var2.e(i13); i13++) {
                    i12++;
                }
                long jC = j + c(u70Var) + ((long) 2) + ((long) i12) + 1;
                u70Var.writeInt(-i12);
                u70Var.writeInt(i5);
                int i14 = i8 + i12;
                while (i8 < i14) {
                    u70Var.writeInt(t80Var.e(i8) & UByte.MAX_VALUE);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (!(i14 == ((t80) list.get(i4)).t())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    u70Var.writeInt(((Number) list2.get(i4)).intValue());
                    return;
                } else {
                    u70 u70Var3 = new u70();
                    u70Var.writeInt(((int) (c(u70Var3) + jC)) * (-1));
                    a(jC, u70Var3, i14, list, i4, i3, list2);
                    u70Var.H(u70Var3);
                    return;
                }
            }
            int i15 = 1;
            for (int i16 = i4 + 1; i16 < i3; i16++) {
                if (((t80) list.get(i16 - 1)).e(i8) != ((t80) list.get(i16)).e(i8)) {
                    i15++;
                }
            }
            long jC2 = j + c(u70Var) + ((long) 2) + ((long) (i15 * 2));
            u70Var.writeInt(i15);
            u70Var.writeInt(i5);
            for (int i17 = i4; i17 < i3; i17++) {
                byte bE = ((t80) list.get(i17)).e(i8);
                if (i17 == i4 || bE != ((t80) list.get(i17 - 1)).e(i8)) {
                    u70Var.writeInt(bE & UByte.MAX_VALUE);
                }
            }
            u70 u70Var4 = new u70();
            while (i4 < i3) {
                byte bE2 = ((t80) list.get(i4)).e(i8);
                int i18 = i4 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i3) {
                        i6 = i3;
                        break;
                    } else {
                        if (bE2 != ((t80) list.get(i19)).e(i8)) {
                            i6 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                if (i18 == i6 && i8 + 1 == ((t80) list.get(i4)).t()) {
                    u70Var.writeInt(((Number) list2.get(i4)).intValue());
                    i7 = i6;
                    u70Var2 = u70Var4;
                } else {
                    u70Var.writeInt(((int) (jC2 + c(u70Var4))) * i10);
                    i7 = i6;
                    u70Var2 = u70Var4;
                    a(jC2, u70Var4, i8 + 1, list, i4, i6, list2);
                }
                u70Var4 = u70Var2;
                i4 = i7;
                i10 = -1;
            }
            u70Var.H(u70Var4);
        }

        public final long c(u70 u70Var) {
            return u70Var.L0() / ((long) 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x00e7, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.zepto.th4 d(com.zepto.t80... r17) {
            /*
                Method dump skipped, instruction units count: 320
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.th4.a.d(com.zepto.t80[]):com.zepto.th4");
        }
    }

    public /* synthetic */ th4(t80[] t80VarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(t80VarArr, iArr);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof t80) {
            return j((t80) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public int get_size() {
        return this.c.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof t80) {
            return u((t80) obj);
        }
        return -1;
    }

    public /* bridge */ boolean j(t80 t80Var) {
        return super.contains(t80Var);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof t80) {
            return w((t80) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public t80 get(int i) {
        return this.c[i];
    }

    public final t80[] n() {
        return this.c;
    }

    public final int[] r() {
        return this.e;
    }

    public /* bridge */ int u(t80 t80Var) {
        return super.indexOf(t80Var);
    }

    public /* bridge */ int w(t80 t80Var) {
        return super.lastIndexOf(t80Var);
    }

    public th4(t80[] t80VarArr, int[] iArr) {
        this.c = t80VarArr;
        this.e = iArr;
    }
}
