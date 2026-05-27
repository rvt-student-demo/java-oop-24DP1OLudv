package rvt.sqllite_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    final static String url = "jdbc:sqlite:todo.db";
    public static void main(String[] args) {
        createtable();

        add("Otzhumanje");
        add("Press kachatj");

        findAll();

        removebyID(3);

        System.out.println("Redigetais:");
        findAll();

    }
    public static void createtable() {
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS todo (" + "id INTEGER PRIMARY KEY, " + "task TEXT NOT NULL) STRICT";
            statement.executeUpdate(sql);
            statement.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void add(String task) {
        String sql = "INSERT INTO todo(task) VALUES(?)";

        try (Connection conn = DriverManager.getConnection(url); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, task);
            ps.executeUpdate();

            System.out.println("Pievienots: " + task);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void findAll() {
        String sql = "SELECT id, task FROM todo";

        try (Connection conn = DriverManager.getConnection(url); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            System.out.println("Visi uzdevumi: ");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("task"));

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void removebyID(int id) {
        String sql = "DELETE FROM todo WHERE id = ?";

        try(Connection conn = DriverManager.getConnection(url); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            int affected = ps.executeUpdate();

            if (affected > 0) {
                System.out.println("Dzests ID: " + id);
            }  else {
                System.out.println("ID neeksistee" + id);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
