package com.simei.demo.config;

import org.springframework.context.annotation.Configuration;

/**
 * description
 *
 * @author faming.yang@hand-china.com 2021-05-30 23:43
 */
@Configuration
public class TestConfiguration {
	public TestConfiguration() {
		System.out.println("TestConfiguration容器启动初始化。。。");
	}
}