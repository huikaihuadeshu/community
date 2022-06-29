package com.newcoder.community.service;

import com.newcoder.community.bean.AlphaDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype")
@Slf4j
public class AlphaService {

    public AlphaService(){
        System.out.println("构造AlphaService");
    }
    @PostConstruct
    public void afterContr(){
        System.out.println("AlphaService构建");
    }
    @PreDestroy
    public void beforeDestory(){
        System.out.println("AlphaService销毁");
    }
    @Autowired
    @Qualifier("alphaHebitImpl")
    AlphaDao alphaDao;

    public String select(){

        return alphaDao.select();
    }
}
