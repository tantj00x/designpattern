package org.example.example03;

import org.example.example02.AdvTemplate;

import java.util.Random;

public class Client {

    /**
     * 发送邮件数量
     */
    private static int MAX_COUNT = 6;

    /**
     * 发送邮件方法
     */
    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t 收件人" + mail.getReceiver() + "\t ...发送成功");
    }

    public static void main(String[] args) {
        int i = 0;
        // 定义模板
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xxx银行版权所有");
        while (i < MAX_COUNT){
            // 每封邮件不同的信息
            // 使用clone方法
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(" 先生 （女士）");
            int num = new Random().nextInt(999999999);
            cloneMail.setReceiver(num + "@" + "example.com");
            // 发送邮件
            sendMail(cloneMail);
            i++;
        }
    }
}
