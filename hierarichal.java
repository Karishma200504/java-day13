class a{
    public void p1()
    {
        System.out.println("hello students");
    }
}
class b extends a{
    public void r(){
        System.out.println("hello teacher");
    }
}
class c extends a{
    public void r1(){
        System.out.println("hello professors");
    }
}public class hierarichal{
    public static void main(String args[]){
        b h=new b();
        h.r();
        h.p1();
        c h1=new c();
        h1.p1();
        h1.r1();
    }
}