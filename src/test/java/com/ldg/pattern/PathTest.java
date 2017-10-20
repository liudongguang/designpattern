package com.ldg.pattern;

import org.junit.Test;

/**
 * Created by LiuDongguang on 2017/10/20.
 */
public class PathTest {
    @Test
    public void testPath(){
        System.out.println(this.getClass().getClassLoader().getResourceAsStream("file.txt"));
        System.out.println(PathTest.class.getClassLoader().getResource("file.txt"));
        System.out.println(this.getClass().getResourceAsStream("/file.txt"));
        System.out.println(PathTest.class.getResource("/file.txt"));
    }
}
