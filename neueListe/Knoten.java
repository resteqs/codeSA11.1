public class Knoten extends Listenelement
{
    private Listenelement nachfolger;
    private Datenelement delement;
    public Knoten(Datenelement d)
    {
        super();
        delement = d;
        nachfolger = new Abschluss();
    }
    public Knoten(Datenelement d, Listenelement l)
    {
        super();
        delement = d;
        nachfolger = l;
    }
    public int laengeGeben()
    {
        return nachfolger.laengeGeben() + 1;
    }
    public Datenelement endeGeben(Datenelement d)
    {
        return nachfolger.endeGeben(delement);
    }
    public Listenelement knotenEntfernen(Datenelement d)
    {
        if (d == delement)
        {
            return nachfolger;
        }
        else
        {
            if (nachfolger != null)
            {
                nachfolger = nachfolger.knotenEntfernen(d);
            }
            return this;
        }
    }
    public Listenelement hintenEinfuegen(Datenelement d)
    {
        nachfolger = nachfolger.hintenEinfuegen(d);
        return this;
    }
    public Datenelement suche(String schluessel)
    {
        if (delement.schluesselIstGleich(schluessel))
        {
            return delement;
        }
        return nachfolger.suche(schluessel);
    }
    public Listenelement einfuegenVor(Datenelement dneu, Datenelement vergleichswert)
    {
        if (delement == vergleichswert)
        {
              Knoten k = new Knoten(dneu, this);
              return k;
        }
        nachfolger = nachfolger.einfuegenVor(dneu,vergleichswert);
        return this;
    }
}
