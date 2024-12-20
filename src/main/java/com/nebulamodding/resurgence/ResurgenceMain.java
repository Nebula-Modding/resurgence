package com.nebulamodding.resurgence;

import com.nebulamodding.resurgence.registry.blocks.ResBlocks;
import com.nebulamodding.resurgence.registry.items.ResCreativeModeTabs;
import com.nebulamodding.resurgence.registry.items.ResItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Random;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(ResurgenceMain.MODID)
public class ResurgenceMain
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "resurgence";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();



    public static final String[] LOG_SPLASH_TEXTS = {
        "Preparing To Commit Crimes Against Nature",
        "I Wonder What Afronts To Code Lay Beneath This Mod",
        "This is a log splash, only pack devs/mod devs should see this. If your a player. Get out",
        "Transmuting lead into gold",
        "OH GOD IT HURTS",
        "Volermite?, I never met ermite!",
        "I am so sorry",
        "So many splash",
        "How Splashy!"



};



    public static final Random RNG = new Random();

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ResItems.VOLERMITE);
        };
    }




    // Creates a new Block with the id "examplemod:example_block", combining the namespace and path

    public ResurgenceMain(IEventBus modEventBus, ModContainer modContainer)
    {
        ResCreativeModeTabs.register(modEventBus);
        ResItems.register(modEventBus);
        ResBlocks.register(modEventBus);
    }



    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info(LOG_SPLASH_TEXTS[RNG.nextInt(LOG_SPLASH_TEXTS.length)]);
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}


