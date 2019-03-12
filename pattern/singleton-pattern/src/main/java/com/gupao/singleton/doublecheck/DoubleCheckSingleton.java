package com.gupao.singleton.doublecheck;

/**
 * 两次if (singleton == null)检查，这样就可以保证线程安全了。
 * 这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，直接return实例化对象。
 * 优点：线程安全；延迟加载；效率较高。
 */
public class DoubleCheckSingleton {

    private static int count = 0;
    private static DoubleCheckSingleton doubleCheckSingleton;

    /**
     * 通过反射获得单例类的构造函数，由于该构造函数是private的，
     * 通过setAccessible(true)指示反射的对象在使用时应该取消 Java 语言访问检查,使得私有的构造函数能够被访问，
     * 这样使得单例模式失效。
     * 如果要抵御这种攻击，要防止构造函数被成功调用两次。需要在构造函数中对实例化次数进行统计，
     * 大于一次就抛出异常。
     */
    private DoubleCheckSingleton(){
        synchronized (DoubleCheckSingleton.class) {
            if(count > 0){
                throw new RuntimeException("创建了两个实例");
            }
            count++;
        }
    }

    public static DoubleCheckSingleton getInstance(){
        if(doubleCheckSingleton == null){
            synchronized (DoubleCheckSingleton.class){
                if(doubleCheckSingleton == null){
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }

}
