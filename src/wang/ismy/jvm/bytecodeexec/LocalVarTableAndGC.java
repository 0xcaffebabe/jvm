package wang.ismy.jvm.bytecodeexec;

/**
 * -verbose:gc
 * @author MY
 * @date 2020/10/29 13:50
 */
public class LocalVarTableAndGC {
    public static void main(String[] args){

        byte[] bytes = new byte[1024 * 1024 * 128];
        bytes = null; // 不加上这行 bytes不会在gc被调用时被回收
        System.gc();
    }
}
