package org.example.proxy.example03;

import java.util.Collections;
import java.util.List;

/**
 * 目标类
 */
public class UserServiceImpl {

    public List<User> findUserList() {
        // Collections.singletonList()方法：返回只保存一个元素的list集合
        return Collections.singletonList(new User("tom", 23));
    }


}
