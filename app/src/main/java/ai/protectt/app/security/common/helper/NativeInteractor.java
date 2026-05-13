package ai.protectt.app.security.common.helper;

import ai.protectt.app.security.main.scan.ScanUtils;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.Keep;
import com.zepto.h14;
import com.zepto.jt;
import com.zepto.mo5;
import com.zepto.nn3;
import com.zepto.s06;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0003\bË\u0001\bÆ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b¥\u0002\u0010¦\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082 J\u0013\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0082 J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0082 J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0082 J\t\u0010\n\u001a\u00020\u0004H\u0082 J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0082 ¢\u0006\u0004\b\u000e\u0010\rJ\t\u0010\u000f\u001a\u00020\u0004H\u0082 J\t\u0010\u0010\u001a\u00020\u0004H\u0082 J\t\u0010\u0011\u001a\u00020\u0004H\u0082 J\t\u0010\u0012\u001a\u00020\u0004H\u0082 J\t\u0010\u0013\u001a\u00020\u0004H\u0082 J\t\u0010\u0014\u001a\u00020\u0004H\u0082 J\t\u0010\u0015\u001a\u00020\u0004H\u0082 J\t\u0010\u0016\u001a\u00020\u0004H\u0082 J\t\u0010\u0017\u001a\u00020\u0004H\u0082 J\t\u0010\u0018\u001a\u00020\u0004H\u0082 J\t\u0010\u0019\u001a\u00020\u0004H\u0082 J\t\u0010\u001a\u001a\u00020\u0004H\u0082 J\t\u0010\u001b\u001a\u00020\u0004H\u0082 J\t\u0010\u001c\u001a\u00020\u0004H\u0082 J\u0019\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0082 J\t\u0010\"\u001a\u00020\u0004H\u0082 J\t\u0010#\u001a\u00020\u0004H\u0082 J\t\u0010$\u001a\u00020\u0004H\u0082 J\t\u0010%\u001a\u00020\u0004H\u0082 J\t\u0010&\u001a\u00020\u0004H\u0082 J\t\u0010'\u001a\u00020\u0004H\u0082 J\t\u0010(\u001a\u00020\u0004H\u0082 J\t\u0010)\u001a\u00020\u0004H\u0082 J\t\u0010*\u001a\u00020\u0004H\u0082 J\t\u0010+\u001a\u00020\u0004H\u0082 J\t\u0010,\u001a\u00020\u0004H\u0082 J\t\u0010-\u001a\u00020\u0004H\u0082 J\t\u0010.\u001a\u00020\u0004H\u0082 J\t\u0010/\u001a\u00020\u0004H\u0082 J\t\u00100\u001a\u00020\u0004H\u0082 J\t\u00101\u001a\u00020\u0004H\u0082 J\t\u00102\u001a\u00020\u0004H\u0082 J\t\u00103\u001a\u00020\u0004H\u0082 J\t\u00104\u001a\u00020\u0004H\u0082 J\t\u00105\u001a\u00020\u0004H\u0082 J\t\u00106\u001a\u00020\u0004H\u0082 J\t\u00107\u001a\u00020\u0004H\u0082 J\t\u00108\u001a\u00020\u0004H\u0082 J\t\u00109\u001a\u00020\u0004H\u0082 J\t\u0010:\u001a\u00020\u0004H\u0082 J\t\u0010;\u001a\u00020\u0004H\u0082 J\u0019\u0010=\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u0004H\u0082 J\u0019\u0010>\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u0004H\u0082 J\u0019\u0010@\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u0004H\u0082 J\u0019\u0010A\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u0004H\u0082 J\u0011\u0010B\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001dH\u0082 J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0082 ¢\u0006\u0004\bC\u0010\rJ\t\u0010D\u001a\u00020\u0004H\u0082 J\t\u0010E\u001a\u00020\u0004H\u0082 J\t\u0010F\u001a\u00020\u0004H\u0082 J\t\u0010G\u001a\u00020\u0004H\u0082 J\t\u0010H\u001a\u00020\u0004H\u0082 J\t\u0010I\u001a\u00020\u0004H\u0082 J\t\u0010K\u001a\u00020JH\u0082 J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0082 ¢\u0006\u0004\bL\u0010\rJ\t\u0010M\u001a\u00020\u0004H\u0082 J\t\u0010N\u001a\u00020\u0004H\u0082 J\t\u0010O\u001a\u00020\u0004H\u0082 J\t\u0010P\u001a\u00020\u0004H\u0082 J\t\u0010Q\u001a\u00020\u0004H\u0082 J\t\u0010R\u001a\u00020\u0004H\u0082 J\t\u0010S\u001a\u00020\u0004H\u0082 J\t\u0010T\u001a\u00020\u0004H\u0082 J\t\u0010U\u001a\u00020\u0004H\u0082 J\t\u0010V\u001a\u00020\u0004H\u0082 J\t\u0010W\u001a\u00020\u0004H\u0082 J\u0016\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0082 ¢\u0006\u0004\bX\u0010\rJ\t\u0010Y\u001a\u00020\u0004H\u0082 J\t\u0010Z\u001a\u00020\u0004H\u0082 J\t\u0010[\u001a\u00020\u0004H\u0082 J\t\u0010]\u001a\u00020\\H\u0082 J\t\u0010^\u001a\u00020\u0004H\u0082 J\t\u0010_\u001a\u00020\\H\u0082 J\t\u0010`\u001a\u00020\\H\u0082 J\u0011\u0010a\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0082 J\u0010\u0010c\u001a\u00020\u00042\u0006\u0010b\u001a\u00020\u0004H\u0002J\u0010\u0010d\u001a\u00020\u00042\u0006\u0010b\u001a\u00020\u0004H\u0002J\u0011\u0010f\u001a\u00020\u00022\u0006\u0010e\u001a\u00020JH\u0082 J\u0011\u0010h\u001a\u00020\u00042\u0006\u0010g\u001a\u00020\u0004H\u0082 J\t\u0010i\u001a\u00020\u0004H\u0082 J\t\u0010j\u001a\u00020\u0004H\u0082 J\t\u0010k\u001a\u00020\\H\u0082 J\t\u0010l\u001a\u00020\u0004H\u0082 J&\u0010o\u001a\u00020\u00042\u0006\u0010m\u001a\u00020\u00042\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0082 ¢\u0006\u0004\bo\u0010pJ\u0011\u0010r\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u0004H\u0082 J\t\u0010s\u001a\u00020\\H\u0082 J\t\u0010t\u001a\u00020\u0004H\u0082 J\t\u0010u\u001a\u00020\u0004H\u0082 J\t\u0010v\u001a\u00020\u0004H\u0082 J!\u0010x\u001a\u00020J2\u0006\u0010w\u001a\u00020\\2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010b\u001a\u00020\\H\u0082 J\t\u0010y\u001a\u00020\u0004H\u0082 J\t\u0010z\u001a\u00020\u0004H\u0082 J\t\u0010{\u001a\u00020\u0004H\u0082 J\t\u0010|\u001a\u00020\u0004H\u0082 J\t\u0010}\u001a\u00020\u0004H\u0082 J\t\u0010~\u001a\u00020\u0004H\u0082 J\t\u0010\u007f\u001a\u00020\u0004H\u0082 J\n\u0010\u0080\u0001\u001a\u00020\u0004H\u0082 J\n\u0010\u0081\u0001\u001a\u00020\u0004H\u0082 J\n\u0010\u0082\u0001\u001a\u00020\u0004H\u0082 J\n\u0010\u0083\u0001\u001a\u00020\u0004H\u0082 J\u0007\u0010\u0084\u0001\u001a\u00020\u0004J\u000f\u0010\u0085\u0001\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0004J\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0004J\u0011\u0010\u0087\u0001\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0004J\u0011\u0010\u0089\u0001\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0007\u0010\u008a\u0001\u001a\u00020\u0004J\u0015\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0005\b\u008b\u0001\u0010\rJ\u0015\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0005\b\u008c\u0001\u0010\rJ\u0007\u0010\u008d\u0001\u001a\u00020\u0004J\u0007\u0010\u008e\u0001\u001a\u00020\u0004J\u0007\u0010\u008f\u0001\u001a\u00020\u0004J\u0007\u0010\u0090\u0001\u001a\u00020\u0004J\u0007\u0010\u0091\u0001\u001a\u00020\u0004J\u0007\u0010\u0092\u0001\u001a\u00020\u0004J\u0007\u0010\u0093\u0001\u001a\u00020\u0004J\u0007\u0010\u0094\u0001\u001a\u00020\u0004J\u0007\u0010\u0095\u0001\u001a\u00020\u0004J\u0007\u0010\u0096\u0001\u001a\u00020\u0004J\u0007\u0010\u0097\u0001\u001a\u00020\u0004J\u0007\u0010\u0098\u0001\u001a\u00020\u0004J\u0007\u0010\u0099\u0001\u001a\u00020\u0004J\u0007\u0010\u009a\u0001\u001a\u00020\u0004J\u0017\u0010\u009b\u0001\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fJ\u0007\u0010\u009c\u0001\u001a\u00020\u0004J\u0007\u0010\u009d\u0001\u001a\u00020\u0004J\u0007\u0010\u009e\u0001\u001a\u00020\u0004J\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0007\u0010 \u0001\u001a\u00020\u0004J\u0007\u0010¡\u0001\u001a\u00020\u0004J\u0007\u0010¢\u0001\u001a\u00020\u0004J\u0007\u0010£\u0001\u001a\u00020\u0004J\u0007\u0010¤\u0001\u001a\u00020\u0004J\u0007\u0010¥\u0001\u001a\u00020\u0004J\u0007\u0010¦\u0001\u001a\u00020\u0004J\u0007\u0010§\u0001\u001a\u00020\u0004J\u0007\u0010¨\u0001\u001a\u00020\u0004J\u0007\u0010©\u0001\u001a\u00020\u0004J\u0007\u0010ª\u0001\u001a\u00020\u0004J\u0007\u0010«\u0001\u001a\u00020\u0004J\u0007\u0010¬\u0001\u001a\u00020\u0004J\u0007\u0010\u00ad\u0001\u001a\u00020\u0004J\u0007\u0010®\u0001\u001a\u00020\u0004J\u0007\u0010¯\u0001\u001a\u00020\u0004J\u0007\u0010°\u0001\u001a\u00020\u0004J\u0007\u0010±\u0001\u001a\u00020\u0004J\u0007\u0010²\u0001\u001a\u00020\u0004J\u0007\u0010³\u0001\u001a\u00020\u0004J\u0007\u0010´\u0001\u001a\u00020\u0004J\u0007\u0010µ\u0001\u001a\u00020\u0004J\u0017\u0010¶\u0001\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u0004J\u0017\u0010·\u0001\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u0004J\u0017\u0010¸\u0001\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u0004J\u0017\u0010¹\u0001\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u0004J\u000f\u0010º\u0001\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001dJ\u0015\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0005\b»\u0001\u0010\rJ\u0007\u0010¼\u0001\u001a\u00020\u0004J\u0007\u0010½\u0001\u001a\u00020\u0004J\u0007\u0010¾\u0001\u001a\u00020\u0004J\u0007\u0010¿\u0001\u001a\u00020\u0004J\u0007\u0010À\u0001\u001a\u00020\u0004J\u0007\u0010Á\u0001\u001a\u00020\u0004J\u0007\u0010Â\u0001\u001a\u00020JJ\u0015\u0010Ã\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0005\bÃ\u0001\u0010\rJ\u0007\u0010Ä\u0001\u001a\u00020\u0004J\u0007\u0010Å\u0001\u001a\u00020\u0004J\u0007\u0010Æ\u0001\u001a\u00020\u0004J\u0007\u0010Ç\u0001\u001a\u00020\u0004J\u0007\u0010È\u0001\u001a\u00020\u0004J\u0007\u0010É\u0001\u001a\u00020\u0004J\u0007\u0010Ê\u0001\u001a\u00020\u0004J\u0007\u0010Ë\u0001\u001a\u00020\u0004J\u0007\u0010Ì\u0001\u001a\u00020\u0004J\u0007\u0010Í\u0001\u001a\u00020\u0004J\u0007\u0010Î\u0001\u001a\u00020\u0004J\u0015\u0010Ï\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0005\bÏ\u0001\u0010\rJ\u0007\u0010Ð\u0001\u001a\u00020\u0004J\u0007\u0010Ñ\u0001\u001a\u00020\u0004J\u0007\u0010Ò\u0001\u001a\u00020\u0004J\u0007\u0010Ó\u0001\u001a\u00020\\J\u0007\u0010Ô\u0001\u001a\u00020\u0004J\u0007\u0010Õ\u0001\u001a\u00020\\J\u0007\u0010Ö\u0001\u001a\u00020\\J\u000f\u0010×\u0001\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dJ\u0019\u0010Ú\u0001\u001a\u00020\u00042\u0007\u0010Ø\u0001\u001a\u00020\u00042\u0007\u0010Ù\u0001\u001a\u00020\u0004J\u000f\u0010Û\u0001\u001a\u00020\u00022\u0006\u0010e\u001a\u00020JJ\u000f\u0010Ü\u0001\u001a\u00020\u00042\u0006\u0010b\u001a\u00020\u0004J\u0007\u0010Ý\u0001\u001a\u00020\u0004J\u0007\u0010Þ\u0001\u001a\u00020\u0004J\u0007\u0010ß\u0001\u001a\u00020\\J\u0007\u0010à\u0001\u001a\u00020\u0004J%\u0010á\u0001\u001a\u00020\u00042\u0006\u0010m\u001a\u00020\u00042\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0005\bá\u0001\u0010pJ\u000f\u0010â\u0001\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u0004J\u0007\u0010ã\u0001\u001a\u00020\\J\u0007\u0010ä\u0001\u001a\u00020\u0004J\u0007\u0010å\u0001\u001a\u00020\u0004J\t\u0010æ\u0001\u001a\u00020\u0002H\u0007J\t\u0010ç\u0001\u001a\u00020JH\u0007J\u0007\u0010è\u0001\u001a\u00020\u0004J\u001f\u0010é\u0001\u001a\u00020J2\u0006\u0010w\u001a\u00020\\2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010b\u001a\u00020\\J\u0007\u0010ê\u0001\u001a\u00020\u0004J\u0007\u0010ë\u0001\u001a\u00020\u0004J\u0007\u0010ì\u0001\u001a\u00020\u0004J\u0007\u0010í\u0001\u001a\u00020\u0004J\u0007\u0010î\u0001\u001a\u00020\u0004J\u0007\u0010ï\u0001\u001a\u00020\u0004J\u0007\u0010ð\u0001\u001a\u00020\u0004J\u0007\u0010ñ\u0001\u001a\u00020\u0004J\u0007\u0010ò\u0001\u001a\u00020\u0004J\u0007\u0010ó\u0001\u001a\u00020\u0004J\u0007\u0010ô\u0001\u001a\u00020\u0004R\u001f\u0010ø\u0001\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010õ\u0001\u001a\u0006\bö\u0001\u0010÷\u0001R\u0019\u0010ù\u0001\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010å\u0001R)\u0010ý\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010õ\u0001\u001a\u0006\bú\u0001\u0010÷\u0001\"\u0006\bû\u0001\u0010ü\u0001R)\u0010\u0080\u0002\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bº\u0001\u0010õ\u0001\u001a\u0006\bþ\u0001\u0010÷\u0001\"\u0006\bÿ\u0001\u0010ü\u0001R)\u0010\u0083\u0002\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bé\u0001\u0010õ\u0001\u001a\u0006\b\u0081\u0002\u0010÷\u0001\"\u0006\b\u0082\u0002\u0010ü\u0001R)\u0010\u0086\u0002\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010õ\u0001\u001a\u0006\b\u0084\u0002\u0010÷\u0001\"\u0006\b\u0085\u0002\u0010ü\u0001R)\u0010\u0089\u0002\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bá\u0001\u0010õ\u0001\u001a\u0006\b\u0087\u0002\u0010÷\u0001\"\u0006\b\u0088\u0002\u0010ü\u0001R)\u0010\u008c\u0002\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010õ\u0001\u001a\u0006\b\u008a\u0002\u0010÷\u0001\"\u0006\b\u008b\u0002\u0010ü\u0001R)\u0010\u008f\u0002\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010õ\u0001\u001a\u0006\b\u008d\u0002\u0010÷\u0001\"\u0006\b\u008e\u0002\u0010ü\u0001R)\u0010\u0092\u0002\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÏ\u0001\u0010õ\u0001\u001a\u0006\b\u0090\u0002\u0010÷\u0001\"\u0006\b\u0091\u0002\u0010ü\u0001R)\u0010\u0095\u0002\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÕ\u0001\u0010õ\u0001\u001a\u0006\b\u0093\u0002\u0010÷\u0001\"\u0006\b\u0094\u0002\u0010ü\u0001R)\u0010\u0098\u0002\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÜ\u0001\u0010õ\u0001\u001a\u0006\b\u0096\u0002\u0010÷\u0001\"\u0006\b\u0097\u0002\u0010ü\u0001R)\u0010\u009b\u0002\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¸\u0001\u0010õ\u0001\u001a\u0006\b\u0099\u0002\u0010÷\u0001\"\u0006\b\u009a\u0002\u0010ü\u0001R)\u0010 \u0002\u001a\u00020J8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010å\u0001\u001a\u0006\b\u009c\u0002\u0010\u009d\u0002\"\u0006\b\u009e\u0002\u0010\u009f\u0002R4\u0010¢\u0002\u001a\u00020\u00042\u0007\u0010¡\u0002\u001a\u00020\u00048Æ\u0001@Æ\u0001X\u0086\u000e¢\u0006\u0018\n\u0006\b¢\u0002\u0010õ\u0001\u001a\u0006\b£\u0002\u0010÷\u0001\"\u0006\b¤\u0002\u0010ü\u0001¨\u0006§\u0002"}, d2 = {"Lai/protectt/app/security/common/helper/NativeInteractor;", "", "", "p0", "", "AESKey", "encryptedAESKey", "setAESKeyToNdk", "getDOAES", "setDOAES", "getOE", "", "getSP", "()[Ljava/lang/String;", "getUAL", "getBSu", "getEmuUsb", "getBB", "getStr1", "getStr2", "getStr4", "getStr5", "getStr6", "getStr7", "getStr3", "getStr9", "getStr12", "getStr10", "getStr15", "Landroid/content/Context;", "context", "Landroid/app/Activity;", "activity", "getStr19", "getStr20", "getStr23", "getStr24", "getStr22", "getStr25", "getStr27", "getStr28", "getStr29", "getStr31", "getStr32", "getStr36", "getStr37", "getStr38", "getStr39", "getStr40", "getStr41", "getStr42", "getStr43", "getStr44", "getStr303", "getStr304", "getStr305", "getStr306", "getStr307", "getStr308", "getStr500", "msg", "getStr498", "doCL", "str", "str497", "toast496", "getAI007", "getARDBLA", "fK", "fIV", "getRSAPu", "getRSAPr", "cliid", "chnild", "", "iMP", "getM1Str", "getM2Str", "getM3Str", "getstrRSafe", "str1005", "str1006", "str1007", "serverLog", "str1004", "spath1", "spathEnd", "fileEnd", "getGKey", "getSSL", "str1003", "fopn", "", "jitCC", "LgRun", "RDG", "getPD", "AST", "input", "A1", "z1", "stage", "setAppS", "plainText", "str1002", "mBandhanPName", "str1001", "NAFTD", "getPath", "filePath", "pathArray", "nativeBin", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "key", "getSyNtv", "PED", "str1000", "strF1", "analyticsState", "avg", "getAvgDofinal", "libGeneral", "libAppPro", "KRD", "navigationPlayStoreUrl", "gwhitelistSOverlayActivity1", "gwhitelistSOverlayActivity2", "gpocketPname", "hashOne", "hashTwo", "hashThree", "FileVE", "U", "b", "q", "s0", "y", "u0", "q0", "x1", "d0", "i", "j", "g", "G0", "L0", "j1", "q1", "s1", "t1", "U0", "u1", "I0", "H0", "J0", "K0", "M0", "O0", "P0", "N0", "Q0", "R0", "S0", "T0", "b1", "c1", "d1", "e1", "f1", "i1", "k1", "l1", "m1", "n1", "o1", "V0", "W0", "X0", "Y0", "Z0", "a1", "r1", "p1", "c", "n", "o", "e", "d", "A", "z", "S", "T", "h1", "g1", "c0", "g0", "h0", "i0", "v1", "m0", "n0", "o0", "l0", "r0", "W", "X", "b0", "k", "w1", "B", "a0", "O", "M", "l", "j0", "t", "nonce", "fg", "G", "F0", "m", "R", "v", "r", "x", "h", "y1", "Q", "w", "Z", "setLoad", "getIslibLoadApp", "s", "f", "f0", "e0", "a", "P", "B1", "C1", "k0", "H", "J", "I", "p", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "libraryLoaded", "u", "t0", "(Ljava/lang/String;)V", "baseUrl", "C", "v0", "getGcmKey", "D", "w0", "getIvKey", "Y", "E0", "sslEndPoint", "F", "A0", "getpublickey", "getGetTrustpublickey", "z0", "getTrustpublickey", "E", "x0", "getNetworkAddress", "L", "C0", "integrityRsaKey", "K", "B0", "integrityAESKey", "getGetServerTrust", "y0", "getServerTrust", "V", "D0", "serverConfigKey", "N", "()Z", "setIslibLoad", "(Z)V", "islibLoad", "<set-?>", "sessionToken", "getSessionToken", "setSessionToken", "<init>", "()V", "app-security_release"}, k = 1, mv = {1, 6, 0})
public final class NativeInteractor {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean libraryLoaded;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public static boolean islibLoad;
    public static final NativeInteractor a = new NativeInteractor();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = "NativeInteractor";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static String baseUrl = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static String getGcmKey = "";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static String getIvKey = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static String sslEndPoint = "";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static String getpublickey = "";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static String getTrustpublickey = "";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static String getNetworkAddress = "";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static String integrityRsaKey = "";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static String integrityAESKey = "";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static String getServerTrust = "";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public static String serverConfigKey = "";

