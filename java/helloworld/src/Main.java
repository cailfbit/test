class Base {
public
    Base(int a)
    {
        num = a;
        System.out.println("Base::Base num = " + this.num);
        System.out.println("break-1");
        System.out.println("Base::Base hashCode = " + super.hashCode());
    }
    void onInputEvent()
    {
        Other o = new Other(this);
        System.out.println("Base::onInputEvent num = " + num);
    }

private
    int num;
}


class Other{
public Other(Base base){
    System.out.println("break-2");
    base.onInputEvent();
    System.out.println("break-3");
    System.out.println("Other::Other base hashCode = " + base.hashCode());
}

}


class Sub extends Base{
public Sub(int a){
    super(a * 2);
    num = a;
    System.out.println("Sub::Sub num = " + num);
    System.out.println("Sub::Sub hashCode = " + this.hashCode());
    System.out.println("Sub::Sub super hashCode = " + super.hashCode());
    super.onInputEvent();
}

    @Override
    void onInputEvent() {
        System.out.println("Sub::onInputEvent: num = " + num);
        //super.onInputEvent();
    }
private
    int num;
}




public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        int i = 10;
        Sub sub = new Sub(i);
    }
}
