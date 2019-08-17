package org.test.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.test.common.base.BaseController;
import org.test.system.entity.Users;
import org.test.system.service.IUserService;

import java.util.List;

/**
 * @author Administrator
 */
@Controller
public class UsersController extends BaseController {

    @Autowired
    private IUserService userService;

    @GetMapping()
    public String list(){
        List<Users> list = userService.list();
        request.setAttribute("list", list);
        return "users/list";
    }
}
