package com.barber.checkin.controller;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.barber.checkin.dao.CustomerDao;
import com.barber.checkin.daoImpl.CustomerDaoImpl;
import com.barber.checkin.model.Customer;
import com.barber.checkin.util.DbUtil;


@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	CustomerDao customerDao = new CustomerDaoImpl();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Customer customer = new Customer();
	customer.setCustomer(request.getParameter("customer"));
	customer.setEmail(request.getParameter("email"));
	customer.setStyle(request.getParameter("style"));
	customer.setColoring(request.getParameter("coloring"));
	
	customerDao.saveUserInfo(customer);
		
		RequestDispatcher rd = request.getRequestDispatcher("customerList.jsp");
		request.setAttribute("customer", customer);
		rd.forward(request, response);
		
	}

}
