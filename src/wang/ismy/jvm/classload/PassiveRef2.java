package wang.ismy.jvm.classload;

/**
 * @author MY
 * @date 2020/10/27 12:36
 */
public class PassiveRef2 {
    static class Ref{
        static {
            System.out.println("ref init");
        }
    }

    public static void main(String[] args) {
        Ref[] refs = new Ref[10]; // print nothing
    }
}
