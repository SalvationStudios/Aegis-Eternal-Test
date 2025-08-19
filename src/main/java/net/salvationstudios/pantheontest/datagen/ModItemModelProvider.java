package net.salvationstudios.pantheontest.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.salvationstudios.pantheontest.item.ModItems;
import net.salvationstudios.pantheontest.pantheontest;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, pantheontest.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.PANTHEON_HELMET);
        simpleItem(ModItems.PANTHEON_CHESTPLATE);
        simpleItem(ModItems.PANTHEON_LEGGINGS);
        simpleItem(ModItems.PANTHEON_BOOTS);
    
    }

    private void simpleItem(RegistryObject<Item> pantheonHelmet) {
    }
}