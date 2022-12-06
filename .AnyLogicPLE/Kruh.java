import java.awt.geom.Ellipse2D;

/**
 * Kruh, s ktorım mono pohybova a nakreslí sa na plátno.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Kruh {
    private int priemer;
    private int lavyHornyX;
    private int lavyHornyY;
    private String farba;
    private boolean jeViditelny;
    
    /**
     * Vytvor novı kruh preddefinovanej farby na preddefinovanej pozícii. 
     */
    public Kruh(int priemer, int lavyHornyX,int lavyHornyY,String farba,boolean jeViditelny   ) {
        this.priemer = priemer;
        this.lavyHornyX = lavyHornyX;
        this.lavyHornyY = lavyHornyY;
        this.farba = farba;
        this.jeViditelny = false;
    }

    /**
     * (Kruh) Zobraz sa.
     */
    public void zobraz() {
        this.jeViditelny = true;
        this.nakresli();
    }
    
    /**
     * (Kruh) Skry sa.
     */
    public void skry() {
        this.zmaz();
        this.jeViditelny = false;
    }
    
    /**
     * (Kruh) Posuò sa vpravo o pevnú dåku. 
     */
    public void posunVpravo() {
        this.posunVodorovne(20);
    }

    /**
     * (Kruh) Posuò sa v¾avo o pevnú dåku. 
     */
    public void posunVlavo() {
        this.posunVodorovne(-20);
    }

    /**
     * (Kruh) Posuò sa hore o pevnú dåku. 
     */
    public void posunHore() {
        this.posunZvisle(-20);
    }

    /**
     * (Kruh) Posuò sa dole o pevnú dåku. 
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
     * (Kruh) Posuò sa zvisle o dåku danú parametrom. 
     */
    public void posunZvisle(int vzdialenost) {
        this.zmaz();
        this.lavyHornyY += vzdialenost;
        this.nakresli();
    }

    /**
     * (Kruh) Posuò sa pomaly vodorovne o dåku danú parametrom. 
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
     * (Kruh) Posuò sa pomaly zvisle o dåku danú parametrom. 
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
     * (Kruh) Zmeò priemer na hodnotu danú parametrom.
     * Priemer musí by nezáporné celé èíslo. 
     */
    public void zmenPriemer(int priemer) {
        this.zmaz();
        this.priemer = priemer;
        this.nakresli();
    }

    /**
     * (Kruh) Zmeò farbu na hodnotu danú parametrom.
     * Nazov farby musí by po anglicky.
     * Moné farby sú tieto:
     * èervená - "red"
     * ltá    - "yellow"
     * modrá   - "blue"
     * zelená  - "green"
     * fialová - "magenta"
     * èierna  - "black"
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
                                                          this.priemer, this.priemer));
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
    
    /* 
       vrati lavyHornyX
       */
    public int getLavyHornyX() {
        return this.lavyHornyX;
    }
    /* 
       vrati lavyHornyY
       */
    public int getLavyHornyY() {
        return this.lavyHornyY;
    }
    /* 
       vrati priemer
       */
    public int getPriemer() {
        return this.priemer;
    }
}
