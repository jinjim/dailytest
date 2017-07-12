package com.chen.spring.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liang.chen
 * @date 2016-11-19
 */
public class AnnotationConfigClient01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        System.out.println("================================================");

        System.out.println(context.getBean(MyBean.class));          // 根据类型获取 MyBean
        System.out.println(context.getBean("myBean"));              // 根据名字获取

        System.out.println(context.getBean(Jeep.class));            // 根据类型获取
        System.out.println(context.getBean("jeepFactoryBean"));     // FactoryBean 获取 Jeep bean 对象
        System.out.println(context.getBean("&jeepFactoryBean"));    // 获取FactoryBean本上bean
        System.out.println(context.getBean(JeepFactoryBean.class));    // 获取FactoryBean本上bean


        System.out.println(context.getBean(Car.class));    // 参数注入然后获取bean


        System.out.println(context.getBean(CatInitializingBean.class));    // 参数注入然后获取bean
        System.out.println(context.getBean(CatDispoableBean.class));    // 参数注入然后获取bean
        System.out.println(context.getBean(Cat.class));
        context.close();
    }
}
