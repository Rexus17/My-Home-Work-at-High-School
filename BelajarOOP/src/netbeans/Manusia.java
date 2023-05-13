/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeans;

/**                                                 "CONSTRUCTOR"
 *
 * @author Asus
 */
public class Manusia implements MakhlukHidup, Hobby {
    public String nama;
    private String alamat;
    protected Integer umur;
    protected String hobby;
    
    public Manusia() {
        this.nama = "Belum Ada Nama";
        this.alamat = "Apalagi Nama"; 
        this.umur = 0;
    }
    
    public Manusia(String nm, String almt) {
        this.nama = nm;
        this.alamat = almt;
    }
    
    public Manusia(String nm, String almt, int umur) {
        this.nama = nm;
        this.alamat = almt;
        this.umur = umur;
    }
    
    public void inputData(String nm) {                                  // Yang Diakses "Tampil 1"
        this.nama = nm;                             // OverLoad
        this.alamat = "Belum Jelas Alamat-nya";
    }
    
    public void inputData(String nm, String almt) {                     // Yang Diakses "Tampil 2"
        this.nama = nm;                                     // OverLoad
        this.alamat = almt;
    }
    
    public void inputData(String nm, int umur) {
        this.nama = nm;
        this.umur = umur;
    }
    
    public void inputData(String nm, String almt, int umur) {                        // Yang Diakses "Tampil 3"
        this.nama = nm;
        this.alamat = almt;
        this.umur = umur;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getAlamat() {
        return this.alamat;
    }
    
    public Integer getUmur() {
        return this.umur;
    }
    
    @Override 
    public String setBernafas() {
        return "Manusia bernafas Dengan Paru-Paru";
    }

    @Override
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String getHobby() {
        return this.hobby;
    }
    
}
