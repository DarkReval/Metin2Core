package pl.liarek123.mt2core.data.armors;

import org.bukkit.inventory.ItemStack;

public class Leggings {
    private ItemStack leggingsItemstack;
    private Integer leggingsDefense;

    public Leggings(ItemStack leggingsItemstack, Integer leggingsDefense){
        this.leggingsItemstack = leggingsItemstack;
        this.leggingsDefense = leggingsDefense;
    }

    public ItemStack getLeggingsItemstack() {
        return leggingsItemstack;
    }

    public void setLeggingsItemstack(ItemStack leggingsItemstack) {
        this.leggingsItemstack = leggingsItemstack;
    }

    public Integer getLeggingsDefense() {
        return leggingsDefense;
    }

    public void setLeggingsDefense(Integer leggingsDefense) {
        this.leggingsDefense = leggingsDefense;
    }

    public static Leggings create(ItemStack leggingsItemstack, Integer leggingsDefense){
        Leggings created = new Leggings(leggingsItemstack, leggingsDefense);
        return created;
    }
}
