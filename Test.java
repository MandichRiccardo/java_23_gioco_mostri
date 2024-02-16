public class Test{
    public static void main(String[] args) {
        Eroe e = new Eroe();
        Licantropo l = new Licantropo(true);
        Vampiro v = new Vampiro();
        for (int i = 0; i < 3; i++) {
            e.combattimento();
        }
        v.azzanno();
        l.combatti(true);
        l.combatti(false);
        System.out.println(e.toString() + l + v);
    }
}