package de.adeptstack.testmod.Core.Gen;

import de.adeptstack.testmod.Core.Features.PlaceFeature;
import de.adeptstack.testmod.Testmod;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class OreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(PlaceFeature.INDIUM_ORE_PLACED);
        base.add(PlaceFeature.LITHIUM_ORE_PLACED);
    }
}
