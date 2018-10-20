/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.bot.Logiikka;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALIEN
 */
public class Tiedot {

    List<String> pelaukset = new ArrayList<>(); //0, ei pelannut 1, pelasi
    
    public Tiedot() {
        
    }
    public Tiedot(List<String> arvot) {
        pelaukset = arvot;
    }

    public List<String> getPelaukset() {
        return pelaukset;
    }

    public void lisääPelaus(String s) {
        pelaukset.add(s);
    }

    public List<String> getProsentit() {
        int pelasi = 0;
        float temp = 0;
        int listanKoko = pelaukset.size();
        List<String> output = new ArrayList<>();
        for (int i = 0; i < listanKoko; i++) {
            String luettu = pelaukset.get(i);
            if (luettu.equals("1")) {
                pelasi++;
            }
        }
        temp = ((float)pelasi / (float) listanKoko) * 100;
        output.add(temp + "%");
        temp = ((float)(listanKoko - pelasi) / (float) listanKoko) * 100;
        output.add(temp + "%");
        return output;
    }
}
