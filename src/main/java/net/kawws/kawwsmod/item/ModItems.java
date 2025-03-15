package net.kawws.kawwsmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kawws.kawwsmod.KawwsMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RICE = registerItem("rice", new Item(new Item.Settings()));
    public static final Item RAW_RICE = registerItem("raw_rice", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(KawwsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        KawwsMod.LOGGER.info("Registering Mod Items for" + KawwsMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RICE);
            entries.add(RAW_RICE);
        });
    }
}
