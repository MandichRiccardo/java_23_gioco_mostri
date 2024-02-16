public class Vampiro implements Mostro{
    private int forza;

    public Vampiro() {
        this.forza = 15;
    }

    @Override
    public void azzanno() {
        forza = forza-2;
    }
    public String toString(){
        String info = "vampiro:\n";
        info += "\tforza:\t\t" + forza + "\n";
        return info;
    }
}
