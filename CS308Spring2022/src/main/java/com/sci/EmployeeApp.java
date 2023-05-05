package com.sci;

import com.sci.criteria.FilterQuery;
import com.sci.criteria.Operator;
import com.sci.dao.DBConfig;
import com.sci.dao.DBEmployee;
import com.sci.models.Employee;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;

public class EmployeeApp {

  public static void main(String[] args) {
    DBEmployee dbEmployee = new DBEmployee();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//     To print all data in the table
//    List<Employee> employeeList = dbEmployee.get();
//    for(Employee e : employeeList) {
//      System.out.println(e);
//    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///------------------------------------------------------------------------------------------------///

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // to print one an element from the table
//        System.out.println(dbEmployee.get(206));
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///------------------------------------------------------------------------------------------------///

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    to insert
//    Employee employee = new Employee();
//    employee.setFirstName("Hassan");
//    employee.setLastName("Ahmed");
//    employee.setEmail("Hassan@sci.eg");
//    employee.setSalary(5000);
//    employee.setCommissionPct(0.5);
//    employee.setDepartmentId(50);
//    employee.setJobId("IT_PROG");
//    employee.setHireDate(new Date());
//
//    System.out.println(dbEmployee.insert(employee));
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///------------------------------------------------------------------------------------------------///

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // to update
//    Employee employee = dbEmployee.get(206);
//    employee.setLastName("Mustafa");
//    dbEmployee.update(employee);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///------------------------------------------------------------------------------------------------///

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//to delete
//        dbEmployee.delete(150);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //   List<FilterQuery> filterQueries = new ArrayList<>();
//    filterQueries.add(new FilterQuery("jobId", "SH_CLERK", Operator.EQ));
////    filterQueries.add(new FilterQuery("salary", 3000, Operator.GT));
//
//    List<Employee> employeeList = dbEmployee.getByFilter(filterQueries);
//    System.out.println("the size of the list = " + employeeList.size());
//    for(Employee employee : employeeList) {
//      System.out.println(employee);
//    }

//////////////////////////////////






    DBConfig.shutdown();

  }
}
