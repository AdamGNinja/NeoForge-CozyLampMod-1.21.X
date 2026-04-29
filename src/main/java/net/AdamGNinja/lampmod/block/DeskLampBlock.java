package net.AdamGNinja.lampmod.block;

import com.mojang.serialization.MapCodec;
import net.AdamGNinja.lampmod.blockentity.DeskLampBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.util.Mth;
import net.minecraft.world.item.context.BlockPlaceContext;


import javax.annotation.Nullable;

public class DeskLampBlock extends BaseEntityBlock {

    public static final IntegerProperty ROTATION = BlockStateProperties.ROTATION_16;
    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public static final MapCodec<DeskLampBlock> CODEC = simpleCodec(DeskLampBlock::new);

    private static final VoxelShape SHAPE = Block.box(1, 0, 1, 15, 14, 15);



    public DeskLampBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(ROTATION, 0)
                .setValue(LIT, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(ROTATION, LIT);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }


    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        if (!level.isClientSide()) {
            if (player.isShiftKeyDown()) {
                int next = (state.getValue(ROTATION) + 1) % 16;
                level.setBlock(pos, state.setValue(ROTATION, next), 3);
            } else {
                level.setBlock(pos, state.setValue(LIT, !state.getValue(LIT)), 3);
            }
        }
        return InteractionResult.sidedSuccess(level.isClientSide());
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new DeskLampBlockEntity(pos, state);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        int rotation = Mth.floor((context.getRotation() * 16.0F / 360.0F) + 0.5F) + 8 & 15;
        return this.defaultBlockState()
                .setValue(ROTATION, rotation)
                .setValue(LIT, false);
    }


}
