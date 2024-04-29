package net.EOR.FoodAdition.item;

import net.EOR.FoodAdition.FoodAdition;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FoodAdition.MOD_ID);

    public static final RegistryObject<Item> LEMON_FRUIT = ITEMS.register("lemon_fruit",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus enventBus) {
        ITEMS.register(enventBus);
    }
}
