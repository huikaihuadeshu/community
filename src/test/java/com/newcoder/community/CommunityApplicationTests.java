package com.newcoder.community;

import com.newcoder.community.bean.AlphaDao;
import com.newcoder.community.service.AlphaService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration
class CommunityApplicationTests implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Test
    public void testApplicationContext(){
        AlphaDao alphaDao = applicationContext.getBean(AlphaDao.class);
        AlphaService alphaService = applicationContext.getBean("alphaService", AlphaService.class);
        System.out.println(alphaService);
        AlphaService bean = applicationContext.getBean(AlphaService.class);
        System.out.println(bean);
        SimpleDateFormat bean1 = applicationContext.getBean(SimpleDateFormat.class);
        String format = bean1.format(new Date());
        System.out.println(format);

    }
}
