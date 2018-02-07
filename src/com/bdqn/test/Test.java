package com.bdqn.test;

import com.bdqn.entity.Dept;
import com.bdqn.service.DeptService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
        DeptService deptService = (DeptService) act.getBean("DeptServiceImpl");
        List<Dept> selectLimitDept = deptService.getSelectLimitDept(1, 3);
        for (Dept dept :
                selectLimitDept) {
            System.out.println(dept.toString());
        }

        List<Dept> selectAllDept = deptService.getSelectAllDept();
        System.out.println(selectAllDept.size());


    }
}
