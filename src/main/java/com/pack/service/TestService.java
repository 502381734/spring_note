package com.pack.service;

import com.pack.controller.TestController;
import com.pack.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Neo
 * @date 2020/3/11 21:22
 */
@Service
public class TestService {

    @Autowired
    private Dao dao;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private TestController testController;

    @EventListener(ApplicationEvent.class)
    public void myListener(ApplicationEvent event){
        return;
    }

    @Transactional
    public void insert(){
        String sql = "insert user(username,`password`,email) values (?,?,?)";
        jdbcTemplate.update(sql,"张三","12345","12345");
//        int i = 1/0;
    }

    public TestService() {
        System.out.println("instantiating...");
    }
}
