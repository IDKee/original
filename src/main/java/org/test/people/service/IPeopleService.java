package org.test.people.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.test.people.entity.People;
import org.test.people.mapper.PeopleMapper;

import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
public interface IPeopleService extends IService<People> {

    /**
     * @return
     */
    List<Map> selectListAll();
}
