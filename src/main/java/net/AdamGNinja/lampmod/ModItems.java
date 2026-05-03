package net.AdamGNinja.lampmod;

import net.AdamGNinja.lampmod.block.DeskLampBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(LampMod.MOD_ID);

    private static DeferredItem<BlockItem> registerLampItem(String name, DeferredBlock<DeskLampBlock> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    // Original lamps
    public static final DeferredItem<BlockItem> DESK_LAMP     = registerLampItem("desk_lamp",     ModBlocks.DESK_LAMP);
    public static final DeferredItem<BlockItem> FLOOR_LAMP    = registerLampItem("floor_lamp",    ModBlocks.FLOOR_LAMP);

    // Wood lamps
    public static final DeferredItem<BlockItem> OAK_LAMP      = registerLampItem("oak_lamp",      ModBlocks.OAK_LAMP);
    public static final DeferredItem<BlockItem> SPRUCE_LAMP   = registerLampItem("spruce_lamp",   ModBlocks.SPRUCE_LAMP);
    public static final DeferredItem<BlockItem> BIRCH_LAMP    = registerLampItem("birch_lamp",    ModBlocks.BIRCH_LAMP);
    public static final DeferredItem<BlockItem> JUNGLE_LAMP   = registerLampItem("jungle_lamp",   ModBlocks.JUNGLE_LAMP);
    public static final DeferredItem<BlockItem> ACACIA_LAMP   = registerLampItem("acacia_lamp",   ModBlocks.ACACIA_LAMP);
    public static final DeferredItem<BlockItem> DARK_OAK_LAMP = registerLampItem("dark_oak_lamp", ModBlocks.DARK_OAK_LAMP);
    public static final DeferredItem<BlockItem> MANGROVE_LAMP = registerLampItem("mangrove_lamp", ModBlocks.MANGROVE_LAMP);
    public static final DeferredItem<BlockItem> CHERRY_LAMP   = registerLampItem("cherry_lamp",   ModBlocks.CHERRY_LAMP);
    public static final DeferredItem<BlockItem> BAMBOO_LAMP   = registerLampItem("bamboo_lamp",   ModBlocks.BAMBOO_LAMP);
    public static final DeferredItem<BlockItem> CRIMSON_LAMP  = registerLampItem("crimson_lamp",  ModBlocks.CRIMSON_LAMP);
    public static final DeferredItem<BlockItem> WARPED_LAMP   = registerLampItem("warped_lamp",   ModBlocks.WARPED_LAMP);

    // Redstone variants
    public static final DeferredItem<BlockItem> REDSTONE_OAK_LAMP      = registerLampItem("redstone_oak_lamp",      ModBlocks.REDSTONE_OAK_LAMP);
    public static final DeferredItem<BlockItem> REDSTONE_SPRUCE_LAMP   = registerLampItem("redstone_spruce_lamp",   ModBlocks.REDSTONE_SPRUCE_LAMP);
    public static final DeferredItem<BlockItem> REDSTONE_BIRCH_LAMP    = registerLampItem("redstone_birch_lamp",    ModBlocks.REDSTONE_BIRCH_LAMP);
    public static final DeferredItem<BlockItem> REDSTONE_JUNGLE_LAMP   = registerLampItem("redstone_jungle_lamp",   ModBlocks.REDSTONE_JUNGLE_LAMP);
    public static final DeferredItem<BlockItem> REDSTONE_ACACIA_LAMP   = registerLampItem("redstone_acacia_lamp",   ModBlocks.REDSTONE_ACACIA_LAMP);
    public static final DeferredItem<BlockItem> REDSTONE_DARK_OAK_LAMP = registerLampItem("redstone_dark_oak_lamp", ModBlocks.REDSTONE_DARK_OAK_LAMP);
    public static final DeferredItem<BlockItem> REDSTONE_MANGROVE_LAMP = registerLampItem("redstone_mangrove_lamp", ModBlocks.REDSTONE_MANGROVE_LAMP);
    public static final DeferredItem<BlockItem> REDSTONE_CHERRY_LAMP   = registerLampItem("redstone_cherry_lamp",   ModBlocks.REDSTONE_CHERRY_LAMP);
    public static final DeferredItem<BlockItem> REDSTONE_BAMBOO_LAMP   = registerLampItem("redstone_bamboo_lamp",   ModBlocks.REDSTONE_BAMBOO_LAMP);
    public static final DeferredItem<BlockItem> REDSTONE_CRIMSON_LAMP  = registerLampItem("redstone_crimson_lamp",  ModBlocks.REDSTONE_CRIMSON_LAMP);
    public static final DeferredItem<BlockItem> REDSTONE_WARPED_LAMP   = registerLampItem("redstone_warped_lamp",   ModBlocks.REDSTONE_WARPED_LAMP);

    // Glowstone variants
    public static final DeferredItem<BlockItem> GLOWSTONE_OAK_LAMP      = registerLampItem("glowstone_oak_lamp",      ModBlocks.GLOWSTONE_OAK_LAMP);
    public static final DeferredItem<BlockItem> GLOWSTONE_SPRUCE_LAMP   = registerLampItem("glowstone_spruce_lamp",   ModBlocks.GLOWSTONE_SPRUCE_LAMP);
    public static final DeferredItem<BlockItem> GLOWSTONE_BIRCH_LAMP    = registerLampItem("glowstone_birch_lamp",    ModBlocks.GLOWSTONE_BIRCH_LAMP);
    public static final DeferredItem<BlockItem> GLOWSTONE_JUNGLE_LAMP   = registerLampItem("glowstone_jungle_lamp",   ModBlocks.GLOWSTONE_JUNGLE_LAMP);
    public static final DeferredItem<BlockItem> GLOWSTONE_ACACIA_LAMP   = registerLampItem("glowstone_acacia_lamp",   ModBlocks.GLOWSTONE_ACACIA_LAMP);
    public static final DeferredItem<BlockItem> GLOWSTONE_DARK_OAK_LAMP = registerLampItem("glowstone_dark_oak_lamp", ModBlocks.GLOWSTONE_DARK_OAK_LAMP);
    public static final DeferredItem<BlockItem> GLOWSTONE_MANGROVE_LAMP = registerLampItem("glowstone_mangrove_lamp", ModBlocks.GLOWSTONE_MANGROVE_LAMP);
    public static final DeferredItem<BlockItem> GLOWSTONE_CHERRY_LAMP   = registerLampItem("glowstone_cherry_lamp",   ModBlocks.GLOWSTONE_CHERRY_LAMP);
    public static final DeferredItem<BlockItem> GLOWSTONE_BAMBOO_LAMP   = registerLampItem("glowstone_bamboo_lamp",   ModBlocks.GLOWSTONE_BAMBOO_LAMP);
    public static final DeferredItem<BlockItem> GLOWSTONE_CRIMSON_LAMP  = registerLampItem("glowstone_crimson_lamp",  ModBlocks.GLOWSTONE_CRIMSON_LAMP);
    public static final DeferredItem<BlockItem> GLOWSTONE_WARPED_LAMP   = registerLampItem("glowstone_warped_lamp",   ModBlocks.GLOWSTONE_WARPED_LAMP);

    // Iron lamps
    public static final DeferredItem<BlockItem> IRON_LAMP           = registerLampItem("iron_lamp",           ModBlocks.IRON_LAMP);
    public static final DeferredItem<BlockItem> REDSTONE_IRON_LAMP  = registerLampItem("redstone_iron_lamp",  ModBlocks.REDSTONE_IRON_LAMP);
    public static final DeferredItem<BlockItem> GLOWSTONE_IRON_LAMP = registerLampItem("glowstone_iron_lamp", ModBlocks.GLOWSTONE_IRON_LAMP);
}
