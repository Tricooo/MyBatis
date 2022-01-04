package com.qhx.mybatis.dao;

import com.qhx.mybatis.bean.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    public Employee getEmpById(int id);

    public void addEmp(Employee employee);
    public void updateEmp(Employee employee);
    public void deleteEmpById(int id);

    public Employee getEmpByIdAndLastName(@Param("id")int id, String lastName);

    public Employee getEmpByMap(Map<String,Object> map);

    public List<Employee> getEmpByLastNameLike(String lastName);

    public Map<String,Object> getEmpByIdReturnMap(int id);

    //封装map使用哪个属性作为map的key
    @MapKey("id")
    public Map<String,Employee> getEmpByNameLike(String lastName);
}
