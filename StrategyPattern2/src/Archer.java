public class Archer implements CharacterType
{
    @Override
    public void attack()
    {
        ShootArrow shootArrow = new ShootArrow("Archer");
        shootArrow.attack("Archer");
    }

    public void defend()
    {
        Dodge dodge = new Dodge("Archer");
        dodge.defend("Archer");
    }
}