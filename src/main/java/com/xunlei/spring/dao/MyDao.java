package com.xunlei.spring.dao;

import com.xunlei.spring.module.Person;
import lombok.Data;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by shiwenhuan on 2017/2/16.
 */
@Data
public class MyDao {

    private SqlSessionTemplate sqlSession;

    public void select(Long id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        List<Person> persons = sqlSession.selectList("MyMapper.select", params);
        persons.forEach(p -> System.out.println(p.getName()));
    }
}
