package de.adeptstack.testmod.world.item;

import de.adeptstack.testmod.Core.Init.BlockInit;
import de.adeptstack.testmod.Core.Init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab programmerlpsadditions = new CreativeModeTab("ProgrammerLP's Additions") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.connected_catenary.get());
        }
    };
}
