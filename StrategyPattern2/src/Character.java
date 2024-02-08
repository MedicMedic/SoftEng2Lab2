public class Character
{
    private CharacterType character;

    public Character(CharacterType character)
    {
        this.character = character;
    }

    public void attack()
    {
        character.attack();
    }

    public void defend()
    {
        character.defend();
    }
}