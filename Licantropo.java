public class Licantropo implements Mostro, Umano{
    private int forza;

    public Licantropo(boolean lunaPiena) {
        this.forza = lunaPiena ? 15 : 10;
    }

    @Override
    public void azzanno() {
        forza = forza-2;
    }
    @Override
    public void combattimento() {
        forza = forza-3;
    }

    public void combatti(boolean lunaPiena) {
        if(!lunaPiena) combattimento();
        else azzanno();
    }
    public String toString(){
        String info = "licantropo:\n";
        info += "\tforza:\t\t" + forza + "\n";
        return info;
    }
}
