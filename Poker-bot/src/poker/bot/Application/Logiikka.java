/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.bot.Application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import poker.bot.Logiikka.Nimet;
import poker.bot.Logiikka.Tiedot;
import poker.bot.Logiikka.kuvanTunnistus;

/**
 *
 * @author tporanen
 */
public class Logiikka {

    kuvanTunnistus p;
    //ArrayList<String> testidata;
    List<String> readAllLines;
    List<Nimet> nimet = new ArrayList<>();

    //List<String> nimiä;
    public Logiikka() {
        String nimi = "";
        List<String> temp = new ArrayList<>();
        List<String> arvot = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            arvot.clear();
            try {
                /* Tiedoston sijainti */
                temp = lueDataa(new File("C:\\temp\\PokeriBotti\\Testidata\\testi" + i + ".txt"));
            } catch (IOException ex) {
                System.out.println("Tiedostot loppuivat!");
                break;
            }
            System.out.println("Luetaan dataa!");
            for (int j = 0; j < temp.size(); j++) {
                String luettu = temp.get(j);
                if (j == 0) {
                    nimi = luettu;
                } else {
                    arvot.add(luettu);
                }
            }

            nimet.add(new Nimet(nimi, arvot));
            System.out.println(nimet.get(i).getTiedot().getPelaukset().toString());
            System.out.println(nimet.get(i).getTiedot().getProsentit().toString());
            System.out.println();
            System.out.println("-----");
            System.out.println();
        }
    }
    

    public List<String> lueDataa(File file) throws IOException {
        readAllLines = Files.readAllLines(file.toPath());
        return readAllLines;
    }
}
