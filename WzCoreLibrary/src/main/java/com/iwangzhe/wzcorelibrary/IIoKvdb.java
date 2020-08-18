package com.iwangzhe.wzcorelibrary;

import com.snappydb.SnappydbException;

/**
 * author : 亚辉
 * e-mail : 2372680617@qq.com
 * date   : 2020/8/1513:25
 * desc   :
 */
public interface IIoKvdb {
    void put(String key, Object object) throws SnappydbException;

    <T> T getObject(String key, Class<T> className) throws SnappydbException;
}