import java.util.Random;
public enum Smer {
    HORE(90,0,-1),
    DOLE(270,0,1),
    VPRAVO(180,1,0),
    VLAVO(0,-1,0);
    
    private int uhol;
    private int vektorX;
    private int vektorY;
    
    private Smer(int uhol, int vektorX, int vektorY){
        this.uhol = uhol;
        this.vektorX = vektorX;
        this.vektorY = vektorY;
    }
    
    public int getVektorX(){
        return this.vektorX;
    }
    
    public int getVektorY(){
        return this.vektorY;
    }
    
    public int getUhol(){
        return this.uhol;
    }
    
    public static Smer getRandom(){
        Random r = new Random();
        return Smer.values()[r.nextInt(Smer.values().length)];
    }
}
