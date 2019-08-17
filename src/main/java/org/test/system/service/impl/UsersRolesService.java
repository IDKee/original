package org.test.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.test.system.entity.UsersRoles;
import org.test.system.mapper.UsersRolesMapper;
import org.test.system.service.IUserRolesService;

/**
 * @author Administrator
 */
@Service
public class UsersRolesService extends ServiceImpl<UsersRolesMapper, UsersRoles> implements IUserRolesService {
}
