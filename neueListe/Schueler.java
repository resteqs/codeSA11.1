public class Schueler implements Datenelement
{
    private String name;
    public Schueler(String neuerName)
    {
        name = neuerName;
    }
    public void informationenAusgeben()
    {
        System.out.println(name);
    }
    public boolean istKleinerAls(Datenelement d)
    {
        if (name.compareTo(d.schluesselGeben())>0)
        {
            return false;
        }
        return true;
    }
    public boolean schluesselIstGleich(String s)
    {
        return name.equals(s);
    }
    public String schluesselGeben()
    {
        return name;
    }
}
