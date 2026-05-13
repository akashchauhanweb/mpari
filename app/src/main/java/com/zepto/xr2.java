package com.zepto;

import com.zepto.g90;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class xr2 {
    private static final String DEFAULT_CONTENT_CHARSET = "ISO-8859-1";
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    private static final String RFC1123_OUTPUT_FORMAT = "EEE, dd MMM yyyy HH:mm:ss 'GMT'";
    private static final String RFC1123_PARSE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss zzz";

    public static List<ml2> combineHeaders(List<ml2> list, g90.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<ml2> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().getName());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<ml2> list2 = aVar.allResponseHeaders;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (ml2 ml2Var : aVar.allResponseHeaders) {
                    if (!treeSet.contains(ml2Var.getName())) {
                        arrayList.add(ml2Var);
                    }
                }
            }
        } else if (!aVar.responseHeaders.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.responseHeaders.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new ml2(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    public static String formatEpochAsRfc1123(long j) {
        return newUsGmtFormatter(RFC1123_OUTPUT_FORMAT).format(new Date(j));
    }

    public static Map<String, String> getCacheHeaders(g90.a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        String str = aVar.etag;
        if (str != null) {
            map.put("If-None-Match", str);
        }
        long j = aVar.lastModified;
        if (j > 0) {
            map.put("If-Modified-Since", formatEpochAsRfc1123(j));
        }
        return map;
    }

    private static SimpleDateFormat newUsGmtFormatter(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static g90.a parseCacheHeaders(m44 m44Var) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = m44Var.headers;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long dateAsEpoch = str != null ? parseDateAsEpoch(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z = false;
            j = 0;
            j2 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = map.get("Expires");
        long dateAsEpoch2 = str3 != null ? parseDateAsEpoch(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long dateAsEpoch3 = str4 != null ? parseDateAsEpoch(str4) : 0L;
        String str5 = map.get("ETag");
        if (i != 0) {
            j4 = jCurrentTimeMillis + (j * 1000);
            j3 = z ? j4 : (j2 * 1000) + j4;
        } else {
            j3 = 0;
            if (dateAsEpoch <= 0 || dateAsEpoch2 < dateAsEpoch) {
                j4 = 0;
            } else {
                j4 = jCurrentTimeMillis + (dateAsEpoch2 - dateAsEpoch);
                j3 = j4;
            }
        }
        g90.a aVar = new g90.a();
        aVar.data = m44Var.data;
        aVar.etag = str5;
        aVar.softTtl = j4;
        aVar.ttl = j3;
        aVar.serverDate = dateAsEpoch;
        aVar.lastModified = dateAsEpoch3;
        aVar.responseHeaders = map;
        aVar.allResponseHeaders = m44Var.allHeaders;
        return aVar;
    }

    public static String parseCharset(Map<String, String> map, String str) {
        String str2;
        if (map != null && (str2 = map.get(HEADER_CONTENT_TYPE)) != null) {
            String[] strArrSplit = str2.split(";", 0);
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
        }
        return str;
    }

    public static long parseDateAsEpoch(String str) {
        try {
            return newUsGmtFormatter(RFC1123_PARSE_FORMAT).parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                cu7.v("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            cu7.e(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static List<ml2> toAllHeaderList(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new ml2(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public static Map<String, String> toHeaderMap(List<ml2> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (ml2 ml2Var : list) {
            treeMap.put(ml2Var.getName(), ml2Var.getValue());
        }
        return treeMap;
    }

    public static String parseCharset(Map<String, String> map) {
        return parseCharset(map, DEFAULT_CONTENT_CHARSET);
    }
}
