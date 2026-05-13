package com.zepto;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public abstract class no6 {

    public class a extends no6 {
        public a() {
        }

        @Override // com.zepto.no6
        public Object read(s53 s53Var) throws IOException {
            if (s53Var.G0() != v53.NULL) {
                return no6.this.read(s53Var);
            }
            s53Var.C0();
            return null;
        }

        @Override // com.zepto.no6
        public void write(b63 b63Var, Object obj) throws IOException {
            if (obj == null) {
                b63Var.m0();
            } else {
                no6.this.write(b63Var, obj);
            }
        }
    }

    public final Object fromJson(Reader reader) throws IOException {
        return read(new s53(reader));
    }

    public final Object fromJsonTree(f53 f53Var) {
        try {
            return read(new w53(f53Var));
        } catch (IOException e) {
            throw new i53(e);
        }
    }

    public final no6 nullSafe() {
        return new a();
    }

    public abstract Object read(s53 s53Var);

    public final void toJson(Writer writer, Object obj) throws IOException {
        write(new b63(writer), obj);
    }

    public final f53 toJsonTree(Object obj) {
        try {
            x53 x53Var = new x53();
            write(x53Var, obj);
            return x53Var.M0();
        } catch (IOException e) {
            throw new i53(e);
        }
    }

    public abstract void write(b63 b63Var, Object obj);

    public final Object fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new i53(e);
        }
    }
}
