package com.nebulamodding.resurgence.registry.items;

import com.nebulamodding.resurgence.ResurgenceMain;
import com.nebulamodding.resurgence.registry.blocks.ResBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ResCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ResurgenceMain.MODID);
    public static final Supplier<CreativeModeTab> RESURGENCE_TAB = CREATIVE_MODE_TAB.register("resurgence_tab",
            ()-> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ResItems.EYE_OF_ABYSS.get()))
                    .title(Component.translatable("creativetab.resurgence.item_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ResItems.EYE_OF_ABYSS);
                        output.accept(ResItems.VOLERMITE);
                        output.accept(ResBlocks.EVERWOOD_PLANKS);
                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }



}
