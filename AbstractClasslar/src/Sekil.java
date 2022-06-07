
public abstract class Sekil {
    /*  interfacelerden farklı oarak hem özellik hem de methodlar barındırır ve methodların gövdesi bbulunur
    sadece abtract methodların gövdesi bulunmaz bu methodlar interface methodu gibi kullanılır*/
    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }
    
    public void ismini_soyle(){
        System.out.println("bu obje "+isim+" objesidir.");}
    
    abstract void alan_hesapla();

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }
}
