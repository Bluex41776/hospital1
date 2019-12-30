import java.sql.*;
public class DbHelper {
    
    private final String username="root";
    private final String password="11791052130abccbA";
    private final String dbUrl="jdbc:mysql://localhost:3306/hastalar?useSSL=false&serverTimezone=UTC";
    
    
    
    public Connection getConnection() throws SQLException{
        
     
        return DriverManager.getConnection(dbUrl, username, password);
    }
    public void showErrorMassage(SQLException exception){
        
        System.out.println("Hata : "+exception.getMessage());
         System.out.println("Hata kodu : "+exception.getErrorCode());
    }
}
