package net.swutm.various_update.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swutm.various_update.block.custom.*;
import net.swutm.various_update.entity.ModSignTypes;
import net.swutm.various_update.various_update;
import net.swutm.various_update.world.feature.tree.CherrySaplingGenerator;

public class ModBlocks {

    //    Blocks

    public static final Block STRIPPED_BAMBOO_BLOCK = registerBlock("stripped_bamboo_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block BAMBOO_BLOCK = registerBlock("bamboo_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block CHISELED_STRIPPED_BAMBOO_BLOCK = registerBlock("chiseled_stripped_bamboo_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block CHERRY_WOOD = registerBlock("cherry_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(0.5f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block CHERRY_LOG = registerBlock("cherry_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ItemGroup.BUILDING_BLOCKS);

    public static final Block CHERRY_PLANKS = registerBlock("cherry_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(0.5f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block CHERRY_LEAVES = registerBlock("cherry_leaves",
            new Block(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ItemGroup.BUILDING_BLOCKS);

    //Sapling

    public static final Block CHERRY_SAPLING = registerBlock("cherry_sapling",
            new SaplingBlock(new CherrySaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ItemGroup.DECORATIONS);

    //Flower

//    public static final Block PINK_PETALS = registerBlock("pink_peatals",
//            new CarpetBlock(FabricBlockSettings.copy(Blocks.RED_CARPET)), ItemGroup.BUILDING_BLOCKS);

    //    Buttons
    public static final Block BAMBOO_BUTTON = registerBlock("bamboo_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(0.5f).requiresTool().noCollision()), ItemGroup.REDSTONE);

    public static final Block STRIPPED_BAMBOO_BUTTON = registerBlock("stripped_bamboo_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(0.5f).requiresTool().noCollision()), ItemGroup.REDSTONE);

    public static final Block CHISELED_STRIPPED_BAMBOO_BUTTON = registerBlock("chiseled_stripped_bamboo_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(0.5f).requiresTool().noCollision()), ItemGroup.REDSTONE);

    public static final Block CHERRY_BUTTON = registerBlock("cherry_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(0.5f).requiresTool().noCollision()), ItemGroup.REDSTONE);

    //    Pressure Plate
    public static final Block BAMBOO_PRESSURE_PLATE = registerBlock("bamboo_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL)
                    .strength(0.5f).requiresTool()), ItemGroup.REDSTONE);

    public static final Block STRIPPED_BAMBOO_PRESSURE_PLATE = registerBlock("stripped_bamboo_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL)
                    .strength(0.5f).requiresTool()), ItemGroup.REDSTONE);

    public static final Block CHISELED_STRIPPED_BAMBOO_PRESSURE_PLATE = registerBlock("chiseled_stripped_bamboo_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL)
                    .strength(0.5f).requiresTool()), ItemGroup.REDSTONE);

    public static final Block CHERRY_PRESSURE_PLATE = registerBlock("cherry_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL)
                    .strength(0.5f).requiresTool()), ItemGroup.REDSTONE);

    //    Slab
    public static final Block BAMBOO_SLAB = registerBlock("bamboo_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(0.5f).requiresTool()), ItemGroup.DECORATIONS);

    public static final Block STRIPPED_BAMBOO_SLAB = registerBlock("stripped_bamboo_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(0.5f).requiresTool()), ItemGroup.DECORATIONS);

    public static final Block CHISELED_STRIPPED_BAMBOO_SLAB = registerBlock("chiseled_stripped_bamboo_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(0.5f).requiresTool()), ItemGroup.DECORATIONS);

    public static final Block CHERRY_SLAB = registerBlock("cherry_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(0.5f).requiresTool()), ItemGroup.DECORATIONS);

    //    Stairs
    public static final Block BAMBOO_STAIRS = registerBlock("bamboo_stairs",
            new ModStairsBlock(ModBlocks.BAMBOO_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).strength(0.5f).requiresTool()), ItemGroup.DECORATIONS);

    public static final Block STRIPPED_BAMBOO_STAIRS = registerBlock("stripped_bamboo_stairs",
            new ModStairsBlock(ModBlocks.STRIPPED_BAMBOO_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).strength(0.5f).requiresTool()), ItemGroup.DECORATIONS);

    public static final Block CHISELED_STRIPPED_STRIPPED_BAMBOO_STAIRS = registerBlock("chiseled_stripped_bamboo_stairs",
            new ModStairsBlock(ModBlocks.STRIPPED_BAMBOO_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).strength(0.5f).requiresTool()), ItemGroup.DECORATIONS);

    public static final Block CHERRY_STAIRS = registerBlock("cherry_stairs",
            new ModStairsBlock(ModBlocks.BAMBOO_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).strength(0.5f).requiresTool()), ItemGroup.DECORATIONS);

    //    Fences

    public static final Block BAMBOO_FENCE = registerBlock("bamboo_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(0.5f).requiresTool()), ItemGroup.DECORATIONS);

    public static final Block STRIPPED_BAMBOO_FENCE = registerBlock("stripped_bamboo_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(0.5f).requiresTool()), ItemGroup.DECORATIONS);

    public static final Block CHISELED_STRIPPED_BAMBOO_FENCE = registerBlock("chiseled_stripped_bamboo_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(0.5f).requiresTool()), ItemGroup.DECORATIONS);

    public static final Block CHERRY_FENCE = registerBlock("cherry_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(0.5f).requiresTool()), ItemGroup.DECORATIONS);

    //    Fence Gate

    public static final Block BAMBOO_FENCE_GATE = registerBlock("bamboo_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(0.5f).requiresTool()), ItemGroup.DECORATIONS);

    public static final Block STRIPPED_BAMBOO_FENCE_GATE = registerBlock("stripped_bamboo_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(0.5f).requiresTool()), ItemGroup.DECORATIONS);

    public static final Block CHISELED_STRIPPED_BAMBOO_FENCE_GATE = registerBlock("chiseled_stripped_bamboo_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(0.5f).requiresTool()), ItemGroup.DECORATIONS);

    public static final Block CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(0.5f).requiresTool()), ItemGroup.DECORATIONS);

    //    Doors
    public static final Block BAMBOO_DOOR = registerBlock("bamboo_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(0.5f).requiresTool().nonOpaque()), ItemGroup.REDSTONE);

    public static final Block STRIPPED_BAMBOO_DOOR = registerBlock("stripped_bamboo_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(0.5f).requiresTool().nonOpaque()), ItemGroup.REDSTONE);

    public static final Block CHISELED_STRIPPED_BAMBOO_DOOR = registerBlock("chiseled_stripped_bamboo_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(0.5f).requiresTool().nonOpaque()), ItemGroup.REDSTONE);

    public static final Block CHERRY_DOOR = registerBlock("cherry_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(0.5f).requiresTool().nonOpaque()), ItemGroup.REDSTONE);

    //    Trapdoors
    public static final Block BAMBOO_TRAPDOOR = registerBlock("bamboo_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(0.5f).requiresTool().nonOpaque()), ItemGroup.REDSTONE);

    public static final Block STRIPPED_BAMBOO_TRAPDOOR = registerBlock("stripped_bamboo_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(0.5f).requiresTool().nonOpaque()), ItemGroup.REDSTONE);

    public static final Block CHISELED_STRIPPED_BAMBOO_TRAPDOOR = registerBlock("chiseled_stripped_bamboo_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(0.5f).requiresTool().nonOpaque()), ItemGroup.REDSTONE);

    public static final Block CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(0.5f).requiresTool().nonOpaque()), ItemGroup.REDSTONE);

    //Signs
    public static final Block BAMBOO_WALL_SIGN = registerBlockWithoutBlockItem("bamboo_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.BAMBOO), ItemGroup.DECORATIONS);

    public static final Block BAMBOO_SIGN = registerBlockWithoutBlockItem("bamboo_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.BAMBOO), ItemGroup.DECORATIONS);

    public static final Block STRIPPED_BAMBOO_WALL_SIGN = registerBlockWithoutBlockItem("stripped_bamboo_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.STRIPPED_BAMBOO), ItemGroup.DECORATIONS);

    public static final Block STRIPPED_BAMBOO_SIGN = registerBlockWithoutBlockItem("stripped_bamboo_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.STRIPPED_BAMBOO), ItemGroup.DECORATIONS);

    public static final Block CHISELED_STRIPPED_BAMBOO_WALL_SIGN = registerBlockWithoutBlockItem("chiseled_stripped_bamboo_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.CHISELED_STRIPPED_BAMBOO), ItemGroup.DECORATIONS);

    public static final Block CHISELED_STRIPPED_BAMBOO_SIGN = registerBlockWithoutBlockItem("chiseled_stripped_bamboo_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.CHISELED_STRIPPED_BAMBOO), ItemGroup.DECORATIONS);

    public static final Block CHERRY_WALL_SIGN = registerBlockWithoutBlockItem("cherry_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.COOLED_CHERRY), ItemGroup.DECORATIONS);

    public static final Block CHERRY_SIGN = registerBlockWithoutBlockItem("cherry_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.COOLED_CHERRY), ItemGroup.DECORATIONS);

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(various_update.MOD_ID, name), block);
    }

        private static Block registerBlock(String name, Block block, ItemGroup tab) {
            registerBlockItem(name, block, tab);
            return Registry.register(Registry.BLOCK, new Identifier(various_update.MOD_ID, name), block);
        }

        private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
            return Registry.register(Registry.ITEM, new Identifier(various_update.MOD_ID, name),
                    new BlockItem(block, new FabricItemSettings().group(tab)));
        }

        public static void registerModBlocks() {
            various_update.LOGGER.debug("Registering ModBlocks for " + various_update.MOD_ID);
        }
    }
