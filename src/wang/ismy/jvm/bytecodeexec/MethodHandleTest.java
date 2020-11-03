package wang.ismy.jvm.bytecodeexec;

import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * @author MY
 * @date 2020/10/29 14:59
 */
public class MethodHandleTest {

    public static void main(String[] args) throws Throwable {
                              // 返回值类型  参数类型
        MethodType methodType = MethodType.methodType(void.class, String.class);
        Object obj = System.out;
        MethodHandle methodHandle = MethodHandles.lookup()
                .findVirtual(obj.getClass(), "println", methodType).bindTo(obj);
        methodHandle.invoke("hello world");
    }
}
