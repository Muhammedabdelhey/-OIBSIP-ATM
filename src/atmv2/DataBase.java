package atmv2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

    Connection conn;
    Statement st;
    

    //Apply singleton Design Pattren , create one object from datebase class
    private static DataBase DB = null;
    //first step make constractuer private
    private DataBase() throws SQLException {
        String ConnectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=ATM;username=muhammed;password=madridsta36702309;";
        conn = DriverManager.getConnection(ConnectionUrl);
        st = conn.createStatement();
    }

    //2 make factory function
    public static DataBase start_connection() throws SQLException {
        if (DB == null) {
            DB = new DataBase();
        }
        return DB;
    }

    public void Close() throws SQLException {
        st.close();
        conn.close();
    }

}
