package com.bdqn.service.impl;

import com.bdqn.dao.DeptMapper;
import com.bdqn.entity.Dept;
import com.bdqn.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("DeptServiceImpl")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> getSelectAllDept() {
        return deptMapper.getSelectAllDept();
    }

    @Override
    public List<Dept> getSelectLimitDept(Integer index, Integer pageSize) {
        return deptMapper.getSelectLimitDept((index-1)*pageSize,pageSize);
    }
}
