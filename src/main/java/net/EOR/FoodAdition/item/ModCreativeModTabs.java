package net.EOR.FoodAdition.item;

import net.EOR.FoodAdition.FoodAdition;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FoodAdition.MOD_ID);







    public static void register(IEventBus enventBus) {
        CREATIVE_MODE_TAB.register(enventBus);
    }

}



