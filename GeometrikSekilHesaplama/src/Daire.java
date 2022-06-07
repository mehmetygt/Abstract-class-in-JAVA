
public class Daire extends Sekil{
    private int yaricap; 

    public Daire(String isim,int yaricap) {
        super(isim);
        this.yaricap=yaricap;
    }

    @Override
    void alan_Hesapala() {
       double alan=Math.PI*yaricap*yaricap;
        System.out.println(getIsim()+" geometrik şeklinin alanı = "+alan);
    }

    /**
     * @return the yaricap
     */
    public int getYaricap() {
        return yaricap;
    }

    /**
     * @param yaricap the yaricap to set
     */
    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }
    
    
}
