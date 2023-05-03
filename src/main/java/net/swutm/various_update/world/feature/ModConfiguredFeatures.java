package net.swutm.various_update.world.feature;

import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.swutm.various_update.block.ModBlocks;
import net.swutm.various_update.various_update;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> CHERRY_TREE =
            ConfiguredFeatures.register("cherry_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.CHERRY_LOG),
                    new StraightTrunkPlacer(3, 2, 2),
                    BlockStateProvider.of(ModBlocks.CHERRY_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(3), 5),
                    new TwoLayersFeatureSize(1, 1, 3)).build());

    public static final RegistryEntry<PlacedFeature> CHERRY_CHECKED = PlacedFeatures.register("cherry_checked",
            ModConfiguredFeatures.CHERRY_TREE, List.of(PlacedFeatures.wouldSurvive(ModBlocks.CHERRY_SAPLING)));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> CHERRY_SPAWN =
            ConfiguredFeatures.register("cherry_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(CHERRY_CHECKED, 0.5f)),
                            CHERRY_CHECKED));

    public static void registerConfiguredFeatures() {
        various_update.LOGGER.debug("ModConfiguredFeatures" + various_update.MOD_ID);
    }
}
