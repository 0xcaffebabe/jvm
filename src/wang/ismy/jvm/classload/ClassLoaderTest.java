package wang.ismy.jvm.classload;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author MY
 * @date 2020/10/27 13:47
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws Exception {
        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1)+".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null) {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };
        Object obj = myLoader.loadClass("wang.ismy.jvm.classload.ClassLoaderTest").newInstance();
        System.out.println(obj.getClass()); // obj是使用自定义加载器加载的
        System.out.println(obj instanceof wang.ismy.jvm.classload.ClassLoaderTest); // false
    }
}
