package pl.liarek123.mt2core.data.armors;

import org.bukkit.inventory.ItemStack;

public class Chestplate {
    private ItemStack chestplateItemstack;
    private Integer chestplateDefense;

    public Chestplate(ItemStack chestplateItemstack, Integer chestplateDefense ){
        this.chestplateItemstack = chestplateItemstack;
        this.chestplateDefense = chestplateDefense;
    }

    public ItemStack getChestplateItemstack() {
        return chestplateItemstack;
    }

    public void setChestplateItemstack(ItemStack chestplateItemstack) {
        this.chestplateItemstack = chestplateItemstack;
    }

    public Integer getChestplateDefense() {
        return chestplateDefense;
    }

    public void setChestplateDefense(Integer chestplateDefense) {
        this.chestplateDefense = chestplateDefense;
    }

    public static Chestplate create(ItemStack chestplateItemstack, Integer chestplateDefense){
        Chestplate created = new Chestplate(chestplateItemstack, chestplateDefense);
        return created;
    }
}
