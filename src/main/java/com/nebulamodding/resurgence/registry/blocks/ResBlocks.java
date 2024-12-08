package com.nebulamodding.resurgence.registry.blocks;

import com.nebulamodding.resurgence.ResurgenceMain;
import com.nebulamodding.resurgence.registry.items.ResItems;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ResBlocks {

    public static final MutableComponent onInteract(Block block ) {
        var blockName = block.getName();
        return blockName;


    }


    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ResurgenceMain.MODID);

    public static final DeferredBlock<Block> EVERWOOD_PLANKS = registerBlock("everwood_planks",
            ()->new Block(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS).ignitedByLava()));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ResItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));



    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


}
