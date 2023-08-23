package org.example.example01;

import java.io.Serializable;

/**
 * 具体原型类
 * 实现Cloneable标识接口，标识当前类对象可复制
 */
public class ConCreatProToType implements Cloneable, Serializable {

    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void show() {
        System.out.println("嫌疑人姓名：" + person.getName());
    }

    public ConCreatProToType() {
        System.out.println("具体的原型对象创建成功！");
    }

    @Override
    protected ConCreatProToType clone() throws CloneNotSupportedException {
        System.out.println("克隆对象复制成功！");
        return (ConCreatProToType) super.clone();
    }
}
