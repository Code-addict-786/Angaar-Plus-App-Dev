class Multiplier
{
    void Mlt(int a,int b)
    {
        System.out.println("Product is "+(a*b));
    }
    void Mlt(float c,float d)
    {
        System.out.println("Product is "+(c*d));
    }
    void Mlt(double e,double f)
    {
        System.out.println("Product is "+(e*f));
    }
}
class polymorphism
{
   public static void main(String[] args)
    {
        Multiplier ml=new Multiplier();
        ml.Mlt(10,20);
        ml.Mlt(10.2f,20.2f);
        ml.Mlt(11.22,12.33);
    }
}