package wang.ismy.jvm.gc;

/**
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * @author MY
 * @date 2020/10/20 16:18
 */
public class LargeObjectWithOld {
    public static void main(String[] args) {
        byte[] allocation;
        allocation = new byte[8 * 1024*1024];
    }
}
