package wang.ismy.jvm.bytecodeexec;

/**
 * @author MY
 * @date 2020/10/29 14:29
 */
public class OverloadResolution {
    static void f(Object obj){
        System.out.println("obj");
    }
    static void f(CharSequence seq){
        System.out.println("seq");
    }
    static void f(String str){
        System.out.println("str");
    }

    public static void main(String[] args) {
        Object obj = "str";
        CharSequence seq = "str";
        String str = "str";
        f(obj); // obj
        f(seq); // seq
        f(str); // str
    }
}
