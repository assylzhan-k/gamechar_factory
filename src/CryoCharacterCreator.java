public class CryoCharacterCreator extends CharacterCreator {
    @Override
    public ElementalCharacter createCharacter() {
        return new CryoCharacter();
    }
}
