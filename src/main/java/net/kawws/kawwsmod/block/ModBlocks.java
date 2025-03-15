package net.kawws.kawwsmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kawws.kawwsmod.KawwsMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

public class ModBlocks {
    public static final Block RICE_CATCHER = registerBlock("rice_catcher", new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));


   private static Block registerBlock(String name, Block block) {
       registerBlockItem(name, block);
       return Registry.register(Registries.BLOCK, Identifier.of(KawwsMod.MOD_ID, name), block);
   }

   private static void registerBlockItem(String name, Block block) {
       Registry.register(Registries.ITEM, Identifier.of(KawwsMod.MOD_ID, name),
       new BlockItem(block, new Item.Settings()));
   }

    public static void registerModBlocks() {
        KawwsMod.LOGGER.info("Registering Mod Blocks for" + KawwsMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
           entries.add(ModBlocks.RICE_CATCHER);
        });
    }
}
