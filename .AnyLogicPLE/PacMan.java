public class PacMan {
    private Poloha poloha;
    private final SpecialObrazok obrazok;
    //private CastVlaku dalsiaCast;
    public PacMan(Poloha poloha, PacManFot typ) {
        this.poloha = poloha;
        this.obrazok = new SpecialObrazok(this.poloha, typ.getSuborObrazka());
    }
    
    public Poloha getPoloha(){
        return this.poloha;
    }
    
    public void setPoloha(Poloha poloha){
        this.poloha = poloha;
        this.obrazok.zmenPolohu(this.poloha);
    }
    
    public void pohniNaNovuPoziciu(Poloha novaPoloha){
        Poloha staraPoloha = this.poloha;
        this.setPoloha(novaPoloha);
    }
}
