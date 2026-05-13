package com.zepto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
public final class u56 extends no6 {
    public static final po6 b = new a();
    public final DateFormat a;

    public class a implements po6 {
        @Override // com.zepto.po6
        public no6 a(Gson gson, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.getRawType() == Date.class) {
                return new u56(aVar);
            }
            return null;
        }
    }

    public /* synthetic */ u56(a aVar) {
        this();
    }

    @Override // com.zepto.no6
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Date read(s53 s53Var) throws IOException {
        java.util.Date date;
        if (s53Var.G0() == v53.NULL) {
            s53Var.C0();
            return null;
        }
        String strE0 = s53Var.E0();
        try {
            synchronized (this) {
                date = this.a.parse(strE0);
            }
            return new Date(date.getTime());
        } catch (ParseException e) {
            throw new u53("Failed parsing '" + strE0 + "' as SQL Date; at path " + s53Var.U(), e);
        }
    }

    @Override // com.zepto.no6
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(b63 b63Var, Date date) throws IOException {
        String str;
        if (date == null) {
            b63Var.m0();
            return;
        }
        synchronized (this) {
            str = this.a.format((java.util.Date) date);
        }
        b63Var.J0(str);
    }

    public u56() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }
}
