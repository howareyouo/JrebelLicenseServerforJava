package com.vvvtimes.JrebelUtil;

import org.apache.commons.codec.binary.Base64;

import java.nio.charset.Charset;
import java.util.Random;

public class ByteUtil {
    private static final Random r;

    static {
        r = new Random();
    }

    public static String a(final byte[] binaryData) {
        if (binaryData == null) {
            return null;
        }
        return new String(Base64.encodeBase64(binaryData), Charset.forName("UTF-8"));
    }

    public static byte[] a(final String s) {
        if (s == null) {
            return null;
        }
        return Base64.decodeBase64(s.getBytes(Charset.forName("UTF-8")));
    }

    public static byte[] a(final int n) {
        final byte[] array = new byte[n];
        ByteUtil.r.nextBytes(array);
        return array;
    }
}
