package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lkotlin/time/TimeSource;", "", "markNow", "Lkotlin/time/TimeMark;", "Companion", "Monotonic", "WithComparableMarks", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
public interface TimeSource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/TimeSource$Companion;", "", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "()V", "markNow", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "toString", "", "ValueTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Monotonic implements WithComparableMarks {
        public static final Monotonic INSTANCE = new Monotonic();

        @SinceKotlin(version = "1.9")
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0018\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\rH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0006J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010!J\u001b\u0010#\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006)"}, d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "constructor-impl", "(J)J", "compareTo", "", "other", "compareTo-6eNON_k", "(JJ)I", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hasNotPassedNow", "hasNotPassedNow-impl", "(J)Z", "hasPassedNow", "hasPassedNow-impl", "hashCode", "hashCode-impl", "(J)I", "minus", "minus-UwyO8pc", "(JLkotlin/time/ComparableTimeMark;)J", "duration", "minus-LRDsOJo", "(JJ)J", "minus-6eNON_k", "plus", "plus-LRDsOJo", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @JvmInline
        @WasExperimental(markerClass = {ExperimentalTime.class})
        public static final class ValueTimeMark implements ComparableTimeMark {
            private final long reading;

            private /* synthetic */ ValueTimeMark(long j) {
                this.reading = j;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ ValueTimeMark m1483boximpl(long j) {
                return new ValueTimeMark(j);
            }

            /* JADX INFO: renamed from: compareTo-6eNON_k, reason: not valid java name */
            public static final int m1484compareTo6eNON_k(long j, long j2) {
                return Duration.m1342compareToLRDsOJo(m1493minus6eNON_k(j, j2), Duration.INSTANCE.m1446getZEROUwyO8pc());
            }

            /* JADX INFO: renamed from: compareTo-impl, reason: not valid java name */
            public static int m1485compareToimpl(long j, ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m1483boximpl(j).compareTo(other);
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static long m1486constructorimpl(long j) {
                return j;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m1488equalsimpl(long j, Object obj) {
                return (obj instanceof ValueTimeMark) && j == ((ValueTimeMark) obj).getReading();
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m1489equalsimpl0(long j, long j2) {
                return j == j2;
            }

            /* JADX INFO: renamed from: hasNotPassedNow-impl, reason: not valid java name */
            public static boolean m1490hasNotPassedNowimpl(long j) {
                return Duration.m1376isNegativeimpl(m1487elapsedNowUwyO8pc(j));
            }

            /* JADX INFO: renamed from: hasPassedNow-impl, reason: not valid java name */
            public static boolean m1491hasPassedNowimpl(long j) {
                return !Duration.m1376isNegativeimpl(m1487elapsedNowUwyO8pc(j));
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m1492hashCodeimpl(long j) {
                return Long.hashCode(j);
            }

            /* JADX INFO: renamed from: minus-6eNON_k, reason: not valid java name */
            public static final long m1493minus6eNON_k(long j, long j2) {
                return MonotonicTimeSource.INSTANCE.m1475differenceBetweenfRLX17w(j, j2);
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m1497toStringimpl(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
            public long mo1333elapsedNowUwyO8pc() {
                return m1487elapsedNowUwyO8pc(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark
            public boolean equals(Object obj) {
                return m1488equalsimpl(this.reading, obj);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                return m1490hasNotPassedNowimpl(this.reading);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasPassedNow() {
                return m1491hasPassedNowimpl(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark
            public int hashCode() {
                return m1492hashCodeimpl(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo1334minusLRDsOJo(long j) {
                return m1483boximpl(m1498minusLRDsOJo(j));
            }

            @Override // kotlin.time.ComparableTimeMark
            /* JADX INFO: renamed from: minus-UwyO8pc */
            public long mo1335minusUwyO8pc(ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m1495minusUwyO8pc(this.reading, other);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo1336plusLRDsOJo(long j) {
                return m1483boximpl(m1499plusLRDsOJo(j));
            }

            public String toString() {
                return m1497toStringimpl(this.reading);
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ long getReading() {
                return this.reading;
            }

            /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
            public static long m1487elapsedNowUwyO8pc(long j) {
                return MonotonicTimeSource.INSTANCE.m1476elapsedFrom6eNON_k(j);
            }

            /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
            public static long m1495minusUwyO8pc(long j, ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                if (other instanceof ValueTimeMark) {
                    return m1493minus6eNON_k(j, ((ValueTimeMark) other).getReading());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m1497toStringimpl(j)) + " and " + other);
            }

            @Override // java.lang.Comparable
            public int compareTo(ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo1334minusLRDsOJo(long j) {
                return m1483boximpl(m1498minusLRDsOJo(j));
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo1336plusLRDsOJo(long j) {
                return m1483boximpl(m1499plusLRDsOJo(j));
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public long m1498minusLRDsOJo(long j) {
                return m1494minusLRDsOJo(this.reading, j);
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public long m1499plusLRDsOJo(long j) {
                return m1496plusLRDsOJo(this.reading, j);
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public static long m1494minusLRDsOJo(long j, long j2) {
                return MonotonicTimeSource.INSTANCE.m1474adjustReading6QKq23U(j, Duration.m1396unaryMinusUwyO8pc(j2));
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public static long m1496plusLRDsOJo(long j, long j2) {
                return MonotonicTimeSource.INSTANCE.m1474adjustReading6QKq23U(j, j2);
            }
        }

        private Monotonic() {
        }

        @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
            return ValueTimeMark.m1483boximpl(m1482markNowz9LOYto());
        }

        /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
        public long m1482markNowz9LOYto() {
            return MonotonicTimeSource.INSTANCE.m1477markNowz9LOYto();
        }

        public String toString() {
            return MonotonicTimeSource.INSTANCE.toString();
        }

        @Override // kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ TimeMark markNow() {
            return ValueTimeMark.m1483boximpl(m1482markNowz9LOYto());
        }
    }

    @SinceKotlin(version = "1.9")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "markNow", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public interface WithComparableMarks extends TimeSource {
        @Override // kotlin.time.TimeSource
        ComparableTimeMark markNow();
    }

    TimeMark markNow();
}
