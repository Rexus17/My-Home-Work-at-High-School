/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeans;

/**                                             INHERITENCE
 *
 * @author Asus
 */
public class Mahasiswa extends Manusia {
    String nim;
    String jurusan;
    Motor vario;
    
    public Mahasiswa() {
        super();
        vario = new Motor();
        this.nim = "Belum Ada nim";
        this.jurusan = "apalagi jurusan";
    }
    
    public Mahasiswa(String nim, String nm, String almt, String jur, int umur, Motor m) {
        super(nm, almt, umur);
        this.vario = m;
        this.nim = nim;
        this.jurusan = jur;
    }
    
    public void inputDataMhs(String nim, String jurusan) {
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void inputDataMhs(String nim, String nm, String almt, String jur, int umur) {
        super.inputData(nm, almt, umur);
        this.nim = nim;
        this.jurusan = jur;
    }
    
    public String getNim() {
        return this.nim;
    }
    
    public String getJurusan() {
        return this.jurusan;
    }
    
    public Motor GetMotor() {
        return this.vario;
    }
    
}