    static {
        try {
            System.loadLibrary("app-protectt-native-lib");
            System.loadLibrary("protectt-native-lib");
            libraryLoaded = true;
        } catch (UnsatisfiedLinkError e) {
            nn3 nn3Var = nn3.a;
            nn3.c(nn3Var, TAG, Intrinsics.stringPlus("==============>>", e), null, 4, null);
            nn3Var.h(jt.c.C());
        }
    }

    private final native String AESKey();

    private final native String AST(Context context);

    private final native String FileVE();

    private final native String KRD();

    private final native String LgRun();

    private final native int NAFTD();

    private final native int PED();

    private final native int RDG();

    private final native String analyticsState();

    private final native String chnild();

    private final native String cliid();

    private final native void doCL(Context context, String msg);

    private final native String fIV();

    private final native String fK();

    private final native String fileEnd();

    private final native String fopn();

    private final native Object getAI007(Context context);

    private final native String[] getARDBLA();

    private final native boolean getAvgDofinal(int avg, Context context, int input);

    private final native String getBB();

    private final native String getBSu();

    private final native String getDOAES();

    private final native String getEmuUsb();

    private final native String[] getGKey();

    private final native String[] getM1Str();

    private final native String getM2Str();

    private final native String getM3Str();

    private final native String getOE();

