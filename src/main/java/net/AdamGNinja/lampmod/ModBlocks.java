package net.AdamGNinja.lampmod;

import net.AdamGNinja.lampmod.block.DeskLampBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(LampMod.MOD_ID);

    public static final DeferredBlock<DeskLampBlock> DESK_LAMP =
            BLOCKS.register("desk_lamp", () -> new DeskLampBlock(
                    BlockBehaviour.Properties.of()
                            .strength(0.5f)
                            .noOcclusion()
                            .lightLevel(state -> state.getValue(DeskLampBlock.LIT) ? 8 : 0)
            ));

    public static final DeferredBlock<DeskLampBlock> FLOOR_LAMP =
            BLOCKS.register("floor_lamp", () -> new DeskLampBlock(
                    BlockBehaviour.Properties.of()
                            .strength(0.5f)
                            .noOcclusion()
                            .lightLevel(state -> state.getValue(DeskLampBlock.LIT) ? 8 : 0)
            ));

}
