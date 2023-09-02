package org.example.example01;

/**
 * 具体装饰类
 */
public class ConcreteDecorator extends Decorator{

    /**
     * 通过构造注入一个抽象构建类型的对象
     */
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        // 调用原有的业务方法
        super.operation();
        // 调用新增的方法
        add();
    }

    /**
     * 新增业务方法
     */
    public void add(){
        // ...
    }
}
