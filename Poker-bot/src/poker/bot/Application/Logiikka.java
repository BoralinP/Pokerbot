/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.bot.Application;

import poker.bot.Logiikka.kuvanTunnistus;

/**
 *
 * @author tporanen
 */
public class Logiikka {
    kuvanTunnistus p;
    public Logiikka() {
        p = new kuvanTunnistus();
    }
    public void aja() {
        p.uusiKuvankaappaus();
    }
}
