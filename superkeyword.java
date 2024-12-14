class a{
    public void r(){
        System.out.println("hello");
    }
}
class b extends a{
    public void r1()
    {
        super.r();
        System.out.println("hello teachers");
    }
}
public class superkeyword{
    public static void main(String args[]){
        b n=new b();
        n.r1();
    }
}