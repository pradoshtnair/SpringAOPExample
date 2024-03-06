package com.pratishthan.sample.spring_aop_example;

public class ReadOnlyContextHolder {
    private static final ThreadLocal<Boolean> READ_ONLY = new ThreadLocal<>();
    private ReadOnlyContextHolder(){

    }
    public static void setReadOnly(boolean readOnly) {
        READ_ONLY.set(readOnly);
    }

    public static boolean isReadOnly() {
        return READ_ONLY.get() != null && READ_ONLY.get();
    }

    public static void clear() {
        READ_ONLY.remove();
    }

}
