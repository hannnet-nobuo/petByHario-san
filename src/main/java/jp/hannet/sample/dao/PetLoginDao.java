package jp.hannet.sample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import jp.hannet.sample.common.DbAccess;
import jp.hannet.sample.model.PetUserMapping;

public class PetLoginDao {

	public boolean validate(Integer userId,String userpass){  
		 boolean status=false;
		 String strId = Integer.toString(userId);
		  try{	
		   Class.forName("com.mysql.jdbc.Driver");  
		   Connection con=DriverManager.getConnection(  
		   "jdbc:mysql://localhost.lo:3306/petbooking","root","rootsh04");  
		     
		   PreparedStatement ps=con.prepareStatement(  
		     "select * from user where USER_ID=? and USER_PW=?");  
		   ps.setString(1,strId);  
		   ps.setString(2,userpass);  
		   ResultSet rs=ps.executeQuery();  
		   status=rs.next();  
		  }catch(Exception e){e.printStackTrace();}  
		 return status;  
		}  

}
