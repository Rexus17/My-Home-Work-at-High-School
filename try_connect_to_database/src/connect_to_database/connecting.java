/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect_to_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RIFAI
 */
public class connecting {
    
    private static Connection connecting;
    public static Connection getConnecting () {
        // cek, apakah koneksi NULL ???
        if (connecting == null) {
            try {
                String url = "http://localhost/phpmyadmin/index.php?route=/database/structure&server=1&db=form_penilaian_mahasiswa";
                String user = "echo";
                String password = "";
                
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/form_penilaian_mahasiswa");
                
                connecting = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Error Membuat Koneksi");
            }
        }
        return connecting;
    }
    
}
