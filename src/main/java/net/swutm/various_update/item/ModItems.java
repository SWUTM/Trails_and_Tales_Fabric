package net.swutm.various_update.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swutm.various_update.block.ModBlocks;
import net.swutm.various_update.various_update;

public class ModItems {

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(various_update.MOD_ID, name), item);
    }

    public static final Item BAMBOO_SIGN = registerItem("bamboo_sign",
            new SignItem(new FabricItemSettings().group(ItemGroup.DECORATIONS).maxCount(16),
                    ModBlocks.BAMBOO_SIGN, ModBlocks.BAMBOO_WALL_SIGN));

    public static final Item STRIPPED_BAMBOO_SIGN = registerItem("stripped_bamboo_sign",
            new SignItem(new FabricItemSettings().group(ItemGroup.DECORATIONS).maxCount(16),
                    ModBlocks.STRIPPED_BAMBOO_SIGN, ModBlocks.STRIPPED_BAMBOO_WALL_SIGN));

    public static final Item CHISELED_STRIPPED_BAMBOO_SIGN = registerItem("chiseled_stripped_bamboo_sign",
            new SignItem(new FabricItemSettings().group(ItemGroup.DECORATIONS).maxCount(16),
                    ModBlocks.CHISELED_STRIPPED_BAMBOO_SIGN, ModBlocks.CHISELED_STRIPPED_BAMBOO_WALL_SIGN));

    public static final Item CHERRY_SIGN = registerItem("cherry_sign",
            new SignItem(new FabricItemSettings().group(ItemGroup.DECORATIONS).maxCount(16),
                    ModBlocks.CHERRY_SIGN, ModBlocks.CHERRY_WALL_SIGN));

    public static void registerModItems() {
        various_update.LOGGER.info("1" + various_update.MOD_ID);
    }
}

