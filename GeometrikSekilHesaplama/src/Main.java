
import java.util.Scanner;


public class Main {
  
    public static void main(String[] args) {
      //Geometrik şekil alanı hesaplama
    
    Scanner scanner=new Scanner(System.in);
    String islemler="\t İŞLEMLER \n"
            + "1. Kare alanı hesapla \n"
            + "2. Ücgen alanı hesapla \n"
            + "3. Daire alalnı hesapla\n"
            + "çıkış = q";  
        while (true) { 
             System.out.println(islemler);
        System.out.println("Hangi geometrik şeklin alanını hesaplamak istiyorsun?");
        
        String sekil_turu=scanner.nextLine();
        
            if (sekil_turu.equals("q")) {
                System.out.println("programdan çıkılıyor");
                break;
                
            }else if (sekil_turu.equals("1")) {
                System.out.println("Karenin kenarı : ");
                int kenar_girdi=scanner.nextInt();
                scanner.nextLine();
              Sekil sekil;
              sekil=new Kare("KARE 1", kenar_girdi);
              sekil.alan_Hesapala();
              /* ŞU KULLANIM DAHA DOĞRU bence*/
              Kare kare=new  Kare("KARE 2", kenar_girdi);
                kare.alan_Hesapala();
               
                
            }
             else if (sekil_turu.equals("2")) {
                System.out.println("\t Ücgenin Kenarları  ");
                System.out.println("birincikenar : ");
                int kenar_a_girdi=scanner.nextInt();
                scanner.nextLine();
                 System.out.println("ikinci kenar : ");
                int kenar_b_girdi=scanner.nextInt();
                scanner.nextLine();
                 System.out.println("üçüncü kenar :  ");
                int kenar_c_girdi=scanner.nextInt();
                scanner.nextLine();
              Sekil sekil;
              sekil=new Ucgen("Üçgen 1", kenar_a_girdi,kenar_b_girdi,kenar_c_girdi);
              sekil.alan_Hesapala();
              /* ŞU KULLANIM DAHA DOĞRU bence */
             Ucgen ucgen=new  Ucgen("Üçgen 2", kenar_a_girdi,kenar_b_girdi,kenar_c_girdi);
                ucgen.alan_Hesapala();
               
                
            }
            else if (sekil_turu.equals("3")) {
                System.out.println("Dairenin yarıçapı : ");
                int yarıcap_girdi=scanner.nextInt();
                scanner.nextLine();
              Sekil sekil;
              sekil=new Daire("Daire 1", yarıcap_girdi);
              sekil.alan_Hesapala();
              /* ŞU KULLANIM DAHA DOĞRU bence */
             Daire daire=new  Daire("Daire 2", yarıcap_girdi);
                daire.alan_Hesapala();
               
                
            }
            else{
                System.out.println("geçersiz işlem");}
        }
       
        
        
    }
    
   
    
}
