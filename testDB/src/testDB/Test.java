package testDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Test {

	public static void main(String[] args){
		TestUserDAO dao=new TestUserDAO();
		dao.select("taro", "123");
	}

}

public void selectAll(){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();


	String sql="select *  form test_table";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while (rs.next()){
			System.out.println(rs.getString("user_name"));
			System.out.println(rs.getString("password"));
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	try{
		con.close();

	}catch(SQLException e){
		e.printStackTrace();
	}
}