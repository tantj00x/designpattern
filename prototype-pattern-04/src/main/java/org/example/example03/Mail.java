package org.example.example03;

import org.example.example02.AdvTemplate;

public class Mail implements Cloneable{

    /**
     * 收件人
     */
    private String receiver;

    /**
     * 邮件名称
     */
    private String subject;

    /**
     * 称呼
     */
    private String appellation;

    /**
     * 邮件内容
     */
    private String context;

    /**
     * 邮件尾部 “xx版权所有”
     */
    private String tail;

    public Mail(AdvTemplate advTemplate){
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvContext();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    protected Mail clone() {
        Mail mail = null;
        try {
            return (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
