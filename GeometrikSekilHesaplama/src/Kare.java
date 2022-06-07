
public class Kare extends Sekil{
    private int kenar;

    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar=kenar;
    }

    @Override
    void alan_Hesapala() {
        int alan=getKenar()*getKenar();
        System.out.println(getIsim()+" geometrik şeklin alanı= "+alan);
    }

    /**
     * @return the kenar
     */
    public int getKenar() {
        return kenar;
    }

    /**
     * @param kenar the kenar to set
     */
    public void setKenar(int kenar) {
        this.kenar = kenar;
    }
    
}
