package com.chickenchaser.item;


import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockState;

public class CopperPickaxeItem extends PickaxeItem {
    public CopperPickaxeItem(Tier tier, Item.Properties properties) {
        super(tier, properties);
    }

    public boolean isCorrectToolForDrops(BlockState state) {
        // Ensures any block tagged "mineable with pickaxe" drops correctly
        return state.is(BlockTags.MINEABLE_WITH_PICKAXE);
    }
}
