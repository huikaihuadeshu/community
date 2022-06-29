package com.newcoder.community.service;

import com.newcoder.community.dao.DisscusspostMapper;
import com.newcoder.community.entity.Disscusspost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisscusspostService {
    @Autowired
    private DisscusspostMapper disscusspostMapper;

    public List<Disscusspost> findDisscussPosts(int userid, int offset, int limit){
        return disscusspostMapper.selectDisscusspost(userid, offset, limit);
    }
    public int findDisscussRows(int userid){
        return disscusspostMapper.selectDisscusspostRows(userid);
    }


}
