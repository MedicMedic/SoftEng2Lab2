public class ShootArrow implements AttackStrategy
{
    private String characterType;

    public ShootArrow(String characterType)
    {
        this.characterType = characterType;
    }

    @Override
    public void attack(String characterType)
    {
        System.out.println(characterType + " shoots an arrow!");
    }
}