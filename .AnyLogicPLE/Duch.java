public class Duch {
    private Poloha poloha;
    private final SpecialObrazok obrazok;

    public Duch(Poloha poloha, DuchFot typ) {
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
