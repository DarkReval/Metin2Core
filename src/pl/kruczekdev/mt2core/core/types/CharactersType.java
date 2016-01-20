package pl.kruczekdev.mt2core.core.types;

public enum CharactersType {
    WARRIOR("Wojownik"), NINJA("Ninja"), SHAMAN("Szaman");

    private String nameCharacter;

    private CharactersType(String nameCharacter){
        this.nameCharacter = nameCharacter;
    }

    public String getNameCharacter() {
        return nameCharacter;
    }
}
