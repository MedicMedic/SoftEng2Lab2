public class Knight implements CharacterType
{
    @Override
    public void attack()
    {
        SwingSword swingSword = new SwingSword("Knight");
        swingSword.attack("Knight");
    }

    public void defend()
    {
        CreateMagic createMagic = new CreateMagic("Knight");
        createMagic.defend("Knight");
        Dodge dodge = new Dodge("Knight");
        dodge.defend("Knight");
        Shield shield = new Shield("Knight");
        shield.defend("Knight");
    }
}