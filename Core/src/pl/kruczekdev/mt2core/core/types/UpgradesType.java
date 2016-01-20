package pl.kruczekdev.mt2core.core.types;

public enum UpgradesType {
    NORMAL("Normalne"), IMPROVED("Zaawansowane"), ELITE("Elitarne"), LEGENDARY("Legendarne");

    private String upgradeName;

    private UpgradesType(String upgradeName){
        this.upgradeName = upgradeName;
    }

    public String getUpgradeName() {
        return upgradeName;
    }

}
