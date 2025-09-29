package com.chickenchaser.item;

import com.chickenchaser.CopperTools;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CopperTools.MOD_ID);

    public static final DeferredItem<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new CopperPickaxeItem(
                    ChickenModToolTiers.Copper, new Item.Properties().attributes(PickaxeItem.createAttributes
                    (ChickenModToolTiers.Copper, 1f, -2.4f))));

    public static final DeferredItem<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ChickenModToolTiers.Copper, new Item.Properties().attributes(ShovelItem.createAttributes(
                    ChickenModToolTiers.Copper, 15f, -1f))));

    public static final DeferredItem<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ChickenModToolTiers.Copper, new Item.Properties().attributes(AxeItem.createAttributes(
                    ChickenModToolTiers.Copper, 5f, -2.6f))));

    public static final DeferredItem<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ChickenModToolTiers.Copper, new Item.Properties().attributes(HoeItem.createAttributes(
                    ChickenModToolTiers.Copper, 1f, -2.8f))));

    public static final DeferredItem<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            ()-> new SwordItem(ChickenModToolTiers.Copper, new Item.Properties().attributes(SwordItem.createAttributes(
                    ChickenModToolTiers.Copper, 4f, -1f))));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
