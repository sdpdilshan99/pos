package com.pos.db;

import com.pos.entity.SystemUser;
import com.pos.util.PasswordGenerator;

import java.sql.*;
import java.util.UUID;

public class DatabaseAccessCode {

    public static boolean createUser(SystemUser user) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pos_system",
                "root",
                "1234");

        String sql = "INSERT INTO system_user VALUES(?,?,?,?,?,?)";

        PreparedStatement stm = connection.prepareStatement(sql);

        stm.setString(1, UUID.randomUUID().toString());
        stm.setString(2, user.getF_name());
        stm.setString(3, user.getL_name());
        stm.setString(4,user.getEmail());
        stm.setString(5,user.getContact_no());
        stm.setString(6, PasswordGenerator.hash(user.getPassword()));

        return stm.executeUpdate() > 0;
    }

    public static boolean loginUser(String email, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pos_system",
                "root",
                "1234");

        String sql = "SELECT * FROM system_user WHERE email = ?";

        PreparedStatement stm = connection.prepareStatement(sql);

        stm.setString(1, email);
        ResultSet rs = stm.executeQuery();

        if (rs.next()) {
            if(PasswordGenerator.check(password, rs.getString("password"))) {
                return true;
            }
            return false;
        }
        return false;
    }
}
