package com.bdqn.controllers;

import com.bdqn.entity.Dept;
import com.bdqn.service.DeptService;
import com.bdqn.utils.PageUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("deptController")
public class DeptController {
    @Resource
    private DeptService deptService;

    @RequestMapping("/getSelectLimitShow")
    public String getSelectLimitShow(@RequestParam(value = "index",required = false)String index,@ModelAttribute("Msg")String Msg,Model model){
        PageUtils pageUtils = new PageUtils();
        if (index == null || index =="") {
            index="1";
        }
        int indexInt = Integer.parseInt(index);
        pageUtils.setIndex(indexInt);
        pageUtils.setPageSize(3);
        pageUtils.setTotalCount(deptService.getSelectAllDept().size());
        pageUtils.getTotalPages();
        List<Dept> selectLimitDept = deptService.getSelectLimitDept(pageUtils.getIndex(), pageUtils.getPageSize());
        model.addAttribute("Msg",Msg);
        model.addAttribute("selectLimitDept",selectLimitDept);
        model.addAttribute("pageUtils",pageUtils);
        return "showInfo";
    }
}
