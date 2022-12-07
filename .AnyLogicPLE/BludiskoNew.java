import java.util.ArrayList;

public class BludiskoNew {
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

    private ArrayList<Obdlznik> obdlznik;
    //// TOTO VSETKO SA TYKALO BLUDISKA 

    private ArrayList<Kruh> body; // Create an ArrayList object
    private ArrayList<Kruh> bonusoveBody;

    public BludiskoNew() {
        this.obdlznik = new ArrayList<Obdlznik>();
        this.obdlznik.add(new Obdlznik(20, 700, 0, 0, "blue", false));
        this.obdlznik.add(new Obdlznik(20, 700, 0, 0, "blue", false));
        this.obdlznik.add(new Obdlznik(700, 20, 00, 0, "blue", false));
        this.obdlznik.add(new Obdlznik(20, 700, 700, 0, "blue", false));
        this.obdlznik.add(new Obdlznik(720, 20, 0, 700, "blue", false));

        this.obdlznik.add(new Obdlznik(300, 30, 210, 150, "blue", false));
        this.obdlznik.add(new Obdlznik (30, 50,210 , 100, "blue", false));
        this.obdlznik.add(new Obdlznik (30, 50,480,100, "blue", false));

        this.obdlznik.add(new Obdlznik (30,300,100,100, "blue", false));
        this.obdlznik.add(new Obdlznik (190,30,120,260, "blue", false));

        this.obdlznik.add(new Obdlznik (30, 300, 590,100, "blue", false));
        this.obdlznik.add(new Obdlznik (190,30,410,260, "blue", false));

        this.obdlznik.add(new Obdlznik(30,190,345,370, "blue", false));
        //this.obdlznik.add(new Obdlznik (300,30, 210,370, "black", false));

        this.obdlznik.add(new Obdlznik (30,140,235,480, "blue", false ));
        this.obdlznik.add(new Obdlznik (165,30,100,480, "blue", false ));
        this.obdlznik.add(new Obdlznik (30,30,205,590, "blue", false ));

        this.obdlznik.add(new Obdlznik (30,140,450,480, "blue", false ));
        this.obdlznik.add(new Obdlznik (170,30,450,480, "blue", false ));
        this.obdlznik.add(new Obdlznik (30,30,480,590, "blue", false ));

        this.obdlznik.add(new Obdlznik (30,50,100 ,570, "blue", false ));
        this.obdlznik.add(new Obdlznik (30,50,590 ,570, "blue", false ));
        ///// TOTO VSETKO SA TYKALO BLUDISKA /////

        this.body = new ArrayList<Kruh>();
        this.bonusoveBody = new ArrayList<Kruh>();
        this.body.add(new Kruh (10,50,100, "yellow", false));
        this.body.add(new Kruh (10,50,140, "yellow", false));
        this.body.add(new Kruh (10,50,180, "yellow", false));
        this.body.add(new Kruh (10,50,220, "yellow", false));
        this.body.add(new Kruh (10,50,260, "yellow", false));
        this.body.add(new Kruh (10,50,300, "yellow", false));
        this.body.add(new Kruh (10,50,340, "yellow", false));
        this.body.add(new Kruh (10,50,380, "yellow", false));
        this.body.add(new Kruh (10,50,420, "yellow", false));
        this.body.add(new Kruh (10,50,460, "yellow", false));
        this.body.add(new Kruh (10,50,500, "yellow", false));
        this.body.add(new Kruh (10,50,540, "yellow", false));
        this.body.add(new Kruh (10,50,580, "yellow", false));
        this.body.add(new Kruh (10,50,620, "yellow", false));
        this.body.add(new Kruh (10,50,660, "yellow", false));
        this.body.add(new Kruh (10,90,660, "yellow", false));
        this.body.add(new Kruh (10,130,660, "yellow", false));
        this.body.add(new Kruh (10,170,660, "yellow", false));
        this.body.add(new Kruh (10,210,660, "yellow", false));
        this.body.add(new Kruh (10,250,660, "yellow", false));
        this.body.add(new Kruh (10,290,660, "yellow", false));
        this.body.add(new Kruh (10,330,660, "yellow", false));
        this.body.add(new Kruh (10,370,660, "yellow", false));
        this.body.add(new Kruh (10,410,660, "yellow", false));
        this.body.add(new Kruh (10,450,660, "yellow", false));
        this.body.add(new Kruh (10,490,660, "yellow", false));
        this.body.add(new Kruh (10,410,660, "yellow", false));
        this.body.add(new Kruh (10,450,660, "yellow", false));
        this.body.add(new Kruh (10,490,660, "yellow", false));
        this.body.add(new Kruh (10,530,660, "yellow", false));
        this.body.add(new Kruh (10,570,660, "yellow", false));
        this.body.add(new Kruh (10,610,660, "yellow", false));
        this.body.add(new Kruh (10,655,620, "yellow", false));
        this.body.add(new Kruh (10,655,580, "yellow", false));
        this.body.add(new Kruh (10,655,540, "yellow", false));
        this.body.add(new Kruh (10,655,500, "yellow", false));
        this.body.add(new Kruh (10,655,460, "yellow", false));
        this.body.add(new Kruh (10,655,420, "yellow", false));
        this.body.add(new Kruh (10,655,380, "yellow", false));
        this.body.add(new Kruh (10,655,340, "yellow", false));
        this.body.add(new Kruh (10,655,300, "yellow", false));
        this.body.add(new Kruh (10,655,260, "yellow", false));
        this.body.add(new Kruh (10,655,220, "yellow", false));
        this.body.add(new Kruh (10,655,180, "yellow", false));
        this.body.add(new Kruh (10,655,140, "yellow", false));
        this.body.add(new Kruh (10,655,100, "yellow", false));
        this.body.add(new Kruh (10,655,55, "yellow", false));
        this.body.add(new Kruh (10,615,55, "yellow", false));
        this.body.add(new Kruh (10,575,55, "yellow", false));
        this.body.add(new Kruh (10,535,55, "yellow", false));
        this.body.add(new Kruh (10,495,55, "yellow", false));
        this.body.add(new Kruh (10,455,55, "yellow", false));
        this.body.add(new Kruh (10,415,55, "yellow", false));
        this.body.add(new Kruh (10,375,55, "yellow", false));
        this.body.add(new Kruh (10,335,55, "yellow", false));
        this.body.add(new Kruh (10,295,55, "yellow", false));
        this.body.add(new Kruh (10,255,55, "yellow", false));
        this.body.add(new Kruh (10,215,55, "yellow", false));
        this.body.add(new Kruh (10,175,55, "yellow", false));
        this.body.add(new Kruh (10,135,55, "yellow", false));
        this.body.add(new Kruh (10,95,55, "yellow", false));
        this.body.add(new Kruh (10,165,100, "yellow", false));
        this.body.add(new Kruh (10,165,140, "yellow", false));
        this.body.add(new Kruh (10,165,180, "yellow", false));
        this.body.add(new Kruh (10,165,220, "yellow", false));
        this.body.add(new Kruh (10,165,300, "yellow", false));
        this.body.add(new Kruh (10,165,340, "yellow", false));
        this.body.add(new Kruh (10,165,380, "yellow", false));
        this.body.add(new Kruh (10,165,420, "yellow", false));
        this.body.add(new Kruh (10,165,460, "yellow", false));
        this.body.add(new Kruh (10,165,540, "yellow", false));
        this.body.add(new Kruh (10,165,580, "yellow", false));
        this.body.add(new Kruh (10,165,620, "yellow", false));
        this.body.add(new Kruh (10,545,100, "yellow", false));
        this.body.add(new Kruh (10,545,140, "yellow", false));
        this.body.add(new Kruh (10,545,180, "yellow", false));
        this.body.add(new Kruh (10,545,220, "yellow", false));
        this.body.add(new Kruh (10,545,300, "yellow", false));
        this.body.add(new Kruh (10,545,340, "yellow", false));
        this.body.add(new Kruh (10,545,380, "yellow", false));
        this.body.add(new Kruh (10,545,420, "yellow", false));
        this.body.add(new Kruh (10,545,460, "yellow", false));
        this.body.add(new Kruh (10,545,540, "yellow", false));
        this.body.add(new Kruh (10,545,580, "yellow", false));
        this.body.add(new Kruh (10,545,620, "yellow", false));
        this.body.add(new Kruh (10,210,220, "yellow", false));
        this.body.add(new Kruh (10,250,220, "yellow", false));
        this.body.add(new Kruh (10,290,220, "yellow", false));
        this.body.add(new Kruh (10,330,220, "yellow", false));
        this.body.add(new Kruh (10,370,220, "yellow", false));
        this.body.add(new Kruh (10,410,220, "yellow", false));
        this.body.add(new Kruh (10,450,220, "yellow", false));
        this.body.add(new Kruh (10,490,220, "yellow", false));
        this.body.add(new Kruh (10,210,300, "yellow", false));
        this.body.add(new Kruh (10,250,300, "yellow", false));
        this.body.add(new Kruh (10,290,300, "yellow", false));
        this.body.add(new Kruh (10,330,300, "yellow", false));
        this.body.add(new Kruh (10,370,300, "yellow", false));
        this.body.add(new Kruh (10,410,300, "yellow", false));
        this.body.add(new Kruh (10,450,300, "yellow", false));
        this.body.add(new Kruh (10,490,300, "yellow", false));
        this.body.add(new Kruh (10,210,340, "yellow", false));
        this.body.add(new Kruh (10,250,340, "yellow", false));
        this.body.add(new Kruh (10,290,340, "yellow", false));
        this.body.add(new Kruh (10,330,340, "yellow", false));
        this.body.add(new Kruh (10,370,340, "yellow", false));
        this.body.add(new Kruh (10,410,340, "yellow", false));
        this.body.add(new Kruh (10,450,340, "yellow", false));
        this.body.add(new Kruh (10,490,340, "yellow", false));
        this.body.add(new Kruh (10,210,380, "yellow", false));
        this.body.add(new Kruh (10,250,380, "yellow", false));
        this.body.add(new Kruh (10,290,380, "yellow", false));
        this.body.add(new Kruh (10,410,380, "yellow", false));
        this.body.add(new Kruh (10,450,380, "yellow", false));
        this.body.add(new Kruh (10,490,380, "yellow", false));
        this.body.add(new Kruh (10,210,420, "yellow", false));
        this.body.add(new Kruh (10,250,420, "yellow", false));
        this.body.add(new Kruh (10,290,420, "yellow", false));
        this.body.add(new Kruh (10,410,420, "yellow", false));
        this.body.add(new Kruh (10,450,420, "yellow", false));
        this.body.add(new Kruh (10,490,420, "yellow", false));
        this.body.add(new Kruh (10,210,460, "yellow", false));
        this.body.add(new Kruh (10,250,460, "yellow", false));
        this.body.add(new Kruh (10,290,460, "yellow", false));
        this.body.add(new Kruh (10,410,460, "yellow", false));
        this.body.add(new Kruh (10,450,460, "yellow", false));
        this.body.add(new Kruh (10,490,460, "yellow", false));
        this.body.add(new Kruh (10,290,620, "yellow", false));
        this.body.add(new Kruh (10,330,620, "yellow", false));
        this.body.add(new Kruh (10,370,620, "yellow", false));
        this.body.add(new Kruh (10,410,620, "yellow", false));
        this.body.add(new Kruh (10,290,580, "yellow", false));
        this.body.add(new Kruh (10,330,580, "yellow", false));
        this.body.add(new Kruh (10,370,580, "yellow", false));
        this.body.add(new Kruh (10,410,580, "yellow", false));
        this.body.add(new Kruh (10,290,540, "yellow", false));
        this.body.add(new Kruh (10,410,540, "yellow", false));
        this.body.add(new Kruh (10,290,500, "yellow", false));
        this.body.add(new Kruh (10,410,500, "yellow", false));
        this.body.add(new Kruh (10,90,540, "yellow", false));
        this.body.add(new Kruh (10,130,540, "yellow", false));
        this.body.add(new Kruh (10,210,540, "yellow", false));
        this.body.add(new Kruh (10,90,420, "yellow", false));
        this.body.add(new Kruh (10,130,420, "yellow", false));
        this.body.add(new Kruh (10,600,420, "yellow", false));
        this.body.add(new Kruh (10,90,460, "yellow", false));
        this.body.add(new Kruh (10,130,460, "yellow", false));
        this.body.add(new Kruh (10,600,460, "yellow", false));
        this.body.add(new Kruh (10,500,540, "yellow", false));
        this.body.add(new Kruh (10,600,540, "yellow", false));
        this.body.add(new Kruh (10,330,260, "yellow", false));
        this.body.add(new Kruh (10,370,260, "yellow", false));

        this.bonusoveBody.add(new Kruh (20,45,50, "yellow", false));
        this.bonusoveBody.add(new Kruh (20,650,650, "yellow", false));
    }

