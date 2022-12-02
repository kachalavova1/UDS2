public class SpecialObrazok {
    private final Obrazok obrazok;
    private Poloha poloha;
    public SpecialObrazok(Poloha poloha, String subor) {
        this.poloha = new Poloha(100, 100, 0);
        this.obrazok = new Obrazok(subor);
        this.zmenPolohu(poloha);
    }
    
    public Poloha getPoloha(){
        return this.poloha;
    }
    
    public void zmenPolohu(Poloha novaPoloha){
        this.obrazok.skry();
        this.obrazok.posunVodorovne(-this.poloha.getX());
        this.obrazok.posunZvisle(-this.poloha.getY());
        this.obrazok.zmenUhol(-this.poloha.getUhol());
        this.poloha = novaPoloha;
        
        this.obrazok.posunVodorovne(this.poloha.getX());
        this.obrazok.posunZvisle(this.poloha.getY());
        this.obrazok.zmenUhol(this.poloha.getUhol());
        
        this.obrazok.zobraz();
    }
}
