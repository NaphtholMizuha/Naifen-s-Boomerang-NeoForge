package com.naifen.simple_boomerangs;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.naifen.simple_boomerangs.SimpleBoomerangsMod.MODID;


public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredItem<Item> WOODEN_BOOMERANG = ITEMS.registerSimpleItem("wooden_boomerang", new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(2f).build()));

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
