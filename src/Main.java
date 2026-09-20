public class Main {
    public static void main(String[] args) {
        runFactoryMethodDemo();
        System.out.println();
        runAbstractFactoryDemo();
    }
    private static void runFactoryMethodDemo() {
        System.out.println("=== factory method ===");

        CharacterCreator anemoCreator = new AnemoCharacterCreator();
        ElementalCharacter anemoCharacter = anemoCreator.createCharacter();
        System.out.println("Element: " + anemoCharacter.getElement());
        anemoCharacter.useSkill();

        CharacterCreator cryoCreator = new CryoCharacterCreator();
        ElementalCharacter cryoCharacter = cryoCreator.createCharacter();
        System.out.println("Element: " + cryoCharacter.getElement());
        cryoCharacter.useSkill();
    }
    private static void runAbstractFactoryDemo() {
        System.out.println("=== abstract factory ===");

        ElementFactory anemoFactory = ElementFactoryProvider.getFactory(ElementType.ANEMO);
        GameClient anemoClient = new GameClient(anemoFactory);

        System.out.println("\nanemo fam:");
        anemoClient.showElementBuild();

        ElementFactory cryoFactory = ElementFactoryProvider.getFactory(ElementType.CRYO);
        GameClient cryoClient = new GameClient(cryoFactory);

        System.out.println("\ncryo fam:");
        cryoClient.showElementBuild();
    }
}