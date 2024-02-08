public class CastSpell implements AttackStrategy
{
    private String characterType;

    public CastSpell(String characterType)
    {
        this.characterType = characterType;
    }

    @Override
    public void attack(String characterType)
    {
        System.out.println(characterType + " casts a spell!");
    }
}