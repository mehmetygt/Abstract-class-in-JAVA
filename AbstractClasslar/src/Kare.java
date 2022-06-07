
public class Kare extends Sekil{
    private int kenar;

    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar=kenar;
        
        
    }
/* abstact class tan exteds ettiğimiz classa  ekstradan method ve özellik ekleyebiliriz
    ve  abstarctaki method ve özeliikleri de kullanabiliriz.
    */
    @Override
    void alan_hesapla() {
        int alan=kenar*kenar;
        System.out.println(getIsim()+" alanı = "+alan);
    }
    public void cevre_hesaola(){
    int cevre=kenar*4;
        System.out.println(getIsim()+" çevresi = "+cevre);}
}
