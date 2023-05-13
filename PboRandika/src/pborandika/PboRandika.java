package pborandika;
import java.util.*;

public class PboRandika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DaftarMataKuliah mMatkul = new DaftarMataKuliah();
        
        System.out.print("Masukkan jumlah mata kuliah = ");
        int jmlMatkul = sc.nextInt();
        
        for(int i=1; i <= jmlMatkul; i++) {
            MataKuliah matkul = new MataKuliah();
                    
            System.out.println("MATA KULIAH KE-" + i);
            System.out.print("Masukkan kode mapel: ");
            matkul.setKodeMatkul( sc.next() );
            
            System.out.print("Masukkan jumlah SKS: ");
            matkul.setSks( sc.nextInt() );
            
            System.out.print("Masukkan nilai harian: ");
            matkul.setNilaiHarian(sc.nextInt() );
            
            System.out.print("Masukkan nilai PTS: ");
            matkul.setNilaiPts( sc.nextInt() );
            
            System.out.print("Masukkan nilai PAS: ");
            matkul.setNilaiPas( sc.nextInt() );
            
            mMatkul.addMatkul(matkul);
            System.out.print("\n\n");
        }
        
        List<MataKuliah> listMatkul = mMatkul.getAllMatkul();
        for(int i=0; i < listMatkul.size(); i++) {
            MataKuliah cMatkul = listMatkul.get(i);
            
            System.out.println("============ DATA MATA KULIAH KE-" + (i + 1) + " ============");
            System.out.println("Nama Mata Kuliah: " + cMatkul.getNamaMatkul());
            System.out.println("Total Nilai: " + cMatkul.getTotalNilai());
            System.out.println("Grade: " + cMatkul.getGrade());
            
            System.out.print("\n");
        }
                
        System.out.println( "Total IPK: " + mMatkul.getIpk() );
    }
}
