package pl.liarek123.mt2core.data.armors;

import org.bukkit.inventory.ItemStack;

public class Helmet {
    private ItemStack helmetItemstack;
    private Integer helmetDefense;

    public Helmet(ItemStack helmetItemstack, Integer helmetDefense){
        this.helmetItemstack = helmetItemstack;
        this.helmetDefense = helmetDefense;
    }

    public ItemStack getHelmetItemstack() {
        return helmetItemstack;
    }

    public void setHelmetItemstack(ItemStack helmetItemstack) {
        this.helmetItemstack = helmetItemstack;
    }

    public Integer getHelmetDefense() {
        return helmetDefense;
    }

    public void setHelmetDefense(Integer helmetDefense) {
        this.helmetDefense = helmetDefense;
    }

    public static Helmet create(ItemStack helmetItemstack, Integer helmetDefense){
        Helmet created = new Helmet(helmetItemstack, helmetDefense);
        return created;
    }
}
