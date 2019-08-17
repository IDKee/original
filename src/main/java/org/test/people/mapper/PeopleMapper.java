package org.test.people.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.test.people.entity.People;

import java.util.List;
import java.util.Map;



/**
 * @author Administrator
 */
public interface PeopleMapper extends BaseMapper<People> {

    /**
     * @return
     */
    List<Map> selectListAll();

}
