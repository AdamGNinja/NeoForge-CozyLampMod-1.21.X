package net.AdamGNinja.lampmod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LampMod.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LAMP_TAB =
            CREATIVE_MODE_TABS.register("lamp_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.adamsdesklampmod.lamp_tab"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> ModItems.DESK_LAMP.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.DESK_LAMP.get());
                        output.accept(ModItems.FLOOR_LAMP.get());
                    })
                    .build());

}
