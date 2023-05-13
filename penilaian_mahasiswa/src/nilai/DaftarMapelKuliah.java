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
public class DaftarMapelKuliah {
    
    List<MapelKuliah> listMapkul = new ArrayList<MapelKuliah>();
    
    public void addMapkul(MapelKuliah mapkul) {
        listMapkul.add(mapkul);
    }
    
    public List getAllMapkul() {
        return this.listMapkul;
    }
    
    public double getIpk() {
        
        int semuaSks = 0;
        int semuaPoint = 0;
        
        for(int i = 0; i < listMapkul.size(); i++) {
            MapelKuliah eMapkul = listMapkul.get(i);
            semuaSks += eMapkul.getSks();
            semuaPoint += eMapkul.getGradePoint() * eMapkul.getSks();
        }
        
        double ipk = semuaPoint / semuaSks;
        return Math.round(ipk * 100.0) / 100.0;
        
    }
    
}
