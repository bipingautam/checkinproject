package com.barber.checkin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.barber.checkin.model.Customer;
import com.barber.checkin.util.DbUtil;

public interface CustomerDao {

	void saveUserInfo(Customer customer);
	
}