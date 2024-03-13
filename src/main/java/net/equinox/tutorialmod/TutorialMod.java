package net.equinox.tutorialmod;

import net.equinox.tutorialmod.block.ModBlocks;
import net.equinox.tutorialmod.item.ModItemGroups;
import net.equinox.tutorialmod.item.ModItems;
import net.equinox.tutorialmod.sound.ModSounds;
import net.equinox.tutorialmod.util.ModCustomTrades;
import net.equinox.tutorialmod.util.ModLootTableModifiers;
import net.equinox.tutorialmod.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();
		ModVillagers.registerVillagers();
		ModSounds.registerSounds();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
	}
}