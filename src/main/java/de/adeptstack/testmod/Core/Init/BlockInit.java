package de.adeptstack.testmod.Core.Init;

import de.adeptstack.testmod.Testmod;
import de.adeptstack.testmod.world.item.ModCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Testmod.MODID);

    public static final RegistryObject<Block> catenary = registerBlock("catenary",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BARS)
                    .strength(0.4f, 3.0f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .noOcclusion())
            , ModCreativeModeTab.programmerlpsadditions);

    public static  final RegistryObject<Block> connected_catenary = registerBlock("connected_catenary",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BARS)
                    .strength(0.4f, 3.0f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .noOcclusion())
            , ModCreativeModeTab.programmerlpsadditions);

    public static final RegistryObject<Block> catenary_holder = registerBlock("catenary_holder",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BARS)
                    .strength(0.4f, 3.0f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .noOcclusion())
            , ModCreativeModeTab.programmerlpsadditions);

    //Minerals
    public static final RegistryObject<Block> indium_block = registerBlock("indium_block",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.METAL)
                    .strength(0.2f, 1.0f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .noOcclusion())
            , ModCreativeModeTab.programmerlpsadditions);

    public static final RegistryObject<Block> indium_ore = registerBlock("indium_ore",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.STONE)
                    .strength(0.3f, 7.0f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
                    .noOcclusion())
            , ModCreativeModeTab.programmerlpsadditions);

    public static final RegistryObject<Block> lithium_block = registerBlock("lithium_block",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.METAL)
                    .strength(0.1f, 0.5f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .noOcclusion())
            , ModCreativeModeTab.programmerlpsadditions);

    public static final RegistryObject<Block> lithium_ore = registerBlock("lithium_ore",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.STONE)
                    .strength(0.2f, 6.5f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
                    .noOcclusion())
            , ModCreativeModeTab.programmerlpsadditions);

    private static <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name,toReturn,tab);
        return toReturn;
    }

    private static <T extends  Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
