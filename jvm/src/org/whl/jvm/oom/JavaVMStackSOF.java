package org.whl.jvm.oom;

/**
 * VM Args: -Xss128k
 *
 * @author whl
 *
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();

        try {
            oom.stackLeak();
        } catch (Throwable t) {
            System.out.println("Stack length:" + oom.stackLength);
            // throw t;
        }

    }

}
