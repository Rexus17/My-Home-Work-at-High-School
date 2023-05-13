/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeans;

/**
 *
 * @author Asus
 */
public class Motor extends Kendaraan {
    
    private String merk;
    private String warna;
    private String th;
    
    public Motor() {
        this.merk = "Honda Supra 125";
        this.warna = "Merah Hitam";
        this.th = "2015";
    }
    
    public Motor(String merk, String warna, String th) {
        this.merk = merk;
        this.warna = warna;
        this.th = th;
    }
    
    public String getMerk() {
        return this.merk;
    }
    
    public String getWarna() {
        return this.warna;
    }
    
    public String getTh() {
        return this.th;
    }
    
    @Override 
    public void setBbm(String bbm) {
        this.bbm = bbm; 
    }
    
}
