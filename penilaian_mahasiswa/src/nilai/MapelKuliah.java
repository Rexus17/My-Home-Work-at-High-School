/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai;

/**
 *
 * @author RIFAI
 */
public class MapelKuliah {
    private String kodeMapkul;
    private String namaMapkul;
    private int nilaiHarian;
    private int nilaiPts;
    private int nilaiPas;
    private int nilaiSks;
    
    public void setKodeMapkul(String kodeMapkul) {
        switch(kodeMapkul) {
            case "KD001":
                this.namaMapkul = "Kimia";
                break;
            case "KD002":
                this.namaMapkul = "Fisika";
                break;
            case "KD003":
                this.namaMapkul = "Biologi";
                break;
            case "KD004":
                this.namaMapkul = "Teknologi";
                break;
                
            default:
                this.namaMapkul = "";
        }
    }
    
    public String getNamaMapkul() {
        return this.namaMapkul;
    }
    
    public void setNilaiHarian(int nilaiHarian) {
        this.nilaiHarian = nilaiHarian;
    }
    
    public void setNilaiPts(int nilaiPts) {
        this.nilaiPts = nilaiPts;
    }
    
    public void setNilaiPas(int nilaiPas) {
        this.nilaiPas = nilaiPas;
    }
    
    public int getTotalNilai() {
        int totalHarian = (int) (this.nilaiHarian * 0.5);
        int totalPts = (int) (this.nilaiPts * 0.25);
        int totalPas = (int) (this.nilaiPas * 0.25);
        
        return totalHarian + totalPts + totalPas;
    }
    
    public char getGrade() {
        int totalNilai = this.getTotalNilai();
        
        if (totalNilai >= 85) {
            return 'A';
        } else if (totalNilai >= 75) {
            return 'B';
        } else if (totalNilai >= 65) {
            return 'C';
        } else {
            return 'D';
        }
    }
    
    public int getGradePoint() {
        char grade = this.getGrade();
        
        switch(grade) {
            case 'A':
                return 4;
            case 'B':
                return 3;
            case 'C':
                return 2;
                        
            default:
                return 1;       
        }
    }
    
    public void setSks(int sks) {
        this.nilaiSks = sks;
    }
    
    public int getSks() {
        return this.nilaiSks;
    }
    
}