    private final native int getPD();

    private final native String getPath();

    private final native String getRSAPr();

    private final native String getRSAPu();

    private final native String[] getSP();

    private final native String getSSL();

    private final native String getStr1();

    private final native String getStr10();

    private final native String getStr12();

    private final native String getStr15();

    private final native String getStr19(Context context, Activity activity);

    private final native String getStr2();

    private final native String getStr20();

    private final native String getStr22();

    private final native String getStr23();

    private final native String getStr24();

    private final native String getStr25();

    private final native String getStr27();

    private final native String getStr28();

    private final native String getStr29();

    private final native String getStr3();

    private final native String getStr303();

    private final native String getStr304();

    private final native String getStr305();

    private final native String getStr306();

    private final native String getStr307();

    private final native String getStr308();

    private final native String getStr31();

    private final native String getStr32();

    private final native String getStr36();

    private final native String getStr37();

    private final native String getStr38();

    private final native String getStr39();

    private final native String getStr4();

    private final native String getStr40();

    private final native String getStr41();

    private final native String getStr42();

    private final native String getStr43();

    private final native String getStr44();

    private final native Object getStr498(Context context, String msg);

    private final native String getStr5();

    private final native String getStr500();

    private final native String getStr6();

    private final native String getStr7();

    private final native String getStr9();

