package com.zkl.web.model.dto.generator;

import lombok.Data;

import java.io.Serializable;

/**
 * 缓存代码生成器请求
 *
 * @author <a href="https://github.com/zhangkunliang"></a>
 * 
 */
@Data
public class GeneratorCacheRequest implements Serializable {

    /**
     * 生成器的 id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}