    public void nakresliBludisko(){
        /*this.obdlznik1.zobraz();
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
        this.obdlznikPStlpik1.zobraz();*/

        /* cyklus s pevnym poctom opakovani sa vykona tolkokrat ake je velke pole 
        tym padom prejde vsetky body a zobrazí ich */
        for(int i = 0; i < this.obdlznik.size(); i++){
            this.obdlznik.get(i).zobraz();
        }

        for(int i = 0; i < this.body.size(); i++) {
            this.body.get(i).zobraz();
        }

        /* cyklus s pevnym poctom opakovani sa vykona tolkokrat ake je velke pole 
        tym padom prejde  vsetky bonusove body a zobrazi ich */
        for(int i = 0; i < this.bonusoveBody.size(); i++) {
            this.bonusoveBody.get(i).zobraz();
        }
    }

    public void zrusBod(int i) {
        if(this.body.size() > i) {
            this.body.get(i).skry();
            this.body.remove(i);
        }
    }

    public void zrusBonusovyBod(int i) {
        if(this.body.size() > i) {
            this.bonusoveBody.get(i).skry();
            this.bonusoveBody.remove(i);
        }
    }

    /* vrati pocet bodov bonusovychaj klasickych */
    public int getPocetBodov() {
        return this.body.size() + this.bonusoveBody.size();
    }

