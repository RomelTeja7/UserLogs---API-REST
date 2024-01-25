package com.usersapi.dao;

import com.usersapi.model.Users;
import com.usersapi.util.ConnectionDB;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Romel
 */
public class UserDAO {

    public Users getUserById(String id_user) {
        Users user = new Users();
        String query = "SELECT * FROM users WHERE id_user = ?";

        try (Connection con = ConnectionDB.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, id_user);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    user.setId_user(rs.getString("id_user"));
                    user.setFirst_name(rs.getString("first_name"));
                    user.setLast_name(rs.getString("last_name"));
                    user.setEmail(rs.getString("email"));
                    user.setUser_name(rs.getString("user_name"));
                    user.setDate_of_birth(rs.getString("date_of_birth"));
                    user.setDate_of_registration(rs.getString("date_of_registration"));
                } else {
                    System.out.println("User with ID " + id_user + " not found.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public Users getUserByUsername(String user_name) {
        Users user = new Users();
        String query = "SELECT * FROM users WHERE user_name = ?";
        try (Connection con = ConnectionDB.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, user_name);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    user.setUser_name(rs.getString("user_name"));
                    user.setId_user(rs.getNString("id_user"));
                    user.setFirst_name(rs.getString("first_name"));
                    user.setLast_name(rs.getString("last_name"));
                    user.setEmail(rs.getString("email"));
                    user.setDate_of_birth(rs.getString("date_of_birth"));
                    user.setDate_of_registration(rs.getString("date_of_registration"));
                } else {
                    System.out.println("User with UserName " + user_name + " not found.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public List<Users> getAllUsers() {
        List<Users> userList = new ArrayList<>();
        String query = "SELECT * FROM users";
        try (Connection con = ConnectionDB.getConnection(); PreparedStatement ps = con.prepareStatement(query); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Users user = new Users();
                user.setId_user(rs.getString("id_user"));
                user.setFirst_name(rs.getString("first_name"));
                user.setLast_name(rs.getString("last_name"));
                user.setEmail(rs.getString("email"));
                user.setUser_name(rs.getString("user_name"));
                user.setDate_of_birth(rs.getString("date_of_birth"));
                user.setDate_of_registration(rs.getString("date_of_registration"));
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public Users addUser(Users user) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formatDate = dateFormat.format(date);

        String query = "INSERT INTO users (id_user, first_name, last_name, email, user_name, date_of_birth, date_of_registration) VALUES (?,?,?,?,?,?,?)";

        try (Connection con = ConnectionDB.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, randomId(user.getFirst_name(), user.getLast_name()));
            ps.setString(2, user.getFirst_name());
            ps.setString(3, user.getLast_name());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getUser_name());
            ps.setString(6, user.getDate_of_birth());
            ps.setString(7, formatDate);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public static String randomId(String first_name, String last_name) {
        if (first_name == null || last_name == null || first_name.isEmpty() || last_name.isEmpty()) {
            throw new IllegalArgumentException("Names cannot be empty");
        }

        char firstInit = first_name.charAt(0);
        char lastInit = last_name.charAt(0);

        int randomNumber = 100_000_000 + new Random().nextInt(900_000_000);

        return String.valueOf(firstInit) + lastInit + randomNumber;
    }
}
