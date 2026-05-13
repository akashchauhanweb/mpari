package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class gx {
    public static final char[][] a = {new char[]{1569, 65152}, new char[]{1570, 65153, 65154}, new char[]{1571, 65155, 65156}, new char[]{1572, 65157, 65158}, new char[]{1573, 65159, 65160}, new char[]{1574, 65161, 65162, 65163, 65164}, new char[]{1575, 65165, 65166}, new char[]{1576, 65167, 65168, 65169, 65170}, new char[]{1577, 65171, 65172}, new char[]{1578, 65173, 65174, 65175, 65176}, new char[]{1579, 65177, 65178, 65179, 65180}, new char[]{1580, 65181, 65182, 65183, 65184}, new char[]{1581, 65185, 65186, 65187, 65188}, new char[]{1582, 65189, 65190, 65191, 65192}, new char[]{1583, 65193, 65194}, new char[]{1584, 65195, 65196}, new char[]{1585, 65197, 65198}, new char[]{1586, 65199, 65200}, new char[]{1587, 65201, 65202, 65203, 65204}, new char[]{1588, 65205, 65206, 65207, 65208}, new char[]{1589, 65209, 65210, 65211, 65212}, new char[]{1590, 65213, 65214, 65215, 65216}, new char[]{1591, 65217, 65218, 65219, 65220}, new char[]{1592, 65221, 65222, 65223, 65224}, new char[]{1593, 65225, 65226, 65227, 65228}, new char[]{1594, 65229, 65230, 65231, 65232}, new char[]{1600, 1600, 1600, 1600, 1600}, new char[]{1601, 65233, 65234, 65235, 65236}, new char[]{1602, 65237, 65238, 65239, 65240}, new char[]{1603, 65241, 65242, 65243, 65244}, new char[]{1604, 65245, 65246, 65247, 65248}, new char[]{1605, 65249, 65250, 65251, 65252}, new char[]{1606, 65253, 65254, 65255, 65256}, new char[]{1607, 65257, 65258, 65259, 65260}, new char[]{1608, 65261, 65262}, new char[]{1609, 65263, 65264, 64488, 64489}, new char[]{1610, 65265, 65266, 65267, 65268}, new char[]{1649, 64336, 64337}, new char[]{1657, 64358, 64359, 64360, 64361}, new char[]{1658, 64350, 64351, 64352, 64353}, new char[]{1659, 64338, 64339, 64340, 64341}, new char[]{1662, 64342, 64343, 64344, 64345}, new char[]{1663, 64354, 64355, 64356, 64357}, new char[]{1664, 64346, 64347, 64348, 64349}, new char[]{1667, 64374, 64375, 64376, 64377}, new char[]{1668, 64370, 64371, 64372, 64373}, new char[]{1670, 64378, 64379, 64380, 64381}, new char[]{1671, 64382, 64383, 64384, 64385}, new char[]{1672, 64392, 64393}, new char[]{1676, 64388, 64389}, new char[]{1677, 64386, 64387}, new char[]{1678, 64390, 64391}, new char[]{1681, 64396, 64397}, new char[]{1688, 64394, 64395}, new char[]{1700, 64362, 64363, 64364, 64365}, new char[]{1702, 64366, 64367, 64368, 64369}, new char[]{1705, 64398, 64399, 64400, 64401}, new char[]{1709, 64467, 64468, 64469, 64470}, new char[]{1711, 64402, 64403, 64404, 64405}, new char[]{1713, 64410, 64411, 64412, 64413}, new char[]{1715, 64406, 64407, 64408, 64409}, new char[]{1722, 64414, 64415}, new char[]{1723, 64416, 64417, 64418, 64419}, new char[]{1726, 64426, 64427, 64428, 64429}, new char[]{1728, 64420, 64421}, new char[]{1729, 64422, 64423, 64424, 64425}, new char[]{1733, 64480, 64481}, new char[]{1734, 64473, 64474}, new char[]{1735, 64471, 64472}, new char[]{1736, 64475, 64476}, new char[]{1737, 64482, 64483}, new char[]{1739, 64478, 64479}, new char[]{1740, 64508, 64509, 64510, 64511}, new char[]{1744, 64484, 64485, 64486, 64487}, new char[]{1746, 64430, 64431}, new char[]{1747, 64432, 64433}};

    public static class a {
        public char a;
        public char b;
        public char c;
        public int d;
        public int e = 1;
    }

    public static int a(char[] cArr, int i, int i2, char[] cArr2, int i3, int i4, int i5) {
        char[] cArr3 = new char[i2];
        for (int i6 = (i2 + i) - 1; i6 >= i; i6--) {
            cArr3[i6 - i] = cArr[i6];
        }
        StringBuffer stringBuffer = new StringBuffer(i2);
        i(cArr3, stringBuffer, i5);
        if ((i5 & 12) != 0) {
            e(stringBuffer, i5);
        }
        System.arraycopy(stringBuffer.toString().toCharArray(), 0, cArr2, i3, stringBuffer.length());
        return stringBuffer.length();
    }

    public static char b(char c, int i) {
        if (c < 1569 || c > 1747) {
            return (c < 65269 || c > 65275) ? c : (char) (c + i);
        }
        int length = a.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) / 2;
            char[] cArr = a[i3];
            char c2 = cArr[0];
            if (c == c2) {
                return cArr[i + 1];
            }
            if (c < c2) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return c;
    }

    public static boolean c(a aVar) {
        return aVar.e > 2;
    }

    public static void d(StringBuffer stringBuffer, a aVar, int i) {
        char c = aVar.a;
        if (c == 0) {
            return;
        }
        stringBuffer.append(c);
        int i2 = aVar.d;
        aVar.d = i2 - 1;
        char c2 = aVar.b;
        if (c2 != 0) {
            if ((i & 1) == 0) {
                stringBuffer.append(c2);
                aVar.d--;
            } else {
                aVar.d = i2 - 2;
            }
        }
        char c3 = aVar.c;
        if (c3 != 0) {
            if ((i & 1) != 0) {
                aVar.d--;
            } else {
                stringBuffer.append(c3);
                aVar.d--;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.lang.StringBuffer r10, int r11) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.gx.e(java.lang.StringBuffer, int):void");
    }

    public static boolean f(char c) {
        return (c >= 1611 && c <= 1621) || c == 1648;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(char r12, com.zepto.gx.a r13) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.gx.g(char, com.zepto.gx$a):int");
    }

    public static void h(char[] cArr, int i, int i2, int i3) {
        int i4 = i + i2;
        int i5 = i3 & 224;
        if (i5 != 0) {
            int i6 = i3 & 256;
            char c = i6 != 0 ? i6 != 256 ? '0' : (char) 1776 : (char) 1632;
            if (i5 == 32) {
                int i7 = c - '0';
                while (i < i4) {
                    char c2 = cArr[i];
                    if (c2 <= '9' && c2 >= '0') {
                        cArr[i] = (char) (c2 + i7);
                    }
                    i++;
                }
                return;
            }
            if (i5 != 64) {
                if (i5 == 96) {
                    j(cArr, 0, i2, c, false);
                    return;
                } else {
                    if (i5 != 128) {
                        return;
                    }
                    j(cArr, 0, i2, c, true);
                    return;
                }
            }
            char c3 = (char) (c + '\t');
            int i8 = '0' - c;
            while (i < i4) {
                char c4 = cArr[i];
                if (c4 <= c3 && c4 >= c) {
                    cArr[i] = (char) (c4 + i8);
                }
                i++;
            }
        }
    }

    public static void i(char[] cArr, StringBuffer stringBuffer, int i) {
        a aVar = new a();
        a aVar2 = new a();
        int i2 = 0;
        while (i2 < cArr.length) {
            int i3 = i2 + 1;
            char c = cArr[i2];
            if (g(c, aVar2) == 0) {
                int iK = k(c);
                int i4 = iK == 1 ? 0 : 2;
                if (c(aVar)) {
                    i4++;
                }
                aVar2.a = b(aVar2.a, i4 % aVar2.e);
                d(stringBuffer, aVar, i);
                a aVar3 = new a();
                aVar3.a = c;
                aVar3.e = iK;
                aVar3.d++;
                i2 = i3;
                a aVar4 = aVar2;
                aVar2 = aVar3;
                aVar = aVar4;
            } else {
                i2 = i3;
            }
        }
        aVar2.a = b(aVar2.a, (c(aVar) ? 1 : 0) % aVar2.e);
        d(stringBuffer, aVar, i);
        d(stringBuffer, aVar2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void j(char[] r3, int r4, int r5, char r6, boolean r7) {
        /*
            int r6 = r6 + (-48)
            char r6 = (char) r6
            int r5 = r5 + r4
        L4:
            if (r4 >= r5) goto L2a
            char r0 = r3[r4]
            byte r1 = com.zepto.q50.d(r0)
            if (r1 == 0) goto L26
            r2 = 8
            if (r1 == r2) goto L1b
            r0 = 3
            if (r1 == r0) goto L26
            r0 = 4
            if (r1 == r0) goto L19
            goto L27
        L19:
            r7 = 1
            goto L27
        L1b:
            if (r7 == 0) goto L27
            r1 = 57
            if (r0 > r1) goto L27
            int r0 = r0 + r6
            char r0 = (char) r0
            r3[r4] = r0
            goto L27
        L26:
            r7 = 0
        L27:
            int r4 = r4 + 1
            goto L4
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.gx.j(char[], int, int, char, boolean):void");
    }

    public static int k(char c) {
        if (c >= 1569 && c <= 1747 && !f(c)) {
            int length = a.length - 1;
            int i = 0;
            while (i <= length) {
                int i2 = (i + length) / 2;
                char[] cArr = a[i2];
                char c2 = cArr[0];
                if (c == c2) {
                    return cArr.length - 1;
                }
                if (c < c2) {
                    length = i2 - 1;
                } else {
                    i = i2 + 1;
                }
            }
        } else if (c == 8205) {
            return 4;
        }
        return 1;
    }
}
