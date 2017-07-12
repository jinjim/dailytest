package com.chen.spring.context;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author liang.chen
 * @date 2016-11-19
 */
@Component          // 没有明确的使用分层含义
//@Repository           // 一般使用在数据访问层
//@Service              // 一般使用在业务逻辑层
//@Controller           // 一般使用在视图控制层
public class User {  // 默认bean的名字是小写字母开头的类名
}
