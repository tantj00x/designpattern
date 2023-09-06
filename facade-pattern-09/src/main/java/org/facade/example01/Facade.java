package org.facade.example01;

/**
 * 外观角色：为多个子系统对外提供一个共同的接口
 */
public class Facade {

    private SubSystemA obj1 = new SubSystemA();
    private SubSystemB obj2 = new SubSystemB();
    private SubSystemC obj3 = new SubSystemC();

    public void method(){
        obj1.methodA();
        obj2.methodB();
        obj3.methodC();
    }
}
