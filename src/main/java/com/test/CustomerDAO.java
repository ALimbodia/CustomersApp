package com.test;

import java.util.List;

import org.hibernate.Session;

import com.test.pojo.Customer;

public class CustomerDAO {

	public void createNewCustomer(Customer c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(c.getAddress());
			session.save(c);
			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}

	public List<Customer> readCustomers() {
		List<Customer> customers = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			customers = session.createCriteria(Customer.class).list();
		} finally {
			session.close();
		}
		return customers;
	}

	public void updateCustomer(Customer c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.update(c.getAddress());
			session.update(c);
			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}

	public void deleteCustomer(Customer c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.delete(c);
			session.delete(c.getAddress());
			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}

}
