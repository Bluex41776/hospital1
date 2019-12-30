
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



/**
 *
 * @author altrk
 */
public class Crud  {
    
     public static ArrayList<Hastalar> getData() throws SQLException{
        
        DbHelper dbHelper=new DbHelper();
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet;
        ArrayList<Hastalar> hastalar1=new ArrayList<Hastalar>();;
    
        // Bir nesnenin fonksiyonlarını kullanabilmek için o nesneyi kesinlikle newlemek gerekir.
        try{
            connection=dbHelper.getConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery("Select * from tablomuz");
            
            while(resultSet.next()){
                                    
                //Getirilicek datalar belirtilen alanlara sırasıyla yazılmalıdır.!!
                // constructer ile aynı şekilde yazılmalıdır.Yazılmaz data yanlış yere yazılır.
                //Ayrıca veritabanındaki kolon isimleri doğru yazılmalıdır.
                hastalar1.add(new Hastalar(
                        
                        resultSet.getString("İsimSoyisim")
                        ,resultSet.getInt("TcKimlikNo")
                        ,resultSet.getInt("Yaş")
                        ,resultSet.getString("Cinsiyet")
                        ,resultSet.getString("Hastalıkİsmi")
                        ,resultSet.getString("RandevuSaati")
                        ,resultSet.getString("PoliKlinikİsmi")
                        ,resultSet.getString("Doktorİsmi")
                ));
                        
                
            }
             
        }catch(SQLException exception){
            dbHelper.showErrorMassage(exception);
        }finally{
            statement.close();
            connection.close();
            
        }
        
        
        return hastalar1;
    }
    
    
    
}
