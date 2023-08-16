package org.example.factory.schemes02.service.impl;

import org.example.factory.schemes02.entity.AwardInfo;
import org.example.factory.schemes02.entity.ResponseResult;
import org.example.factory.schemes02.service.IFreeGoods;

/**
 * 优酷会员服务
 */
public class YouKuMemberFreeGoods implements IFreeGoods {


    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {
        String phone = awardInfo.getExtMap().get("phone");
        System.out.println("发放优酷会员成功，绑定手机号" + phone);
        return new ResponseResult("200","发放优酷会员成功！");
    }
}
