package com.zepto;

import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ry implements Comparable {
    public final List c;
    public final List e;

    public class b implements Comparator {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            int iCompare = Integer.compare(bArr.length, bArr2.length);
            if (iCompare != 0) {
                return iCompare;
            }
            for (int i = 0; i < bArr.length; i++) {
                iCompare = Byte.compare(bArr[i], bArr2[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return iCompare;
        }
    }

    public ry(a0 a0Var) throws CertificateParsingException {
        if (!(a0Var instanceof x0)) {
            throw new CertificateParsingException("Expected sequence for AttestationApplicationId, found " + a0Var.getClass().getName());
        }
        x0 x0Var = (x0) a0Var;
        List listB = b(x0Var.j0(0));
        this.c = listB;
        listB.sort(null);
        List listC = c(x0Var.j0(1));
        this.e = listC;
        listC.sort(new b());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ry ryVar) {
        int iCompare = Integer.compare(this.c.size(), ryVar.c.size());
        if (iCompare != 0) {
            return iCompare;
        }
        for (int i = 0; i < this.c.size(); i++) {
            int iCompareTo = ((yy) this.c.get(i)).compareTo((yy) ryVar.c.get(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        int iCompare2 = Integer.compare(this.e.size(), ryVar.e.size());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        b bVar = new b();
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            iCompare2 = bVar.compare((byte[]) this.e.get(i2), (byte[]) ryVar.e.get(i2));
            if (iCompare2 != 0) {
                return iCompare2;
            }
        }
        return iCompare2;
    }

    public final List b(a0 a0Var) throws CertificateParsingException {
        if (!(a0Var instanceof z0)) {
            throw new CertificateParsingException("Expected set for AttestationApplicationsInfos, found " + a0Var.getClass().getName());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((z0) a0Var).iterator();
        while (it.hasNext()) {
            arrayList.add(new yy((a0) it.next()));
        }
        return arrayList;
    }

    public final List c(a0 a0Var) throws CertificateParsingException {
        if (!(a0Var instanceof z0)) {
            throw new CertificateParsingException("Expected set for Signature digests, found " + a0Var.getClass().getName());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((z0) a0Var).iterator();
        while (it.hasNext()) {
            arrayList.add(yx.g((a0) it.next()));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry)) {
            return false;
        }
        ry ryVar = (ry) obj;
        return Objects.equals(this.c, ryVar.c) && Objects.equals(this.e, ryVar.e);
    }

    public int hashCode() {
        return Objects.hash(this.c, this.e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = this.c.size();
        int i = 1;
        int i2 = 1;
        for (yy yyVar : this.c) {
            sb.append("Package info " + i2 + "/" + size + ":\n");
            sb.append(yyVar);
            i2++;
        }
        sb.append('\n');
        int size2 = this.e.size();
        for (byte[] bArr : this.e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Signature digest ");
            int i3 = i + 1;
            sb2.append(i);
            sb2.append("/");
            sb2.append(size2);
            sb2.append(":\n");
            sb.append(sb2.toString());
            for (byte b2 : bArr) {
                sb.append(String.format("%02X ", Byte.valueOf(b2)));
            }
            sb.append('\n');
            i = i3;
        }
        return sb.toString();
    }
}
