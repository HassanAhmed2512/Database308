package com.sci;

import com.sci.dao.DBConfig;
import com.sci.dao.DBDepartments;
import com.sci.models.Departments;
import java.util.List;
import com.sci.criteria.FilterQuery;
import com.sci.criteria.Operator;
import com.sci.models.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class DepartmentsApp {

    public static void main(String[] args) {

        DBDepartments Department = new DBDepartments();

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////     To print all data in the table
//        List<Departments> FakeList = Department.get();
//        for (Departments e : FakeList) {
//            System.out.println(e);
//        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///------------------------------------------------------------------------------------------------///

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         to print one an element from the table
//        System.out.println(Department.get(210));
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///------------------------------------------------------------------------------------------------///

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    to insert
//        Departments Department1 = new Departments();
//        Department1.setDepartmentName("Ahmed");
//        Department1.setManagerId(114);
//        Department1.setLocationId(1700);
//
//    System.out.println(Department.insert(Department1));
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///------------------------------------------------------------------------------------------------///

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // to update
//        Departments Department1 = Department.get(310);
//        Department1.setDepartmentName("TEEEEEEEEEEEESTTTT");
//        Department.update(Department1);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///------------------------------------------------------------------------------------------------///

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//to delete
        Department.delete(310);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////














        DBConfig.shutdown();

    }
}
