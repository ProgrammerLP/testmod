package de.adeptstack.testmod.Core.Features;

import de.adeptstack.testmod.Core.Init.FeatureInit;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class PlaceFeature {
    public static final Holder<PlacedFeature> INDIUM_ORE_PLACED = PlacementUtils.register("indium_ore_placed",
            FeatureInit.INDIUM_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(100))));

    public static final Holder<PlacedFeature> LITHIUM_ORE_PLACED = PlacementUtils.register("lithium_ore_placed",
            FeatureInit.LITHIUM_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(100))));
}
