public class GameClient {
    private final ElementalCharacter character;
    private final Weapon weapon;
    private final Artifact artifact;
    public GameClient(ElementFactory factory) {
        if (factory == null) {
            throw new IllegalArgumentException("Element factory cannot be null");
        }
        character = factory.createCharacter();
        weapon = factory.createWeapon();
        artifact = factory.createArtifact();
    }
    public void showElementBuild() {
        System.out.println("Character element: " + character.getElement());
        character.useSkill();
        weapon.useWeapon();
        artifact.activateBonus();
    }
}