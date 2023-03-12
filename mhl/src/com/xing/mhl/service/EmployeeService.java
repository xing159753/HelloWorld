package com.xing.mhl.service;

import com.xing.mhl.dao.EmployeeDAO;
import com.xing.mhl.domain.Employee;

//该类完成对employee表的各种操作(通过调用EmployeeDAO对象完成)
public class EmployeeService {
    //定义一个 EmployeeDAO属性
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    // 方法，根据empId 和 pwd 返回一个Employee对象
    //如果查询不到，就返回null
    public Employee getEmployeeByIdAndPwd(String empId,String pwd) {

        return employeeDAO.querySingle("select * from employee=? and pwd=md5(?)",Employee.class,empId,pwd);
    }

}
