package org.example.example01;

import java.util.ArrayList;

/**
 * 树枝节点
 * 树枝节点是一个容器对象，它既可以包含子节点也可以包含叶子节点
 */
public class Composite extends Component{

    // 定义集合属性，保存子节点的数据
    private ArrayList<Component> list = new ArrayList<>();

    /**
     * 增加节点
     *
     * @param component
     */
    @Override
    public void add(Component component) {
        list.add(component);
    }

    /**
     * 删除节点
     *
     * @param component
     */
    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    /**
     * 获取节点
     *
     * @param i
     */
    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    /**
     * 具体的业务方法
     */
    @Override
    public void operation() {
        // 在循环中，递归调用其他节点中的operation()方法
        for (Component component : list) {
            component.operation();
        }
    }
}
