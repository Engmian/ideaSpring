package com.bdqn.service;

import com.bdqn.entity.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> getSelectAllDept();
    List<Dept> getSelectLimitDept(Integer index,Integer pageSize);
}
