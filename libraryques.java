class library{
    String name;
    int bb;
    library(String name)
    {
        this.name=name;
        this.bb=0;
    }
    public boolean cb(){
        return false;
    }
    public void bob()
    {
        if(cb())
        {
            bb++;
            System.out.println(name+"you borrowed"+bb+"book");
        }else{
            System.out.println("your limit exceeded!");
        }
    }
}
class students extends library
{
    students(String name){
        super(name);
    }
    public boolean cb()
    {
        return bb<3;
    }
}
class teachers extends library{
    teachers(String name){
        super(name);
    }
    public boolean cb()
    {
        return bb<10;
    }
}
public class libraryques{
    public static void main(String args[]){
        library a=new students("amar");
        library b1=new students("lalitha");
        library b=new teachers("dr.prem kumar");
        b1.bob();
        a.bob();
        a.bob();
        a.bob();
    }
}
