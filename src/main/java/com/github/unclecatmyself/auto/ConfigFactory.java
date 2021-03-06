package com.github.unclecatmyself.auto;

import com.github.unclecatmyself.bootstrap.data.InChatToDataBaseService;
import com.github.unclecatmyself.bootstrap.verify.InChatVerifyService;
import com.github.unclecatmyself.common.bean.InitNetty;

/**
 * 默认配置工厂
 * Created by MySelf on 2018/12/21.
 */
public class ConfigFactory {

    /** 用户校验伪接口 */
    public static InChatVerifyService inChatVerifyService;

    /** 用户获取数据伪接口 */
    public static InChatToDataBaseService inChatToDataBaseService;

    /** InChat项目配置 */
    public static InitNetty initNetty;

    public InChatVerifyService getInChatVerifyService() {
        return inChatVerifyService;
    }

    public void setInChatVerifyService(InChatVerifyService inChatVerifyService) {
        this.inChatVerifyService = inChatVerifyService;
    }

    public InChatToDataBaseService getInChatToDataBaseService() {
        return inChatToDataBaseService;
    }

    public void setInChatToDataBaseService(InChatToDataBaseService inChatToDataBaseService) {
        this.inChatToDataBaseService = inChatToDataBaseService;
    }
}
