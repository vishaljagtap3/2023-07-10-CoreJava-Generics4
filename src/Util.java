public class Util {

    //here the type is Object independent of actual type
    public static void fun(Holder h) {
        System.out.println("fun: " + h.getData());
    }

    //fun1 accepts a specific type of holder
    public static void fun1(Holder<String> h) {
        System.out.println("fun: " + h.getData());
    }

    //fun2 accepts a specific type of holder
    public static void fun2(Holder<Integer> h) {
        System.out.println("fun: " + h.getData());
    }

    public static void fun3(Holder<?> h) {
        System.out.println("fun3: " + h.getData());
    }

    //here the K and V are considered of type Object
    public static void demo1(Box b) {
        System.out.println(b);
    }

    //type should be known at run-time
    public static void demo2(Box<?, ?> b) {
        System.out.println(b);
    }

    public static void demo3(Box<String, ?> b) {
        System.out.println(b);
    }

    public static void demo4(Box<?, Integer> b) {
        System.out.println(b);
    }

    public static void demo5(Box<String, Integer> b) {
        System.out.println(b);
    }
}
