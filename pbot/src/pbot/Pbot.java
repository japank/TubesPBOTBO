/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbot;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS ROG
 */
public class Pbot extends abstr{
    
    public void selamat(){
        JOptionPane.showMessageDialog(null, "Koneksi DB berhasil");
    }
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost/pbot"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Pbot ss = new Pbot();
            ss.selamat();
            mysqlconfig=(Connection) DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tidak ada koneksi DB"); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }    
    
    public static void main(String args[]){

    }
}
