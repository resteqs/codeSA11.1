
/**
 * Beschreiben Sie hier die Klasse Schueler.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Schueler
{
    private String name;
    private Schueler nachfolger;
    public Schueler(String schuelername)
    {
        nachfolger = null;
        name = schuelername;
    }  
    public void nachfolgersetzten(Schueler neuernachfolger)
    {
        nachfolger = neuernachfolger;
    }
    public Schueler nachfolgergeben()
    {
        return nachfolger;
    }
    public void informationenausgeben()
    {
        System.out.println(name);
    }
}
