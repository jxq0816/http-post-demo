package com.httpclient.util;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

//对接口进行测试
public class WeiBoPostService {
    private String charset = "utf-8";
    private String accessToken="2.00SdyOsBnp71ED50b943f4670l75U8";

    @Test
    public void jUnitTestPost() {
        String rs=comment("4087614108017463","ssl",accessToken);
        System.out.println(rs);
    }
    public String comment(String id,String comment,String token){
        String httpOrgCreateTest = "https://c.api.weibo.com/2/comments/create/biz.json";
        Map<String,String> createMap = new HashMap<String,String>();
        createMap.put("access_token",token);
        createMap.put("id",id);
        createMap.put("comment",comment);
        HttpClientSSLUtil httpClientSSLUtil = new HttpClientSSLUtil();
        String httpOrgCreateTestRtn = httpClientSSLUtil.doPost(httpOrgCreateTest,createMap,charset);
        return httpOrgCreateTestRtn;
    }
}
