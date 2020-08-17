package com.iwangzhe.wzcorelibrary;

import java.util.Map;

/**
 * author : 亚辉
 * e-mail : 2372680617@qq.com
 * date   : 2020/8/1513:26
 * desc   :
 */
public interface INetHttp {
    void reqGetResByWzApi(String url, Map<String, String> params, IResCallback callback);

}
