package wang.ismy.jvm.bytecode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author MY
 * @date 2020/11/8 12:37
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Run origin = new Run();
        Runnable hello = (Runnable)Proxy.newProxyInstance(Run.class.getClassLoader(), new Class[]{Runnable.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("hello");
                return method.invoke(origin);
            }
        });
        hello.run();
    }
}

class Run implements Runnable{
    @Override
    public void run() {
        System.out.println("world");
    }
}
