import java.util.Random;
import java.util.ArrayList;

public class Hra {
    private static final int velkost = 35;
    private final Manazer manazer;
    
    private Smer vybranySmer;
    private Random random;
    
    private PacMan pacMan;
    private int tikCounter = 0;
    private BludiskoNew bludisko;
    private Bodovanie bodovanie;
    private Platno platno;
    
    public Hra() {
        this.manazer = new Manazer();
        this.random = new Random();
        this.bludisko = new BludiskoNew();
        this.bludisko.nakresliBludisko();
        this.bodovanie = new Bodovanie();
        
        
        this.pacMan = new PacMan(new Poloha(Hra.velkost, Hra.velkost, 270), PacManFot.PACMAN);
        this.vybranySmer = Smer.DOLE;
        
        this.manazer.spravujObjekt(this);
        
    }
    
    public void tik(){
        if (this.tikCounter < 1){
            this.tikCounter++;
            return;
        }
        this.tikCounter = 0;
        this.pacMan.pohniNaNovuPoziciu(getNextPoloha());
        
        /* zisti koliziu */
        ArrayList<Integer> kolizia = this.bludisko.zistiKoliziuSBodom(this.pacMan.getPoloha()); 
        if(kolizia.get(0) != -1){
            //zisti typ bodu, s ktorym mal koliziu v pripade ak je to typ 0 bol to klasicky bod ak to bol bol 1 bol to bonusovy
            if(kolizia.get(1) == 0) { //klasicky bod
                this.bludisko.zrusBod(kolizia.get(0));
                this.bodovanie.pridajKuSkore(10);
            } else { //bonusovy bod
                this.bludisko.zrusBonusovyBod(kolizia.get(0));
                this.bodovanie.pridajKuSkore(100);
            }
            
        }
        
        if(this.bludisko.getPocetBodov() == 0) {
            this.bodovanie.vypisSkore();
        }
    }
    
    public Poloha getNextPoloha(){
        return this.pacMan.getPoloha().getPosunutuPolohu(this.velkost, this.vybranySmer);
    }
    
    public void posunHore(){
        this.vybranySmer = Smer.HORE;
    }
    
    public void posunDole(){
        this.vybranySmer = Smer.DOLE;
    }
    
    public void posunVlavo(){
        this.vybranySmer = Smer.VLAVO;
    }
    
    public void posunVpravo(){
        this.vybranySmer = Smer.VPRAVO;
    }
}
