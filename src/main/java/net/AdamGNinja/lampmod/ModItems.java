package net.AdamGNinja.lampmod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(LampMod.MOD_ID);

    public static final DeferredItem<BlockItem> DESK_LAMP =
            ITEMS.register("desk_lamp",
                    () -> new BlockItem(ModBlocks.DESK_LAMP.get(), new Item.Properties()));

    public static final DeferredItem<BlockItem> FLOOR_LAMP =
            ITEMS.register("floor_lamp",
                    () -> new BlockItem(ModBlocks.FLOOR_LAMP.get(), new Item.Properties()));

}
