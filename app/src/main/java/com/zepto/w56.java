package com.zepto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class w56 extends no6 {
    public static final po6 b = new a();
    public final DateFormat a;

    public class a implements po6 {
        @Override // com.zepto.po6
        public no6 a(Gson gson, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.getRawType() == Time.class) {
                return new w56(aVar);
            }
            return null;
        }
    }

    public /* synthetic */ w56(a aVar) {
        this();
    }

    @Override // com.zepto.no6
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Time read(s53 s53Var) throws IOException {
        Time time;
        if (s53Var.G0() == v53.NULL) {
            s53Var.C0();
            return null;
        }
        String strE0 = s53Var.E0();
        try {
            synchronized (this) {
                time = new Time(this.a.parse(strE0).getTime());
            }
            return time;
        } catch (ParseException e) {
            throw new u53("Failed parsing '" + strE0 + "' as SQL Time; at path " + s53Var.U(), e);
        }
    }

    @Override // com.zepto.no6
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(b63 b63Var, Time time) throws IOException {
        String str;
        if (time == null) {
            b63Var.m0();
            return;
        }
        synchronized (this) {
            str = this.a.format((Date) time);
        }
        b63Var.J0(str);
    }

    public w56() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }
}
