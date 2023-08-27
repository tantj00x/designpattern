package org.example.proxy.example03;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * cglib代理类
 */
public class UserLogProxy implements MethodInterceptor {

    /**
     * 目标被代理对象
     */
    private Object target;

    public UserLogProxy(Object target) {
        this.target = target;
    }


    /**
     * 生成CGLIB动态代理方法
     *
     * @return 代理类对象
     */
    public Object getLogProxy() {

        // 增强器类，用来创建动态代理类
        Enhancer enhancer = new Enhancer();

        // 设置代理类的父类字节码对象
        enhancer.setSuperclass(target.getClass());

        // 设置回调，重写的 intercept() 方法在哪个类中就传入哪个类
        enhancer.setCallback(this);

        // 创建动态代理对象并返回
        return enhancer.create();
    }

    /**
     * 实现回调的方法
     *
     * @param o           代理对象
     * @param method      目标对象中方法的实例
     * @param objects     实际参数
     * @param methodProxy 代理类对象中的方法实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(formatter.format(calendar.getTime()) + "[ " + method.getName() + " ] 查询用户信息...");

        // 被代理类执行后返回的结果
        Object result = methodProxy.invokeSuper(o, objects);
        return result;
    }
}
