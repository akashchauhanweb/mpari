package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.zepto.u15;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public boolean a;
    public String b;
    public EnumC0006b c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0006b.values().length];
            a = iArr;
            try {
                iArr[EnumC0006b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0006b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC0006b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC0006b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC0006b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[EnumC0006b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[EnumC0006b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[EnumC0006b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    public enum EnumC0006b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public b(String str, EnumC0006b enumC0006b, Object obj, boolean z) {
        this.b = str;
        this.c = enumC0006b;
        this.a = z;
        d(obj);
    }

    public static HashMap a(HashMap map, View view) {
        HashMap map2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            b bVar = (b) map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return map2;
    }

    public static void b(Context context, XmlPullParser xmlPullParser, HashMap map) {
        EnumC0006b enumC0006b;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), u15.L4);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        EnumC0006b enumC0006b2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == u15.M4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == u15.W4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == u15.N4) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0006b2 = EnumC0006b.BOOLEAN_TYPE;
            } else {
                if (index == u15.P4) {
                    enumC0006b = EnumC0006b.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == u15.O4) {
                    enumC0006b = EnumC0006b.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == u15.T4) {
                    enumC0006b = EnumC0006b.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == u15.Q4) {
                    enumC0006b = EnumC0006b.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == u15.R4) {
                    enumC0006b = EnumC0006b.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == u15.S4) {
                    enumC0006b = EnumC0006b.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == u15.V4) {
                    enumC0006b = EnumC0006b.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == u15.U4) {
                    enumC0006b = EnumC0006b.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                enumC0006b2 = enumC0006b;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new b(string, enumC0006b2, objValueOf2, z));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void c(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            b bVar = (b) map.get(str);
            String str2 = bVar.a ? str : "set" + str;
            try {
                switch (a.a[bVar.c.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.d));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.g));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(view, bVar.f);
                        break;
                    case 4:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.d));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.e));
                        break;
                    case 8:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.e));
                        break;
                }
            } catch (IllegalAccessException e) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                Log.e("TransitionLayout", sb.toString());
            } catch (InvocationTargetException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e3.printStackTrace();
            }
        }
    }

    public void d(Object obj) {
        switch (a.a[this.c.ordinal()]) {
            case 1:
            case 6:
                this.d = ((Integer) obj).intValue();
                break;
            case 2:
                this.g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f = (String) obj;
                break;
            case 4:
            case 5:
                this.h = ((Integer) obj).intValue();
                break;
            case 7:
                this.e = ((Float) obj).floatValue();
                break;
            case 8:
                this.e = ((Float) obj).floatValue();
                break;
        }
    }

    public b(b bVar, Object obj) {
        this.a = false;
        this.b = bVar.b;
        this.c = bVar.c;
        d(obj);
    }
}
