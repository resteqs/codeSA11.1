public abstract class Listenelement
{
    public Listenelement()
    {
    
    }
    public abstract Datenelement endeGeben(Datenelement d);
    public abstract int laengeGeben();
    public abstract Listenelement knotenEntfernen(Datenelement d);
    public abstract Listenelement hintenEinfuegen(Datenelement d);
    public abstract Datenelement suche(String schluessel);
    public abstract Listenelement einfuegenVor(Datenelement dneu, Datenelement vergleichswert);
}
