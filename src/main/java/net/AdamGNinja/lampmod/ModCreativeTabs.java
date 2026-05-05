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
                        // Original lamps
                        output.accept(ModItems.DESK_LAMP.get());
                        output.accept(ModItems.FLOOR_LAMP.get());
                        // Wood lamps
                        output.accept(ModItems.OAK_LAMP.get());
                        output.accept(ModItems.SPRUCE_LAMP.get());
                        output.accept(ModItems.BIRCH_LAMP.get());
                        output.accept(ModItems.JUNGLE_LAMP.get());
                        output.accept(ModItems.ACACIA_LAMP.get());
                        output.accept(ModItems.DARK_OAK_LAMP.get());
                        output.accept(ModItems.MANGROVE_LAMP.get());
                        output.accept(ModItems.CHERRY_LAMP.get());
                        output.accept(ModItems.BAMBOO_LAMP.get());
                        output.accept(ModItems.CRIMSON_LAMP.get());
                        output.accept(ModItems.WARPED_LAMP.get());
                        // Redstone variants
                        output.accept(ModItems.REDSTONE_OAK_LAMP.get());
                        output.accept(ModItems.REDSTONE_SPRUCE_LAMP.get());
                        output.accept(ModItems.REDSTONE_BIRCH_LAMP.get());
                        output.accept(ModItems.REDSTONE_JUNGLE_LAMP.get());
                        output.accept(ModItems.REDSTONE_ACACIA_LAMP.get());
                        output.accept(ModItems.REDSTONE_DARK_OAK_LAMP.get());
                        output.accept(ModItems.REDSTONE_MANGROVE_LAMP.get());
                        output.accept(ModItems.REDSTONE_CHERRY_LAMP.get());
                        output.accept(ModItems.REDSTONE_BAMBOO_LAMP.get());
                        output.accept(ModItems.REDSTONE_CRIMSON_LAMP.get());
                        output.accept(ModItems.REDSTONE_WARPED_LAMP.get());
                        // Glowstone variants
                        output.accept(ModItems.GLOWSTONE_OAK_LAMP.get());
                        output.accept(ModItems.GLOWSTONE_SPRUCE_LAMP.get());
                        output.accept(ModItems.GLOWSTONE_BIRCH_LAMP.get());
                        output.accept(ModItems.GLOWSTONE_JUNGLE_LAMP.get());
                        output.accept(ModItems.GLOWSTONE_ACACIA_LAMP.get());
                        output.accept(ModItems.GLOWSTONE_DARK_OAK_LAMP.get());
                        output.accept(ModItems.GLOWSTONE_MANGROVE_LAMP.get());
                        output.accept(ModItems.GLOWSTONE_CHERRY_LAMP.get());
                        output.accept(ModItems.GLOWSTONE_BAMBOO_LAMP.get());
                        output.accept(ModItems.GLOWSTONE_CRIMSON_LAMP.get());
                        output.accept(ModItems.GLOWSTONE_WARPED_LAMP.get());
                        // Iron lamps
                        output.accept(ModItems.IRON_LAMP.get());
                        output.accept(ModItems.REDSTONE_IRON_LAMP.get());
                        output.accept(ModItems.GLOWSTONE_IRON_LAMP.get());
                        // Obsidian lamps
                        output.accept(ModItems.OBSIDIAN_LAMP.get());
                        output.accept(ModItems.REDSTONE_OBSIDIAN_LAMP.get());
                        output.accept(ModItems.GLOWSTONE_OBSIDIAN_LAMP.get());
                        // Lapis lamps
                        output.accept(ModItems.LAPIS_LAMP.get());
                        output.accept(ModItems.REDSTONE_LAPIS_LAMP.get());
                        output.accept(ModItems.GLOWSTONE_LAPIS_LAMP.get());
                        // Emerald bottle lamps
                        output.accept(ModItems.EMERALD_BOTTLELAMP.get());
                        output.accept(ModItems.REDSTONE_EMERALD_BOTTLELAMP.get());
                        output.accept(ModItems.GLOWSTONE_EMERALD_BOTTLELAMP.get());
                    })
                    .build());
}
