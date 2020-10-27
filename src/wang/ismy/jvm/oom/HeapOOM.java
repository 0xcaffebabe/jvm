package wang.ismy.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author MY
 * @date 2020/10/18 14:38
 */
public class HeapOOM {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        while (true){
            list.add(new Object());
        }
    }
}
