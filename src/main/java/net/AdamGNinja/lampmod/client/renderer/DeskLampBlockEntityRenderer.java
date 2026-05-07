package net.AdamGNinja.lampmod.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.AdamGNinja.lampmod.ModBlocks;
import net.AdamGNinja.lampmod.block.DeskLampBlock;
import net.AdamGNinja.lampmod.blockentity.DeskLampBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.data.ModelData;

public class DeskLampBlockEntityRenderer implements BlockEntityRenderer<DeskLampBlockEntity> {

    public DeskLampBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
    }

    @Override
    public void render(DeskLampBlockEntity blockEntity, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight, int packedOverlay) {

        BlockState state = blockEntity.getBlockState();
        int rotation = state.getValue(DeskLampBlock.ROTATION);
        boolean lit = state.getValue(DeskLampBlock.LIT);

        int lightLevel = lit ? LightTexture.FULL_BRIGHT : packedLight;

        poseStack.pushPose();

        poseStack.translate(0.5, 0.0, 0.5);
        poseStack.mulPose(Axis.YP.rotationDegrees(rotation * 22.5f));
        poseStack.translate(-0.5, 0.0, -0.5);

        var dispatcher = Minecraft.getInstance().getBlockRenderer();
        BakedModel model = dispatcher.getBlockModel(state);

        boolean isLapis = state.getBlock() == ModBlocks.LAPIS_LAMP.get() ||
                          state.getBlock() == ModBlocks.REDSTONE_LAPIS_LAMP.get() ||
                          state.getBlock() == ModBlocks.GLOWSTONE_LAPIS_LAMP.get();
        RenderType renderType = isLapis ? RenderType.translucent() : RenderType.cutoutMipped();

        dispatcher.getModelRenderer().renderModel(
                poseStack.last(),
                bufferSource.getBuffer(renderType),
                state,
                model,
                1.0f, 1.0f, 1.0f,
                lightLevel,
                packedOverlay,
                ModelData.EMPTY,
                renderType
        );

        poseStack.popPose();
    }
}

