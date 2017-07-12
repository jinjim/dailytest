package com.chen.spring.context;

import com.chen.apache.ParamJson;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author liang.chen
 * @date 2016-11-19
 */

@Configuration
public class MyConfig {


    /**
     * Bean 的装配，一种是通过Bean注解，一种是FactoryBean工厂
     *
     *
     */

    // 方式一
    @Bean(name = "myBean")  // 表示是一个配置类bean, 默认bean的名字是方法名字,单例
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // prototype
    public MyBean createMyBean(){
        return new MyBean();
    }
    // 方式一


    // 方式二
    @Bean(name = "jeepFactoryBean")
    public JeepFactoryBean getJeepFactoryBean(){
        return new JeepFactoryBean();
    }
    // 方式二


    // 方式三
    @Bean
    public CarFactory createCarFactoryo(){
        return new CarFactory();
    }

    @Bean
    public Car createCar(CarFactory factory){   // 默认会从spring context中获取一个CarFactory类型的实例组装成参数
        return factory.createCar();
    }
    // 方式三



    // 在装配合卸载时执行的方法
    @Bean
    public CatInitializingBean createCatInitializingBean(){
        return new CatInitializingBean();
    }

    @Bean
    public CatDispoableBean createCatDispoableBean(){
        return new CatDispoableBean();
    }

    @Bean(initMethod = "init", destroyMethod = "destory")
    public Cat createCat(){
        return new Cat();
    }

}
