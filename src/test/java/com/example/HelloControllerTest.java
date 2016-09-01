package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by qtr-ptc-7 on 9/1/2016.
 */
public class HelloControllerTest {

    HelloController controller = new HelloController();

    @Test
    public void shouldGreetUser() {
        assertEquals("Hello, username!", controller.hello("username"));
    }

}