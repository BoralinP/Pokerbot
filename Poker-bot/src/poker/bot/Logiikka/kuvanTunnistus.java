/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.bot.Logiikka;

import poker.bot.Application.ApplicationUI;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author tporanen
 */
public class kuvanTunnistus {

    public Robot s;
    public boolean paalla = false;
    public ArrayList listOfImages;
    public ArrayList suorakulmiot;
    public BufferedImage screenShot;
    public kuvanTunnistus() {
        paalla = true;
        try {
            s = new Robot();
        } catch (AWTException ex) {
            //Logger.getLogger(kuvanTunnistus.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Botti päällä! - " + getAika());
    }

    public void uusiKuvankaappaus() {
        System.out.println(getAika() + " - ");
        //listOfImages.clear();
        screenShot = s.createScreenCapture(new Rectangle(2, 2, 2, 2));
        //Tutkitaan mikä kirjain on kyseessä!
        ApplicationUI.kuva(screenShot);
    }

    public String getAika() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(cal.getTime());
    }
}
