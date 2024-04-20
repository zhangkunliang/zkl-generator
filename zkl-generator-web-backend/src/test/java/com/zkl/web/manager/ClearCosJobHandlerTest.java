package com.zkl.web.manager;

import com.zkl.web.job.ClearCosJobHandler;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClearCosJobHandlerTest {

    @Resource
    private ClearCosJobHandler clearCosJobHandler;

    @Test
    void clearCosJobHandler() throws Exception {
        clearCosJobHandler.clearCosJobHandler();
    }
}