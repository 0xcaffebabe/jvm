package wang.ismy.jvm.classload;

/**
 * @author MY
 * @date 2020/10/27 13:37
 */
public class Clinit1 {
    static class Father {
        static int a= 1;
        static {
            a=2;
        }
    }
    static class Son extends Father{
        static int b = a;
    }

    public static void main(String[] args) {
        System.out.println(Son.a); // 2
    }
}
