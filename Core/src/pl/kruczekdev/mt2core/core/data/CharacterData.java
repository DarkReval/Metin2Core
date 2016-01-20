package pl.kruczekdev.mt2core.core.data;

import pl.kruczekdev.mt2core.core.types.CharactersType;

public class CharacterData {
    private Integer level, exp, necessary_exp;
    private Integer health, mana, attackdmg, defense;
    private Integer vit, inte, str, dex;
    private CharactersType charactersType;

    public CharacterData(Integer level, Integer exp, Integer necessary_exp, Integer health, Integer mana, Integer attackdmg, Integer defense, Integer vit, Integer inte, Integer str, Integer dex, CharactersType charactersType) {
        this.level = level;
        this.exp = exp;
        this.necessary_exp = necessary_exp;
        this.health = health;
        this.mana = mana;
        this.attackdmg = attackdmg;
        this.defense = defense;
        this.vit = vit;
        this.inte = inte;
        this.str = str;
        this.dex = dex;
        this.charactersType = charactersType;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getNecessary_exp() {
        return necessary_exp;
    }

    public void setNecessary_exp(Integer necessary_exp) {
        this.necessary_exp = necessary_exp;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Integer getAttackdmg() {
        return attackdmg;
    }

    public void setAttackdmg(Integer attackdmg) {
        this.attackdmg = attackdmg;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getVit() {
        return vit;
    }

    public void setVit(Integer vit) {
        this.vit = vit;
    }

    public Integer getInte() {
        return inte;
    }

    public void setInte(Integer inte) {
        this.inte = inte;
    }

    public Integer getStr() {
        return str;
    }

    public void setStr(Integer str) {
        this.str = str;
    }

    public Integer getDex() {
        return dex;
    }

    public void setDex(Integer dex) {
        this.dex = dex;
    }

    public CharactersType getCharactersType() {
        return charactersType;
    }

    public void setCharactersType(CharactersType charactersType) {
        this.charactersType = charactersType;
    }
}
