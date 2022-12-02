import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;

/**
 * Trieda Obrazok, reprezentuje bitmapovy obrazok, ktory moze byt vykresleny na platno.
 * 
 * @author Miroslav Kvassay
 * @authot Michal Varga
 * 
 * @version 1.1
 */
public class Obrazok {
    private boolean jeViditelny;
    
    private int lavyHornyX;
    private int lavyHornyY;
    private int uhol;
    
    private BufferedImage obrazok;

    /**
     * Parametricky konstruktor vytvori Obrazok na pozicii paX, paY s natocenim paUhol
     * 
     * @param suborSObrazkom cesta k suboru s obrazkom, ktory sa ma vykreslovat
     */
    public Obrazok(String suborSObrazkom) {      
        this.obrazok = this.nacitajObrazokZoSuboru(suborSObrazkom);                                   
 
        this.jeViditelny = false;
        this.lavyHornyX = 100;
        this.lavyHornyY = 100; 
        this.uhol = 0;         
    }
    
    /**
     * (Obr�zok) Zobraz sa.
     */
    public void zobraz() {      
        this.jeViditelny = true;
        this.nakresli();
    }
    
    /**
     * (Obr�zok) Zobraz sa.
     */
    public void skry() {       
        this.zmaz();
        this.jeViditelny = false;
    }                     
    
    /**
     * (Obr�zok) Posu� sa vpravo o pevn� d�ku.
     */
    public void posunVpravo() {
        this.posunVodorovne(20);
    }

    /**
     * (Obr�zok) Posu� sa v�avo o pevn� d�ku.
     */
    public void posunVlavo() {
        this.posunVodorovne(-20);
    }

    /**
     * (Obr�zok) Posu� sa hore o pevn� d�ku.
     */
    public void posunHore() {
        this.posunZvisle(-20);
    }

    /**
     * (Obr�zok) Posu� sa dole o pevn� d�ku.
     */
    public void posunDole() {
        this.posunZvisle(20);
    }

    /**
     * (Obr�zok) Posu� sa vodorovne o d�ku dan� parametrom.
     */
    public void posunVodorovne(int vzdialenost) {
        this.zmaz();
        this.lavyHornyX += vzdialenost;
        this.nakresli();
    }

    /**
     * (Obr�zok) Posu� sa zvisle o d�ku dan� parametrom.
     */
    public void posunZvisle(int vzdialenost) {
        this.zmaz();
        this.lavyHornyY += vzdialenost;
        this.nakresli();
    }

    /**
     * (Obr�zok) Posu� sa pomaly vodorovne o d�ku dan� parametrom.
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
     * (Obr�zok) Posu� sa pomaly vodorovne o d�ku dan� parametrom.
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
     * (Obr�zok) Zmen� obr�zok.
     * S�bor s obr�zkom mus� existova�.
     * 
     * @param suborSObrazkom cesta k s�boru s obr�zkom, ktor� sa m� na��ta�
     */
    public void zmenObrazok(String suborSObrazkom) {
        boolean nakresleny = this.jeViditelny;
        this.zmaz();        
        this.obrazok = this.nacitajObrazokZoSuboru(suborSObrazkom);
        if (nakresleny) {
            this.nakresli();
        }
    }    
    
    /**
     * (Obr�zok) Zme� polohu stredu obr�zka na hodnoty dan� parametrami. 
     */
    public void zmenPolohu(int stredX, int stredY) {
        boolean nakresleny = this.jeViditelny;
        this.zmaz();
        this.lavyHornyX = stredX - this.sirka() / 2;
        this.lavyHornyY = stredY - this.vyska() / 2;
        if (nakresleny) {
            this.nakresli();
        }
    }
    
    /**
     * (Obr�zok) Zme� uhol nato�enia obr�zku pod�a parametra. Sever = 0.
     */
    public void zmenUhol(int uhol) {
        boolean nakresleny = this.jeViditelny;
        this.zmaz();
        this.uhol = uhol;
        if (nakresleny) {
            this.nakresli();
        }
    }  
    
    /*
     * Na��ta obr�zok zo s�boru.
     */
    private BufferedImage nacitajObrazokZoSuboru(String subor) {
        BufferedImage nacitanyOBrazok = null;
        
        try {
            nacitanyOBrazok = ImageIO.read(new File(subor));
        } catch (IOException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Subor " + subor + " sa nenasiel.");
        }        
        
        return nacitanyOBrazok;
    }     
    
    /*
     * (Obr�zok) Vr�ti v��rku obr�zka.
     */
    private int sirka() {
        return this.obrazok.getWidth();
    }
    
    /*
     * (Obr�zok) Vr�ti v��ku obr�zka.
     */
    private int vyska() {
        return this.obrazok.getHeight();
    }    
    
    /*
     * Draw the square with current specifications on screen.
     */
    private void nakresli() {
        if (this.jeViditelny) {
            Platno canvas = Platno.dajPlatno();
        
            AffineTransform at = new AffineTransform();
            at.translate(this.lavyHornyX + this.sirka() / 2, this.lavyHornyY + this.vyska() / 2);
            at.rotate(this.uhol / 180.0 * Math.PI);
            at.translate(-this.sirka() / 2, -this.vyska() / 2);
        
            canvas.draw(this, this.obrazok, at);
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
