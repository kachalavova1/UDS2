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
       setSkore(getSkore()+ Body); // zvy�im aktualne skore o body
    }
    public void vypisSkore(){ // vyp�e skore na Displeji ako spr�vu
       JOptionPane.showMessageDialog(null, "Po�et z�skan�ch bodov: " + this.skore, "Konecne Skore" ,JOptionPane.INFORMATION_MESSAGE);
    }
    
}
