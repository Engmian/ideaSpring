package com.bdqn.dao;

import com.bdqn.entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {
    List<Dept> getSelectLimitDept(@Param("index")Integer index,@Param("pageSize")Integer pageSize);
    List<Dept> getSelectAllDept();
}
