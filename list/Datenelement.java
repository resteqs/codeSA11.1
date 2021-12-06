public interface Datenelement
{
    void informationenAusgeben();
    boolean istKleinerAls(Datenelement d);
    boolean schluesselIstGleich(String s);
    String schluesselGeben();
}
