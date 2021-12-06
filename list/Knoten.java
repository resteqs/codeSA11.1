public class Knoten
{
    private Datenelement delement;
    private Knoten nachfolger;
    public Knoten(Datenelement neuesElement)
    {
        delement = neuesElement;
    }
    public Knoten(Datenelement neuesElement, Knoten neuerKnoten)
    {
        delement = neuesElement;
        nachfolger = neuerKnoten;
    }
    public Datenelement datenelementGeben()
    {
        return delement;
    }
    public Knoten nachfolgerGeben()
    {
        return nachfolger;
    }
    public int restlaengeGeben()
    {
        if (nachfolger == null)
        {
            return 1;
        }
        return nachfolger.restlaengeGeben()+1;
    }
    public void knotenEinfuegen(Datenelement dneu)
    {
        if (nachfolger != null)
        {
            nachfolger.knotenEinfuegen(dneu);
        }
        else
        {
            Knoten k = new Knoten(dneu);
            nachfolger = k;
        }
    }
    public Datenelement suchen(String vergleichswert)
    {
        if (delement.schluesselIstGleich(vergleichswert))
        {
            return delement;
        }
        else if (nachfolger != null)
        {
            return nachfolger.suchen(vergleichswert);
        }
        else 
        {
            return null;
        }
    }
    public Knoten einfuegenVor(Datenelement dneu, Datenelement vergleich)
    {
        if (delement != vergleich)
        {
            if (nachfolger != null)
            {
                nachfolger = nachfolger.einfuegenVor(dneu,vergleich);
            }
            else
            {
                knotenEinfuegen(dneu);
            }
            return this;
        }
        else 
        {
            Knoten kneu = new Knoten (dneu, this);
            return kneu;
        }
    }
    public Knoten sortiertEinfuegen(Datenelement dneu)
    {
        if (delement.istKleinerAls(dneu))
        {
            if (nachfolger != null)
            {
                nachfolger = nachfolger.sortiertEinfuegen(dneu);
            }
            else
            {
                knotenEinfuegen(dneu);
            }
            return this;
        }
        else 
        {
            Knoten kneu = new Knoten (dneu, this);
            return kneu;
        }
    }
    public Knoten knotenEntfernen(Datenelement d)
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
    public Datenelement endeGeben()
    {
        if (nachfolger == null)
        {
            return delement;
        }
        else
        {
            return nachfolger.endeGeben();
        }
    }
}
