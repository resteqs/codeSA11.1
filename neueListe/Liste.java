public class Liste
{
    private Listenelement anfang;
    public Liste()
    {
        anfang = new Abschluss();
    }
    public int laengeGeben()
    {
        return anfang.laengeGeben();
    }
    public Datenelement endeEntfernen()
    {
        Datenelement d = anfang.endeGeben(null);
        anfang = anfang.knotenEntfernen(d);
        return d;
    }
    public void vorneEinfuegen(Datenelement dneu)
    {
        Knoten k = new Knoten(dneu, anfang);
        anfang = k;
    }
    public void hintenEinfuegen(Datenelement dneu)
    {
        anfang = anfang.hintenEinfuegen(dneu);
    }
    public Datenelement suche(String schluessel)
    {
        return anfang.suche(schluessel);
    }
    public void einfuegenVor(Datenelement dneu, Datenelement vergleichswert)
    {
        anfang = anfang.einfuegenVor(dneu,vergleichswert);
    }
}
