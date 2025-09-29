package com.chickenchaser.datagen;

import com.chickenchaser.CopperTools;
import com.chickenchaser.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagsProvider.TagLookup<Block>> pBlockTagsProvider, ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTagsProvider, CopperTools.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.SWORDS)
                .add(ModItems.COPPER_SWORD.get());
        this.tag(ItemTags.AXES)
                .add(ModItems.COPPER_AXE.get());
        this.tag(ItemTags.PICKAXES)
                .add(ModItems.COPPER_PICKAXE.get());
        this.tag(ItemTags.SHOVELS)
                .add(ModItems.COPPER_SHOVEL.get());
        this.tag(ItemTags.HOES)
                .add(ModItems.COPPER_HOE.get());
    }
}