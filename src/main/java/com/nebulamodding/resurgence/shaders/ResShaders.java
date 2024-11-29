package com.nebulamodding.resurgence.shaders;

import team.lodestar.lodestone.registry.common.particle.LodestoneParticleTypes;
import team.lodestar.lodestone.systems.particle.builder.WorldParticleBuilder;
import team.lodestar.lodestone.systems.particle.world.type.LodestoneWorldParticleType;

public class ResShaders {


    // This class is for PPS
    // post processing shaders, dont quote that
    // Ok fine ill explain it

    /*
    Post processing shaders go in this file, non lodestone PPS' will go in a seperate file which will be added later under client. Lodestone shaders are rendered both serverside and clientside with lodestone. Lodestone shaders are not compatible with sodium/iris and use of sodium/ iris with resurgence is discouraged
    As always NO vanilla/lodestone shaders are compatible with optifine and if you want custom shaders, we cant confirm it will work
    I have no intention of helping anyone else who is working on this project work on shaders, if you want to work with shaders lodestone has a discord server as well as a wiki.

    In the future we might make a veil version of Resurgence but at the moment resurgence is ONLY for neoforge 1.21.1

    The piece of code below is commented out for testing purposes

     */


    public static void resPostProcessing() {

        // ALL PARTICLE OR SHADER BUILDERS GO INTO THIS CLASS

        var resParticleBuilder = WorldParticleBuilder.create(LodestoneParticleTypes.TWINKLE_PARTICLE);

        


    }


}
