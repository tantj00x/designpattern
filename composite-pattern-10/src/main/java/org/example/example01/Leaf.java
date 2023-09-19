package org.example.example01;

/**
 * 叶子节点
 * 特点：不能包含子节点
 */
public class Leaf extends Component{
    /**
     * 增加节点
     *
     * @param component
     */
    @Override
    public void add(Component component) {

    }

    /**
     * 删除节点
     *
     * @param component
     */
    @Override
    public void remove(Component component) {

    }

    /**
     * 获取节点
     *
     * @param i
     */
    @Override
    public Component getChild(int i) {
        return null;
    }

    /**
     * 业务方法
     */
    @Override
    public void operation() {
        // 叶子节点中的具体方法
    }
}
