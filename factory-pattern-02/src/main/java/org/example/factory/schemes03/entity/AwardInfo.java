package org.example.factory.schemes03.entity;

import java.util.Map;

/**
 * 获奖信息实体类
 */
public class AwardInfo {

    /**
     * 用户ID
     */
    private String uid;

    /**
     * 奖品信息：1.打折券 2.优酷会员 3.小礼品
     */
    private Integer awardTypes;

    /**
     * 奖品编号
     */
    private String awardNumber;

    /**
     * 额外信息
     */
    private Map<String,String> extMap;

    public AwardInfo() {
    }

    public AwardInfo(String uid, Integer awardTypes, String awardNumber, Map<String, String> extMap) {
        this.uid = uid;
        this.awardTypes = awardTypes;
        this.awardNumber = awardNumber;
        this.extMap = extMap;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getAwardTypes() {
        return awardTypes;
    }

    public void setAwardTypes(Integer awardTypes) {
        this.awardTypes = awardTypes;
    }

    public String getAwardNumber() {
        return awardNumber;
    }

    public void setAwardNumber(String awardNumber) {
        this.awardNumber = awardNumber;
    }

    public Map<String, String> getExtMap() {
        return extMap;
    }

    public void setExtMap(Map<String, String> extMap) {
        this.extMap = extMap;
    }
}
