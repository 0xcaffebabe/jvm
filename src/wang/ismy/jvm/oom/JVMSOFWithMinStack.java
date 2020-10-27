package wang.ismy.jvm.oom;

/**
 * -Xss256k
 * @author MY
 * @date 2020/10/18 14:57
 */
public class JVMSOFWithMinStack {
    private int stackLength = 1;
    public void stackLeak() {
        stackLength++;
        stackLeak();
    }
    public static void main(String[] args) throws Throwable {
        JVMSOFWithMinStack oom = new JVMSOFWithMinStack();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
