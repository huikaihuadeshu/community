package com.newcoder.community.dao;

import com.newcoder.community.entity.Disscusspost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DisscusspostMapper {
    List<Disscusspost> selectDisscusspost(int userid, int offset, int limit);

    int selectDisscusspostRows(@Param("userid") int userid);
}
