package org.shenlan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by wangwei on 2016/9/9.
 */
@SpringBootApplication
@EnableAsync
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
