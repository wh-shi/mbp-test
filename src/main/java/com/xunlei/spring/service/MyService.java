package com.xunlei.spring.service;

import com.xunlei.spring.dao.MyDao;
import lombok.Data;

/**
 * Created by shiwenhuan on 2017/2/15.
 */
@Data
public class MyService {

    private MyDao myDao;

    public void addPerson() {
        myDao.select(1L);
    }

}
