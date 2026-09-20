public class CryoCharacter implements ElementalCharacter {
    @Override
    public String getElement() {
        return "Cryo";
    }
    @Override
    public void useSkill() {
        System.out.println("Cryo character uses Frost Strike!");
    }
}
