package com.qhx.mybatis.test;


import com.qhx.mybatis.bean.Employee;
import com.qhx.mybatis.dao.EmployeeDynamicSQLDao;
import com.qhx.mybatis.dao.EmployeeMapper;
import com.qhx.mybatis.dao.EmployeeMapperPlus;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMybatis {

    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource="mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        return build;
    }

    @Test
    public void test() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeDynamicSQLDao mapper = sqlSession.getMapper(EmployeeDynamicSQLDao.class);
        //Employee empById = mapper.getEmpById(1);
        //System.out.println(empById);
        //Employee abc = new Employee(null, "abc", "q@163.com", "1");
        //mapper.addEmp(abc);
        //System.out.println(abc.getId());
        //mapper.updateEmp(new Employee(1,"alice","qq","0"));
        //mapper.deleteEmpById(1);
        //sqlSession.commit();
        //Employee tom = mapper.getEmpByIdAndLastName(2, "mike");
//        Map<String,Object> map=new HashMap<>();
//        map.put("id",2);
//        map.put("lastName","mike");
//        Employee empByMap = mapper.getEmpByMap(map);
//        System.out.println(empByMap);
//        List<Employee> empByLastNameLike = mapper.getEmpByLastNameLike("%i%");
//        for(Employee em:empByLastNameLike){
//            System.out.println(em);
//        }
//        Map<String, Object> empByIdReturnMap = mapper.getEmpByIdReturnMap(2);
//        System.out.println(empByIdReturnMap);
        //Map<String, Employee> empByNameLike = mapper.getEmpByNameLike("%i%");
        //Employee empAndDept = mapper.getEmpAndDept(1);
//        Employee empByIdStep = mapper.getEmpByIdStep(2);
//        System.out.println(empByIdStep);
        Employee employee = new Employee(null, "%i%", "%163%", null,null);
        List<Employee> empsByConditionIf = mapper.getEmpsByConditionIf(employee);
        for(Employee em:empsByConditionIf){
            System.out.println(em);
        }
        sqlSession.close();
        System.out.println("111");
    }
}
