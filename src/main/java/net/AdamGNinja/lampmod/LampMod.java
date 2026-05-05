package net.AdamGNinja.lampmod;

import com.mojang.logging.LogUtils;
import net.AdamGNinja.lampmod.client.renderer.DeskLampBlockEntityRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import org.slf4j.Logger;

@Mod(LampMod.MOD_ID)
public class LampMod {

    public static final String MOD_ID = "cozynightlamps";
    public static final Logger LOGGER = LogUtils.getLogger();

    public LampMod(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }

    @EventBusSubscriber(modid = LampMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAPIS_LAMP.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.REDSTONE_LAPIS_LAMP.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLOWSTONE_LAPIS_LAMP.get(), RenderType.translucent());
            });
        }

        @SubscribeEvent
        public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
            event.registerBlockEntityRenderer(
                    ModBlockEntities.DESK_LAMP_BE.get(),
                    DeskLampBlockEntityRenderer::new
            );
        }
    }
}
