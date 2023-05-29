package de.adeptstack.testmod.Core.Init;

import de.adeptstack.testmod.Testmod;
import de.adeptstack.testmod.world.item.ModCreativeModeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Testmod.MODID);

    public static final RegistryObject<Item> Catenary_Cable = ITEMS.register("catenary_cable", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.programmerlpsadditions)));
    public static final RegistryObject<Item> rawIndium = ITEMS.register("raw_indium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.programmerlpsadditions)));
    public static final RegistryObject<Item> indiumIngot = ITEMS.register("indium_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.programmerlpsadditions)));
    public static final RegistryObject<Item> lithiumIngot = ITEMS.register("lithium_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.programmerlpsadditions)));
    public static final RegistryObject<Item> rawLithium = ITEMS.register("raw_lithium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.programmerlpsadditions)));

    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
