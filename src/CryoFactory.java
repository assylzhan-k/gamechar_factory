public class CryoFactory implements ElementFactory {
    @Override
    public ElementalCharacter createCharacter() {
        return new CryoCharacter();
    }
    @Override
    public Weapon createWeapon() {
        return new CryoWeapon();
    }
    @Override
    public Artifact createArtifact() {
        return new CryoArtifact();
    }
}
