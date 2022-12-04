
public class Bludisko {
    // okraje bludiska
    private Obdlznik obdlznik1;
    private Obdlznik obdlznik2;
    private Obdlznik obdlznik3;
    private Obdlznik obdlznik4;

    // rodisko duchov
    private Obdlznik obdlznikRodisko1;
    private Obdlznik obdlznikRodisko2;
    private Obdlznik obdlznikRodisko3;

    // steny z lavej strany pri rodisku (obratene t)
    private Obdlznik obdlznikLavoRodisko1;
    private Obdlznik obdlznikLavoRodisko2;

    // steny z pravej strany pri rodisku (obratene t) 
    private Obdlznik obdlznikPravoRodisko1;
    private Obdlznik obdlznikPravoRodisko2;

    // stena v tvare T pod rodisko
    private Obdlznik obdlznikT1;
    private Obdlznik obdlznikT2;
    
    // stena v tvare jemne zahnuteho L prava
    private Obdlznik obdlznikPravoL1;
    private Obdlznik obdlznikPravoL2; 
    private Obdlznik obdlznikPravoL3;
    // stena v tvare L lava 
    private Obdlznik obdlznikLavoL1;
    private Obdlznik obdlznikLavoL2; 
    private Obdlznik obdlznikLavoL3; 
    // spodny stlpik (maly) v tvare I lava
    private Obdlznik obdlznikLStlpik1;
    
    // spodny stlpik (maly) v tvare I prava
    private Obdlznik obdlznikPStlpik1;
    public Bludisko() {
        obdlznik1 = new Obdlznik(20, 700, 0, 0, "red", false);
        obdlznik2 = new Obdlznik(700, 20, 00, 0, "red", false);
        obdlznik3 = new Obdlznik(20, 700, 700, 0, "red", false);
        obdlznik4 = new Obdlznik(720, 20, 0, 700, "red", false);
        
        obdlznikRodisko1 = new Obdlznik(300, 30, 210, 150, "black", false);
        obdlznikRodisko2 = new Obdlznik (30, 50,210 , 100, "black", false);
        obdlznikRodisko3 = new Obdlznik (30, 50,480,100, "black", false);
        
        obdlznikLavoRodisko1 = new Obdlznik (30,300,100,100, "black", false);
        obdlznikLavoRodisko2 = new Obdlznik (190,30,120,260, "black", false);
        
        obdlznikPravoRodisko1 = new Obdlznik (30, 300, 590,100, "black", false);
        obdlznikPravoRodisko2 = new Obdlznik (190,30,410,260, "black", false);
        
        obdlznikT1 = new Obdlznik(30,190,345,370, "black", false);
        obdlznikT2 = new Obdlznik (300,30, 210,370, "black", false);
        
        obdlznikPravoL1 = new Obdlznik (30,140,235,480, "black", false );
        obdlznikPravoL2 = new Obdlznik (165,30,100,480, "black", false );
        obdlznikPravoL3 = new Obdlznik (30,30,205,590, "black", false );
        
        obdlznikLavoL1 = new Obdlznik (30,140,450,480, "black", false );
        obdlznikLavoL2 = new Obdlznik (170,30,450,480, "black", false );
        obdlznikLavoL3 = new Obdlznik (30,30,480,590, "black", false );
        
        obdlznikLStlpik1 = new Obdlznik (30,50,100 ,570, "black", false );
        obdlznikPStlpik1 = new Obdlznik (30,50,590 ,570, "black", false );
    }

    public void nakresliBludisko(){
        this.obdlznik1.zobraz();
        this.obdlznik2.zobraz();
        this.obdlznik3.zobraz();
        this.obdlznik4.zobraz();
        
        this.obdlznikRodisko1.zobraz();
        this.obdlznikRodisko2.zobraz();
        this.obdlznikRodisko3.zobraz();
        
        this.obdlznikLavoRodisko1.zobraz();
        this.obdlznikLavoRodisko2.zobraz();
        
        this.obdlznikPravoRodisko1.zobraz();
        this.obdlznikPravoRodisko2.zobraz();
        this.obdlznikPravoRodisko2.zobraz();
        
        this.obdlznikT1.zobraz();
        this.obdlznikT2.zobraz();
        
        this.obdlznikPravoL1.zobraz();
        this.obdlznikPravoL2.zobraz();
        this.obdlznikPravoL3.zobraz();
        
        this.obdlznikLavoL1.zobraz();
        this.obdlznikLavoL2.zobraz();
        this.obdlznikLavoL3.zobraz();
        
        this.obdlznikLStlpik1.zobraz();
        this.obdlznikPStlpik1.zobraz();
    }
}
