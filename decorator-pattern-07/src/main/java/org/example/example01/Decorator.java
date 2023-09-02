package org.example.example01;

/**
 * 抽象装饰类-装饰者模式的核心
 */
public class Decorator extends Component {

    /**
     * 维持一个对抽象构建对象的引用
     */
    private Component component;

    /**
     * 通过构造注入一个抽象构建类型的对象
     */
    public Decorator(Component component) {
        this.component = component;
    }


    @Override
    public void operation() {
        // 调用原有的业务方法，并没有真正的进行装饰，提供了一个统一的接口
        // 将装饰的过程交给子类完成
        component.operation();
    }
}
