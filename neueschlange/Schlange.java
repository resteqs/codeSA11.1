
/**
 * Beschreiben Sie hier die Klasse Schlange.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Schlange
{
    private Knoten anfang;
    private Knoten ende;
    public Schlange()
    {
        anfang = null;
        ende = null;
    }
    public void einfuegen(Schueler neuerschueler)
    { 
        Knoten neuerKnoten = new Knoten(neuerschueler);
        if (ende != null)
        {
            ende. nachfolgerSetzen(neuerKnoten);
            ende = neuerKnoten;     
        }
        else
        {
            ende = neuerKnoten;
            anfang = neuerKnoten;
        }
    }
    public Schueler entfernen()
    {
        Schueler s = null;
        if (anfang != null)
        {
            s = anfang.datemelementgeben();
            anfang = anfang. nachfolgergeben();
            if (anfang == null)
            {
                ende = null;
            }
        }
        return s;
    }
    public void informationenausgeben()
    {
        if (anfang != null)
        {
                anfang.InformationAusgeben();
        }
    }
    
        
}
