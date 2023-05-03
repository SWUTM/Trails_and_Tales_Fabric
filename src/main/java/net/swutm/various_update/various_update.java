package net.swutm.various_update;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.swutm.various_update.block.ModBlocks;
import net.swutm.various_update.item.ModItems;
import net.swutm.various_update.world.feature.ModConfiguredFeatures;
import net.swutm.various_update.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class various_update implements ModInitializer {
	public static final String MOD_ID = "various_update";
	public static final Logger LOGGER = LoggerFactory.getLogger("various_update");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
//		Registry.register(BuiltinRegistries.BIOME, new Identifier("various_update", "cherry_biome"));
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModWorldGen.generateWorldGen();
	};
}
