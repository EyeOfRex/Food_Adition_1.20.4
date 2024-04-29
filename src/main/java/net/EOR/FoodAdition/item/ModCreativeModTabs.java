package net.EOR.FoodAdition.item;

import net.EOR.FoodAdition.FoodAdition;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FoodAdition.MOD_ID);


    public static final RegistryObject<CreativeModeTab> FOOD_TAB_FRUIT = CREATIVE_MODE_TAB.register("food_adition_fruit",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LEMON.get()))
                    .title(Component.translatable("creativetab.food_adition_fruit"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.LEMON.get());
                    })
                    .build());





    public static void register(IEventBus enventBus) {
        CREATIVE_MODE_TAB.register(enventBus);
    }

}



