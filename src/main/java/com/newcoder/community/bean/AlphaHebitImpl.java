package com.newcoder.community.bean;

import org.springframework.stereotype.Repository;

@Repository
public class AlphaHebitImpl implements AlphaDao{
    @Override
    public String select() {
        return "HebitImpl";
    }
}
