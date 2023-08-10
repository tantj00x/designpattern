package org.example.singleton;

/**
 * 单例模式-枚举
 *  阻止反射的破坏：在反射方法中不允许使用反射创枚举对象
 *  阻止序列化的破坏：在序列化的时候仅仅是将枚举对象的name属性输出到了结果中，反序列化的时候，就会通过 Enum 的 valueof 方法，根据名字查找对应枚举对象
 */
public enum Singleton_07 {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Singleton_07 getSingleton(){
        return INSTANCE;
    }
}
