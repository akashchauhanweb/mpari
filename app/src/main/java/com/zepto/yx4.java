package com.zepto;

import java.io.Reader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
public class yx4 implements mx4 {
    public final XmlPullParserFactory a;

    public yx4() throws XmlPullParserException {
        XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
        this.a = xmlPullParserFactoryNewInstance;
        xmlPullParserFactoryNewInstance.setNamespaceAware(true);
    }

    @Override // com.zepto.mx4
    public c52 a(Reader reader) throws XmlPullParserException {
        XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
        if (reader != null) {
            xmlPullParserNewPullParser.setInput(reader);
        }
        return new zx4(xmlPullParserNewPullParser);
    }
}
