package wang.ismy.jvm.oom;

/**
 * -Xss2M
 * @author MY
 * @date 2020/10/18 15:05
 */
public class JVMStackOOM {
    private void dontStop() {
        while (true) {
        }
    }
    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }
    public static void main(String[] args) throws Throwable {
        JVMStackOOM oom = new JVMStackOOM();
        oom.stackLeakByThread();
    }
}
