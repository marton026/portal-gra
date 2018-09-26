/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portalgramax;

import java.util.ArrayList;

/**
 *
 * @author Marcin
 */
class Portal {
    
    private ArrayList<String> polaPolozenia;
    private String nazwa;

    public void setPolaPolozenia(ArrayList<String> ppol) {
        polaPolozenia = ppol;
    }
    public void setNazwa(String nzwPortalu) {
        nazwa = nzwPortalu;
    }


    public String sprawdz(String ruch) {
          String wynik = "pudło";
          int indeks = polaPolozenia.indexOf(ruch);
            if (indeks >= 0) {
                polaPolozenia.remove(indeks);
            if (polaPolozenia.isEmpty()) {
                wynik = "zatopiony";
                System.out.println("Auć! Zatopiłeś portal "+ nazwa + " :(");
            } else {
                wynik = "trafiony";
            }
            }
            return wynik;
    }
    
    
}
