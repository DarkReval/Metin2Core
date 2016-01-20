package pl.kruczekdev.mt2core.core.data;

import pl.kruczekdev.mt2core.core.types.KingdomsType;

import java.util.UUID;

public class GamerData {
    private String name;
    private UUID uuid;
    private KingdomsType kingdomsType;
    private CharacterData characterData;

    public GamerData(String name, UUID uuid, KingdomsType kingdomsType, CharacterData characterData) {
        this.name = name;
        this.uuid = uuid;
        this.kingdomsType = kingdomsType;
        this.characterData = characterData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public KingdomsType getKingdomsType() {
        return kingdomsType;
    }

    public void setKingdomsType(KingdomsType kingdomsType) {
        this.kingdomsType = kingdomsType;
    }

    public CharacterData getCharacterData() {
        return characterData;
    }

    public void setCharacterData(CharacterData characterData) {
        this.characterData = characterData;
    }

}
