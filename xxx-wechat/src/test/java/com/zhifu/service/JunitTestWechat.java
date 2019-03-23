
package com.zhifu.service;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试common模块
 */
public class JunitTestWechat {

    private static final String PORT = "8082";

    /**
     * 微信登录
     */
    @Test
    public void wxlogin() {
        Map<String, String> param = new HashMap<String, String>();
        param.put("appid", "wx6db9b17a64a8087b");
        param.put("code", "0618aeoT0JOMLX1kdFpT0u9qoT08aeoU");
        HttpPostService.testService(param, PORT, "/xxx-wechat/wx/user/login");
    }

    /**
     * 发送消息模板
     */
    @Test
    public void sendTemplateMessage() {
        Map<String, String> param = new HashMap<String, String>();
        param.put("openid", "oPoMc5GhjnKlsi7PPBK5iDxgr85k");
        param.put("page", "/pages/serviceNotification/serviceNotification");
        param.put("formId", "1b33efedaa74e77ec2963faf63d1266e");
        HttpPostService.testService(param, PORT, "/wechat/sendTemplateMessage");
    }



}
