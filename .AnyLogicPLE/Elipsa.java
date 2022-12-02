import java.awt.geom.Ellipse2D;

/**
 * Elipsa, s ktor�m mo�no pohybova� a nakresl� sa na pl�tno.
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
     * Vytvor nov� elipsu preddefinovanej farby na preddefinovanej poz�cii. 
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
     * (Elipsa) Posu� sa vpravo o pevn� d�ku. 
     */
    public void posunVpravo() {
        this.posunVodorovne(20);
    }

    /**
     * (Elipsa) Posu� sa v�avo o pevn� d�ku. 
     */
    public void posunVlavo() {
        this.posunVodorovne(-20);
    }

    /**
     * (Elipsa) Posu� sa hore o pevn� d�ku. 
     */
    public void posunHore() {
        this.posunZvisle(-20);
    }

    /**
     * (Elipsa) Posu� sa dole o pevn� d�ku. 
     */
    public void posunDole() {
        this.posunZvisle(20);
    }

    /**
     * (Kruh) Posu� sa vodorovne o d�ku dan� parametrom. 
     */
    public void posunVodorovne(int vzdialenost) {
        this.zmaz();
        this.lavyHornyX += vzdialenost;
        this.nakresli();
    }

    /**
     * (Elipsa) Posu� sa zvisle o d�ku dan� parametrom. 
     */
    public void posunZvisle(int vzdialenost) {
        this.zmaz();
        this.lavyHornyY += vzdialenost;
        this.nakresli();
    }

    /**
     * (Elipsa) Posu� sa pomaly vodorovne o d�ku dan� parametrom. 
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
     * (Elipsa) Posu� sa pomaly zvisle o d�ku dan� parametrom. 
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
     * (Elipsa) Zme� ve�kosti os� na hodnoty dan� parametrami.
     * Ve�kos� mus� by� nez�porn� cel� ��slo. 
     */
    public void zmenOsi(int osX, int osY) {
        this.zmaz();
        this.osX = osX;
        this.osY = osY;
        this.nakresli();
    }

    /**
     * (Elipsa) Zme� farbu na hodnotu dan� parametrom.
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
