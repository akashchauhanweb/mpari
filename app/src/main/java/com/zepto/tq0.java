package com.zepto;

import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class tq0 {
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final int e;
    public final View f;
    public final String g;
    public final String h;
    public final b26 i;
    public Integer j;

    public static final class a {
        public Account a;
        public qx b;
        public String c;
        public String d;
        public b26 e = b26.k;

        public tq0 a() {
            return new tq0(this.a, this.b, null, 0, null, this.c, this.d, this.e, false);
        }

        public a b(String str) {
            this.c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.b == null) {
                this.b = new qx();
            }
            this.b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.a = account;
            return this;
        }

        public final a e(String str) {
            this.d = str;
            return this;
        }
    }

    public tq0(Account account, Set set, Map map, int i, View view, String str, String str2, b26 b26Var, boolean z) {
        this.a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = setEmptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.d = map;
        this.f = view;
        this.e = i;
        this.g = str;
        this.h = str2;
        this.i = b26Var == null ? b26.k : b26Var;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            wb0.a(it.next());
            throw null;
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.a;
    }

    public Account b() {
        Account account = this.a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set c() {
        return this.c;
    }

    public String d() {
        return this.g;
    }

    public Set e() {
        return this.b;
    }

    public final b26 f() {
        return this.i;
    }

    public final Integer g() {
        return this.j;
    }

    public final String h() {
        return this.h;
    }

    public final void i(Integer num) {
        this.j = num;
    }
}
