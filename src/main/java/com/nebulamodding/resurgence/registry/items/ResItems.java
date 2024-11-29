package com.nebulamodding.resurgence.registry.items;
import com.nebulamodding.resurgence.ResurgenceMain;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ResItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ResurgenceMain.MODID);

    public static final DeferredItem<Item> VOLERMITE = ITEMS.register("volermite",
            ()-> new Item(new Item.Properties()));


    public static void register(IEventBus event) {
        ITEMS.register(event);
    }



}
