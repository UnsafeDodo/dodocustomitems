package unsafedodo.dodocustomitems.util;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;

public class CommonMethods {
    public static void addGlow(ItemStack itemStack) {
        itemStack.addEnchantment(Enchantments.LURE, 0);
        itemStack.addHideFlag(ItemStack.TooltipSection.ENCHANTMENTS);
    }
}
