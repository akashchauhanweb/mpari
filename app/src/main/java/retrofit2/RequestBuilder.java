package retrofit2;

import com.zepto.bf2;
import com.zepto.ds2;
import com.zepto.jy3;
import com.zepto.kc5;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.pl2;
import com.zepto.u70;
import com.zepto.xr2;
import com.zepto.z70;
import java.io.EOFException;
import java.io.IOException;
import java.util.regex.Pattern;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
final class RequestBuilder {
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private final ds2 baseUrl;
    private lc5 body;
    private ls3 contentType;
    private bf2.a formBuilder;
    private final boolean hasBody;
    private final pl2.a headersBuilder;
    private final String method;
    private jy3.a multipartBuilder;
    private String relativeUrl;
    private final kc5.a requestBuilder = new kc5.a();
    private ds2.a urlBuilder;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    public static class ContentTypeOverridingRequestBody extends lc5 {
        private final ls3 contentType;
        private final lc5 delegate;

        public ContentTypeOverridingRequestBody(lc5 lc5Var, ls3 ls3Var) {
            this.delegate = lc5Var;
            this.contentType = ls3Var;
        }

        @Override // com.zepto.lc5
        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        @Override // com.zepto.lc5
        public ls3 contentType() {
            return this.contentType;
        }

        @Override // com.zepto.lc5
        public void writeTo(z70 z70Var) throws IOException {
            this.delegate.writeTo(z70Var);
        }
    }

    public RequestBuilder(String str, ds2 ds2Var, String str2, pl2 pl2Var, ls3 ls3Var, boolean z, boolean z2, boolean z3) {
        this.method = str;
        this.baseUrl = ds2Var;
        this.relativeUrl = str2;
        this.contentType = ls3Var;
        this.hasBody = z;
        if (pl2Var != null) {
            this.headersBuilder = pl2Var.n();
        } else {
            this.headersBuilder = new pl2.a();
        }
        if (z2) {
            this.formBuilder = new bf2.a();
        } else if (z3) {
            jy3.a aVar = new jy3.a();
            this.multipartBuilder = aVar;
            aVar.d(jy3.j);
        }
    }

    private static String canonicalizeForPath(String str, boolean z) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                u70 u70Var = new u70();
                u70Var.a1(str, 0, iCharCount);
                canonicalizeForPath(u70Var, str, iCharCount, length, z);
                return u70Var.H0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    public void addFormField(String str, String str2, boolean z) {
        if (z) {
            this.formBuilder.b(str, str2);
        } else {
            this.formBuilder.a(str, str2);
        }
    }

    public void addHeader(String str, String str2) {
        if (!xr2.HEADER_CONTENT_TYPE.equalsIgnoreCase(str)) {
            this.headersBuilder.a(str, str2);
            return;
        }
        try {
            this.contentType = ls3.e(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e);
        }
    }

    public void addHeaders(pl2 pl2Var) {
        this.headersBuilder.b(pl2Var);
    }

    public void addPart(pl2 pl2Var, lc5 lc5Var) {
        this.multipartBuilder.a(pl2Var, lc5Var);
    }

    public void addPathParam(String str, String str2, boolean z) throws EOFException {
        if (this.relativeUrl == null) {
            throw new AssertionError();
        }
        String strCanonicalizeForPath = canonicalizeForPath(str2, z);
        String strReplace = this.relativeUrl.replace("{" + str + "}", strCanonicalizeForPath);
        if (!PATH_TRAVERSAL.matcher(strReplace).matches()) {
            this.relativeUrl = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    public void addQueryParam(String str, String str2, boolean z) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            ds2.a aVarL = this.baseUrl.l(str3);
            this.urlBuilder = aVarL;
            if (aVarL == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
            this.relativeUrl = null;
        }
        if (z) {
            this.urlBuilder.a(str, str2);
        } else {
            this.urlBuilder.b(str, str2);
        }
    }

    public <T> void addTag(Class<T> cls, T t) {
        this.requestBuilder.h(cls, t);
    }

    public kc5.a get() {
        ds2 ds2VarQ;
        ds2.a aVar = this.urlBuilder;
        if (aVar != null) {
            ds2VarQ = aVar.c();
        } else {
            ds2VarQ = this.baseUrl.q(this.relativeUrl);
            if (ds2VarQ == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        lc5 contentTypeOverridingRequestBody = this.body;
        if (contentTypeOverridingRequestBody == null) {
            bf2.a aVar2 = this.formBuilder;
            if (aVar2 != null) {
                contentTypeOverridingRequestBody = aVar2.c();
            } else {
                jy3.a aVar3 = this.multipartBuilder;
                if (aVar3 != null) {
                    contentTypeOverridingRequestBody = aVar3.c();
                } else if (this.hasBody) {
                    contentTypeOverridingRequestBody = lc5.create((ls3) null, new byte[0]);
                }
            }
        }
        ls3 ls3Var = this.contentType;
        if (ls3Var != null) {
            if (contentTypeOverridingRequestBody != null) {
                contentTypeOverridingRequestBody = new ContentTypeOverridingRequestBody(contentTypeOverridingRequestBody, ls3Var);
            } else {
                this.headersBuilder.a(xr2.HEADER_CONTENT_TYPE, ls3Var.toString());
            }
        }
        return this.requestBuilder.i(ds2VarQ).e(this.headersBuilder.e()).f(this.method, contentTypeOverridingRequestBody);
    }

    public void setBody(lc5 lc5Var) {
        this.body = lc5Var;
    }

    public void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    public void addPart(jy3.c cVar) {
        this.multipartBuilder.b(cVar);
    }

    private static void canonicalizeForPath(u70 u70Var, String str, int i, int i2, boolean z) throws EOFException {
        u70 u70Var2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt >= 32 && iCodePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(iCodePointAt) == -1 && (z || (iCodePointAt != 47 && iCodePointAt != 37))) {
                    u70Var.b1(iCodePointAt);
                } else {
                    if (u70Var2 == null) {
                        u70Var2 = new u70();
                    }
                    u70Var2.b1(iCodePointAt);
                    while (!u70Var2.I()) {
                        byte b = u70Var2.readByte();
                        int i3 = b & UByte.MAX_VALUE;
                        u70Var.J(37);
                        char[] cArr = HEX_DIGITS;
                        u70Var.J(cArr[(i3 >> 4) & 15]);
                        u70Var.J(cArr[b & 15]);
                    }
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }
}
