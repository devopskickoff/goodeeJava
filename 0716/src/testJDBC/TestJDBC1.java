package testJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC1 {
   public static void main(String[] args) {
      //1.드라이버 로딩하기
      try
      {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("드라이브 로딩 성공");
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
      
      String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
      String userid="user01";
      String pwd ="1234";
      //java.sql.*
      Connection conn = null;
      Statement stmt=null;
      ResultSet rs = null;
      
      try
      {
         conn = DriverManager.getConnection(url, userid, pwd);
         System.out.println("연결성공");
         
         stmt = conn.createStatement();
         String sql="select * from member";
         rs=stmt.executeQuery(sql);
         while(rs.next())
         {
            System.out.printf("%s %s %s %s %s %s \n",
                  rs.getString("id"), rs.getString("userid"),
                  rs.getString("password"), rs.getString("username"),
                  rs.getString("phone"), rs.getString("email"),
                  rs.getString("wdate"));
         }
      }
      catch(SQLException se) //폭포수 모델이라 Exception이 잴 나중에
      {
         se.printStackTrace();
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
   }
}