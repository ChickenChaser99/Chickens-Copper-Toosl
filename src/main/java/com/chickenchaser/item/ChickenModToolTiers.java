package com.chickenchaser.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;

import javax.swing.text.html.HTML;

import static com.chickenchaser.item.ModItems.*;

public class ChickenModToolTiers {
    public static final Tier Copper = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL, 300, 7F,
            2.5F, 26, () -> Ingredient.of(Items.COPPER_INGOT));

}


