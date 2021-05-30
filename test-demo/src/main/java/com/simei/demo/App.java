package com.simei.demo;

import com.simei.demo.config.TestConfiguration;
import com.simei.demo.domain.Video;
import com.simei.demo.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description
 *
 * @author faming.yang@hand-china.com 2021-05-23 21:01
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeansManage.xml");
        Video video = (Video) applicationContext.getBean("video");
        System.out.println(video.getTitle());
		System.out.println(video.getBeanFactory());


		ApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);


		ApplicationContext aop = new ClassPathXmlApplicationContext("aop.xml");
		IUserService userService = aop.getBean(IUserService.class);
		System.out.println(userService.getClass());
		userService.save();
    }
}
