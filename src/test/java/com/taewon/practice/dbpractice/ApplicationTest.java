package com.taewon.practice.dbpractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class ApplicationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    @DisplayName("SpringBootTest 정상 기동 확인용")
    public void testRunningApplication() {
        Assertions.assertNotNull(applicationContext);
    }
}
