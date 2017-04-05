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

	public static boolean validate(Integer userId,String userpass){  
		 boolean status=false;
		 String strId = Integer.toString(userId);
		  try{  
		   Class.forName("oracle.jdbc.driver.OracleDriver");  
		   Connection con=DriverManager.getConnection(  
		   "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
		     
		   PreparedStatement ps=con.prepareStatement(  
		     "select * from user3333 where name=? and password=?");  
		   ps.setString(1,strId);  
		   ps.setString(2,userpass);  
		   ResultSet rs=ps.executeQuery();  
		   status=rs.next();  
		  }catch(Exception e){e.printStackTrace();}  
		 return status;  
		}  

}
