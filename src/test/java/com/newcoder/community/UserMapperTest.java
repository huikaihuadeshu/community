package com.newcoder.community;

import com.newcoder.community.dao.DisscusspostMapper;
import com.newcoder.community.dao.UserMapper;
import com.newcoder.community.entity.Disscusspost;
import com.newcoder.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DisscusspostMapper disscusspostMapper;

    @Test
    public void testDiscuss(){
        List<Disscusspost> disscussposts = disscusspostMapper.selectDisscusspost(0, 2, 10);
        for(Disscusspost disscusspost : disscussposts){
            System.out.println(disscusspost);
        }

        int i = disscusspostMapper.selectDisscusspostRows(0);
        System.out.println(i);
    }

    @Test
    public void testSelect(){
        User liubei = userMapper.selectByUsername("liubei");
        System.out.println(liubei);

        liubei = userMapper.selectByEmail("nowcoder101@sina.com");
        System.out.println(liubei);

        liubei = userMapper.selectById(101);
        System.out.println(liubei);
    }
    @Test
    public void testInsert(){
        User user = new User();
        user.setCreatetime(new Date());
        user.setEmail("10086@qq.com");
        user.setUsername("newtset");
        user.setHeaderurl("http://images.nowcoder.com/head/14t.png");
        user.setStatus(0);
        user.setType(1);
        user.setSalt("49f10");
        int i = userMapper.insertUser(user);
        System.out.println(i);
    }
    @Test
    public void testUpdate(){
        int i = userMapper.updatePassword(150, "asldhasl");
        System.out.println(i);

        int i1 = userMapper.updateHeaderurl(150, "http://images.nowcoder.com/head/100t.png");
        System.out.println(i1);

        int i2 = userMapper.updateStatus(150, 1);
        System.out.println(i2);
    }
}
