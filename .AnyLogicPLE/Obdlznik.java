import java.awt.Rectangle;

/**
 * Obdånik, s ktorım mono pohybova a nakreslí sa na plátno.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Obdlznik {
    private int stranaA;
    private int stranaB;
    private int lavyHornyX;
    private int lavyHornyY;
    private String farba;

    private boolean jeViditelny;

    /**
     * Vytvor novı obdånik preddefinovanej farby na preddefinovanej pozícii.
     */
    public Obdlznik(int stranaA, int stranaB, int lavyHornyX, int lavyHornyY, String farba, boolean jeViditelny) {
        this.stranaA = stranaA;
        this.stranaB = stranaB;
        this.lavyHornyX = lavyHornyX;
        this.lavyHornyY = lavyHornyY;
        this.farba = farba;
        this.jeViditelny = jeViditelny;
    }

    /**
     * (Obdånik) Zobraz sa.
     */
    public void zobraz() {
        this.jeViditelny = true;
        this.nakresli();
    }

    /**
     * (Obdånik) Skry sa.
     */
    public void skry() {
        this.zmaz();
        this.jeViditelny = false;
    }

    /**
     * (Obdånik) Posuò sa vpravo o pevnú dåku.
     */
    public void posunVpravo() {
        this.posunVodorovne(20);
    }

    /**
     * (Obdånik) Posuò sa v¾avo o pevnú dåku.
     */
    public void posunVlavo() {
        this.posunVodorovne(-20);
    }

    /**
     * (Obdånik) Posuò sa hore o pevnú dåku.
     */
    public void posunHore() {
        this.posunZvisle(-20);
    }

    /**
     * (Obdånik) Posuò sa dole o pevnú dåku.
     */
    public void posunDole() {
        this.posunZvisle(20);
    }

    /**
     * (Obdånik) Posuò sa vodorovne o dåku danú parametrom.
     */
    public void posunVodorovne(int vzdialenost) {
        this.zmaz();
        this.lavyHornyX += vzdialenost;
        this.nakresli();
    }

    /**
     * (Obdånik) Posuò sa zvisle o dåku danú parametrom.
     */
    public void posunZvisle(int vzdialenost) {
        this.zmaz();
        this.lavyHornyY += vzdialenost;
        this.nakresli();
    }

    /**
     * (Obdånik) Posuò sa pomaly vodorovne o dåku danú parametrom.
     */
    public void pomalyPosunVodorovne(int vzdialenost) {
        int delta;

        if (vzdialenost < 0) {
            delta = -1;
            vzdialenost = -vzdialenost;
        } else  {
            delta = 1;
        }

        for (int i = 0; i < vzdialenost; i++) {
            this.lavyHornyX += delta;
            this.nakresli();
        }
    }

    /**
     * (Obdånik) Posuò sa pomaly vodorovne o dåku danú parametrom.
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
     * (Obdånik) Zmeò dåky strán na hodnoty dané parametrami.
     * Dåka strany musí by nezáporné celé èíslo. 
     */
    public void zmenStrany(int stranaA, int stranaB) {
        this.zmaz();
        this.stranaA = stranaA;
        this.stranaB = stranaB;
        this.nakresli();
    }

    /**
     * (Obdånik) Zmeò farbu na hodnotu danú parametrom.
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
     * Draw the square with current specifications on screen.
     */
    private void nakresli() {
        if (this.jeViditelny) {
            Platno canvas = Platno.dajPlatno();
            canvas.draw(this, this.farba,
                new Rectangle(this.lavyHornyX, this.lavyHornyY, this.stranaA, this.stranaB));
            canvas.wait(10);
        }
    }

    /*
     * Erase the square on screen.
     */
    private void zmaz() {
        if (this.jeViditelny) {
            Platno canvas = Platno.dajPlatno();
            canvas.erase(this);
        }
    }

    public int getLavyHornyX(){
        return this.lavyHornyX;
    }

    public int getLavyHornyY(){
        return this.lavyHornyY;
    }

    public int getStranaA(){
        return this.stranaA;
    }

    public int getStranaB(){
        return this.stranaB;
    }

    public boolean obsahujeBod(int x, int y) {
        if (x < this.lavyHornyX || x > this.lavyHornyX + this.stranaA)
            return false;

        if (y < this.lavyHornyY || y > this.lavyHornyY + this.stranaB)
            return false;      

        return true;    
    }
}
