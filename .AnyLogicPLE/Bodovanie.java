import javax.swing.JOptionPane;

public class Bodovanie
{
  
    private int skore;
    
    public Bodovanie()
    {
        skore = 0;
    }

    public int getSkore()
    {
        return this.skore;
    }
    public void setSkore(int newSkore){
        this.skore = newSkore;
    }
    public void pridajKuSkore(int Body){
       setSkore(getSkore()+ Body); // zvyšim aktualne skore o body
    }
    public void vypisSkore(){ // vypíše skore na Displeji ako správu
       JOptionPane.showMessageDialog(null, "Poèet získaných bodov: " + this.skore, "Konecne Skore" ,JOptionPane.INFORMATION_MESSAGE);
    }
    
}
