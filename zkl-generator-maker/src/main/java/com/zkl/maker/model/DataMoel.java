package com.zkl.maker.model;

import lombok.Data;

/**
 * 动态模版配置
 */
@Data
public class DataMoel {

    /**
     * 是否生成循环
     */
    private boolean loop;

    /**
     * 作者注释
     */
    private String author = "zkl";

    /**
     * 输出信息
     */
    private String outputText = "sum = ";
}
