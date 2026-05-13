package com.zepto;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.zepto.gd1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class gd1 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final boolean h(String str, Enabledservice o) {
            Intrinsics.checkNotNullParameter(o, "o");
            return o.getServCode().equals(str);
        }

        public static final boolean j(ArrayList list, String str, int i) {
            Intrinsics.checkNotNullParameter(list, "$list");
            return StringsKt__StringsJVMKt.equals(((Enabledservice) list.get(i)).getServCode(), str, true);
        }

        public final String[] c(yf2 yf2Var) {
            String strD = new wa3(yf2Var).d();
            return StringsKt__StringsJVMKt.equals(strD, "english", true) ? new String[]{"Vehicle", "Driving Licence", "Insurance", "PUCC"} : StringsKt__StringsJVMKt.equals(strD, "gujarati", true) ? new String[]{"વાહન", "ડ્રાઇવિંગ લાયસન્સ", "વીમા", "પીયુસીસી"} : StringsKt__StringsJVMKt.equals(strD, "asamiya", true) ? new String[]{"বাহন", "ড্ৰাইভিং লাইচেন্স", "বীমা", "পিইউচিচি"} : StringsKt__StringsJVMKt.equals(strD, "bengali", true) ? new String[]{"যানবাহন", "চালনার অনুমতিপত্র", "বীমা", "পুক"} : StringsKt__StringsJVMKt.equals(strD, "hindi", true) ? new String[]{"वाहन", "ड्राइविंग लाइसेंस", "बीमा", "पीयूसीसी"} : StringsKt__StringsJVMKt.equals(strD, "tamil", true) ? new String[]{"வாகனம்", "ஓட்டுனர் உரிமம்", "காப்பீடு", "பியுசிசி"} : StringsKt__StringsJVMKt.equals(strD, "malayalam", true) ? new String[]{"വാഹനം", "ഡ്രൈവിംഗ് ലൈസൻസ്", "ഇൻഷുറൻസ്", "പി.യു.സി.സി"} : new String[]{"Vehicle", "Driving Licence", "Insurance", "PUCC"};
        }

        public final String d(Context context, String str, String str2) {
            Intrinsics.checkNotNullParameter(context, "context");
            wa3 wa3Var = new wa3(context);
            try {
                Date date = new Date();
                Date date2 = new SimpleDateFormat("dd-MMM-yyyy").parse(str);
                Intrinsics.checkNotNullExpressionValue(date2, "parse(...)");
                if (date2.before(date)) {
                    return str2 + wa3Var.b("expired_on", "Expired on ") + ' ' + str;
                }
                if (!date2.after(date)) {
                    return str2 + wa3Var.b("expired_on", " Expired on ") + ' ' + str;
                }
                if (k(str) > 30) {
                    return "";
                }
                return str2 + wa3Var.b("expiring_on_lbl", " Expiring on ") + ' ' + str;
            } catch (ParseException e) {
                e.printStackTrace();
                return str2 + wa3Var.b("expired_on", " Expired on ") + ' ' + str;
            } catch (Exception e2) {
                e2.printStackTrace();
                return str2 + wa3Var.b("expired_on", " Expired on ") + ' ' + str;
            }
        }

        public final boolean e(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                return Double.parseDouble(new ws6(context).c()) > 227.0d;
            } catch (NumberFormatException unused) {
                return false;
            }
        }

        public final boolean f(String str) {
            try {
                Date date = new Date();
                Date date2 = new SimpleDateFormat("dd-MMM-yyyy").parse(str);
                Intrinsics.checkNotNullExpressionValue(date2, "parse(...)");
                if (!date2.before(date) && date2.after(date)) {
                    return k(str) <= 30;
                }
                return true;
            } catch (ParseException e) {
                e.printStackTrace();
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }

        public final boolean g(ArrayList list, final String str) {
            Intrinsics.checkNotNullParameter(list, "list");
            return list.stream().filter(new Predicate() { // from class: com.zepto.fd1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return gd1.a.h(str, (Enabledservice) obj);
                }
            }).findFirst().isPresent();
        }

        public final int i(final ArrayList list, final String str) {
            Intrinsics.checkNotNullParameter(list, "list");
            return IntStream.range(0, list.size()).filter(new IntPredicate() { // from class: com.zepto.ed1
                @Override // java.util.function.IntPredicate
                public final boolean test(int i) {
                    return gd1.a.j(list, str, i);
                }
            }).findFirst().orElse(-1);
        }

        public final int k(String str) {
            try {
                Date date = new Date();
                long time = new SimpleDateFormat("dd-MMM-yyyy").parse(str).getTime();
                long time2 = date.getTime();
                return (int) ((time > time2 ? time - time2 : time2 - time) / ((long) 86400000));
            } catch (ParseException e) {
                e.printStackTrace();
                return 0;
            } catch (Exception e2) {
                e2.printStackTrace();
                return 0;
            }
        }

        public final void l(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                Object systemService = activity.getSystemService("input_method");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                View currentFocus = activity.getCurrentFocus();
                if (currentFocus == null) {
                    currentFocus = new View(activity);
                }
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            } catch (Exception unused) {
            }
        }

        public final boolean m(String str) {
            return StringsKt__StringsJVMKt.equals$default(str, null, false, 2, null) || StringsKt__StringsJVMKt.equals$default(str, "null", false, 2, null) || StringsKt__StringsJVMKt.equals(str, " ", true) || StringsKt__StringsJVMKt.equals$default(str, "", false, 2, null) || StringsKt__StringsJVMKt.equals(str, "NA", true) || str == null || str.length() == 0 || str == null || StringsKt__StringsJVMKt.isBlank(str) || StringsKt__StringsJVMKt.isBlank(str) || str.length() == 0 || !(StringsKt__StringsJVMKt.isBlank(str) ^ true) || str.length() <= 0;
        }

        public final boolean n(String str) {
            try {
                new SimpleDateFormat("dd-MMM-yyyy").parse(str);
                return true;
            } catch (ParseException e) {
                e.printStackTrace();
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }
}
