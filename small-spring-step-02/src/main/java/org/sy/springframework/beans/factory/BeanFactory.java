package org.sy.springframework.beans.factory;

import org.sy.springframework.beans.BeansException;

/**
 * @description: beanFactory 抽象接口
 * @author: SunYang
 * @date: 2022/2/9
 * @Copyright： sunyangqaq@foxmail.com
 */
public interface BeanFactory {
    /**
     * 获取Bean
     * @param beanName bean name
     * @return Object
     * @throws BeansException bean异常
     */
    Object getBean(String beanName) throws BeansException;

}
