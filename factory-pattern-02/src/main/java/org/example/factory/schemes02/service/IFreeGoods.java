package org.example.factory.schemes02.service;

import org.example.factory.schemes02.entity.AwardInfo;
import org.example.factory.schemes02.entity.ResponseResult;

/**
 * 免费商品发放接口
 */
public interface IFreeGoods {
    /**
     * 发送免费商品
     * @param awardInfo 获奖信息实体类
     * @return 响应结果封装类
     */
    ResponseResult sendFreeGoods(AwardInfo awardInfo);

}
