import java.util.Random;

public class Hra {
    private static final int velkost = 35;
    private final Manazer manazer;
    
    private Smer vybranySmer;
    private Random random;
    
    private PacMan pacMan;
    private int tikCounter = 0;
    
    public Hra() {
        this.manazer = new Manazer();
        this.random = new Random();
        
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
