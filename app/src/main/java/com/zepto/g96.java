package com.zepto;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.io.ConstantsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class g96 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public Context c;
    public Object d;

    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class[] c = {MenuItem.class};
        public Object a;
        public Method b;

        public a(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.b.invoke(this.a, menuItem)).booleanValue();
                }
                this.b.invoke(this.a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public class b {
        public a6 A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;
        public Menu a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;

        public b(Menu menu) {
            this.a = menu;
            h();
        }

        public void a() {
            this.h = true;
            i(this.a.add(this.b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu subMenuAddSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.h;
        }

        public final Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g96.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g96.this.c.obtainStyledAttributes(attributeSet, c25.w1);
            this.b = typedArrayObtainStyledAttributes.getResourceId(c25.y1, 0);
            this.c = typedArrayObtainStyledAttributes.getInt(c25.A1, 0);
            this.d = typedArrayObtainStyledAttributes.getInt(c25.B1, 0);
            this.e = typedArrayObtainStyledAttributes.getInt(c25.C1, 0);
            this.f = typedArrayObtainStyledAttributes.getBoolean(c25.z1, true);
            this.g = typedArrayObtainStyledAttributes.getBoolean(c25.x1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            lg6 lg6VarU = lg6.u(g96.this.c, attributeSet, c25.D1);
            this.i = lg6VarU.n(c25.G1, 0);
            this.j = (lg6VarU.k(c25.J1, this.c) & (-65536)) | (lg6VarU.k(c25.K1, this.d) & 65535);
            this.k = lg6VarU.p(c25.L1);
            this.l = lg6VarU.p(c25.M1);
            this.m = lg6VarU.n(c25.E1, 0);
            this.n = c(lg6VarU.o(c25.N1));
            this.o = lg6VarU.k(c25.U1, ConstantsKt.DEFAULT_BLOCK_SIZE);
            this.p = c(lg6VarU.o(c25.O1));
            this.q = lg6VarU.k(c25.Y1, ConstantsKt.DEFAULT_BLOCK_SIZE);
            int i = c25.P1;
            if (lg6VarU.s(i)) {
                this.r = lg6VarU.a(i, false) ? 1 : 0;
            } else {
                this.r = this.e;
            }
            this.s = lg6VarU.a(c25.H1, false);
            this.t = lg6VarU.a(c25.I1, this.f);
            this.u = lg6VarU.a(c25.F1, this.g);
            this.v = lg6VarU.k(c25.Z1, -1);
            this.z = lg6VarU.o(c25.Q1);
            this.w = lg6VarU.n(c25.R1, 0);
            this.x = lg6VarU.o(c25.T1);
            String strO = lg6VarU.o(c25.S1);
            this.y = strO;
            boolean z = strO != null;
            if (z && this.w == 0 && this.x == null) {
                this.A = (a6) e(strO, g96.f, g96.this.b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = lg6VarU.p(c25.V1);
            this.C = lg6VarU.p(c25.a2);
            int i2 = c25.X1;
            if (lg6VarU.s(i2)) {
                this.E = zw1.d(lg6VarU.k(i2, -1), this.E);
            } else {
                this.E = null;
            }
            int i3 = c25.W1;
            if (lg6VarU.s(i3)) {
                this.D = lg6VarU.c(i3);
            } else {
                this.D = null;
            }
            lg6VarU.w();
            this.h = false;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.z != null) {
                if (g96.this.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g96.this.b(), this.z));
            }
            if (this.r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof ts3) {
                    ((ts3) menuItem).h(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g96.e, g96.this.a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            a6 a6Var = this.A;
            if (a6Var != null) {
                rs3.a(menuItem, a6Var);
            }
            rs3.c(menuItem, this.B);
            rs3.g(menuItem, this.C);
            rs3.b(menuItem, this.n, this.o);
            rs3.f(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                rs3.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                rs3.d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public g96(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.d == null) {
            this.d = a(this.c);
        }
        return this.d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        z2 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            a6 a6Var = bVar.A;
                            if (a6Var == null || !a6Var.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof f96)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.c.getResources().getLayout(i);
                    c(layout, Xml.asAttributeSet(layout), menu);
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
