package de.adeptstack.testmod.Core.Events;

import de.adeptstack.testmod.Core.Gen.OreGeneration;
import de.adeptstack.testmod.Testmod;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.spongepowered.asm.mixin.Debug;

@Mod.EventBusSubscriber(modid = Testmod.MODID)
public class WorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        OreGeneration.generateOres(event);
    }
}