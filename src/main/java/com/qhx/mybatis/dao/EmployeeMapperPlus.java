package com.qhx.mybatis.dao;

import com.qhx.mybatis.bean.Employee;

public interface EmployeeMapperPlus {
    public Employee getEmpByPrimaryKey(Integer id);

    public Employee getEmpAndDept(Integer id);

    public Employee getEmpByIdStep(Integer id);
}