    private final native String getSyNtv(String key);

    private final native String[] getUAL();

    private final native String getstrRSafe();

    private final native String gpocketPname();

    private final native String gwhitelistSOverlayActivity1();

    private final native String gwhitelistSOverlayActivity2();

    private final native String hashOne();

    private final native String hashThree();

    private final native String hashTwo();

    private final native boolean iMP();

    private final native int jitCC();

    private final native String libAppPro();

    private final native String libGeneral();

    private final native String mBandhanPName();

    private final native String nativeBin(String filePath, String[] pathArray);

    private final native String navigationPlayStoreUrl();

    private final native String serverLog();

    private final native void setAESKeyToNdk(String encryptedAESKey);

    private final native void setAppS(boolean stage);

    private final native void setDOAES(String encryptedAESKey);

    private final native String spath1();

    private final native String spathEnd();

    private final native String str1000();

    private final native String str1001();

    private final native String str1002(String plainText);

    private final native String str1003();

    private final native String str1004();

    private final native String str1005();

    private final native String str1006();

    private final native String str1007();

    private final native void str497(Context context, String str);

    private final native String strF1();

    private final native void toast496(Context context, String msg);

    public final String A() {
        try {
            try {
                return fK();
            } catch (UnsatisfiedLinkError e) {
                nn3 nn3Var = nn3.a;
                nn3Var.f(TAG, e.toString());
                nn3Var.h(jt.c.C());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return fK();
        }
    }

    public final void A0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        getpublickey = str;
    }

