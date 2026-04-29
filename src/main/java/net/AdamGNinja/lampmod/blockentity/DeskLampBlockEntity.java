package net.AdamGNinja.lampmod.blockentity;

import net.AdamGNinja.lampmod.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class DeskLampBlockEntity extends BlockEntity {

    public DeskLampBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.DESK_LAMP_BE.get(), pos, state);
    }
}
