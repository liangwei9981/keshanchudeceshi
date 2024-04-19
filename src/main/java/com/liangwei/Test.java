package com.liangwei;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

// 我的微信：dadudu6789
// 我的公众号：IT周瑜
public class Test {

	public static void main(String[] args) throws IOException {


		// 创建一个Spring容器
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context.getBean("zhouyuFactoryBean"));
		System.out.println(context.getBean("&zhouyuFactoryBean"));
		System.out.println(111222444);
		System.out.println(111222333);
		System.out.println("push test");

	}

}







