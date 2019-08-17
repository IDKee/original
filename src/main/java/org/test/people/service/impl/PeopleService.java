package org.test.people.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.people.entity.People;
import org.test.people.mapper.PeopleMapper;
import org.test.people.service.IPeopleService;

import java.util.List;
import java.util.Map;

/**
 * @author panjie
 * @Description:org.test.people.service
 * @date 2019/7/23 18:01 
 */


@Service
public class PeopleService extends ServiceImpl<PeopleMapper, People> implements IPeopleService{

    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    public List<Map> selectListAll() {
        return peopleMapper.selectListAll();
    }
}
