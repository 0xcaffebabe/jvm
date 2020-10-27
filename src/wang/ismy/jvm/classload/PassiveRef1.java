package wang.ismy.jvm.classload;

/**
 * 被动引用不会触发类的初始化
 * @author MY
 * @date 2020/10/27 12:31
 */
public class PassiveRef1 {
    static class Father {
        static  {
            System.out.println("father init");
        }
        static int value = 123;
    }
    static class Son extends Father{
        static {
            System.out.println("son init");
        }
    }

    public static void main(String[] args) {
        System.out.println(Son.value); // fatcher init ...
    }
}
