package retrofit2.converter.scalars;

import com.zepto.nd5;
import java.io.IOException;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes3.dex */
final class ScalarResponseBodyConverters {

    public static final class BooleanResponseBodyConverter implements Converter<nd5, Boolean> {
        static final BooleanResponseBodyConverter INSTANCE = new BooleanResponseBodyConverter();

        @Override // retrofit2.Converter
        public Boolean convert(nd5 nd5Var) throws IOException {
            return Boolean.valueOf(nd5Var.string());
        }
    }

    public static final class ByteResponseBodyConverter implements Converter<nd5, Byte> {
        static final ByteResponseBodyConverter INSTANCE = new ByteResponseBodyConverter();

        @Override // retrofit2.Converter
        public Byte convert(nd5 nd5Var) throws IOException {
            return Byte.valueOf(nd5Var.string());
        }
    }

    public static final class CharacterResponseBodyConverter implements Converter<nd5, Character> {
        static final CharacterResponseBodyConverter INSTANCE = new CharacterResponseBodyConverter();

        @Override // retrofit2.Converter
        public Character convert(nd5 nd5Var) throws IOException {
            String strString = nd5Var.string();
            if (strString.length() == 1) {
                return Character.valueOf(strString.charAt(0));
            }
            throw new IOException("Expected body of length 1 for Character conversion but was " + strString.length());
        }
    }

    public static final class DoubleResponseBodyConverter implements Converter<nd5, Double> {
        static final DoubleResponseBodyConverter INSTANCE = new DoubleResponseBodyConverter();

        @Override // retrofit2.Converter
        public Double convert(nd5 nd5Var) throws IOException {
            return Double.valueOf(nd5Var.string());
        }
    }

    public static final class FloatResponseBodyConverter implements Converter<nd5, Float> {
        static final FloatResponseBodyConverter INSTANCE = new FloatResponseBodyConverter();

        @Override // retrofit2.Converter
        public Float convert(nd5 nd5Var) throws IOException {
            return Float.valueOf(nd5Var.string());
        }
    }

    public static final class IntegerResponseBodyConverter implements Converter<nd5, Integer> {
        static final IntegerResponseBodyConverter INSTANCE = new IntegerResponseBodyConverter();

        @Override // retrofit2.Converter
        public Integer convert(nd5 nd5Var) throws IOException {
            return Integer.valueOf(nd5Var.string());
        }
    }

    public static final class LongResponseBodyConverter implements Converter<nd5, Long> {
        static final LongResponseBodyConverter INSTANCE = new LongResponseBodyConverter();

        @Override // retrofit2.Converter
        public Long convert(nd5 nd5Var) throws IOException {
            return Long.valueOf(nd5Var.string());
        }
    }

    public static final class ShortResponseBodyConverter implements Converter<nd5, Short> {
        static final ShortResponseBodyConverter INSTANCE = new ShortResponseBodyConverter();

        @Override // retrofit2.Converter
        public Short convert(nd5 nd5Var) throws IOException {
            return Short.valueOf(nd5Var.string());
        }
    }

    public static final class StringResponseBodyConverter implements Converter<nd5, String> {
        static final StringResponseBodyConverter INSTANCE = new StringResponseBodyConverter();

        @Override // retrofit2.Converter
        public String convert(nd5 nd5Var) throws IOException {
            return nd5Var.string();
        }
    }

    private ScalarResponseBodyConverters() {
    }
}
