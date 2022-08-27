package atmv2;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseServecs {
    
    private static double balance;
    
    public static Object[] get_user_database(int user_id) throws SQLException {
        DataBase db = DataBase.start_connection();
        String sql = "select * from Uesrs where user_id = " + user_id;
        ResultSet result = db.st.executeQuery(sql);
        Object[] user = new Object[4];
        while (result.next()) {
            user[0] = (Object) result.getInt("user_id");
            user[1] = (Object) result.getInt("password");
            user[2] = (Object) result.getString("user_name");
            user[3] = (Object) result.getDouble("user_balance");
        }
        return user;
    }

    public static double get_balance_database(int user_id) throws SQLException {
        DataBase db = DataBase.start_connection();
        String sql = "select user_balance from Uesrs where user_id = " + user_id;
        ResultSet result = db.st.executeQuery(sql);
        while (result.next()) {
            balance=result.getFloat("user_balance");
        }
  
        return balance;
    }

    public static void Update_balance_database(int user_id, double balance) throws SQLException {
        DataBase db = DataBase.start_connection();
        String sql = "update Uesrs set user_balance= " + balance + " where user_id=" + user_id;
        db.st.executeUpdate(sql);
    }
    
    public void store_transation(int id,String name,double balance_befor,double balance_after,String transation_type,String transation_date) throws SQLException{
        DataBase db = DataBase.start_connection();
        String sql = "insert into Transactions values ("+id+","+"'"+name+"'"+","+balance_befor+","+balance_after+","
                +"'"+transation_type+"'"+","+"'"+transation_date+"'"+")";
        db.st.executeUpdate(sql);
    }
    public ResultSet get_Transactions_database(int id) throws SQLException{
        DataBase db = DataBase.start_connection();
        String sql = "select * from Transactions where user_id = " + id;
        ResultSet result = db.st.executeQuery(sql);
        return result;
    }

}
