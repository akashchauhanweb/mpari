package com.zepto;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
public class c03 {
    public final i90 a = new tv0();

    public class a implements b03 {
        public Object a;
        public Class b;

        public a(Class cls) {
            this.b = cls;
        }

        @Override // com.zepto.b03
        public boolean a() {
            return false;
        }

        @Override // com.zepto.b03
        public Object b(Object obj) {
            this.a = obj;
            return obj;
        }

        @Override // com.zepto.b03
        public Object c() {
            if (this.a == null) {
                this.a = c03.this.b(this.b);
            }
            return this.a;
        }

        @Override // com.zepto.b03
        public Class getType() {
            return this.b;
        }
    }

    public b03 a(Class cls) {
        return new a(cls);
    }

    public Object b(Class cls) throws NoSuchMethodException {
        Constructor declaredConstructor = (Constructor) this.a.b(cls);
        if (declaredConstructor == null) {
            declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            this.a.a(cls, declaredConstructor);
        }
        return declaredConstructor.newInstance(new Object[0]);
    }
}
