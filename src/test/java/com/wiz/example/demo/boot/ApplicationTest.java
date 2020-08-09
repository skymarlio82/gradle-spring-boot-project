package com.wiz.example.demo.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@AutoConfigureMockMvc
public class ApplicationTest {

//    @Autowired
//    private MockMvc mvc;

    @Test
    public void helloGradle() throws Exception {
//        mvc.perform(get("/"))
//            .andExpect(status().isOk())
//            .andExpect(content().string("Hello, Gradle!"));
//        assertEquals(new Integer(100), Integer.valueOf("100"));
    }
}