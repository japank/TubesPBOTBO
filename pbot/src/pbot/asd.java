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
public class asd extends abstr{
    public void selamat(){
        JOptionPane.showMessageDialog(null, "Login berhasil");
    }

    public static void asdd (){
        asd sd=new asd();
        sd.selamat();
    }    
    
    public static void main(String args[]){

    }
}