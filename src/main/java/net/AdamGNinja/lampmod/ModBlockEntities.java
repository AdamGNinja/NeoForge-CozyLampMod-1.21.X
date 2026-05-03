package net.AdamGNinja.lampmod;

import net.AdamGNinja.lampmod.blockentity.DeskLampBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, LampMod.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DeskLampBlockEntity>> DESK_LAMP_BE =
            BLOCK_ENTITIES.register("desk_lamp_be", () ->
                    BlockEntityType.Builder.of(DeskLampBlockEntity::new,
                            // Original lamps
                            ModBlocks.DESK_LAMP.get(),
                            ModBlocks.FLOOR_LAMP.get(),
                            // Wood lamps
                            ModBlocks.OAK_LAMP.get(),
                            ModBlocks.SPRUCE_LAMP.get(),
                            ModBlocks.BIRCH_LAMP.get(),
                            ModBlocks.JUNGLE_LAMP.get(),
                            ModBlocks.ACACIA_LAMP.get(),
                            ModBlocks.DARK_OAK_LAMP.get(),
                            ModBlocks.MANGROVE_LAMP.get(),
                            ModBlocks.CHERRY_LAMP.get(),
                            ModBlocks.BAMBOO_LAMP.get(),
                            ModBlocks.CRIMSON_LAMP.get(),
                            ModBlocks.WARPED_LAMP.get(),
                            // Redstone variants
                            ModBlocks.REDSTONE_OAK_LAMP.get(),
                            ModBlocks.REDSTONE_SPRUCE_LAMP.get(),
                            ModBlocks.REDSTONE_BIRCH_LAMP.get(),
                            ModBlocks.REDSTONE_JUNGLE_LAMP.get(),
                            ModBlocks.REDSTONE_ACACIA_LAMP.get(),
                            ModBlocks.REDSTONE_DARK_OAK_LAMP.get(),
                            ModBlocks.REDSTONE_MANGROVE_LAMP.get(),
                            ModBlocks.REDSTONE_CHERRY_LAMP.get(),
                            ModBlocks.REDSTONE_BAMBOO_LAMP.get(),
                            ModBlocks.REDSTONE_CRIMSON_LAMP.get(),
                            ModBlocks.REDSTONE_WARPED_LAMP.get(),
                            // Glowstone variants
                            ModBlocks.GLOWSTONE_OAK_LAMP.get(),
                            ModBlocks.GLOWSTONE_SPRUCE_LAMP.get(),
                            ModBlocks.GLOWSTONE_BIRCH_LAMP.get(),
                            ModBlocks.GLOWSTONE_JUNGLE_LAMP.get(),
                            ModBlocks.GLOWSTONE_ACACIA_LAMP.get(),
                            ModBlocks.GLOWSTONE_DARK_OAK_LAMP.get(),
                            ModBlocks.GLOWSTONE_MANGROVE_LAMP.get(),
                            ModBlocks.GLOWSTONE_CHERRY_LAMP.get(),
                            ModBlocks.GLOWSTONE_BAMBOO_LAMP.get(),
                            ModBlocks.GLOWSTONE_CRIMSON_LAMP.get(),
                            ModBlocks.GLOWSTONE_WARPED_LAMP.get(),
                            // Iron lamps
                            ModBlocks.IRON_LAMP.get(),
                            ModBlocks.REDSTONE_IRON_LAMP.get(),
                            ModBlocks.GLOWSTONE_IRON_LAMP.get()
                    ).build(null));
}
