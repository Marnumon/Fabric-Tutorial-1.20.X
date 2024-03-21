package net.equinox.tutorialmod.world.biome;

import net.equinox.tutorialmod.TutorialMod;
import net.equinox.tutorialmod.world.biome.surface.ModMaterialRules;
import net.equinox.tutorialmod.world.biome.surface.ModOverworldRegion;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(TutorialMod.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, TutorialMod.MOD_ID, ModMaterialRules.makeRules());
    }
}
