package com.liwenyao.coolweather.util;

/**
 * Created by liwenyao on 2015/11/26.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
