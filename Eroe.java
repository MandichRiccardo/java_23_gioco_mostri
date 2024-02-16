public class Eroe implements Umano{
    private int forza;

    public Eroe() {
        this.forza = 10;
    }

    @Override
    public void combattimento() {
        forza = forza-3;
    }
    public String toString(){
        String info = "eroe:\n";
        info += "\tforza:\t\t" + forza + "\n";
        return info;
    }
}
