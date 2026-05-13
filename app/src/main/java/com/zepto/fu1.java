package com.zepto;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes3.dex */
public class fu1 implements c52 {
    public u94 a;
    public y94 b;
    public b52 c;

    public static class b extends k52 {
        public b() {
        }

        @Override // com.zepto.k52, com.zepto.b52
        public boolean W() {
            return true;
        }
    }

    public static class c extends p42 {
        public final Node a;

        public c(Node node) {
            this.a = node;
        }

        @Override // com.zepto.bz
        public Object a() {
            return this.a;
        }

        @Override // com.zepto.bz
        public String b() {
            return this.a.getNamespaceURI();
        }

        @Override // com.zepto.bz
        public boolean c() {
            String prefix = getPrefix();
            return prefix != null ? prefix.startsWith("xml") : getName().startsWith("xml");
        }

        @Override // com.zepto.bz
        public String getName() {
            return this.a.getLocalName();
        }

        @Override // com.zepto.bz
        public String getPrefix() {
            return this.a.getPrefix();
        }

        @Override // com.zepto.bz
        public String getValue() {
            return this.a.getNodeValue();
        }
    }

    public static class d extends s42 {
        public final Element c;

        public d(Node node) {
            this.c = (Element) node;
        }

        @Override // com.zepto.b52
        public String getName() {
            return this.c.getLocalName();
        }

        public NamedNodeMap r() {
            return this.c.getAttributes();
        }
    }

    public static class e extends k52 {
        public final Node c;

        public e(Node node) {
            this.c = node;
        }

        @Override // com.zepto.k52, com.zepto.b52
        public boolean g() {
            return true;
        }

        @Override // com.zepto.k52, com.zepto.b52
        public String getValue() {
            return this.c.getNodeValue();
        }
    }

    public fu1(Document document) {
        this.a = new u94(document);
        y94 y94Var = new y94();
        this.b = y94Var;
        y94Var.r(document);
    }

    public final c a(Node node) {
        return new c(node);
    }

    public final d b(d dVar) {
        NamedNodeMap namedNodeMapR = dVar.r();
        int length = namedNodeMapR.getLength();
        for (int i = 0; i < length; i++) {
            c cVarA = a(namedNodeMapR.item(i));
            if (!cVarA.c()) {
                dVar.add(cVarA);
            }
        }
        return dVar;
    }

    public final b52 c(Node node) {
        if (node.getNodeType() != 1) {
            return h(node);
        }
        this.b.r(node);
        return g(node);
    }

    public final b d() {
        return new b();
    }

    public final b52 e() {
        Node node = (Node) this.a.peek();
        return node == null ? d() : f(node);
    }

    public final b52 f(Node node) {
        Node parentNode = node.getParentNode();
        Node node2 = (Node) this.b.u();
        if (parentNode == node2) {
            this.a.poll();
            return c(node);
        }
        if (node2 != null) {
            this.b.pop();
        }
        return d();
    }

    public final d g(Node node) {
        d dVar = new d(node);
        return dVar.isEmpty() ? b(dVar) : dVar;
    }

    public final e h(Node node) {
        return new e(node);
    }

    @Override // com.zepto.c52
    public b52 next() {
        b52 b52Var = this.c;
        if (b52Var == null) {
            return e();
        }
        this.c = null;
        return b52Var;
    }

    @Override // com.zepto.c52
    public b52 peek() {
        if (this.c == null) {
            this.c = next();
        }
        return this.c;
    }
}
