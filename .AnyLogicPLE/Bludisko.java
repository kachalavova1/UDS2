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
    public Bludisko() {
        obdlznik1 = new Obdlznik(20, 700, 0, 0, "red", false);
        obdlznik2 = new Obdlznik(700, 20, 00, 0, "red", false);
        obdlznik3 = new Obdlznik(20, 700, 700, 0, "red", false);
        obdlznik4 = new Obdlznik(720, 20, 0, 700, "red", false);
        obdlznikRodisko1 = new Obdlznik(300, 20, 200, 150, "blue", false);
    }
    
    public void nakresliBludisko(){
        this.obdlznik1.zobraz();
        this.obdlznik2.zobraz();
        this.obdlznik3.zobraz();
        this.obdlznik4.zobraz();
        this.obdlznikRodisko1.zobraz();
    }
}
