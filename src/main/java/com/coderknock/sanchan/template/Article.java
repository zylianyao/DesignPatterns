package com.coderknock.sanchan.template;

/**
 * <p></p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public abstract class Article {
    public void show() {
        title();
        content();
    }

    protected abstract void content();

    protected abstract void title();
}
