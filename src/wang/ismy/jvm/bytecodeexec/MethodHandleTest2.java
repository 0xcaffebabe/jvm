package wang.ismy.jvm.bytecodeexec;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;

/**
 * @author MY
 * @date 2020/10/29 15:11
 */
public class MethodHandleTest2 {
    static class GrandFather {
        void thinking() {
            System.out.println("i am grandfather");
        }
    }

    static class Father extends GrandFather {
        void thinking() {
            System.out.println("i am father");
        }
    }

    static class Son extends Father {
        void thinking() {
            // 在这里填入适当的代码（不能修改其他地方的代码）
            // 实现调用祖父类的thinking()方法，打印"i am grandfather"
            try {
                MethodType mt = MethodType.methodType(void.class);
                Field lookupImpl = MethodHandles.Lookup.class.getDeclaredField("IMPL_LOOKUP");
                lookupImpl.setAccessible(true);
                MethodHandle mh = ((MethodHandles.Lookup) lookupImpl.get(null)).findSpecial(GrandFather.class, "thinking", mt, GrandFather.class);
                try {
                    mh.invoke(this);
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.thinking();
    }
}
