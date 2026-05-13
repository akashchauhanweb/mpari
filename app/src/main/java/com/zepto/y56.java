package com.zepto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class y56 extends no6 {
    public static final po6 b = new a();
    public final no6 a;

    public class a implements po6 {
        @Override // com.zepto.po6
        public no6 a(Gson gson, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.getRawType() == Timestamp.class) {
                return new y56(gson.getAdapter(Date.class), aVar);
            }
            return null;
        }
    }

    public /* synthetic */ y56(no6 no6Var, a aVar) {
        this(no6Var);
    }

    @Override // com.zepto.no6
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Timestamp read(s53 s53Var) {
        Date date = (Date) this.a.read(s53Var);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.zepto.no6
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(b63 b63Var, Timestamp timestamp) {
        this.a.write(b63Var, timestamp);
    }

    public y56(no6 no6Var) {
        this.a = no6Var;
    }
}
