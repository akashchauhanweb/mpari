package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt___URangesKt;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0010J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013J\u001b\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u0010J\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0013J\u001b\u0010&\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0016\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u0010J\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u0013J\u001b\u00102\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001fJ\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u0018J\u001b\u00107\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001b\u00107\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010\u0013J\u001b\u00107\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010\u001fJ\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010\u000bJ\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u0010J\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u0013J\u001b\u0010?\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u0018J\u001b\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010GJ\u001b\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bK\u0010\u0010J\u001b\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u0013J\u001b\u0010J\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bM\u0010\u001fJ\u001b\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u0018J\u001b\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bP\u0010\u0010J\u001b\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0013J\u001b\u0010O\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bR\u0010\u001fJ\u001b\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bS\u0010\u0018J\u0010\u0010T\u001a\u00020UH\u0087\b¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020YH\u0087\b¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\rH\u0087\b¢\u0006\u0004\ba\u0010-J\u0010\u0010b\u001a\u00020cH\u0087\b¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bg\u0010\u0005J\u000f\u0010h\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u0016\u0010l\u001a\u00020\u000eH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bm\u0010WJ\u0016\u0010n\u001a\u00020\u0011H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010-J\u0016\u0010p\u001a\u00020\u0014H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010eJ\u0016\u0010r\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bs\u0010\u0005J\u001b\u0010t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bu\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006w"}, d2 = {"Lkotlin/UShort;", "", "data", "", "constructor-impl", "(S)S", "getData$annotations", "()V", "and", "other", "and-xj2QHRw", "(SS)S", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "compareTo-xj2QHRw", "(SS)I", "dec", "dec-Mh2AYeg", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(SJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(S)I", "inc", "inc-Mh2AYeg", "inv", "inv-Mh2AYeg", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(SB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "or", "or-xj2QHRw", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-xj2QHRw", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(S)B", "toDouble", "", "toDouble-impl", "(S)D", "toFloat", "", "toFloat-impl", "(S)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toShort", "toShort-impl", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-xj2QHRw", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class UShort implements Comparable<UShort> {
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UShort(short s) {
        this.data = s;
    }

    @InlineOnly
    /* JADX INFO: renamed from: and-xj2QHRw, reason: not valid java name */
    private static final short m280andxj2QHRw(short s, short s2) {
        return m287constructorimpl((short) (s & s2));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShort m281boximpl(short s) {
        return new UShort(s);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m282compareTo7apg3OU(short s, byte b) {
        return Intrinsics.compare(s & MAX_VALUE, b & UByte.MAX_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m283compareToVKZWuLQ(short s, long j) {
        return Long.compareUnsigned(ULong.m180constructorimpl(((long) s) & 65535), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m284compareToWZ4Q5Ns(short s, int i) {
        return Integer.compareUnsigned(UInt.m101constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private int m285compareToxj2QHRw(short s) {
        return Intrinsics.compare(getData() & MAX_VALUE, s & MAX_VALUE);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m287constructorimpl(short s) {
        return s;
    }

    @InlineOnly
    /* JADX INFO: renamed from: dec-Mh2AYeg, reason: not valid java name */
    private static final short m288decMh2AYeg(short s) {
        return m287constructorimpl((short) (s - 1));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m289div7apg3OU(short s, byte b) {
        return Integer.divideUnsigned(UInt.m101constructorimpl(s & MAX_VALUE), UInt.m101constructorimpl(b & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m290divVKZWuLQ(short s, long j) {
        return Long.divideUnsigned(ULong.m180constructorimpl(((long) s) & 65535), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m291divWZ4Q5Ns(short s, int i) {
        return Integer.divideUnsigned(UInt.m101constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m292divxj2QHRw(short s, short s2) {
        return Integer.divideUnsigned(UInt.m101constructorimpl(s & MAX_VALUE), UInt.m101constructorimpl(s2 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m293equalsimpl(short s, Object obj) {
        return (obj instanceof UShort) && s == ((UShort) obj).getData();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m294equalsimpl0(short s, short s2) {
        return s == s2;
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m295floorDiv7apg3OU(short s, byte b) {
        return Integer.divideUnsigned(UInt.m101constructorimpl(s & MAX_VALUE), UInt.m101constructorimpl(b & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m296floorDivVKZWuLQ(short s, long j) {
        return Long.divideUnsigned(ULong.m180constructorimpl(((long) s) & 65535), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m297floorDivWZ4Q5Ns(short s, int i) {
        return Integer.divideUnsigned(UInt.m101constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m298floorDivxj2QHRw(short s, short s2) {
        return Integer.divideUnsigned(UInt.m101constructorimpl(s & MAX_VALUE), UInt.m101constructorimpl(s2 & MAX_VALUE));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m299hashCodeimpl(short s) {
        return Short.hashCode(s);
    }

    @InlineOnly
    /* JADX INFO: renamed from: inc-Mh2AYeg, reason: not valid java name */
    private static final short m300incMh2AYeg(short s) {
        return m287constructorimpl((short) (s + 1));
    }

    @InlineOnly
    /* JADX INFO: renamed from: inv-Mh2AYeg, reason: not valid java name */
    private static final short m301invMh2AYeg(short s) {
        return m287constructorimpl((short) (~s));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m302minus7apg3OU(short s, byte b) {
        return UInt.m101constructorimpl(UInt.m101constructorimpl(s & MAX_VALUE) - UInt.m101constructorimpl(b & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m303minusVKZWuLQ(short s, long j) {
        return ULong.m180constructorimpl(ULong.m180constructorimpl(((long) s) & 65535) - j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m304minusWZ4Q5Ns(short s, int i) {
        return UInt.m101constructorimpl(UInt.m101constructorimpl(s & MAX_VALUE) - i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m305minusxj2QHRw(short s, short s2) {
        return UInt.m101constructorimpl(UInt.m101constructorimpl(s & MAX_VALUE) - UInt.m101constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m306mod7apg3OU(short s, byte b) {
        return UByte.m24constructorimpl((byte) Integer.remainderUnsigned(UInt.m101constructorimpl(s & MAX_VALUE), UInt.m101constructorimpl(b & UByte.MAX_VALUE)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m307modVKZWuLQ(short s, long j) {
        return Long.remainderUnsigned(ULong.m180constructorimpl(((long) s) & 65535), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m308modWZ4Q5Ns(short s, int i) {
        return Integer.remainderUnsigned(UInt.m101constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m309modxj2QHRw(short s, short s2) {
        return m287constructorimpl((short) Integer.remainderUnsigned(UInt.m101constructorimpl(s & MAX_VALUE), UInt.m101constructorimpl(s2 & MAX_VALUE)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: or-xj2QHRw, reason: not valid java name */
    private static final short m310orxj2QHRw(short s, short s2) {
        return m287constructorimpl((short) (s | s2));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m311plus7apg3OU(short s, byte b) {
        return UInt.m101constructorimpl(UInt.m101constructorimpl(s & MAX_VALUE) + UInt.m101constructorimpl(b & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m312plusVKZWuLQ(short s, long j) {
        return ULong.m180constructorimpl(ULong.m180constructorimpl(((long) s) & 65535) + j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m313plusWZ4Q5Ns(short s, int i) {
        return UInt.m101constructorimpl(UInt.m101constructorimpl(s & MAX_VALUE) + i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m314plusxj2QHRw(short s, short s2) {
        return UInt.m101constructorimpl(UInt.m101constructorimpl(s & MAX_VALUE) + UInt.m101constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rangeTo-xj2QHRw, reason: not valid java name */
    private static final UIntRange m315rangeToxj2QHRw(short s, short s2) {
        return new UIntRange(UInt.m101constructorimpl(s & MAX_VALUE), UInt.m101constructorimpl(s2 & MAX_VALUE), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: rangeUntil-xj2QHRw, reason: not valid java name */
    private static final UIntRange m316rangeUntilxj2QHRw(short s, short s2) {
        return URangesKt___URangesKt.m1286untilJ1ME1BU(UInt.m101constructorimpl(s & MAX_VALUE), UInt.m101constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m317rem7apg3OU(short s, byte b) {
        return Integer.remainderUnsigned(UInt.m101constructorimpl(s & MAX_VALUE), UInt.m101constructorimpl(b & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m318remVKZWuLQ(short s, long j) {
        return Long.remainderUnsigned(ULong.m180constructorimpl(((long) s) & 65535), j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m319remWZ4Q5Ns(short s, int i) {
        return Integer.remainderUnsigned(UInt.m101constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m320remxj2QHRw(short s, short s2) {
        return Integer.remainderUnsigned(UInt.m101constructorimpl(s & MAX_VALUE), UInt.m101constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m321times7apg3OU(short s, byte b) {
        return UInt.m101constructorimpl(UInt.m101constructorimpl(s & MAX_VALUE) * UInt.m101constructorimpl(b & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m322timesVKZWuLQ(short s, long j) {
        return ULong.m180constructorimpl(ULong.m180constructorimpl(((long) s) & 65535) * j);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m323timesWZ4Q5Ns(short s, int i) {
        return UInt.m101constructorimpl(UInt.m101constructorimpl(s & MAX_VALUE) * i);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m324timesxj2QHRw(short s, short s2) {
        return UInt.m101constructorimpl(UInt.m101constructorimpl(s & MAX_VALUE) * UInt.m101constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m325toByteimpl(short s) {
        return (byte) s;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m326toDoubleimpl(short s) {
        return s & MAX_VALUE;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m327toFloatimpl(short s) {
        return s & MAX_VALUE;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m328toIntimpl(short s) {
        return s & MAX_VALUE;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m329toLongimpl(short s) {
        return ((long) s) & 65535;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m330toShortimpl(short s) {
        return s;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m331toStringimpl(short s) {
        return String.valueOf(s & MAX_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m332toUBytew2LRezQ(short s) {
        return UByte.m24constructorimpl((byte) s);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m333toUIntpVg5ArA(short s) {
        return UInt.m101constructorimpl(s & MAX_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m334toULongsVKNKU(short s) {
        return ULong.m180constructorimpl(((long) s) & 65535);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m335toUShortMh2AYeg(short s) {
        return s;
    }

    @InlineOnly
    /* JADX INFO: renamed from: xor-xj2QHRw, reason: not valid java name */
    private static final short m336xorxj2QHRw(short s, short s2) {
        return m287constructorimpl((short) (s ^ s2));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(getData() & MAX_VALUE, uShort.getData() & MAX_VALUE);
    }

    public boolean equals(Object obj) {
        return m293equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m299hashCodeimpl(this.data);
    }

    public String toString() {
        return m331toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ short getData() {
        return this.data;
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static int m286compareToxj2QHRw(short s, short s2) {
        return Intrinsics.compare(s & MAX_VALUE, s2 & MAX_VALUE);
    }
}
