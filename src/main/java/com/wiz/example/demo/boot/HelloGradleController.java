package com.wiz.example.demo.boot;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloGradleController {
    private Log logger = LogFactory.getLog(HelloGradleController.class);

    @GetMapping
    public String helloGradle(String name) {
        logger.debug("===> Input name : " + name);
        String result = StringUtils.hasText(name) ? ("Hello, " + name + "!") : "Hello, Gradle1!";
        logger.info("RESTful Result : " + result);
        return result;
    }
}