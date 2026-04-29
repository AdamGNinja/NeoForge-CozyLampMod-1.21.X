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
                    BlockEntityType.Builder.of(DeskLampBlockEntity::new, ModBlocks.DESK_LAMP.get(),  ModBlocks.FLOOR_LAMP.get())
                            .build(null));
}
