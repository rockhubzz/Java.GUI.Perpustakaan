/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import java.sql.*;

/**
 *
 * @author raki
 */
public class DBHelper {
    private static Connection koneksi;
    private static final String URL = "jdbc:sqlserver://localhost: 1433; databaseName=db_perpus; encrypt=true; trustServerCertificate=true;";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "shrek";

    
    public static void bukaKoneksi(){
        if(koneksi == null){
        try {
            koneksi = DriverManager.getConnection (URL, USERNAME, PASSWORD);
            System.out.println("Koneksi ke database berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: "+ e.getMessage());
        }

        }
    }
    public static int insertQueryGetId(String query){
        bukaKoneksi();
        int num = 0;
        int result = -1;
        try{
            Statement stmt = koneksi.createStatement();
            num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()){
                result = rs.getInt(1);
            }
            rs.close();
            stmt.close();
        }
        catch (Exception e){
            e.printStackTrace();
            result = -1;
        }
        return result;
    }
    
    public static boolean executeQuery(String query){
        bukaKoneksi();
        boolean result = false;
        try{
            Statement stmt = koneksi.createStatement();
            stmt.executeUpdate(query);
            result = true;
            stmt.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    
    public static ResultSet selectQuery(String query){
        bukaKoneksi();
        ResultSet rs = null;
        try{
            Statement stmt = koneksi.createStatement();
            rs = stmt.executeQuery(query);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return rs;
    }
}
