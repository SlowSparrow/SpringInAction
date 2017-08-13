package com.test;

import com.configurations.PlayConfig;
import com.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by latham on 17-8-13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= PlayConfig.class)
public class PlayTest {

    @Autowired
    private User user;

    @Test
    public void test(){
        user.setAge(18);
        user.setName("li");
        user.add(10,15);
        String s = user.toString();
        System.out.println(s);
    }
}
