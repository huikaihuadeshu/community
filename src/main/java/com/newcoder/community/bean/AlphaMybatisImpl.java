package com.newcoder.community.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("alphaMybatis")
@Primary
public class AlphaMybatisImpl implements AlphaDao{

    @Override
    public String select() {
        return "AlphaMybatis";
    }
}
