
public class Main {
    public static void main(String[] args) {
       
        Kare kare1=new Kare("KARE", 5);
        Daire daire1=new Daire("DAİRE", 5);
        kare1.alan_hesapla();
        daire1.alan_hesapla();
        kare1.cevre_hesaola();
       
        // şu şekildede kullanabiliriz ama
        
        Sekil seki1=new Kare("KARE", 5);
        Sekil seki2=new Daire("DAİRE", 5);
        seki1.alan_hesapla();
        seki2.alan_hesapla();
        seki1.ismini_soyle();
        seki2.ismini_soyle();
       // seki1.cevre_hesaola();// ama bu method abtracta tanımlı olmadığından böyle çağıramayız
        
        
    }
    
}
