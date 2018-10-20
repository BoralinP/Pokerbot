/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.bot.Logiikka;

import java.util.ArrayList;

/**
 *
 * @author ALIEN
 */
public class Numerot {

    int koko;
    int tallennettuNumero;

    public Numerot(int uusiNumero) {
        /*
            Luodaan objekti johon tallennetaan kuinka monta numeroa 
            ja tallennettu numero
         */
        koko = 0;
        tallennettuNumero = uusiNumero;
    }

    public int getNumero() {
        return tallennettuNumero;
    }

    public int getKoko() {
        return koko;
    }

    public void lisää() {
        koko++;
    }
}
