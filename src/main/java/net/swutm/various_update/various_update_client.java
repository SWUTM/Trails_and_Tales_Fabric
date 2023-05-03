package net.swutm.various_update;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.BiomeKeys;
import net.swutm.various_update.block.ModBlocks;

public class various_update_client implements ClientModInitializer {
        @Override
        public void onInitializeClient() {
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BAMBOO_DOOR, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BAMBOO_TRAPDOOR, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_BAMBOO_DOOR, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRIPPED_BAMBOO_TRAPDOOR, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHISELED_STRIPPED_BAMBOO_DOOR, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHISELED_STRIPPED_BAMBOO_TRAPDOOR, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_DOOR, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_TRAPDOOR, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_LEAVES, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_SAPLING, RenderLayer.getCutout());
//            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_PETALS, RenderLayer.getCutout());
        }
    }


