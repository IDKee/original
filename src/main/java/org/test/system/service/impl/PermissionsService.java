package org.test.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.test.system.entity.Permissions;
import org.test.system.mapper.PermissionsMapper;
import org.test.system.service.IPermissionsService;

/**
 * @author Administrator
 */
@Service
public class PermissionsService extends ServiceImpl<PermissionsMapper, Permissions> implements IPermissionsService {

}
