package org.test.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.test.system.entity.RolesPermissions;
import org.test.system.mapper.RolesPermissionsMapper;
import org.test.system.service.IRolesPermissionsService;

/**
 * @author Administrator
 */
@Service
public class RolesPermissionsService extends ServiceImpl<RolesPermissionsMapper, RolesPermissions> implements IRolesPermissionsService {
}
