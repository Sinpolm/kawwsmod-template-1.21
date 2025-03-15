package net.kawws.kawwsmod;

import net.fabricmc.api.ModInitializer;

import net.kawws.kawwsmod.block.ModBlocks;
import net.kawws.kawwsmod.item.ModItemGroups;
import net.kawws.kawwsmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KawwsMod implements ModInitializer {
	public static final String MOD_ID = "kawwsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}