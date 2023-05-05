package com.sci.dao;

import com.sci.models.Departments;
import com.sci.models.Employee;
import org.hibernate.Session;

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

import java.util.List;

public class DBDepartments {

    public List<Departments> get() {
        try (Session session = DBConfig.SESSION_FACTORY.openSession()) {
//      return session.createQuery("FROM Employee").list();
            return session.createSQLQuery("select * from hr.departments").addEntity(Departments.class).list();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

    public Departments get(Integer DepartmentsId) {

        try (Session session = DBConfig.SESSION_FACTORY.openSession()) {
            return session.get(Departments.class, DepartmentsId);

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        return null;
    }

    public Integer insert(Departments Departments) {

        Transaction transaction = null;
        int Department_ID = 0;

        try (Session session = DBConfig.SESSION_FACTORY.openSession()) {

            transaction = session.beginTransaction();

            Department_ID = (Integer) session.save(Departments);

            transaction.commit();

        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.err.println(ex.getMessage());
        }
        return Department_ID;
    }

    public void update(Departments Department) {

        Transaction transaction = null;

        try (Session session = DBConfig.SESSION_FACTORY.openSession()) {

            transaction = session.beginTransaction();

            session.update(Department);

            transaction.commit();

        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.err.println(ex.getMessage());
        }
    }

    public void delete(Integer DepartmentId) {

        Transaction transaction = null;

        try (Session session = DBConfig.SESSION_FACTORY.openSession()) {

            transaction = session.beginTransaction();

            Departments Department = get(DepartmentId);

            session.delete(Department);

            transaction.commit();

        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.err.println(ex.getMessage());
        }
    }



}

