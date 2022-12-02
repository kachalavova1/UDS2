import java.awt.Rectangle;

/**
 * �tvorec, s ktor�m mo�no pohybova� a nakresl� sa na pl�tno.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Stvorec {
    private int strana;
    private int lavyHornyX;
    private int lavyHornyY;
    private String farba;
    private boolean jeViditelny;

    /**
     * Vytvor nov� �tvorec preddefinovanej farby na preddefinovanej poz�cii.
     */
    public Stvorec() {
        this.strana = 30;
        this.lavyHornyX = 60;
        this.lavyHornyY = 50;
        this.farba = "red";
        this.jeViditelny = false;
    }

    /**
     * (�tvorec) Zobraz sa.
     */
    public void zobraz() {
        this.jeViditelny = true;
        this.nakresli();
    }
    
    /**
     * (�tvorec) Skry sa.
     */
    public void skry() {
        this.zmaz();
        this.jeViditelny = false;
    }
    
    /**
     * (�tvorec) Posu� sa vpravo o pevn� d�ku.
     */
    public void posunVpravo() {
        this.posunVodorovne(20);
    }

    /**
     * (�tvorec) Posu� sa v�avo o pevn� d�ku.
     */
    public void posunVlavo() {
        this.posunVodorovne(-20);
    }

    /**
     * (�tvorec) Posu� sa hore o pevn� d�ku.
     */
    public void posunHore() {
        this.posunZvisle(-20);
    }

    /**
     * (�tvorec) Posu� sa dole o pevn� d�ku.
     */
    public void posunDole() {
        this.posunZvisle(20);
    }

    /**
     * (�tvorec) Posu� sa vodorovne o d�ku dan� parametrom.
     */
    public void posunVodorovne(int vzdialenost) {
        this.zmaz();
        this.lavyHornyX += vzdialenost;
        this.nakresli();
    }

    /**
     * (�tvorec) Posu� sa zvisle o d�ku dan� parametrom.
     */
    public void posunZvisle(int vzdialenost) {
        this.zmaz();
        this.lavyHornyY += vzdialenost;
        this.nakresli();
    }

    /**
     * (�tvorec) Posu� sa pomaly vodorovne o d�ku dan� parametrom.
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
     * (�tvorec) Posu� sa pomaly vodorovne o d�ku dan� parametrom.
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
     * (�tvorec) Zme� d�ku strany na hodnotu dan� parametrom.
     * D�ka strany mus� by� nez�porn� cel� ��slo. 
     */
    public void zmenStranu(int dlzka) {
        this.zmaz();
        this.strana = dlzka;
        this.nakresli();
    }

    /**
     * (�tvorec) Zme� farbu na hodnotu dan� parametrom.
     * Nazov farby mus� by� po anglicky.
     * Mo�n� farby s� tieto:
     * �erven� - "red"
     * �lt�    - "yellow"
     * modr�   - "blue"
     * zelen�  - "green"
     * fialov� - "magenta"
     * �ierna  - "black"
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
                        new Rectangle(this.lavyHornyX, this.lavyHornyY, this.strana, this.strana));
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
}
