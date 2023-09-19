package org.example.example01;

/**
 * 抽象根节点角色
 * 对客户端而言，只需要针对抽象编程，无需关心具体子类是树枝节点还是叶子节点
 */
public abstract class Component {

    /**
     * 增加节点
     */
    public abstract void add(Component component);


    /**
     * 删除节点
     */
    public abstract void remove(Component component);

    /**
     * 获取节点
     */
    public abstract Component getChild(int i);

    /**
     * 业务方法
     */
    public abstract void operation();
}
