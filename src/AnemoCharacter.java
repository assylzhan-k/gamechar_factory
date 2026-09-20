public class AnemoCharacter implements ElementalCharacter {

    @Override
    public String getElement() {
        return "Anemo";
    }

    @Override
    public void useSkill() {
        System.out.println("Anemo charecter uses Wind Blade!");
    }
}
