public class Main {
    public static void main(String[] args) {

        //Holder1 object could be created for any type
        Holder1<Integer> h1 = new Holder1<Integer>(100);
        Holder1<String> h2 = new Holder1<String>("Vishal");

        Holder2<Integer> h3 = new Holder2<Integer>(100);
        //Holder2<String> h4 = new Holder2<String>("Vishal");
        Holder2<Double> h5 = new Holder2<Double>(12.12);

    }
}
