package pborandika;

public class MataKuliah {
    private String kodeMatkul;
    private String namaMatkul;
    private int nilaiHarian;
    private int nilaiPts;
    private int nilaiPas;
    private int sks;
    
    public void setKodeMatkul(String kodeMatkul) {
        switch(kodeMatkul) {
            case "KD001":
                this.namaMatkul = "MATEMATIKA";
                break;
                
            case "KD002":
                this.namaMatkul = "PENDIDIKAN AGAMA";
                break;
                
            case "KD003":
                this.namaMatkul = "PENDIDIKAN KEWARGANEGARAAN";
                break;
                
            case "KD004":
                this.namaMatkul = "PENJAS";
                break;
                
            default:
                this.namaMatkul = "";
        }
    }
    
    public String getNamaMatkul() {
        return this.namaMatkul;
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
        
        if(totalNilai >= 85) {
            return 'A';
        } else if(totalNilai >= 75) {
            return 'B';
        } else if(totalNilai >= 65) {
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
        this.sks = sks;
    }
    
    public int getSks() {
        return this.sks;
    }
}
