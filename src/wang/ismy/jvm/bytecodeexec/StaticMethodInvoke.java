package wang.ismy.jvm.bytecodeexec;

/**
 * @author MY
 * @date 2020/10/29 14:21
 */
public class StaticMethodInvoke {
    public static void say(){
        System.out.println("hello world");
    }
    public static void main(String[] args) {
        say();
    }
}
