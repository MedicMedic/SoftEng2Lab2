public class CreateMagic implements DefenseStrategy
{
    private String characterType;

    public CreateMagic(String characterType)
    {
        this.characterType = characterType;
    }

    @Override
    public void defend(String characterType)
    {
        System.out.println(characterType + " is creating a magic barrier for defense!");
    }
}