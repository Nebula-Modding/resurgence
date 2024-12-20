package com.nebulamodding.resurgence.registry.items;
import com.nebulamodding.resurgence.ResurgenceMain;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.swing.*;

public class ResItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ResurgenceMain.MODID);

    public static final DeferredItem<Item> VOLERMITE = ITEMS.register("volermite",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EYE_OF_ABYSS = ITEMS.register("eye_of_abyss",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ASTRAL_RESIDUE = ITEMS.register("astral_residue",
            ()-> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }



}
