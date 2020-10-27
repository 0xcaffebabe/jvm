package wang.ismy.jvm.classload;

/**
 * @author MY
 * @date 2020/10/27 13:35
 */
public class Clinit {
    static {
        i=1; // 可以赋值
//        System.out.println(i); // 无法通过编译
    }
    static int i =0;
}
