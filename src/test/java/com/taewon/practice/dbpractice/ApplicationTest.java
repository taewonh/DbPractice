package com.taewon.practice.dbpractice;

import com.taewon.practice.dbpractice.service.ProductParentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class ApplicationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    ProductParentService parentService;

    @BeforeEach
    void init() {
        parentService.truncate();
    }

    @Test
    @DisplayName("SpringBootTest 정상 기동 확인용")
    public void testRunningApplication() {
        Assertions.assertNotNull(applicationContext);
    }

    @Test
    @DisplayName("Product 저장 테스트")
    public void testSaveProduct() {
        int saveCount = 3;
        parentService.saveRandomProduct(saveCount);
        Assertions.assertEquals(saveCount, parentService.count());
    }
}
