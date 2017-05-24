package com.coderknock.sanchan.prototype;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * <p>文本</p>
 *
 * @author 三产
 * @version 1.0
 * @date 2017-05-24
 * @QQGroup 213732117
 * @website http://www.coderknock.com
 * @copyright Copyright 2017 拿客 coderknock.com  All rights reserved.
 * @since JDK 1.8
 */
public class Text implements Cloneable {
    private List<String> lines;

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "Text{" +
                "lines=" + lines +
                '}';
    }

    @Override
    public Text clone() throws CloneNotSupportedException {
        String thisJon = JSON.toJSONString(this);
        Text text = JSON.parseObject(thisJon, Text.class);
        return text;
    }
}
