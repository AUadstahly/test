import java.util.ArrayList;

class Test {
    private int _x;

    public Test(){
        _x = 0;

    }
    public Test(int x){
        _x=x;
    }
    public void setX(int x){ _x = x; }
    public int getX(){return _x;}
}
class Test2 {
    private int _y;

    public Test2(){
        _y = 0;
    }
    public Test2(int x){
        _y =x;
    }
    public void setY(int x){ _y = x; }
    public int getY(){return _y;}
}
class Stuff<T>{
    private T _thing;
    public Stuff() {_thing = null;}
    public Stuff(T t) {_thing = t;}
    public T getThing() {return _thing;}
    public void setThing(T t) {_thing = t;}
    public void print(){
        if (_thing != null)
            System.out.println("Type: " + _thing.getClass().getName() + ", value: " + _thing);
    }
    //getClass() is in object and gets class info
}
public class Main {
    public static void main(String[] args) {
        //ArrayList<Test> stuff = new ArrayList<Test>() a generic
        Stuff<Test> s = new Stuff<Test>();
        s.setThing(new Test(5));
        s.print();
        System.out.println(s.getThing().getX()); //chaining
    }
}
//test
//_x
//        def
//narg
//                accessor
//mutator
//                        test2
//_y
//                                set
