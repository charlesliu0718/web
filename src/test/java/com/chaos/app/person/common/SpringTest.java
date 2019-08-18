package com.chaos.app.person.common;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载spring容器
 * @author LiuChao
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mapper.xml", "classpath:spring/spring-service.xml"})//配置junit spring配置文件的位置
public class SpringTest {

}
