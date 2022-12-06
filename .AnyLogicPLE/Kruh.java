import java.awt.geom.Ellipse2D;

/**
 * Kruh, s ktor�m mo�no pohybova� a nakresl� sa na pl�tno.
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
     * Vytvor nov� kruh preddefinovanej farby na preddefinovanej poz�cii. 
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
     * (Kruh) Posu� sa vpravo o pevn� d�ku. 
     */
    public void posunVpravo() {
        this.posunVodorovne(20);
    }

    /**
     * (Kruh) Posu� sa v�avo o pevn� d�ku. 
     */
    public void posunVlavo() {
        this.posunVodorovne(-20);
    }

    /**
     * (Kruh) Posu� sa hore o pevn� d�ku. 
     */
    public void posunHore() {
        this.posunZvisle(-20);
    }

    /**
     * (Kruh) Posu� sa dole o pevn� d�ku. 
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
     * (Kruh) Posu� sa zvisle o d�ku dan� parametrom. 
     */
    public void posunZvisle(int vzdialenost) {
        this.zmaz();
        this.lavyHornyY += vzdialenost;
        this.nakresli();
    }

    /**
     * (Kruh) Posu� sa pomaly vodorovne o d�ku dan� parametrom. 
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
     * (Kruh) Posu� sa pomaly zvisle o d�ku dan� parametrom. 
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
     * (Kruh) Zme� priemer na hodnotu dan� parametrom.
     * Priemer mus� by� nez�porn� cel� ��slo. 
     */
    public void zmenPriemer(int priemer) {
        this.zmaz();
        this.priemer = priemer;
        this.nakresli();
    }

    /**
     * (Kruh) Zme� farbu na hodnotu dan� parametrom.
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
