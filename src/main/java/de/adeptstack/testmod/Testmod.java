package de.adeptstack.testmod;

import com.mojang.logging.LogUtils;
import de.adeptstack.testmod.Core.Events.WorldEvents;
import de.adeptstack.testmod.Core.Init.BlockInit;
import de.adeptstack.testmod.Core.Init.ItemInit;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Testmod.MODID)
public class Testmod {

    public static final String MODID = "testmod";

    public static final Logger LOGGER = LogUtils.getLogger();

    public Testmod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        ItemInit.register(modEventBus);
        BlockInit.register(modEventBus);
    }
}
