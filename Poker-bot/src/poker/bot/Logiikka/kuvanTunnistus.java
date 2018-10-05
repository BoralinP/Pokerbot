/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.bot.Logiikka;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author tporanen
 */
public class kuvanTunnistus {

    public Robot s; //Robotti (ottaa kuvan)
    public boolean paalla = false;
    public BufferedImage screenShot;

    public kuvanTunnistus() {
        paalla = true;
        try {
            s = new Robot(); //Luodaan robotti nimeltä s.
        } catch (AWTException ex) {
            //Logger.getLogger(kuvanTunnistus.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Botti päällä! - " + getAika());
    }

    public void uusiKuvankaappaus() {
        System.out.println(getAika() + " - ");
        screenShot = s.createScreenCapture(new Rectangle(2, 2, 2, 2)); //public Rectangle(int x, int y, int width, int height) {
        /*
            Tutkitaan mikä kirjain on kuvassa
            OpenCV kuvantunnistus...
         */

    }

    public String getAika() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(cal.getTime());
    }
}
