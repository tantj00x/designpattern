package org.example.example02;

/**
 * 广告模板
 */
public class AdvTemplate {
    // 广告信名称
    private String advSubject = "xx银行本月还款达标，可抽iPhone14等好礼";

    // 广告新内容
    private String advContext = "达标用户请在2023年12月31日前参与抽奖......";

    public String getAdvSubject() {
        return advSubject;
    }

    public void setAdvSubject(String advSubject) {
        this.advSubject = advSubject;
    }

    public String getAdvContext() {
        return advContext;
    }

    public void setAdvContext(String advContext) {
        this.advContext = advContext;
    }
}
