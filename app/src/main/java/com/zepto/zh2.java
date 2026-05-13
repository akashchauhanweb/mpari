package com.zepto;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class zh2 {

    public static class a implements wh2, Serializable {
        public final Map c;
        public final Object e;

        public a(Map map, Object obj) {
            this.c = (Map) ju4.j(map);
            this.e = obj;
        }

        @Override // com.zepto.wh2
        public Object a(Object obj) {
            Object obj2 = this.c.get(obj);
            return (obj2 != null || this.c.containsKey(obj)) ? je4.a(obj2) : this.e;
        }

        @Override // com.zepto.wh2
        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.c.equals(aVar.c) && jf4.a(this.e, aVar.e);
        }

        public int hashCode() {
            return jf4.b(this.c, this.e);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.c);
            String strValueOf2 = String.valueOf(this.e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 33 + strValueOf2.length());
            sb.append("Functions.forMap(");
            sb.append(strValueOf);
            sb.append(", defaultValue=");
            sb.append(strValueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static wh2 a(Map map, Object obj) {
        return new a(map, obj);
    }
}