    public ArrayList<Kruh> getBody() {
        return this.body;
    }

    public ArrayList<Integer> zistiKoliziuSBodom(Poloha polohaPacmana) {
        int velkostPacmana = 40;
        Kruh bod = null;
        ArrayList<Integer> vysledok = new ArrayList<Integer>();
        for(int i = 0; i < this.body.size(); i++) {
            bod = this.body.get(i); // zistujeme èi sa bod nachádza v Pac-Manovi
            if( 
            ( 
                (polohaPacmana.getX() < bod.getLavyHornyX()+bod.getPriemer()) 
                && 
                (polohaPacmana.getX() + velkostPacmana > bod.getLavyHornyX())
            )
            && 
            ( 
                (polohaPacmana.getY() < bod.getLavyHornyY()+bod.getPriemer()) 
                && 
                (polohaPacmana.getY() + velkostPacmana > bod.getLavyHornyY())
            ) 
            ) { 
                vysledok.add(i);
                vysledok.add(0);
                return vysledok;
            }
        }
        for(int i = 0; i < this.bonusoveBody.size(); i++) {
            bod = this.bonusoveBody.get(i); // zistujeme èi sa bod nachádza v Pac-Manovi
            if( 
            ( 
                (polohaPacmana.getX() < bod.getLavyHornyX()+bod.getPriemer()) 
                && 
                (polohaPacmana.getX() + velkostPacmana > bod.getLavyHornyX())
            )
            && 
            ( 
                (polohaPacmana.getY() < bod.getLavyHornyY()+bod.getPriemer()) 
                && 
                (polohaPacmana.getY() + velkostPacmana > bod.getLavyHornyY())
            ) 
            ) {
                vysledok.add(i);// metoda vrati to že ked tam poslem polohu pacmana tak prejde z bludiska všetky body
                //a zisti ci sa s bodom skolizuje alebo nie , a vrati index a typ bodu
                vysledok.add(1);
                return vysledok;
            }
        }
        vysledok.add(-1);
        vysledok.add(-1);
        return vysledok;

    }


    public boolean vyberSuradnice(int x, int y) {
        Obdlznik najdeny = null;
        for(int i = 0; i < this.obdlznik.size(); i++){
        if (this.obdlznik.get(i).obsahujeBod(x, y)) {
            najdeny = this.obdlznik.get(i);
            break;
        }
    }
        if (najdeny != null) { 
            return true;
        }
        return false;
    }
}
