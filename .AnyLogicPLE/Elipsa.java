import java.awt.geom.Ellipse2D;

/**
 * Elipsa, s ktorım mono pohybova a nakreslí sa na plátno.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Elipsa {
    private int osX;
    private int osY;
    private int lavyHornyX;
    private int lavyHornyY;
    private String farba;
    private boolean jeViditelny;
    
    /**
     * Vytvor novú elipsu preddefinovanej farby na preddefinovanej pozícii. 
     */
    public Elipsa() {
        this.osX = 60;
        this.osY = 30;
        this.lavyHornyX = 20;
        this.lavyHornyY = 60;
        this.farba = "blue";
        this.jeViditelny = false;
    }

    /**
     * (Elipsa) Zobraz sa.
     */
    public void zobraz() {
        this.jeViditelny = true;
        this.nakresli();
    }
    
    /**
     * (Elipsa) Skry sa.
     */
    public void skry() {
        this.zmaz();
        this.jeViditelny = false;
    }
    
    /**
     * (Elipsa) Posuò sa vpravo o pevnú dåku. 
     */
    public void posunVpravo() {
        this.posunVodorovne(20);
    }

    /**
     * (Elipsa) Posuò sa v¾avo o pevnú dåku. 
     */
    public void posunVlavo() {
        this.posunVodorovne(-20);
    }

    /**
     * (Elipsa) Posuò sa hore o pevnú dåku. 
     */
    public void posunHore() {
        this.posunZvisle(-20);
    }

    /**
     * (Elipsa) Posuò sa dole o pevnú dåku. 
     */
    public void posunDole() {
        this.posunZvisle(20);
    }

    /**
     * (Kruh) Posuò sa vodorovne o dåku danú parametrom. 
     */
    public void posunVodorovne(int vzdialenost) {
        this.zmaz();
        this.lavyHornyX += vzdialenost;
        this.nakresli();
    }

    /**
     * (Elipsa) Posuò sa zvisle o dåku danú parametrom. 
     */
    public void posunZvisle(int vzdialenost) {
        this.zmaz();
        this.lavyHornyY += vzdialenost;
        this.nakresli();
    }

    /**
     * (Elipsa) Posuò sa pomaly vodorovne o dåku danú parametrom. 
     */
    public void pomalyPosunVodorovne(int vzdialenost) {
        int delta;

        if (vzdialenost < 0) {
            delta = -1;
            vzdialenost = -vzdialenost;
        } else {
            delta = 1;
        }

        for (int i = 0; i < vzdialenost; i++) {
            this.lavyHornyX += delta;
            this.nakresli();
        }
    }

    /**
     * (Elipsa) Posuò sa pomaly zvisle o dåku danú parametrom. 
     */
    public void pomalyPosunZvisle(int vzdialenost) {
        int delta;

        if (vzdialenost < 0) {
            delta = -1;
            vzdialenost = -vzdialenost;
        } else {
            delta = 1;
        }

        for (int i = 0; i < vzdialenost; i++) {
            this.lavyHornyY += delta;
            this.nakresli();
        }
    }

    /**
     * (Elipsa) Zmeò ve¾kosti osí na hodnoty dané parametrami.
     * Ve¾kos musí by nezáporné celé èíslo. 
     */
    public void zmenOsi(int osX, int osY) {
        this.zmaz();
        this.osX = osX;
        this.osY = osY;
        this.nakresli();
    }

    /**
     * (Elipsa) Zmeò farbu na hodnotu danú parametrom.
     * Nazov farby musí by po anglicky.
     * Moné farby sú tieto:
     * èervená - "red"
     * ltá    - "yellow"
     * modrá   - "blue"
     * zelená  - "green"
     * fialová - "magenta"
     * èierna  - "black"
     * biela   - "white"
     * hnedá   - "brown"
     */
    public void zmenFarbu(String farba) {
        this.farba = farba;
        this.nakresli();
    }

    /*
     * Draw the circle with current specifications on screen.
     */
    private void nakresli() {
        if (this.jeViditelny) {
            Platno canvas = Platno.dajPlatno();
            canvas.draw(this, this.farba, new Ellipse2D.Double(this.lavyHornyX, this.lavyHornyY, 
                                                          this.osX, this.osY));
            canvas.wait(10);
        }
    }

    /*
     * Erase the circle on screen.
     */
    private void zmaz() {
        if (this.jeViditelny) {
            Platno canvas = Platno.dajPlatno();
            canvas.erase(this);
        }
    }
}
