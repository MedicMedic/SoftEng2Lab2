public class SwingSword implements AttackStrategy
{
    private String characterType;

    public SwingSword(String characterType)
    {
        this.characterType = characterType;
    }

    @Override
    public void attack(String characterType)
    {
        System.out.println(characterType + " attacks with a sword!");
    }
}