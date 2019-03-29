package spring.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {

	private static Connection con;
	private String dbUrl="jdbc:mysql:///test?serverTimezone=GMT"; 
	private String dbUserName="root"; 
	private String dbPassword="zhangjun"; 
	//private String jdbcName="com.mysql.cj.jdbc.Driver"; 
	
	
	public Connection getCon()throws Exception{
		Connection con=DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		return con;
	}
	
	public void closeCon(Connection con)throws Exception{
		if(con!=null){
			con.close();
		}
	}
	
	public static void main(String[] args) throws Exception {
		DbUtil dbUtil = new DbUtil();
		try {
			Connection con = dbUtil.getCon();
			System.out.println("连接成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("连接失败");
		}finally {
			dbUtil.closeCon(con);
			System.out.println("释放资源");

		}
	}
	
}
