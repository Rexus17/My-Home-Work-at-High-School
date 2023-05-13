package pborandika;
import java.util.*;

public class DaftarMataKuliah {
    List<MataKuliah> listMatkul = new ArrayList<MataKuliah>();
    
    public void addMatkul(MataKuliah matkul) {
        listMatkul.add(matkul);
    }
    
    public List getAllMatkul() {
        return this.listMatkul;
    }
    
    public double getIpk() {
        int totalSks = 0;
        int totalPoint = 0;
        
        for(int i=0; i < listMatkul.size(); i++) {
            MataKuliah cMatkul = listMatkul.get(i);
            totalSks += cMatkul.getSks();
            totalPoint += cMatkul.getGradePoint() * cMatkul.getSks();
        }
        
        double ipk = totalPoint / totalSks;
        return Math.round(ipk * 100.0) / 100.0;
    }
}
