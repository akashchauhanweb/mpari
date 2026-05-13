package org.xmlpull.mxp1;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class MXParserNonValidating extends MXParserCachingStrings {
    private boolean processDocDecl;

    @Override // org.xmlpull.mxp1.MXParserCachingStrings, org.xmlpull.mxp1.MXParser, org.xmlpull.v1.XmlPullParser
    public boolean getFeature(String str) {
        return XmlPullParser.FEATURE_PROCESS_DOCDECL.equals(str) ? this.processDocDecl : super.getFeature(str);
    }

    @Override // org.xmlpull.mxp1.MXParser
    public char[] lookuEntityReplacement(int i) throws XmlPullParserException, IOException {
        if (this.allStringsInterned) {
            char[] cArr = this.buf;
            int i2 = this.posStart;
            this.entityRefName = newString(cArr, i2, this.posEnd - i2);
            for (int i3 = this.entityEnd - 1; i3 >= 0; i3--) {
                if (this.entityRefName == this.entityName[i3]) {
                    if (this.tokenize) {
                        this.text = this.entityReplacement[i3];
                    }
                    return this.entityReplacementBuf[i3];
                }
            }
            return null;
        }
        char[] cArr2 = this.buf;
        int i4 = this.posStart;
        int iFastHash = MXParser.fastHash(cArr2, i4, this.posEnd - i4);
        for (int i5 = this.entityEnd - 1; i5 >= 0; i5--) {
            if (iFastHash == this.entityNameHash[i5]) {
                char[] cArr3 = this.entityNameBuf[i5];
                if (i == cArr3.length) {
                    for (int i6 = 0; i6 < i; i6++) {
                        if (this.buf[this.posStart + i6] != cArr3[i6]) {
                            break;
                        }
                    }
                    if (this.tokenize) {
                        this.text = this.entityReplacement[i5];
                    }
                    return this.entityReplacementBuf[i5];
                }
                continue;
            }
        }
        return null;
    }

    @Override // org.xmlpull.mxp1.MXParser
    public char more() throws XmlPullParserException, IOException {
        return super.more();
    }

    @Override // org.xmlpull.mxp1.MXParser
    public void parseDocdecl() throws XmlPullParserException, IOException {
        boolean z = this.tokenize;
        try {
            if (more() != 'O') {
                throw new XmlPullParserException("expected <!DOCTYPE", this, null);
            }
            if (more() != 'C') {
                throw new XmlPullParserException("expected <!DOCTYPE", this, null);
            }
            if (more() != 'T') {
                throw new XmlPullParserException("expected <!DOCTYPE", this, null);
            }
            if (more() != 'Y') {
                throw new XmlPullParserException("expected <!DOCTYPE", this, null);
            }
            if (more() != 'P') {
                throw new XmlPullParserException("expected <!DOCTYPE", this, null);
            }
            if (more() != 'E') {
                throw new XmlPullParserException("expected <!DOCTYPE", this, null);
            }
            this.posStart = this.pos;
            char cSkipS = skipS(readName(requireNextS()));
            if (cSkipS == 'S' || cSkipS == 'P') {
                cSkipS = skipS(processExternalId(cSkipS));
            }
            if (cSkipS == '[') {
                processInternalSubset();
            }
            char cSkipS2 = skipS(cSkipS);
            if (cSkipS2 == '>') {
                this.posEnd = this.pos - 1;
                this.tokenize = z;
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("expected > to finish <[DOCTYPE but got ");
                stringBuffer.append(printable(cSkipS2));
                throw new XmlPullParserException(stringBuffer.toString(), this, null);
            }
        } catch (Throwable th) {
            this.tokenize = z;
            throw th;
        }
    }

    public void processAttlistDecl(char c) throws XmlPullParserException, IOException {
    }

    public void processElementDecl(char c) throws XmlPullParserException, IOException {
        readName(requireNextS());
        requireNextS();
    }

    public void processEntityDecl(char c) throws XmlPullParserException, IOException {
    }

    public char processExternalId(char c) throws XmlPullParserException, IOException {
        return c;
    }

    public void processInternalSubset() throws XmlPullParserException, IOException {
        while (true) {
            char cMore = more();
            if (cMore == ']') {
                return;
            }
            if (cMore == '%') {
                processPEReference();
            } else if (isS(cMore)) {
                skipS(cMore);
            } else {
                processMarkupDecl(cMore);
            }
        }
    }

    public void processMarkupDecl(char c) throws XmlPullParserException, IOException {
        if (c != '<') {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("expected < for markupdecl in DTD not ");
            stringBuffer.append(printable(c));
            throw new XmlPullParserException(stringBuffer.toString(), this, null);
        }
        char cMore = more();
        if (cMore == '?') {
            parsePI();
            return;
        }
        if (cMore != '!') {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("expected markupdecl in DTD not ");
            stringBuffer2.append(printable(cMore));
            throw new XmlPullParserException(stringBuffer2.toString(), this, null);
        }
        if (more() == '-') {
            parseComment();
            return;
        }
        char cMore2 = more();
        if (cMore2 == 'A') {
            processAttlistDecl(cMore2);
            return;
        }
        if (cMore2 != 'E') {
            if (cMore2 == 'N') {
                processNotationDecl(cMore2);
                return;
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("expected markupdecl after <! in DTD not ");
            stringBuffer3.append(printable(cMore2));
            throw new XmlPullParserException(stringBuffer3.toString(), this, null);
        }
        char cMore3 = more();
        if (cMore3 == 'L') {
            processElementDecl(cMore3);
        } else {
            if (cMore3 == 'N') {
                processEntityDecl(cMore3);
                return;
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("expected ELEMENT or ENTITY after <! in DTD not ");
            stringBuffer4.append(printable(cMore3));
            throw new XmlPullParserException(stringBuffer4.toString(), this, null);
        }
    }

    public void processNotationDecl(char c) throws XmlPullParserException, IOException {
    }

    public void processPEReference() throws XmlPullParserException, IOException {
    }

    public char readName(char c) throws XmlPullParserException, IOException {
        if (!isNameStartChar(c)) {
            while (isNameChar(c)) {
                c = more();
            }
            return c;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("XML name must start with name start character not ");
        stringBuffer.append(printable(c));
        throw new XmlPullParserException(stringBuffer.toString(), this, null);
    }

    @Override // org.xmlpull.mxp1.MXParserCachingStrings, org.xmlpull.mxp1.MXParser, org.xmlpull.v1.XmlPullParser
    public void setFeature(String str, boolean z) throws XmlPullParserException {
        if (!XmlPullParser.FEATURE_PROCESS_DOCDECL.equals(str)) {
            super.setFeature(str, z);
        } else {
            if (this.eventType != 0) {
                throw new XmlPullParserException("process DOCDECL feature can only be changed before parsing", this, null);
            }
            this.processDocDecl = z;
        }
    }
}
