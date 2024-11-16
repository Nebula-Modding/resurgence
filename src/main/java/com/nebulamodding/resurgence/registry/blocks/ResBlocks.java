package com.nebulamodding.resurgence.registry.blocks;

import com.nebulamodding.resurgence.registry.items.ResItems;
import net.minecraft.world.level.block.Block;
import martian.regolith.DeferredHolders;
import martian.regolith.builder.RegolithBlockBuilder;
import martian.regolith.neoforge.RegolithNeoForge;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;

import static com.nebulamodding.resurgence.ResurgenceMain.BLOCKS;

public class ResBlocks {
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> MOON_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(ResItems.ITEMS)
    )
            .register(

                    "oditite_ore"

            )
            .done();









}
