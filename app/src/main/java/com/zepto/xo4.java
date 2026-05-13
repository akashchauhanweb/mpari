package com.zepto;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import kotlin.UByte;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public abstract class xo4 {
    public static final char[] a = {0, 1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', 11, '\f', '\r', 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, ' ', '!', Typography.quote, '#', Typography.dollar, '%', Typography.amp, '\'', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', Typography.less, '=', Typography.greater, '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~', 127, Typography.euro, 65533, Typography.lowSingleQuote, 402, Typography.lowDoubleQuote, Typography.ellipsis, Typography.dagger, Typography.doubleDagger, 710, 8240, 352, 8249, 338, 65533, 381, 65533, 65533, Typography.leftSingleQuote, Typography.rightSingleQuote, Typography.leftDoubleQuote, Typography.rightDoubleQuote, Typography.bullet, Typography.ndash, Typography.mdash, 732, Typography.tm, 353, 8250, 339, 65533, 382, 376, Typography.nbsp, 161, Typography.cent, Typography.pound, 164, 165, 166, Typography.section, 168, Typography.copyright, 170, 171, 172, 173, Typography.registered, 175, Typography.degree, Typography.plusMinus, 178, 179, 180, 181, Typography.paragraph, Typography.middleDot, 184, 185, 186, 187, 188, Typography.half, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, Typography.times, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255};
    public static final char[] b = {0, 1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', 11, '\f', '\r', 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, ' ', '!', Typography.quote, '#', Typography.dollar, '%', Typography.amp, '\'', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', Typography.less, '=', Typography.greater, '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~', 127, Typography.bullet, Typography.dagger, Typography.doubleDagger, Typography.ellipsis, Typography.mdash, Typography.ndash, 402, 8260, 8249, 8250, 8722, 8240, Typography.lowDoubleQuote, Typography.leftDoubleQuote, Typography.rightDoubleQuote, Typography.leftSingleQuote, Typography.rightSingleQuote, Typography.lowSingleQuote, Typography.tm, 64257, 64258, 321, 338, 352, 376, 381, 305, 322, 339, 353, 382, 65533, Typography.euro, 161, Typography.cent, Typography.pound, 164, 165, 166, Typography.section, 168, Typography.copyright, 170, 171, 172, 173, Typography.registered, 175, Typography.degree, Typography.plusMinus, 178, 179, 180, 181, Typography.paragraph, Typography.middleDot, 184, 185, 186, 187, 188, Typography.half, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, Typography.times, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255};
    public static final k03 c = new k03();
    public static final k03 d = new k03();
    public static HashMap e = new HashMap();
    public static final HashMap f;
    public static final byte[][] g;

    public static class b implements l72 {
        public static k03 a = new k03();
        public static final char[] b = {199, 252, 233, 226, 228, 224, 229, 231, 234, 235, 232, 239, 238, 236, 196, 197, 201, 230, 198, 244, 246, 242, 251, 249, 255, 214, 220, Typography.cent, Typography.pound, 165, 8359, 402, 225, 237, 243, 250, 241, 209, 170, 186, 191, 8976, 172, Typography.half, 188, 161, 171, 187, 9617, 9618, 9619, 9474, 9508, 9569, 9570, 9558, 9557, 9571, 9553, 9559, 9565, 9564, 9563, 9488, 9492, 9524, 9516, 9500, 9472, 9532, 9566, 9567, 9562, 9556, 9577, 9574, 9568, 9552, 9580, 9575, 9576, 9572, 9573, 9561, 9560, 9554, 9555, 9579, 9578, 9496, 9484, 9608, 9604, 9612, 9616, 9600, 945, 223, 915, 960, 931, 963, 181, 964, 934, 920, 937, 948, 8734, 966, 949, 8745, 8801, Typography.plusMinus, Typography.greaterOrEqual, Typography.lessOrEqual, 8992, 8993, 247, Typography.almostEqual, Typography.degree, 8729, Typography.middleDot, 8730, 8319, 178, 9632, Typography.nbsp};

        static {
            int i = 0;
            while (true) {
                char[] cArr = b;
                if (i >= cArr.length) {
                    return;
                }
                a.d(cArr[i], i + 128);
                i++;
            }
        }

        public b() {
        }

        @Override // com.zepto.l72
        public byte[] a(String str, String str2) {
            int i;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            int length = charArray.length;
            int i2 = 0;
            for (char c : charArray) {
                if (c < 128) {
                    i = i2 + 1;
                    bArr[i2] = (byte) c;
                } else {
                    byte b2 = (byte) a.b(c);
                    if (b2 != 0) {
                        i = i2 + 1;
                        bArr[i2] = b2;
                    }
                }
                i2 = i;
            }
            if (i2 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            return bArr2;
        }

        @Override // com.zepto.l72
        public byte[] b(char c, String str) {
            if (c < 128) {
                return new byte[]{(byte) c};
            }
            byte b2 = (byte) a.b(c);
            return b2 != 0 ? new byte[]{b2} : new byte[0];
        }

        @Override // com.zepto.l72
        public String c(byte[] bArr, String str) {
            int i;
            char[] cArr = new char[bArr.length];
            int i2 = 0;
            for (byte b2 : bArr) {
                int i3 = b2 & UByte.MAX_VALUE;
                if (i3 >= 32) {
                    if (i3 < 128) {
                        i = i2 + 1;
                        cArr[i2] = (char) i3;
                    } else {
                        i = i2 + 1;
                        cArr[i2] = b[i3 - 128];
                    }
                    i2 = i;
                }
            }
            return new String(cArr, 0, i2);
        }
    }

    public static class c implements l72 {
        public static final k03 b = new k03();
        public static final k03 c = new k03();
        public static final char[] d = {' ', '!', 8704, '#', 8707, '%', Typography.amp, 8715, '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', Typography.less, '=', Typography.greater, '?', 8773, 913, 914, 935, 916, 917, 934, 915, 919, 921, 977, 922, 923, 924, 925, 927, 928, 920, 929, 931, 932, 933, 962, 937, 926, 936, 918, '[', 8756, ']', 8869, '_', 773, 945, 946, 967, 948, 949, 981, 947, 951, 953, 966, 954, 955, 956, 957, 959, 960, 952, 961, 963, 964, 965, 982, 969, 958, 968, 950, '{', '|', '}', '~', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Typography.euro, 978, Typography.prime, Typography.lessOrEqual, 8260, 8734, 402, 9827, 9830, 9829, 9824, 8596, 8592, 8593, 8594, 8595, Typography.degree, Typography.plusMinus, Typography.doublePrime, Typography.greaterOrEqual, Typography.times, 8733, 8706, Typography.bullet, 247, Typography.notEqual, 8801, Typography.almostEqual, Typography.ellipsis, 9474, 9472, 8629, 8501, 8465, 8476, 8472, 8855, 8853, 8709, 8745, 8746, 8835, 8839, 8836, 8834, 8838, 8712, 8713, 8736, 8711, Typography.registered, Typography.copyright, Typography.tm, 8719, 8730, Typography.bullet, 172, 8743, 8744, 8660, 8656, 8657, 8658, 8659, 9674, 9001, 0, 0, 0, 8721, 9115, 9116, 9117, 9121, 9122, 9123, 9127, 9128, 9129, 9130, 0, 9002, 8747, 8992, 9134, 8993, 9118, 9119, 9120, 9124, 9125, 9126, 9131, 9132, 9133, 0};
        public static final char[] e = {' ', 9985, 9986, 9987, 9988, 9742, 9990, 9991, 9992, 9993, 9755, 9758, 9996, 9997, 9998, 9999, 10000, 10001, 10002, 10003, 10004, 10005, 10006, 10007, 10008, 10009, 10010, 10011, 10012, 10013, 10014, 10015, 10016, 10017, 10018, 10019, 10020, 10021, 10022, 10023, 9733, 10025, 10026, 10027, 10028, 10029, 10030, 10031, 10032, 10033, 10034, 10035, 10036, 10037, 10038, 10039, 10040, 10041, 10042, 10043, 10044, 10045, 10046, 10047, 10048, 10049, 10050, 10051, 10052, 10053, 10054, 10055, 10056, 10057, 10058, 10059, 9679, 10061, 9632, 10063, 10064, 10065, 10066, 9650, 9660, 9670, 10070, 9687, 10072, 10073, 10074, 10075, 10076, 10077, 10078, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10081, 10082, 10083, 10084, 10085, 10086, 10087, 9827, 9830, 9829, 9824, 9312, 9313, 9314, 9315, 9316, 9317, 9318, 9319, 9320, 9321, 10102, 10103, 10104, 10105, 10106, 10107, 10108, 10109, 10110, 10111, 10112, 10113, 10114, 10115, 10116, 10117, 10118, 10119, 10120, 10121, 10122, 10123, 10124, 10125, 10126, 10127, 10128, 10129, 10130, 10131, 10132, 8594, 8596, 8597, 10136, 10137, 10138, 10139, 10140, 10141, 10142, 10143, 10144, 10145, 10146, 10147, 10148, 10149, 10150, 10151, 10152, 10153, 10154, 10155, 10156, 10157, 10158, 10159, 0, 10161, 10162, 10163, 10164, 10165, 10166, 10167, 10168, 10169, 10170, 10171, 10172, 10173, 10174, 0};
        public k03 a;

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                char[] cArr = d;
                if (i2 >= cArr.length) {
                    break;
                }
                char c2 = cArr[i2];
                if (c2 != 0) {
                    b.d(c2, i2 + 32);
                }
                i2++;
            }
            while (true) {
                char[] cArr2 = e;
                if (i >= cArr2.length) {
                    return;
                }
                char c3 = cArr2[i];
                if (c3 != 0) {
                    c.d(c3, i + 32);
                }
                i++;
            }
        }

        public c(boolean z) {
            if (z) {
                this.a = b;
            } else {
                this.a = c;
            }
        }

        @Override // com.zepto.l72
        public byte[] a(String str, String str2) {
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            int length = charArray.length;
            int i = 0;
            for (char c2 : charArray) {
                byte b2 = (byte) this.a.b(c2);
                if (b2 != 0) {
                    bArr[i] = b2;
                    i++;
                }
            }
            if (i == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            return bArr2;
        }

        @Override // com.zepto.l72
        public byte[] b(char c2, String str) {
            byte b2 = (byte) this.a.b(c2);
            return b2 != 0 ? new byte[]{b2} : new byte[0];
        }

        @Override // com.zepto.l72
        public String c(byte[] bArr, String str) {
            return null;
        }
    }

    public static class d implements l72 {
        public d() {
        }

        @Override // com.zepto.l72
        public byte[] a(String str, String str2) {
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            int length = charArray.length;
            int i = 0;
            for (char c : charArray) {
                int i2 = 65280 & c;
                if (i2 == 0 || i2 == 61440) {
                    bArr[i] = (byte) c;
                    i++;
                }
            }
            if (i == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            return bArr2;
        }

        @Override // com.zepto.l72
        public byte[] b(char c, String str) {
            int i = 65280 & c;
            return (i == 0 || i == 61440) ? new byte[]{(byte) c} : new byte[0];
        }

        @Override // com.zepto.l72
        public String c(byte[] bArr, String str) {
            return null;
        }
    }

    public static class e implements l72 {
        public static final byte[] a = {0, 35, 34, 0, 0, 0, 41, 62, 81, 42, 0, 0, 65, 63, 0, 0, 0, 0, 0, -4, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 86, 0, 88, 89, 0, 0, 0, 0, 0, 0, 0, 0, -75, 0, 0, 0, 0, 0, -74, 0, 0, 0, -83, -81, -84, 0, 0, 0, 0, 0, 0, 0, 0, 124, 123, 0, 0, 0, 84, 0, 0, 0, 0, 0, 0, 0, 0, -90, 0, 0, 0, 113, 114, 0, 0, 0, 117, 0, 0, 0, 0, 0, 0, 125, 126, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -116, -115, -114, -113, -112, -111, -110, -109, -108, -107, -127, -126, -125, -124, -123, -122, -121, -120, -119, -118, -116, -115, -114, -113, -112, -111, -110, -109, -108, -107, -24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -24, -40, 0, 0, -60, -58, 0, 0, -16, 0, 0, 0, 0, 0, 0, 0, 0, 0, -36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        public e() {
        }

        @Override // com.zepto.l72
        public byte[] a(String str, String str2) {
            byte b;
            int i;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            int length = charArray.length;
            int i2 = 0;
            for (char c : charArray) {
                if (c == ' ') {
                    i = i2 + 1;
                    bArr[i2] = (byte) c;
                } else if (c >= 9985 && c <= 10174 && (b = a[c - 9984]) != 0) {
                    i = i2 + 1;
                    bArr[i2] = b;
                }
                i2 = i;
            }
            if (i2 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            return bArr2;
        }

        @Override // com.zepto.l72
        public byte[] b(char c, String str) {
            byte b;
            return c == ' ' ? new byte[]{(byte) c} : (c < 9985 || c > 10174 || (b = a[c + 55552]) == 0) ? new byte[0] : new byte[]{b};
        }

        @Override // com.zepto.l72
        public String c(byte[] bArr, String str) {
            return null;
        }
    }

    static {
        for (int i = 128; i < 161; i++) {
            char c2 = a[i];
            if (c2 != 65533) {
                c.d(c2, i);
            }
        }
        for (int i2 = 128; i2 < 161; i2++) {
            char c3 = b[i2];
            if (c3 != 65533) {
                d.d(c3, i2);
            }
        }
        a("Wingdings", new e());
        a("Symbol", new c(true));
        a("ZapfDingbats", new c(false));
        a("SymbolTT", new d());
        a("Cp437", new b());
        f = new HashMap();
        g = new byte[][]{new byte[]{10}, new byte[]{13, 10}};
    }

    public static void a(String str, l72 l72Var) {
        synchronized (e) {
            HashMap map = (HashMap) e.clone();
            map.put(str.toLowerCase(), l72Var);
            e = map;
        }
    }

    public static final byte[] b(char c2, String str) {
        byte[] bArrB;
        if (str == null || str.length() == 0) {
            return new byte[]{(byte) c2};
        }
        l72 l72Var = (l72) e.get(str.toLowerCase());
        if (l72Var != null && (bArrB = l72Var.b(c2, str)) != null) {
            return bArrB;
        }
        k03 k03Var = str.equals("Cp1252") ? c : str.equals("PDF") ? d : null;
        if (k03Var == null) {
            if (str.equals("UnicodeBig")) {
                return new byte[]{-2, -1, (byte) (c2 >> '\b'), (byte) (c2 & 255)};
            }
            try {
                return String.valueOf(c2).getBytes(str);
            } catch (UnsupportedEncodingException e2) {
                throw new p52(e2);
            }
        }
        int iB = c2;
        if (c2 >= 128) {
            iB = c2;
            if (c2 <= 160 || c2 > 255) {
                iB = k03Var.b(c2);
            }
        }
        return iB != 0 ? new byte[]{(byte) iB} : new byte[0];
    }

    public static final byte[] c(String str, String str2) {
        byte[] bArrA;
        int i = 0;
        if (str == null) {
            return new byte[0];
        }
        if (str2 == null || str2.length() == 0) {
            int length = str.length();
            byte[] bArr = new byte[length];
            while (i < length) {
                bArr[i] = (byte) str.charAt(i);
                i++;
            }
            return bArr;
        }
        l72 l72Var = (l72) e.get(str2.toLowerCase());
        if (l72Var != null && (bArrA = l72Var.a(str, str2)) != null) {
            return bArrA;
        }
        k03 k03Var = str2.equals("Cp1252") ? c : str2.equals("PDF") ? d : null;
        if (k03Var == null) {
            if (!str2.equals("UnicodeBig")) {
                try {
                    return str.getBytes(str2);
                } catch (UnsupportedEncodingException e2) {
                    throw new p52(e2);
                }
            }
            char[] charArray = str.toCharArray();
            int length2 = charArray.length;
            byte[] bArr2 = new byte[(charArray.length * 2) + 2];
            bArr2[0] = -2;
            bArr2[1] = -1;
            int i2 = 2;
            while (i < length2) {
                char c2 = charArray[i];
                int i3 = i2 + 1;
                bArr2[i2] = (byte) (c2 >> '\b');
                i2 += 2;
                bArr2[i3] = (byte) (c2 & 255);
                i++;
            }
            return bArr2;
        }
        char[] charArray2 = str.toCharArray();
        int length3 = charArray2.length;
        byte[] bArr3 = new byte[length3];
        int i4 = 0;
        for (char c3 : charArray2) {
            int iB = c3;
            if (c3 >= 128) {
                iB = c3;
                if (c3 <= 160 || c3 > 255) {
                    iB = k03Var.b(c3);
                }
            }
            if (iB != 0) {
                bArr3[i4] = (byte) iB;
                i4++;
            }
        }
        if (i4 == length3) {
            return bArr3;
        }
        byte[] bArr4 = new byte[i4];
        System.arraycopy(bArr3, 0, bArr4, 0, i4);
        return bArr4;
    }

    public static final String d(byte[] bArr, String str) {
        String strC;
        if (bArr == null) {
            return "";
        }
        int i = 0;
        if (str == null || str.length() == 0) {
            char[] cArr = new char[bArr.length];
            while (i < bArr.length) {
                cArr[i] = (char) (bArr[i] & UByte.MAX_VALUE);
                i++;
            }
            return new String(cArr);
        }
        l72 l72Var = (l72) e.get(str.toLowerCase());
        if (l72Var != null && (strC = l72Var.c(bArr, str)) != null) {
            return strC;
        }
        char[] cArr2 = str.equals("Cp1252") ? a : str.equals("PDF") ? b : null;
        if (cArr2 == null) {
            try {
                return new String(bArr, str);
            } catch (UnsupportedEncodingException e2) {
                throw new p52(e2);
            }
        }
        int length = bArr.length;
        char[] cArr3 = new char[length];
        while (i < length) {
            cArr3[i] = cArr2[bArr[i] & UByte.MAX_VALUE];
            i++;
        }
        return new String(cArr3);
    }

    public static boolean e(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 128 && ((cCharAt <= 160 || cCharAt > 255) && !d.a(cCharAt))) {
                return false;
            }
        }
        return true;
    }
}
