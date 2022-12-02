public enum PacManFot {
    PACMAN("pics/pacman.png");
    
    private String suborObrazka;
    
    private PacManFot(String subor){
        this.suborObrazka = subor;
    }
    
    public String getSuborObrazka(){
        return this.suborObrazka;
    }
}
