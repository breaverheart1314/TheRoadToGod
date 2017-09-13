//静态变量/类变量不是对象的属性,而是一个类的属性,spring则是基于对象层面上的依赖注入。---------------------直接xml配置不行啊	
package com.fleamarket.util;
//spring使用jdbc是使用数据源就是这个bean:dataSource
//为了使用spring的jdbc,好像过时了-----好像是直接在action里使用
//import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
//import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.fleamarket.domain.PersonInfo;
//import com.sun.corba.se.impl.ior.GenericTaggedComponent;

//import com.fleamarket.domain.PersonInfo;

//这个类用来从数据库内获取bean
public class FromDB_getBean  {
	
	private DataSource dataSource = null;//这个有用的
	private static DataSource ds_static = null;
	
	public static void close(Connection connection,Statement statement,ResultSet resultSet) {
		try {
			if(!resultSet.wasNull()&&!resultSet.isClosed()) {
				resultSet.close();
			}
			if(statement != null && !statement.isClosed()){
				statement.close();
			}
			if(connection != null && !connection.isClosed())
				connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	private static FromDB_getBean db_getBean;
	public void init() {//http://blog.csdn.net/chen1403876161/article/details/53644024:用自己的类来注入
//		db_getBean = this;//用生成的对象实例赋值给类变量------通过xml,init-method初始化这个方法
		FromDB_getBean.ds_static = this.dataSource;
	}
	//这个用途是，applicationContext依赖注入非静态成员变量，然后使用的时候使用静态方法，所以我又弄了个静态的,等他注入完成
	//http://blog.csdn.net/doctor_who2004/article/details/50532169：博客说，直接给变量注入不支持，可以通过setter方法，
	//这个静态方法不能使用非静态变量，，，，所以就GG了，上面blog说，static是可以注入的
	public static PersonInfo getPersonInfoForEmail(String email) {
//		System.out.println("data-source-static:"+ds_static);
		String sql = "select  password,ID from PERSON_INFO where email=?";
		try {
			Connection connection  = ds_static.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet == null || resultSet.next() == false) {
				System.out.println("this email is non exist");
				return null;
			}
			PersonInfo info = new PersonInfo();
			info.setPassword(resultSet.getString(1));
			info.setId(resultSet.getInt(2));
			return info;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/*private static SimpleJdbcTemplate jdbcTemplate;
	//-----------------------------------获取一个person_info,通过email--------------------
	public static PersonInfo getOnePersonInfoThroughEmail() {
		
		return null;
	}
	
	public static SimpleJdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public static void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
		FromDB_getBean.jdbcTemplate = jdbcTemplate;
	}*/

public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	/*	public DataSource getDataSource() {
		return dataSource;
	}*/
	public static DataSource getDs_static() {
		return ds_static;
	}
	public static void setDs_static(DataSource ds_static) {
		FromDB_getBean.ds_static = ds_static;
	}

	/*public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello hibernate");
	}
	
}
