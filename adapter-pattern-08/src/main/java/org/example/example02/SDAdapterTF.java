package org.example.example02;

import org.example.example01.SDCard;
import org.example.example01.TFCard;

/**
 * 对象适配器类（组合形式）
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adaadapter write tf card");
        tfCard.writeTF(msg);
    }
}
