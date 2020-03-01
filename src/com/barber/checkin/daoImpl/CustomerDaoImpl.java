package com.barber.checkin.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.barber.checkin.dao.CustomerDao;
import com.barber.checkin.model.Customer;
import com.barber.checkin.util.DbUtil;

public class CustomerDaoImpl  implements CustomerDao{
    public static final String SQL ="insert into customer_tbl(customer, email, style, coloring)values(?,?,?,?)";  

	public void saveCustomerInfo(Customer customer) {
		try(Connection con = DbUtil.getConnection();
			 PreparedStatement ps = con.prepareStatement(SQL);
			){
		ps.setString(1, customer.getCustomer());
		ps.setString(2, customer.getEmail());
		ps.setString(3, customer.getStyle());
		ps.setString(4, customer.getColoring());
		ps.executeUpdate();
		
	}catch (ClassNotFoundException|SQLException e) {
		e.printStackTrace();
	}

}

	@Override
	public void saveUserInfo(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
