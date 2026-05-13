package com.zepto;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: loaded from: classes.dex */
public final class p53 {
    public static f53 b(s53 s53Var) {
        boolean zE0 = s53Var.e0();
        s53Var.L0(true);
        try {
            try {
                return v76.a(s53Var);
            } catch (OutOfMemoryError e) {
                throw new o53("Failed parsing JSON source: " + s53Var + " to Json", e);
            } catch (StackOverflowError e2) {
                throw new o53("Failed parsing JSON source: " + s53Var + " to Json", e2);
            }
        } finally {
            s53Var.L0(zE0);
        }
    }

    public static f53 c(Reader reader) {
        try {
            s53 s53Var = new s53(reader);
            f53 f53VarB = b(s53Var);
            if (!f53VarB.w() && s53Var.G0() != v53.END_DOCUMENT) {
                throw new u53("Did not consume the entire document.");
            }
            return f53VarB;
        } catch (gp3 e) {
            throw new u53(e);
        } catch (IOException e2) {
            throw new i53(e2);
        } catch (NumberFormatException e3) {
            throw new u53(e3);
        }
    }

    public static f53 d(String str) {
        return c(new StringReader(str));
    }

    public f53 a(String str) {
        return d(str);
    }
}
