package com.zepto;

import java.io.Reader;
import javax.xml.parsers.DocumentBuilderFactory;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes3.dex */
public class eu1 implements mx4 {
    public final DocumentBuilderFactory a;

    public eu1() {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        this.a = documentBuilderFactoryNewInstance;
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
    }

    @Override // com.zepto.mx4
    public c52 a(Reader reader) {
        return b(new InputSource(reader));
    }

    public final c52 b(InputSource inputSource) {
        return new fu1(this.a.newDocumentBuilder().parse(inputSource));
    }
}
