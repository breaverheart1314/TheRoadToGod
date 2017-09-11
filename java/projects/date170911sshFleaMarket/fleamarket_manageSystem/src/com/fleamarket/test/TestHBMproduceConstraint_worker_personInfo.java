package com.fleamarket.test;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestHBMproduceConstraint_worker_personInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String sql=  "insert into";//已经在terminal测试成功
			PreparedStatement preparedStatement = SQL_UTIL.getConnection().prepareStatement(sql);
			preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
