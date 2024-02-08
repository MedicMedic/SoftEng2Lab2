public class Dodge implements DefenseStrategy
{
    private String characterType;

    public Dodge(String characterType)
    {
        this.characterType = characterType;
    }

    @Override
    public void defend(String characterType)
    {
        System.out.println(characterType + " dodging to avoid attack!");
    }
}