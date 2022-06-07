
public class Ucgen extends Sekil{
    private int a;
    private int b;
    private int c;

    public Ucgen(String isim,int a,int b,int c) {
        super(isim);
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    void alan_Hesapala() {
        double u=(a+b+c)/2.0;
        
       double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(getIsim()+" geometrik şekilimizin alanı = "+alan);
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public int getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(int c) {
        this.c = c;
    }
    
}
