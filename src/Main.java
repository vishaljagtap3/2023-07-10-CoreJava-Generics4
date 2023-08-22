public class Main {
    public static void main(String[] args) {

        Holder<String> hs = new Holder<String>("Pune");
        Holder<Integer> hi = new Holder<>(1290);
        Holder<Float> hf = new Holder<>(12.12f);


        Util.fun(hs);
        Util.fun(hi);
        Util.fun(hf);

        Util.fun1(hs);
        //Util.fun1(hi);
        //Util.fun1(hf);

        System.out.println();

        Util.fun3(hs);
        Util.fun3(hi);
        Util.fun3(hf);

        Box<Integer, String> b1 = new Box<Integer, String>(100, "BitCode");
        Box<String, Float> b2 = new Box<>("Velu", 0F);
        Box<String, String> b3 = new Box<String, String>("vishal", "9999999");

    }
}
