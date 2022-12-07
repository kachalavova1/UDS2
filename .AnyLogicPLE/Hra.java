import java.util.Random;
import java.util.ArrayList;

public class Hra {
    private static final int velkost = 15; //Hra.velkost
    private final Manazer manazer;

    private Smer vybranySmer;
    private Random random;

    private PacMan pacMan;
    private Duch duchOra;
    private Duch duchMod;
    private Duch duchCer;
    private Duch duchRuz;
    private int tikCounter = 0;
    private BludiskoNew bludisko;
    private Bodovanie bodovanie;
    private Platno platno;
    //private boolean hraBezi = false;
    public Hra() {
        this.manazer = new Manazer();
        this.random = new Random();
        this.bludisko = new BludiskoNew();
        this.bludisko.nakresliBludisko();
        this.bodovanie = new Bodovanie();

        this.pacMan = new PacMan(new Poloha(35, 35, 0), PacManFot.PACMAN);
        this.duchOra = new Duch(new Poloha(250, 100, 0), DuchFot.ORANZOVY);
        this.duchMod = new Duch(new Poloha(300, 100, 0), DuchFot.MODRY);
        this.duchCer = new Duch(new Poloha(350, 100, 0), DuchFot.CERVENY);
        this.duchRuz = new Duch(new Poloha(400, 100, 0), DuchFot.RUZOVY);
        this.vybranySmer = Smer.DOLE;

        this.manazer.spravujObjekt(this);

    }

    public void tik(){
        if (this.tikCounter < 1){
            this.tikCounter++;
            return;
        }
        this.tikCounter = 0;
        //zisti kolizu s polom pacMan
        if (this.bludisko.vyberSuradnice(this.pacMan.getPoloha().getPosunutuPolohu(this.velkost, this.vybranySmer).getX(), this.pacMan.getPoloha().getPosunutuPolohu(this.velkost, this.vybranySmer).getY())){

        } else {
            this.pacMan.pohniNaNovuPoziciu(getNextPoloha());
        }

        //zisti kolizu s polom duchOra
        if (this.bludisko.vyberSuradnice(this.duchOra.getPoloha().getPosunutuPolohu(this.velkost, Smer.getRandom()).getX(), this.duchOra.getPoloha().getPosunutuPolohu(this.velkost, Smer.getRandom()).getY())){

        } else {
            this.duchOra.pohniNaNovuPoziciu(getNextPolohaRandomOra());
        }
        
        //zisti kolizu s polom duchMod
        if (this.bludisko.vyberSuradnice(this.duchMod.getPoloha().getPosunutuPolohu(this.velkost, Smer.getRandom()).getX(), this.duchMod.getPoloha().getPosunutuPolohu(this.velkost, Smer.getRandom()).getY())){

        } else {
            this.duchMod.pohniNaNovuPoziciu(getNextPolohaRandomMod());
        }
        
        //zisti kolizu s polom duchRuz
        if (this.bludisko.vyberSuradnice(this.duchRuz.getPoloha().getPosunutuPolohu(this.velkost, Smer.getRandom()).getX(), this.duchRuz.getPoloha().getPosunutuPolohu(this.velkost, Smer.getRandom()).getY())){

        } else {
            this.duchRuz.pohniNaNovuPoziciu(getNextPolohaRandomRuz());
        }
        
        //zisti kolizu s polom duchCer
        if (this.bludisko.vyberSuradnice(this.duchCer.getPoloha().getPosunutuPolohu(this.velkost, Smer.getRandom()).getX(), this.duchCer.getPoloha().getPosunutuPolohu(this.velkost, Smer.getRandom()).getY())){

        } else {
            this.duchCer.pohniNaNovuPoziciu(getNextPolohaRandomCer());
        }

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
            this.manazer.prestanSpravovatObjekt(this);
        }
    }

    public Poloha getNextPoloha(){
        return this.pacMan.getPoloha().getPosunutuPolohu(this.velkost, this.vybranySmer);
    }

    public Poloha getNextPolohaRandomOra(){
    return this.duchOra.getPoloha().getPosunutuPolohu(this.velkost, Smer.getRandom());
    }
    
    public Poloha getNextPolohaRandomMod(){
    return this.duchMod.getPoloha().getPosunutuPolohu(this.velkost, Smer.getRandom());
    }
    
    public Poloha getNextPolohaRandomRuz(){
    return this.duchRuz.getPoloha().getPosunutuPolohu(this.velkost, Smer.getRandom());
    }
    
    public Poloha getNextPolohaRandomCer(){
    return this.duchCer.getPoloha().getPosunutuPolohu(this.velkost, Smer.getRandom());
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
