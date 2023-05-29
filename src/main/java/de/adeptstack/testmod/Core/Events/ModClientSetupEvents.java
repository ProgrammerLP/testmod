package de.adeptstack.testmod.Core.Events;

import de.adeptstack.testmod.Core.Init.BlockInit;
import de.adeptstack.testmod.Testmod;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = Testmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientSetupEvents {
    @SubscribeEvent
    public static void modRenderTypes(final EntityRenderersEvent.RegisterRenderers event) {
        ItemBlockRenderTypes.setRenderLayer(BlockInit.catenary.get(), RenderType.translucent());
    }
}
