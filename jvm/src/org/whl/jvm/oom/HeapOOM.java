package org.whl.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * VM args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *
 * @author whl
 *
 */
public class HeapOOM {

    static class OOMObject {

    }

    /**
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }

}
