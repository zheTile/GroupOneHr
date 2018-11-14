package com.groupone.gohr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * className:GroupOneHrMainApp
 * discriptoin:SpringBoot启动函数
 * author:朱得鑫
 * createTime:2018-11-13 21:18
 */
@SpringBootApplication
@MapperScan("com.groupone.gohr.dao")
public class GroupOneHrMainApp {
    public static void main(String[] args) {
        SpringApplication.run(GroupOneHrMainApp.class);
    }
}
