package net.salvationstudios.pantheontest.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.salvationstudios.pantheontest.item.custom.PantheonArmorItem;
import net.salvationstudios.pantheontest.pantheontest;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, pantheontest.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PANTHEON_HELMET = ITEMS.register("pantheon_helmet",
            () -> new PantheonArmorItem(ModArmorMaterials.Pantheon, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PANTHEON_CHESTPLATE = ITEMS.register("pantheon_chestplate",
            () -> new PantheonArmorItem(ModArmorMaterials.Pantheon, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PANTHEON_LEGGINGS = ITEMS.register("pantheon_leggings",
            () -> new PantheonArmorItem(ModArmorMaterials.Pantheon, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PANTHEON_BOOTS = ITEMS.register("pantheon_boots",
            () -> new PantheonArmorItem(ModArmorMaterials.Pantheon, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
