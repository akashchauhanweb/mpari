package com.zepto;

/* JADX INFO: loaded from: classes2.dex */
public class q62 {
    public int a;
    public int b;
    public int c;

    public q62(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q62 q62Var = (q62) obj;
        return this.a == q62Var.a && this.b == q62Var.b && this.c == q62Var.c;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
