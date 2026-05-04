package net.AdamGNinja.lampmod;

import net.AdamGNinja.lampmod.block.DeskLampBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(LampMod.MOD_ID);

    private static DeferredBlock<DeskLampBlock> registerLamp(String name, int litLevel) {
        return BLOCKS.register(name, () -> new DeskLampBlock(
                BlockBehaviour.Properties.of()
                        .strength(0.5f)
                        .noOcclusion()
                        .lightLevel(state -> state.getValue(DeskLampBlock.LIT) ? litLevel : 0)
        ));
    }

    // Original lamps (level 12)
    public static final DeferredBlock<DeskLampBlock> DESK_LAMP     = registerLamp("desk_lamp",  12);
    public static final DeferredBlock<DeskLampBlock> FLOOR_LAMP    = registerLamp("floor_lamp", 12);

    // Wood lamps (level 12)
    public static final DeferredBlock<DeskLampBlock> OAK_LAMP      = registerLamp("oak_lamp",      12);
    public static final DeferredBlock<DeskLampBlock> SPRUCE_LAMP   = registerLamp("spruce_lamp",   12);
    public static final DeferredBlock<DeskLampBlock> BIRCH_LAMP    = registerLamp("birch_lamp",    12);
    public static final DeferredBlock<DeskLampBlock> JUNGLE_LAMP   = registerLamp("jungle_lamp",   12);
    public static final DeferredBlock<DeskLampBlock> ACACIA_LAMP   = registerLamp("acacia_lamp",   12);
    public static final DeferredBlock<DeskLampBlock> DARK_OAK_LAMP = registerLamp("dark_oak_lamp", 12);
    public static final DeferredBlock<DeskLampBlock> MANGROVE_LAMP = registerLamp("mangrove_lamp", 12);
    public static final DeferredBlock<DeskLampBlock> CHERRY_LAMP   = registerLamp("cherry_lamp",   12);
    public static final DeferredBlock<DeskLampBlock> BAMBOO_LAMP   = registerLamp("bamboo_lamp",   12);
    public static final DeferredBlock<DeskLampBlock> CRIMSON_LAMP  = registerLamp("crimson_lamp",  12);
    public static final DeferredBlock<DeskLampBlock> WARPED_LAMP   = registerLamp("warped_lamp",   12);

    // Redstone variants (level 7)
    public static final DeferredBlock<DeskLampBlock> REDSTONE_OAK_LAMP      = registerLamp("redstone_oak_lamp",      7);
    public static final DeferredBlock<DeskLampBlock> REDSTONE_SPRUCE_LAMP   = registerLamp("redstone_spruce_lamp",   7);
    public static final DeferredBlock<DeskLampBlock> REDSTONE_BIRCH_LAMP    = registerLamp("redstone_birch_lamp",    7);
    public static final DeferredBlock<DeskLampBlock> REDSTONE_JUNGLE_LAMP   = registerLamp("redstone_jungle_lamp",   7);
    public static final DeferredBlock<DeskLampBlock> REDSTONE_ACACIA_LAMP   = registerLamp("redstone_acacia_lamp",   7);
    public static final DeferredBlock<DeskLampBlock> REDSTONE_DARK_OAK_LAMP = registerLamp("redstone_dark_oak_lamp", 7);
    public static final DeferredBlock<DeskLampBlock> REDSTONE_MANGROVE_LAMP = registerLamp("redstone_mangrove_lamp", 7);
    public static final DeferredBlock<DeskLampBlock> REDSTONE_CHERRY_LAMP   = registerLamp("redstone_cherry_lamp",   7);
    public static final DeferredBlock<DeskLampBlock> REDSTONE_BAMBOO_LAMP   = registerLamp("redstone_bamboo_lamp",   7);
    public static final DeferredBlock<DeskLampBlock> REDSTONE_CRIMSON_LAMP  = registerLamp("redstone_crimson_lamp",  7);
    public static final DeferredBlock<DeskLampBlock> REDSTONE_WARPED_LAMP   = registerLamp("redstone_warped_lamp",   7);

    // Glowstone variants (level 15)
    public static final DeferredBlock<DeskLampBlock> GLOWSTONE_OAK_LAMP      = registerLamp("glowstone_oak_lamp",      15);
    public static final DeferredBlock<DeskLampBlock> GLOWSTONE_SPRUCE_LAMP   = registerLamp("glowstone_spruce_lamp",   15);
    public static final DeferredBlock<DeskLampBlock> GLOWSTONE_BIRCH_LAMP    = registerLamp("glowstone_birch_lamp",    15);
    public static final DeferredBlock<DeskLampBlock> GLOWSTONE_JUNGLE_LAMP   = registerLamp("glowstone_jungle_lamp",   15);
    public static final DeferredBlock<DeskLampBlock> GLOWSTONE_ACACIA_LAMP   = registerLamp("glowstone_acacia_lamp",   15);
    public static final DeferredBlock<DeskLampBlock> GLOWSTONE_DARK_OAK_LAMP = registerLamp("glowstone_dark_oak_lamp", 15);
    public static final DeferredBlock<DeskLampBlock> GLOWSTONE_MANGROVE_LAMP = registerLamp("glowstone_mangrove_lamp", 15);
    public static final DeferredBlock<DeskLampBlock> GLOWSTONE_CHERRY_LAMP   = registerLamp("glowstone_cherry_lamp",   15);
    public static final DeferredBlock<DeskLampBlock> GLOWSTONE_BAMBOO_LAMP   = registerLamp("glowstone_bamboo_lamp",   15);
    public static final DeferredBlock<DeskLampBlock> GLOWSTONE_CRIMSON_LAMP  = registerLamp("glowstone_crimson_lamp",  15);
    public static final DeferredBlock<DeskLampBlock> GLOWSTONE_WARPED_LAMP   = registerLamp("glowstone_warped_lamp",   15);

    // Iron lamps
    public static final DeferredBlock<DeskLampBlock> IRON_LAMP           = registerLamp("iron_lamp",           12);
    public static final DeferredBlock<DeskLampBlock> REDSTONE_IRON_LAMP  = registerLamp("redstone_iron_lamp",   7);
    public static final DeferredBlock<DeskLampBlock> GLOWSTONE_IRON_LAMP = registerLamp("glowstone_iron_lamp", 15);

    // Obsidian lamps
    public static final DeferredBlock<DeskLampBlock> OBSIDIAN_LAMP           = registerLamp("obsidian_lamp",           12);
    public static final DeferredBlock<DeskLampBlock> REDSTONE_OBSIDIAN_LAMP  = registerLamp("redstone_obsidian_lamp",   7);
    public static final DeferredBlock<DeskLampBlock> GLOWSTONE_OBSIDIAN_LAMP = registerLamp("glowstone_obsidian_lamp", 15);
}
