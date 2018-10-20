/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.bot.Logiikka;

import java.util.List;

/**
 *
 * @author ALIEN
 */
//Tallennetaan nimi ja erilliseen objektiin tiedot
public class Nimet {

    public String nimi = "";
    public Tiedot tiedot; //Tiedot muuttuja

    public Nimet(String uusiNimi) {
        nimi = uusiNimi;
    }

    public Nimet(String uusiNimi, List<String> l) {
        nimi = uusiNimi;
        tiedot = new Tiedot(l);
    }

    public String getNimi() {
        return nimi;
    }

    public Tiedot getTiedot() {
        return tiedot;
    }
}
