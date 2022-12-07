import java.awt.Rectangle;

/**
 * Obd�nik, s ktor�m mo�no pohybova� a nakresl� sa na pl�tno.
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
     * Vytvor nov� obd�nik preddefinovanej farby na preddefinovanej poz�cii.
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
     * (Obd�nik) Zobraz sa.
     */
    public void zobraz() {
        this.jeViditelny = true;
        this.nakresli();
    }

    /**
     * (Obd�nik) Skry sa.
     */
    public void skry() {
        this.zmaz();
        this.jeViditelny = false;
    }

    /**
     * (Obd�nik) Posu� sa vpravo o pevn� d�ku.
     */
    public void posunVpravo() {
        this.posunVodorovne(20);
    }

    /**
     * (Obd�nik) Posu� sa v�avo o pevn� d�ku.
     */
    public void posunVlavo() {
        this.posunVodorovne(-20);
    }

    /**
     * (Obd�nik) Posu� sa hore o pevn� d�ku.
     */
    public void posunHore() {
        this.posunZvisle(-20);
    }

    /**
     * (Obd�nik) Posu� sa dole o pevn� d�ku.
     */
    public void posunDole() {
        this.posunZvisle(20);
    }

    /**
     * (Obd�nik) Posu� sa vodorovne o d�ku dan� parametrom.
     */
    public void posunVodorovne(int vzdialenost) {
        this.zmaz();
        this.lavyHornyX += vzdialenost;
        this.nakresli();
    }

    /**
     * (Obd�nik) Posu� sa zvisle o d�ku dan� parametrom.
     */
    public void posunZvisle(int vzdialenost) {
        this.zmaz();
        this.lavyHornyY += vzdialenost;
        this.nakresli();
    }

    /**
     * (Obd�nik) Posu� sa pomaly vodorovne o d�ku dan� parametrom.
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
     * (Obd�nik) Posu� sa pomaly vodorovne o d�ku dan� parametrom.
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
     * (Obd�nik) Zme� d�ky str�n na hodnoty dan� parametrami.
     * D�ka strany mus� by� nez�porn� cel� ��slo. 
     */
    public void zmenStrany(int stranaA, int stranaB) {
        this.zmaz();
        this.stranaA = stranaA;
        this.stranaB = stranaB;
        this.nakresli();
    }

    /**
     * (Obd�nik) Zme� farbu na hodnotu dan� parametrom.
     * Nazov farby mus� by� po anglicky.
     * Mo�n� farby s� tieto:
     * �erven� - "red"
     * �lt�    - "yellow"
     * modr�   - "blue"
     * zelen�  - "green"
     * fialov� - "magenta"
     * �ierna  - "black"
     * biela   - "white"
     * hned�   - "brown"
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
