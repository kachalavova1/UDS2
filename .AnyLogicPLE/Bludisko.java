public class Bludisko {
    private Obdlznik obdlznik1;
    private Obdlznik obdlznik2;
    private Obdlznik obdlznik3;
    private Obdlznik obdlznik4;
    public Bludisko() {
        obdlznik1 = new Obdlznik(20, 700, 60, 50, "red", false);
        obdlznik2 = new Obdlznik(700, 20, 60, 50, "red", false);
        obdlznik3 = new Obdlznik(20, 700, 760, 50, "red", false);
        obdlznik4 = new Obdlznik(720, 20, 60, 750, "red", false);
    }
    
    public void nakresliBludisko(){
        this.obdlznik1.zobraz();
        this.obdlznik2.zobraz();
        this.obdlznik3.zobraz();
        this.obdlznik4.zobraz();
    }
}
