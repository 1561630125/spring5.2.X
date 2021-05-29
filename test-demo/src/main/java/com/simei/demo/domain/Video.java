package com.simei.demo.domain;

import lombok.Data;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * description
 *
 * @author faming.yang@hand-china.com 2021-05-23 20:57
 */
@Data
public class Video implements ApplicationContextAware , BeanFactoryAware {
    private int id;
    private String title;

    private ApplicationContext applicationContext;
    private BeanFactory beanFactory;
}
