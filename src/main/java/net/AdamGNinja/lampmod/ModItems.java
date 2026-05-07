package net.AdamGNinja.lampmod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LampMod.MOD_ID);

    private static RegistryObject<BlockItem> registerLampItem(String name, RegistryObject<? extends Block> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    // Original lamps
    public static final RegistryObject<BlockItem> DESK_LAMP     = registerLampItem("desk_lamp",     ModBlocks.DESK_LAMP);
    public static final RegistryObject<BlockItem> FLOOR_LAMP    = registerLampItem("floor_lamp",    ModBlocks.FLOOR_LAMP);

    // Wood lamps
    public static final RegistryObject<BlockItem> OAK_LAMP      = registerLampItem("oak_lamp",      ModBlocks.OAK_LAMP);
    public static final RegistryObject<BlockItem> SPRUCE_LAMP   = registerLampItem("spruce_lamp",   ModBlocks.SPRUCE_LAMP);
    public static final RegistryObject<BlockItem> BIRCH_LAMP    = registerLampItem("birch_lamp",    ModBlocks.BIRCH_LAMP);
    public static final RegistryObject<BlockItem> JUNGLE_LAMP   = registerLampItem("jungle_lamp",   ModBlocks.JUNGLE_LAMP);
    public static final RegistryObject<BlockItem> ACACIA_LAMP   = registerLampItem("acacia_lamp",   ModBlocks.ACACIA_LAMP);
    public static final RegistryObject<BlockItem> DARK_OAK_LAMP = registerLampItem("dark_oak_lamp", ModBlocks.DARK_OAK_LAMP);
    public static final RegistryObject<BlockItem> MANGROVE_LAMP = registerLampItem("mangrove_lamp", ModBlocks.MANGROVE_LAMP);
    public static final RegistryObject<BlockItem> CHERRY_LAMP   = registerLampItem("cherry_lamp",   ModBlocks.CHERRY_LAMP);
    public static final RegistryObject<BlockItem> BAMBOO_LAMP   = registerLampItem("bamboo_lamp",   ModBlocks.BAMBOO_LAMP);
    public static final RegistryObject<BlockItem> CRIMSON_LAMP  = registerLampItem("crimson_lamp",  ModBlocks.CRIMSON_LAMP);
    public static final RegistryObject<BlockItem> WARPED_LAMP   = registerLampItem("warped_lamp",   ModBlocks.WARPED_LAMP);

    // Redstone variants
    public static final RegistryObject<BlockItem> REDSTONE_OAK_LAMP      = registerLampItem("redstone_oak_lamp",      ModBlocks.REDSTONE_OAK_LAMP);
    public static final RegistryObject<BlockItem> REDSTONE_SPRUCE_LAMP   = registerLampItem("redstone_spruce_lamp",   ModBlocks.REDSTONE_SPRUCE_LAMP);
    public static final RegistryObject<BlockItem> REDSTONE_BIRCH_LAMP    = registerLampItem("redstone_birch_lamp",    ModBlocks.REDSTONE_BIRCH_LAMP);
    public static final RegistryObject<BlockItem> REDSTONE_JUNGLE_LAMP   = registerLampItem("redstone_jungle_lamp",   ModBlocks.REDSTONE_JUNGLE_LAMP);
    public static final RegistryObject<BlockItem> REDSTONE_ACACIA_LAMP   = registerLampItem("redstone_acacia_lamp",   ModBlocks.REDSTONE_ACACIA_LAMP);
    public static final RegistryObject<BlockItem> REDSTONE_DARK_OAK_LAMP = registerLampItem("redstone_dark_oak_lamp", ModBlocks.REDSTONE_DARK_OAK_LAMP);
    public static final RegistryObject<BlockItem> REDSTONE_MANGROVE_LAMP = registerLampItem("redstone_mangrove_lamp", ModBlocks.REDSTONE_MANGROVE_LAMP);
    public static final RegistryObject<BlockItem> REDSTONE_CHERRY_LAMP   = registerLampItem("redstone_cherry_lamp",   ModBlocks.REDSTONE_CHERRY_LAMP);
    public static final RegistryObject<BlockItem> REDSTONE_BAMBOO_LAMP   = registerLampItem("redstone_bamboo_lamp",   ModBlocks.REDSTONE_BAMBOO_LAMP);
    public static final RegistryObject<BlockItem> REDSTONE_CRIMSON_LAMP  = registerLampItem("redstone_crimson_lamp",  ModBlocks.REDSTONE_CRIMSON_LAMP);
    public static final RegistryObject<BlockItem> REDSTONE_WARPED_LAMP   = registerLampItem("redstone_warped_lamp",   ModBlocks.REDSTONE_WARPED_LAMP);

    // Glowstone variants
    public static final RegistryObject<BlockItem> GLOWSTONE_OAK_LAMP      = registerLampItem("glowstone_oak_lamp",      ModBlocks.GLOWSTONE_OAK_LAMP);
    public static final RegistryObject<BlockItem> GLOWSTONE_SPRUCE_LAMP   = registerLampItem("glowstone_spruce_lamp",   ModBlocks.GLOWSTONE_SPRUCE_LAMP);
    public static final RegistryObject<BlockItem> GLOWSTONE_BIRCH_LAMP    = registerLampItem("glowstone_birch_lamp",    ModBlocks.GLOWSTONE_BIRCH_LAMP);
    public static final RegistryObject<BlockItem> GLOWSTONE_JUNGLE_LAMP   = registerLampItem("glowstone_jungle_lamp",   ModBlocks.GLOWSTONE_JUNGLE_LAMP);
    public static final RegistryObject<BlockItem> GLOWSTONE_ACACIA_LAMP   = registerLampItem("glowstone_acacia_lamp",   ModBlocks.GLOWSTONE_ACACIA_LAMP);
    public static final RegistryObject<BlockItem> GLOWSTONE_DARK_OAK_LAMP = registerLampItem("glowstone_dark_oak_lamp", ModBlocks.GLOWSTONE_DARK_OAK_LAMP);
    public static final RegistryObject<BlockItem> GLOWSTONE_MANGROVE_LAMP = registerLampItem("glowstone_mangrove_lamp", ModBlocks.GLOWSTONE_MANGROVE_LAMP);
    public static final RegistryObject<BlockItem> GLOWSTONE_CHERRY_LAMP   = registerLampItem("glowstone_cherry_lamp",   ModBlocks.GLOWSTONE_CHERRY_LAMP);
    public static final RegistryObject<BlockItem> GLOWSTONE_BAMBOO_LAMP   = registerLampItem("glowstone_bamboo_lamp",   ModBlocks.GLOWSTONE_BAMBOO_LAMP);
    public static final RegistryObject<BlockItem> GLOWSTONE_CRIMSON_LAMP  = registerLampItem("glowstone_crimson_lamp",  ModBlocks.GLOWSTONE_CRIMSON_LAMP);
    public static final RegistryObject<BlockItem> GLOWSTONE_WARPED_LAMP   = registerLampItem("glowstone_warped_lamp",   ModBlocks.GLOWSTONE_WARPED_LAMP);

    // Iron lamps
    public static final RegistryObject<BlockItem> IRON_LAMP           = registerLampItem("iron_lamp",           ModBlocks.IRON_LAMP);
    public static final RegistryObject<BlockItem> REDSTONE_IRON_LAMP  = registerLampItem("redstone_iron_lamp",  ModBlocks.REDSTONE_IRON_LAMP);
    public static final RegistryObject<BlockItem> GLOWSTONE_IRON_LAMP = registerLampItem("glowstone_iron_lamp", ModBlocks.GLOWSTONE_IRON_LAMP);

    // Obsidian lamps
    public static final RegistryObject<BlockItem> OBSIDIAN_LAMP           = registerLampItem("obsidian_lamp",           ModBlocks.OBSIDIAN_LAMP);
    public static final RegistryObject<BlockItem> REDSTONE_OBSIDIAN_LAMP  = registerLampItem("redstone_obsidian_lamp",  ModBlocks.REDSTONE_OBSIDIAN_LAMP);
    public static final RegistryObject<BlockItem> GLOWSTONE_OBSIDIAN_LAMP = registerLampItem("glowstone_obsidian_lamp", ModBlocks.GLOWSTONE_OBSIDIAN_LAMP);

    // Lapis lamps
    public static final RegistryObject<BlockItem> LAPIS_LAMP           = registerLampItem("lapis_lamp",           ModBlocks.LAPIS_LAMP);
    public static final RegistryObject<BlockItem> REDSTONE_LAPIS_LAMP  = registerLampItem("redstone_lapis_lamp",  ModBlocks.REDSTONE_LAPIS_LAMP);
    public static final RegistryObject<BlockItem> GLOWSTONE_LAPIS_LAMP = registerLampItem("glowstone_lapis_lamp", ModBlocks.GLOWSTONE_LAPIS_LAMP);

    // Emerald bottle lamps
    public static final RegistryObject<BlockItem> EMERALD_BOTTLELAMP           = registerLampItem("emerald_bottlelamp",           ModBlocks.EMERALD_BOTTLELAMP);
    public static final RegistryObject<BlockItem> REDSTONE_EMERALD_BOTTLELAMP  = registerLampItem("redstone_emerald_bottlelamp",  ModBlocks.REDSTONE_EMERALD_BOTTLELAMP);
    public static final RegistryObject<BlockItem> GLOWSTONE_EMERALD_BOTTLELAMP = registerLampItem("glowstone_emerald_bottlelamp", ModBlocks.GLOWSTONE_EMERALD_BOTTLELAMP);
}