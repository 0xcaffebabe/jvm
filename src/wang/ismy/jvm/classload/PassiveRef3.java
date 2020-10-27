package wang.ismy.jvm.classload;

/**
 * @author MY
 * @date 2020/10/27 12:38
 */
public class PassiveRef3 {
    static class Ref {
        static {
            System.out.println("ref init");
        }
        public static final int value = 123;
    }

    public static void main(String[] args) {
        System.out.println(Ref.value); // only print 123
    }
}
