package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class we6 {

    public class a implements b {
        public final /* synthetic */ s80 a;

        public a(s80 s80Var) {
            this.a = s80Var;
        }

        @Override // com.zepto.we6.b
        public byte a(int i) {
            return this.a.m(i);
        }

        @Override // com.zepto.we6.b
        public int size() {
            return this.a.size();
        }
    }

    public interface b {
        byte a(int i);

        int size();
    }

    public static String a(s80 s80Var) {
        return b(new a(s80Var));
    }

    public static String b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            byte bA = bVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String c(String str) {
        return a(s80.z(str));
    }
}
