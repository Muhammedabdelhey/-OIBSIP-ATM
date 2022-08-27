package atmv2;

import java.sql.SQLException;

public class system {

    private int user_id;
    private int password;
    private String user_name;
    private double user_balance;

    //singleton Design Pattren , create object from system to make user
    private static system user = null;

    //private constractuer will use in login function to create user object
    private system(int user_id, int password, String user_name, double user_balance) {
        this.user_id = user_id;
        this.password = password;
        this.user_name = user_name;
        this.user_balance = user_balance;
    }

    public system() {
    }

    // get user date from user instance field note it will have data after login
    public static system get_user() {
        return user;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public double getUser_balance() {
        return user_balance;
    }

    public static boolean login(int user_id, int password) throws SQLException {
        //create object from DataBaseServecs to deal with database
        DataBaseServecs dbs = new DataBaseServecs();
        //store all user data
        // if array have data that mean id found 
        Object[] user_database = dbs.get_user_database(user_id);
        // check password
        if (password == (int) user_database[1]) {
            /* if userid and password correct create user object using private constractur*/
            user = new system((int) user_database[0], (int) user_database[1], String.valueOf(user_database[2]), (double) user_database[3]);
            return true;
        }
        return false;
    }

    public void Deposit(double amount_of_money) throws SQLException {
        DataBaseServecs dbs = new DataBaseServecs();
        // get user balance from database
        double balance = dbs.get_balance_database(user.getUser_id());
        //update balance on database
        dbs.Update_balance_database(user.getUser_id(), (balance + amount_of_money));
        //update balance on object
        user.user_balance = user.getUser_balance() + amount_of_money;
        //store transation on database
        dbs.store_transation(user.user_id, user.getUser_name(), balance, balance + amount_of_money, "Deposit", String.valueOf(new java.util.Date()));
    }

    public int Withdraw(double amount_of_money) throws SQLException {
        DataBaseServecs dbs = new DataBaseServecs();
        double balance = dbs.get_balance_database(user.getUser_id());
        // check if you can make withdraw
        if (balance - amount_of_money >= 0) {
            dbs.Update_balance_database(user.getUser_id(), balance - amount_of_money);
            user.user_balance = user.getUser_balance() - amount_of_money;
            //store transation on database
            dbs.store_transation(user.user_id, user.getUser_name(), balance, balance - amount_of_money, "Withdraw", String.valueOf(new java.util.Date()));
            return 0;
        }
        return 1;
    }

    public int Transfer(int id, double amount_of_money) throws SQLException {
        DataBaseServecs dbs = new DataBaseServecs();
        // get sender_balance
        double sender_balance = dbs.get_balance_database(user.getUser_id());
        // check if he can make Transfer
        if (sender_balance - amount_of_money >= 0) {
            // call update method to update sender_balance 
            dbs.Update_balance_database(user.getUser_id(), sender_balance - amount_of_money);
            user.user_balance = user.getUser_balance() - amount_of_money;
            //get receiver_balance
            double receiver_balance = dbs.get_balance_database(id);
            //call update method to update receiver_balance now transfer done 
            dbs.Update_balance_database(id, receiver_balance + amount_of_money);
            dbs.store_transation(user.user_id, user.getUser_name(), sender_balance, sender_balance - amount_of_money, "Transfer", String.valueOf(new java.util.Date()));
            return 0;
        }
        return 1;
    }

}
