package com.iwangzhe.wzcorelibrary;

/**
 * author : 亚辉
 * e-mail : 2372680617@qq.com
 * date   : 2020/8/1513:25
 * desc   :
 */
public interface IRouter {
    /**
     * 跳转到首页
     *
     * @param url     重定向到哪个webview
     * @param title   标题
     * @param animate 是否需要动画
     */
    void jumpToMain(String url, String title, boolean animate);

    /**
     * 王者财经业务统一打开webview
     *
     * @param url       webview链接
     * @param title     webview标题
     * @param needLogin 是否需要登录
     */
    void startWebview(String url, String title, boolean needLogin);
}
