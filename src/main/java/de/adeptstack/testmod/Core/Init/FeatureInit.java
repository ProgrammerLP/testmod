package de.adeptstack.testmod.Core.Init;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class FeatureInit {
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_INDIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.indium_ore.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.indium_ore.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> INDIUM_ORE = FeatureUtils.register("indium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_INDIUM_ORES, 9));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_LITHIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.lithium_ore.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.lithium_ore.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> LITHIUM_ORE = FeatureUtils.register("lithium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_LITHIUM_ORES, 9));
}
