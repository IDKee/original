package org.test.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.test.system.entity.Users;
import org.test.system.mapper.UsersMapper;
import org.test.system.service.IUserService;

/**
 * @author Administrator
 */
@Service
public class UsersService extends ServiceImpl<UsersMapper, Users> implements IUserService {
}
