public class Abschluss extends Listenelement
{
    public Abschluss()
    {
        super();
    }
    public int laengeGeben()
    {
        return 0;
    }
    public Datenelement endeGeben(Datenelement d)
    {
        return d;
    }
    public Listenelement knotenEntfernen(Datenelement d)
    {
        return this;
    }
    public Listenelement hintenEinfuegen(Datenelement d)
    {
        Knoten k = new Knoten(d,this);
        return k;
    }
    public Datenelement suche(String schluessel)
    {
        return null;
    }
    public Listenelement einfuegenVor(Datenelement dneu, Datenelement vergleichswert)
    {
        return hintenEinfuegen(dneu);
    }
}
