/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai;

import java.util.*;

/**
 *
 * @author RIFAI
 */
public class NilaiMahasiswa {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DaftarMapelKuliah mKuliah = new DaftarMapelKuliah();
                
        System.out.print("Masukan Jumlah Mata Kuliah : ");
        int jmlhMapkul = sc.nextInt();
        
        for (int i = 1; i <= jmlhMapkul; i++) {
            MapelKuliah mapkul = new MapelKuliah();
            
            System.out.println("Mata Kuliah Ke " + i);
            System.out.print("Masukan Kode Mata Pelajaran Kuliah : ");
            mapkul.setKodeMapkul(sc.next());
            
            System.out.print("Masukan Jumlah SKS : ");
            mapkul.setSks(sc.nextInt());
            
            System.out.print("Masukan Nilai Harian : ");
            mapkul.setNilaiHarian(sc.nextInt());
            
            System.out.print("Masukan Nilai PTS : ");
            mapkul.setNilaiPts(sc.nextInt());
            
            System.out.print("Masukan Nilai PAS : ");
            mapkul.setNilaiPas(sc.nextInt());
            
            mKuliah.addMapkul(mapkul);
            System.out.print("\n\n");
        }
        
        List<MapelKuliah> listMapkul = mKuliah.getAllMapkul();
        for (int i = 0; i < listMapkul.size(); i++) {
            MapelKuliah eMapkul = listMapkul.get(i);
            
            System.out.println("======= Data Mata Pelajaran Kuliah Ke " + (i + 1) + " =======");
            System.out.println("Nama Mata Pelajaran Kuliah : " + eMapkul.getNamaMapkul());
            System.out.println("Total Nilai : " + eMapkul.getTotalNilai());
            System.out.println("Grade : " + eMapkul.getGrade());
            
            System.out.println("\n");
        }
        
        System.out.println("Total IPK : " + mKuliah.getIpk());
        
    }
    
}
