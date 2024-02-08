public class Shield implements DefenseStrategy
{
    private String characterType;

    public Shield(String characterType)
    {
        this.characterType = characterType;
    }

    @Override
    public void defend(String characterType)
    {
        System.out.println(characterType + " using a shield to defend");
    }
}