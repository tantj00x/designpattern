package org.example.example01;

import org.example.example01.builder.impl.HelloBikeBuilder;
import org.example.example01.builder.impl.MoBikeBuilder;
import org.example.example01.director.Director;
import org.example.example01.product.Bike;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        // 1.创建指挥者
        Director director = new Director(new HelloBikeBuilder());

        // 2.获取自行车
        Bike bike = director.construct();

        System.out.println(bike.getFrame() + "," + bike.getSeat());

    }
}
