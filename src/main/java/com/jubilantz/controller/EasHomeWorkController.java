package com.jubilantz.controller;

import com.jubilantz.entity.EasHomeWork;
import com.jubilantz.services.EasHomeWorkService;
import com.jubilantz.utils.MyFormAuthenticationFilter;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/easStudy")
public class EasHomeWorkController {

    @Autowired
    private EasHomeWorkService easHomeWorkService;

    @RequestMapping("/add")
    @RequiresPermissions("study:add")
    public String add(Model model) {
        // 获取 homework 数据
//        List<EasHomeWork> homeworkList = easHomeWorkService.getAllEasHomeWork();
        List<EasHomeWork> homeworkList = easHomeWorkService.getEasHomeWorkByStuId(123);
        // 将 homework 数据传递到前端
        model.addAttribute("homeworkList", homeworkList);
        // 返回前端页面
        return "system/study/add";
    }
}