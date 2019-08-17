package org.test.common.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Administrator
 */
public class BaseController {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 重定向
     */
    protected static String REDIRECT = "redirect:";

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected HttpServletResponse response;
}
