package com.zepto;

import java.util.LinkedList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes3.dex */
public class u94 extends LinkedList {
    public u94(Document document) {
        r(document);
    }

    public final void r(Document document) {
        Element documentElement = document.getDocumentElement();
        if (documentElement != null) {
            offer(documentElement);
            u(documentElement);
        }
    }

    public final void u(Node node) {
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() != 8) {
                offer(nodeItem);
                u(nodeItem);
            }
        }
    }
}
