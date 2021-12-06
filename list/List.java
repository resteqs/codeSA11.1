public class List
{
    private Knoten anfang;
    public List()
    {
         anfang = null;
    }
    public int laengeGeben()
    {
        if (anfang == null)
        {
            return 0;
        }
        return anfang.restlaengeGeben();
    }
    public Datenelement suchen(String vergleichswert)
    {
        if (anfang == null)
        {
            return null;
        }
        return anfang.suchen(vergleichswert);
    }
    public void hintenEinfuegen(Datenelement dneu)
    {
        if (anfang != null)
        {
            anfang.knotenEinfuegen(dneu);
        }
        else
        {
            vorneEinfuegen(dneu);
        }
    }
    public void vorneEinfuegen(Datenelement dneu)
    {
        Knoten k = new Knoten(dneu, anfang);
        anfang = k;
    }
    public void vordatenelementEinfügen(Datenelement dneu, Datenelement vergleich)
    {
        if (anfang != null)
        {
            anfang = anfang.einfuegenVor(dneu,vergleich);
        }
        else
        {
            vorneEinfuegen(dneu);
        }
    }
    public void sortiertEinfuegen(Datenelement dneu)
    {
        if (anfang != null)
        {
            anfang = anfang. sortiertEinfuegen(dneu);
        }
        else
        {
            vorneEinfuegen(dneu);
        }
    }
    public Datenelement anfangEntfernen()
    {
        if (anfang != null)
        {
            Datenelement d = anfang.datenelementGeben();
            anfang = anfang. nachfolgerGeben();
            return d;
        }
        else
        {
            return null;
        }
    }
    public Datenelement endeEntfernen()
    {
        if (anfang != null)
        {
            Datenelement d = anfang.endeGeben();
            anfang = anfang.knotenEntfernen(d);
            return d;
        }
        else
        {
            return null;
        }
    }
    public void knotenEntfernen(Datenelement d)
    {
        if (anfang != null)
        {
            anfang = anfang.knotenEntfernen(d);
        }
    }
    
}
