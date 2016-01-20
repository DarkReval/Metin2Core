package pl.liarek123.mt2core.data.armors;

import org.bukkit.inventory.ItemStack;

public class Boots {
    private ItemStack bootsItemstack;
    private Integer bootsDefense;

    public Boots(ItemStack bootsItemstack, Integer bootsDefense){
        this.bootsItemstack = bootsItemstack;
        this.bootsDefense = bootsDefense;
    }

    public ItemStack getBootsItemstack() {
        return bootsItemstack;
    }

    public void setBootsItemstack(ItemStack bootsItemstack) {
        this.bootsItemstack = bootsItemstack;
    }

    public Integer getBootsDefense() {
        return bootsDefense;
    }

    public void setBootsDefense(Integer bootsDefense) {
        this.bootsDefense = bootsDefense;
    }

    public static Boots create(ItemStack bootsItemstack, Integer bootsDefense){
        Boots created = new Boots(bootsItemstack, bootsDefense);
        return created;
    }
}
