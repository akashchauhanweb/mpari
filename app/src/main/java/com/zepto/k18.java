package com.zepto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class k18 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String date) {
            Intrinsics.checkNotNullParameter(date, "date");
            try {
                String str = new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("dd-MMM-yyyy").parse(date));
                Intrinsics.checkNotNull(str);
                return str;
            } catch (Exception e) {
                e.printStackTrace();
                return date;
            }
        }

        public final String b(String date) {
            Intrinsics.checkNotNullParameter(date, "date");
            try {
                Locale locale = Locale.ENGLISH;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", locale);
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", locale);
                Date date2 = simpleDateFormat.parse(date);
                Intrinsics.checkNotNull(date2);
                String str = simpleDateFormat2.format(date2);
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            } catch (ParseException e) {
                e.printStackTrace();
                return c(date);
            }
        }

        public final String c(String date) {
            Intrinsics.checkNotNullParameter(date, "date");
            try {
                String str = new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("MMM dd, yyyy").parse(date));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            } catch (ParseException e) {
                e.printStackTrace();
                return date;
            }
        }

        public final boolean d(String str) {
            try {
                return new SimpleDateFormat("yyyy-MM-dd").parse(str).after(new Date());
            } catch (ParseException e) {
                e.printStackTrace();
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }

        public final boolean e(String str) {
            try {
                return new SimpleDateFormat("yyyy-MM-dd").parse(str).before(new Date());
            } catch (ParseException e) {
                e.printStackTrace();
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }

        public final String f(String date) {
            Intrinsics.checkNotNullParameter(date, "date");
            try {
                try {
                    String str = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH).format(OffsetDateTime.parse(date));
                    Intrinsics.checkNotNull(str);
                    return str;
                } catch (ParseException e) {
                    e.printStackTrace();
                    return i(date);
                }
            } catch (Exception unused) {
                return i(date);
            }
        }

        public final String g(String date) {
            Intrinsics.checkNotNullParameter(date, "date");
            try {
                String str = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH).format(OffsetDateTime.parse(date));
                Intrinsics.checkNotNull(str);
                return str;
            } catch (Exception e) {
                e.printStackTrace();
                return date;
            }
        }

        public final String h(String date) {
            Intrinsics.checkNotNullParameter(date, "date");
            try {
                String str = new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("dd-MM-yyyy").parse(date));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            } catch (ParseException e) {
                e.printStackTrace();
                return date;
            }
        }

        public final String i(String date) {
            Intrinsics.checkNotNullParameter(date, "date");
            try {
                String str = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(date));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            } catch (ParseException e) {
                e.printStackTrace();
                return date;
            }
        }

        public final String j(String str, String str2) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                Date date = simpleDateFormat.parse(str);
                Date date2 = simpleDateFormat.parse(str2);
                if (date.compareTo(date2) >= 0 && date.compareTo(date2) > 0) {
                    return String.valueOf(str2);
                }
                return String.valueOf(str);
            } catch (ParseException e) {
                e.printStackTrace();
                return String.valueOf(str);
            } catch (Exception e2) {
                e2.printStackTrace();
                return String.valueOf(str);
            }
        }
    }
}
