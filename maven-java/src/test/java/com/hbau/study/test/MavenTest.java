package com.hbau.study.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Zhy
 * @create 2024/2/26 17:07
 */
public class MavenTest {

    @Test
    public void testAssert() {
        int a = 10;
        int b = 20;
        Assertions.assertEquals(a + b, 30);
    }

}