    public final String A1(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.insert(1, 't');
        sb.insert(3, 'r');
        sb.insert(5, 'u');
        sb.insert(7, 'e');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    public final String B() {
        try {
            try {
                return str1003();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "G";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return str1003();
        }
    }

    public final void B0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        integrityAESKey = str;
    }

    public final String B1() {
        try {
            try {
                return gwhitelistSOverlayActivity1();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return gwhitelistSOverlayActivity1();
        }
    }

    public final String C() {
        return getGcmKey;
    }

    public final void C0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        integrityRsaKey = str;
    }

    public final String C1() {
        try {
            try {
                return gwhitelistSOverlayActivity2();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return gwhitelistSOverlayActivity2();
        }
    }

    public final String D() {
        return getIvKey;
    }

    public final void D0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        serverConfigKey = str;
    }

    public final String E() {
        return getNetworkAddress;
    }

    public final void E0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        sslEndPoint = str;
    }

    public final String F() {
        return getpublickey;
    }

    public final void F0(boolean stage) {
        try {
            try {
                setAppS(stage);
            } catch (UnsatisfiedLinkError e) {
                nn3 nn3Var = nn3.a;
                nn3Var.f(TAG, e.toString());
                nn3Var.h(jt.c.C());
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            setAppS(stage);
        }
    }

    public final String G(String nonce, String fg) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(fg, "fg");
        if (Intrinsics.areEqual(fg, "true")) {
            String strA1 = A1(nonce);
            h14 h14VarB = h14.b.b();
            Intrinsics.checkNotNull(h14VarB);
            String strM = h14VarB.m(strA1);
            Intrinsics.checkNotNull(strM);
            String strSubstring = strM.substring(0, 10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
        String strZ1 = z1(nonce);
        h14 h14VarB2 = h14.b.b();
        Intrinsics.checkNotNull(h14VarB2);
        String strM2 = h14VarB2.m(strZ1);
        Intrinsics.checkNotNull(strM2);
        String strSubstring2 = strM2.substring(0, 10);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring2;
    }

    public final String G0() {
        try {
            try {
                return getStr1();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr1();
        }
    }

    public final String H() {
        try {
            try {
                return hashOne();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return hashOne();
        }
    }

    public final String H0() {
        try {
            try {
                return getStr10();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr10();
        }
    }

    public final String I() {
        try {
            try {
                return hashThree();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return hashThree();
        }
    }

    public final String I0() {
        try {
            try {
                return getStr12();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr12();
        }
    }

    public final String J() {
        try {
            try {
                return hashTwo();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return hashTwo();
        }
    }

    public final String J0() {
        try {
            try {
                return getStr15();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr15();
        }
    }

    public final String K() {
        return integrityAESKey;
    }

    public final String K0(Context context, Activity activity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            try {
                return getStr19(context, activity);
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr19(context, activity);
        }
    }

    public final String L() {
        return integrityRsaKey;
    }

    public final String L0() {
        try {
            try {
                return getStr2();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr2();
        }
    }

    public final String M() {
        try {
            try {
                return LgRun();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return LgRun();
        }
    }

    public final String M0() {
        try {
            try {
                return getStr20();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr20();
        }
    }

    public final boolean N() {
        return islibLoad;
    }

    public final String N0() {
        try {
            try {
                return getStr22();
            } catch (UnsatisfiedLinkError unused) {
                nn3.a.h(jt.c.C());
                return "";
            }
        } catch (UnsatisfiedLinkError unused2) {
            p0();
            return getStr22();
        }
    }

    public final int O() {
        try {
            try {
                return jitCC();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return 0;
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return jitCC();
        }
    }

    public final String O0() {
        try {
            try {
                return getStr23();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr23();
        }
    }

    public final String P() {
        try {
            try {
                return navigationPlayStoreUrl();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return navigationPlayStoreUrl();
        }
    }

    public final String P0() {
        try {
            try {
                return getStr24();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr24();
        }
    }

    public final int Q() {
        try {
            try {
                return PED();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return 0;
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return PED();
        }
    }

    public final String Q0() {
        try {
            try {
                return getStr25();
            } catch (UnsatisfiedLinkError unused) {
                nn3.a.h(jt.c.C());
                return "";
            }
        } catch (UnsatisfiedLinkError unused2) {
            p0();
            return getStr25();
        }
    }

    public final String R() {
        try {
            try {
                return mBandhanPName();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return mBandhanPName();
        }
    }

    public final String R0() {
        try {
            try {
                return getStr27();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr27();
        }
    }

    public final String S() {
        try {
            try {
                return getRSAPu();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getRSAPu();
        }
    }

    public final String S0() {
        try {
            try {
                return getStr28();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr28();
        }
    }

    public final String T() {
        try {
            try {
                return getRSAPr();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getRSAPr();
        }
    }

    public final String T0() {
        try {
            try {
                return getStr29();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr29();
        }
    }

    public final String U() {
        try {
            s06 s06VarA = s06.m.a();
            Intrinsics.checkNotNull(s06VarA);
            return s06VarA.s();
        } catch (Exception e) {
            nn3.c(nn3.a, TAG, e.toString(), null, 4, null);
            return "";
        }
    }

    public final String U0() {
        try {
            try {
                return getStr3();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr3();
        }
    }

    public final String V() {
        return serverConfigKey;
    }

    public final String V0() {
        try {
            try {
                return getStr303();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr303();
        }
    }

    public final String W() {
        try {
            try {
                return spath1();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return spath1();
        }
    }

    public final String W0() {
        try {
            try {
                return getStr304();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr304();
        }
    }

    public final String X() {
        try {
            try {
                return spathEnd();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return spathEnd();
        }
    }

    public final String X0() {
        try {
            try {
                return getStr305();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr305();
        }
    }

    public final String Y() {
        return sslEndPoint;
    }

    public final String Y0() {
        try {
            try {
                return getStr306();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr306();
        }
    }

    public final String Z() {
        try {
            try {
                return strF1();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return strF1();
        }
    }

    public final String Z0() {
        try {
            try {
                return getStr307();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr307();
        }
    }

    public final String a() {
        try {
            try {
                return KRD();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "LFO";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return KRD();
        }
    }

    public final String a0() {
        try {
            try {
                return fopn();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "G";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return fopn();
        }
    }

    public final String a1() {
        try {
            try {
                return getStr308();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr308();
        }
    }

    public final void b(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        mo5.a.n(false);
    }

    public final String b0() {
        try {
            try {
                return fileEnd();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return fileEnd();
        }
    }

    public final String b1() {
        try {
            try {
                return getStr31();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr31();
        }
    }

    public final void c(Context context, String msg) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(msg, "msg");
        try {
            try {
                doCL(context, msg);
            } catch (UnsatisfiedLinkError unused) {
                p0();
                doCL(context, msg);
            }
        } catch (UnsatisfiedLinkError e) {
            nn3.a.f(TAG, e.toString());
        }
    }

    public final boolean c0() {
        try {
            try {
                return iMP();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return false;
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return iMP();
        }
    }

    public final String c1() {
        try {
            try {
                return getStr32();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr32();
        }
    }

    public final String[] d() {
        try {
            try {
                return getARDBLA();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return new String[0];
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getARDBLA();
        }
    }

    public final String[] d0() {
        try {
            try {
                return getUAL();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return new String[0];
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getUAL();
        }
    }

    public final String d1() {
        try {
            try {
                return getStr36();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr36();
        }
    }

    public final Object e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            try {
                return getAI007(context);
            } catch (UnsatisfiedLinkError unused) {
                p0();
                return getAI007(context);
            }
        } catch (UnsatisfiedLinkError e) {
            nn3.a.f(TAG, e.toString());
            return "";
        }
    }

    public final String e0() {
        try {
            try {
                return libAppPro();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return libAppPro();
        }
    }

    public final String e1() {
        try {
            try {
                return getStr37();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr37();
        }
    }

    public final boolean f(int avg, Context context, int input) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            try {
                try {
                    return getAvgDofinal(avg, context, input);
                } catch (UnsatisfiedLinkError e) {
                    nn3.a.f(TAG, e.toString());
                    return getAvgDofinal(avg, context, input);
                }
            } catch (UnsatisfiedLinkError unused) {
                p0();
                return getAvgDofinal(avg, context, input);
            }
        } catch (UnsatisfiedLinkError e2) {
            nn3.a.f(TAG, e2.toString());
            return false;
        }
    }

    public final String f0() {
        try {
            try {
                return libGeneral();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return libGeneral();
        }
    }

    public final String f1() {
        try {
            try {
                return getStr38();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr38();
        }
    }

    public final String g() {
        try {
            try {
                return getBB();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getBB();
        }
    }

    public final String[] g0() {
        try {
            try {
                return getM1Str();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return new String[0];
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getM1Str();
        }
    }

    public final String g1() {
        try {
            try {
                return chnild();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return chnild();
        }
    }

    @Keep
    public final boolean getIslibLoadApp() {
        return islibLoad;
    }

    public final native String getSessionToken();

    public final String h(String filePath, String[] pathArray) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(pathArray, "pathArray");
        try {
            try {
                return nativeBin(filePath, pathArray);
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return nativeBin(filePath, pathArray);
        }
    }

    public final String h0() {
        try {
            try {
                return getM2Str();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getM2Str();
        }
    }

    public final String h1() {
        try {
            try {
                return cliid();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return cliid();
        }
    }

    public final String i() {
        try {
            try {
                return getBSu();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getBSu();
        }
    }

    public final String i0() {
        try {
            try {
                return getM3Str();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getM3Str();
        }
    }

    public final String i1() {
        try {
            try {
                return getStr39();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr39();
        }
    }

    public final String j() {
        try {
            try {
                return getEmuUsb();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getEmuUsb();
        }
    }

    public final int j0() {
        try {
            try {
                return getPD();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return 0;
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getPD();
        }
    }

    public final String j1() {
        try {
            try {
                return getStr4();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr4();
        }
    }

    public final String[] k() {
        try {
            try {
                return getGKey();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return new String[0];
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getGKey();
        }
    }

    public final String k0() {
        try {
            try {
                return gpocketPname();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return gpocketPname();
        }
    }

    public final String k1() {
        try {
            try {
                return getStr40();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr40();
        }
    }

    public final int l() {
        try {
            try {
                return RDG();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return 0;
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return RDG();
        }
    }

    public final String l0() {
        try {
            try {
                return serverLog();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return serverLog();
        }
    }

    public final String l1() {
        try {
            try {
                return getStr41();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr41();
        }
    }

    public final String m(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            try {
                return str1002(input);
            } catch (UnsatisfiedLinkError unused) {
                p0();
                return str1002(input);
            }
        } catch (UnsatisfiedLinkError e) {
            nn3.a.f(TAG, e.toString());
            return "";
        }
    }

    public final String m0() {
        try {
            try {
                return str1005();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return str1005();
        }
    }

    public final String m1() {
        try {
            try {
                return getStr42();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr42();
        }
    }

    public final void n(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "str");
        try {
            try {
                str497(context, str);
            } catch (UnsatisfiedLinkError unused) {
                p0();
                str497(context, str);
            }
        } catch (UnsatisfiedLinkError e) {
            nn3.a.f(TAG, e.toString());
        }
    }

    public final String n0() {
        try {
            try {
                return str1006();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return str1006();
        }
    }

    public final String n1() {
        try {
            try {
                return getStr43();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr43();
        }
    }

    public final void o(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "str");
        try {
            try {
                toast496(context, str);
            } catch (UnsatisfiedLinkError unused) {
                p0();
                toast496(context, str);
            }
        } catch (UnsatisfiedLinkError e) {
            nn3.a.f(TAG, e.toString());
        }
    }

    public final String o0() {
        try {
            try {
                return str1007();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return str1007();
        }
    }

    public final String o1() {
        try {
            try {
                return getStr44();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr44();
        }
    }

    public final String p() {
        try {
            try {
                return FileVE();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "FOD";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return FileVE();
        }
    }

    public final void p0() {
        try {
            System.loadLibrary("app-protectt-native-lib");
            System.loadLibrary("protectt-native-lib");
        } catch (UnsatisfiedLinkError e) {
            nn3 nn3Var = nn3.a;
            nn3Var.f(TAG, e.toString());
            nn3Var.h(jt.c.C());
        }
    }

    public final Object p1(Context context, String msg) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(msg, "msg");
        try {
            try {
                return getStr498(context, msg);
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr498(context, msg);
        }
    }

    public final String q() {
        try {
            try {
                return AESKey();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return null;
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return AESKey();
        }
    }

    public final String q0() {
        try {
            try {
                return getOE();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getOE();
        }
    }

    public final String q1() {
        try {
            try {
                return getStr5();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr5();
        }
    }

    public final int r() {
        try {
            try {
                return NAFTD();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return 0;
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return NAFTD();
        }
    }

    public final String r0() {
        try {
            try {
                return str1004();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return str1004();
        }
    }

    public final String r1() {
        try {
            try {
                return getStr500();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr500();
        }
    }

    public final String s() {
        try {
            try {
                return analyticsState();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "not found";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return analyticsState();
        }
    }

    public final void s0(String encryptedAESKey) {
        try {
            try {
                setAESKeyToNdk(encryptedAESKey);
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            setAESKeyToNdk(encryptedAESKey);
        }
    }

    public final String s1() {
        try {
            try {
                return getStr6();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr6();
        }
    }

    @Keep
    public final void setLoad() {
        islibLoad = true;
    }

    public final native void setSessionToken(String str);

    public final String t(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            try {
                return AST(context);
            } catch (UnsatisfiedLinkError unused) {
                p0();
                return AST(context);
            }
        } catch (UnsatisfiedLinkError e) {
            nn3.a.f(TAG, e.toString());
            return "";
        }
    }

    public final void t0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        baseUrl = str;
    }

    public final String t1() {
        try {
            try {
                return getStr7();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr7();
        }
    }

    public final String u() {
        return baseUrl;
    }

    public final void u0(String encryptedAESKey) {
        try {
            try {
                setDOAES(encryptedAESKey);
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            setDOAES(encryptedAESKey);
        }
    }

    public final String u1() {
        try {
            try {
                return getStr9();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getStr9();
        }
    }

    public final String v() {
        try {
            try {
                return str1001();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "Not-found";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return str1001();
        }
    }

    public final void v0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        getGcmKey = str;
    }

    public final String v1() {
        try {
            try {
                return getstrRSafe();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getstrRSafe();
        }
    }

    public final String w() {
        try {
            try {
                return str1000();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            ScanUtils.a.f1(false);
            p0();
            return str1000();
        }
    }

    public final void w0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        getIvKey = str;
    }

    public final String w1() {
        try {
            try {
                return getSSL();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getSSL();
        }
    }

    public final String x() {
        try {
            try {
                return getPath();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getPath();
        }
    }

    public final void x0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        getNetworkAddress = str;
    }

    public final String[] x1() {
        try {
            try {
                return getSP();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return new String[0];
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getSP();
        }
    }

    public final String y() {
        try {
            try {
                return getDOAES();
            } catch (UnsatisfiedLinkError e) {
                nn3.a.f(TAG, e.toString());
                return null;
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return getDOAES();
        }
    }

    public final void y0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        getServerTrust = str;
    }

    public final String y1(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            try {
                return getSyNtv(key);
            } catch (UnsatisfiedLinkError unused) {
                p0();
                return getSyNtv(key);
            }
        } catch (UnsatisfiedLinkError e) {
            nn3.a.f(TAG, e.toString());
            return "";
        }
    }

    public final String z() {
        try {
            try {
                return fIV();
            } catch (UnsatisfiedLinkError e) {
                nn3 nn3Var = nn3.a;
                nn3Var.f(TAG, e.toString());
                nn3Var.h(jt.c.C());
                return "";
            }
        } catch (UnsatisfiedLinkError unused) {
            p0();
            return fIV();
        }
    }

    public final void z0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        getTrustpublickey = str;
    }

    public final String z1(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.insert(1, 'f');
        sb.insert(3, 'a');
        sb.insert(5, 'l');
        sb.insert(7, 's');
        sb.insert(9, 'e');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
