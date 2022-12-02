public class Poloha {
    private final int uhol;
    private final int x;
    private final int y;
    public Poloha(int x, int y, int uhol) {
        this.x = x;
        this.y = y;
        this.uhol = uhol;
    }
    
    public int getUhol(){
        return this.uhol;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public Poloha getPosunutuPolohu(int krok, Smer smer){
        return new Poloha(this.x + (krok * smer.getVektorX()),
        this.y + (krok * smer.getVektorY()),
        smer.getUhol());
    }
}
