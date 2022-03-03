package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");// step 2  class loader 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sam","root", "1234");//step 3 create connection
		
		Statement st = con.createStatement();// step 4
		//String query = "create table emp1(ID int primary key,SName varchar(20), location varchar(20))";//step 6
		//String query = "insert into emp1 values(3,'Sahil','pune')";
			
		//deleting row from table
		//String query3 = "delete from emp1 where ID=2";
		
		//st.executeUpdate(query3);
		
		System.out.println("| ID | Name  | location |");
		ResultSet rs= st.executeQuery("SELECT * from emp1");
		while(rs.next()){
			
			System.out.print("| "+rs.getString(1)+"  | ");
			System.out.print(rs.getString(2)+" | ");
			System.out.print(rs.getString(3)+" | ");
			System.out.println("");
		}
		
		
		//st.executeUpdate(query);
		
		//System.out.println("Employee Table created successfully");
		
		//System.out.println("Row effected successfully");
		
	st.close();
	con.close();


	}

}
