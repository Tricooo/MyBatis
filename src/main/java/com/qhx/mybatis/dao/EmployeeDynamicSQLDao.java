package com.qhx.mybatis.dao;

import com.qhx.mybatis.bean.Employee;

import java.util.List;

public interface EmployeeDynamicSQLDao {

    public List<Employee> getEmpsByConditionIf(Employee employee);

    public List<Employee> getEmpsByConditionChoose(Employee employee);
}
