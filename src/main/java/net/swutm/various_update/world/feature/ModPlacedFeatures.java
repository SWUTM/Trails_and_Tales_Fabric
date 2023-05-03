package net.swutm.various_update.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class ModPlacedFeatures {
    public static final  RegistryEntry<PlacedFeature> CHERRY_PLACED = PlacedFeatures.register("cherry_placed",
            ModConfiguredFeatures.CHERRY_SPAWN,
            VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(5, 0.5f, 4)));
}
