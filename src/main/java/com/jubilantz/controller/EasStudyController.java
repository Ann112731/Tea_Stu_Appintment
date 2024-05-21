package com.jubilantz.controller;


import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/easStudy")
public class EasStudyController  {

    @RequestMapping("/index")
    @RequiresPermissions("study:query")
    public String index() throws Exception
    {
        return "system/study/index";
    }

}