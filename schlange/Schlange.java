
/**
 * Beschreiben Sie hier die Klasse Schlange.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Schlange
{
    private Schueler anfang;
    private Schueler ende;
    public Schlange()
    {
        anfang = null;
        ende = null;
    }
    public void einfuegen(Schueler neuerschueler)
    { 
        if (ende != null)
        {
            ende.nachfolgersetzten(neuerschueler);
            ende = neuerschueler;     
        }
        else
        {
            ende = neuerschueler;
            anfang = neuerschueler;
        }
    }
    public Schueler entfernen()
    {
        Schueler s = anfang;
        if (anfang != null)
        {
            anfang = anfang.nachfolgergeben();
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
                anfang.informationenausgeben();
        }
    }
    
        
}
