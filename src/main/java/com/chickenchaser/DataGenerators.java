package com.chickenchaser;
import com.chickenchaser.datagen.ModBlockTagGenerator;
import com.chickenchaser.datagen.ModItemTagGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = CopperTools.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();


        ModBlockTagGenerator blockTagGenerator = new ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagGenerator);


        ModItemTagGenerator itemTagGenerator = new ModItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper);
        generator.addProvider(event.includeServer(), itemTagGenerator);
    }
}