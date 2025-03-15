package net.kawws.kawwsmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kawws.kawwsmod.KawwsMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup KAWWS_MOD_ITEMS_GROUP = Registry.register((Registries.ITEM_GROUP, Identifier.of(KawwsMod.MOD_ID, "kawws_mod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RICE))
                    .displayName(Text.translatable("itemgroup.kawwsmod.kawws_mod_items"))
                    .build());
    public static void registerItemGroups() {
        KawwsMod.LOGGER.info(KawwsMod.MOD_ID+" Item Group/Groups Registered!");
    }
}
