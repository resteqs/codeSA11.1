public class Knoten
{
    private Knoten nachfolger;
    private Schueler delement;
    public Knoten(Schueler neuesDelement)
    {
        delement = neuesDelement;
    }
    public Schueler datemelementgeben()
    {
        return delement;
    }
    public void nachfolgerSetzen(Knoten neuernachfolger)
    {
        nachfolger = neuernachfolger;
    }
    public Knoten nachfolgergeben()
    {
        return nachfolger;
    }
    public void InformationAusgeben()
    {
        if (delement != null)
        {
                delement.informationenausgeben();
        }
    }
        
}
