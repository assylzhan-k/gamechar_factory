public final class ElementFactoryProvider {
    private ElementFactoryProvider() {
    }
    public static ElementFactory getFactory(ElementType type) {
        if (type == ElementType.ANEMO) {
            return new AnemoFactory();
        }
        if (type == ElementType.CRYO) {
            return new CryoFactory();
        }
        throw new IllegalArgumentException("Unsupported element type");
    }
}