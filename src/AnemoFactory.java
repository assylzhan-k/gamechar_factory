public class AnemoFactory implements ElementFactory {
    @Override
    public ElementalCharacter createCharacter() {
        return new AnemoCharacter();
    }
    @Override
    public Weapon createWeapon() {
        return new AnemoWeapon();
    }
    @Override
    public Artifact createArtifact() {
        return new AnemoArtifact();
    }
}
