package org.test.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.test.system.entity.Roles;
import org.test.system.mapper.RolesMapper;
import org.test.system.service.IRolesService;

/**
 * @author Administrator
 */
@Service
public class RolesService extends ServiceImpl<RolesMapper, Roles> implements IRolesService {
}
