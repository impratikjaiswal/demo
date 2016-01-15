package org.whl.jvm.oom;

import java.lang.reflect.Field;

public class GetDirectMemorty {

    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("java.nio.Bits");
        Field maxMemory = c.getDeclaredField("maxMemory");
        maxMemory.setAccessible(true);
        Field reservedMemory = c.getDeclaredField("reservedMemory");
        reservedMemory.setAccessible(true);
        Long maxMemoryValue = (Long) maxMemory.get(null);
        Long reservedMemoryValue = (Long) reservedMemory.get(null);

        System.out.println("maxMemoryValue=" + maxMemoryValue / 1024 / 1024);
        System.out.println("reservedMemoryValue=" + reservedMemoryValue);
    }

}
