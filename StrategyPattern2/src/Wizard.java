public class Wizard implements CharacterType
{
    @Override
    public void attack()
    {
        CastSpell castSpell = new CastSpell("Wizard");
        castSpell.attack("Wizard");
    }

    public void defend()
    {
        CreateMagic createMagic = new CreateMagic("Wizard");
        createMagic.defend("Wizard");
    }
}