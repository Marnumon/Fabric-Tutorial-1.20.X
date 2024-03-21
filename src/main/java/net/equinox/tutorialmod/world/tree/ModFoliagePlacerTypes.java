package net.equinox.tutorialmod.world.tree;

import net.equinox.tutorialmod.TutorialMod;
import net.equinox.tutorialmod.mixin.FoliagePlacerTypeInvoker;
import net.equinox.tutorialmod.world.tree.custom.ChestnutFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> CHESTNUT_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("chestnut_foliage_placer", ChestnutFoliagePlacer.CODEC);

    public static void register() {
        TutorialMod.LOGGER.info("Registering Foliage Placers for " + TutorialMod.MOD_ID);
    }
}
