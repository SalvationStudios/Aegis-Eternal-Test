package net.salvationstudios.pantheontest.item.client.armor;

import net.salvationstudios.pantheontest.item.custom.PantheonArmorItem;
import net.salvationstudios.pantheontest.pantheontest;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PantheonArmorModel extends GeoModel<PantheonArmorItem> {
    @Override
    public ResourceLocation getModelResource(PantheonArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath("pantheontest", "geo/pantheon_armor.json");
    }

    @Override
    public ResourceLocation getTextureResource(PantheonArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath("pantheontest", "textures/armor/pantheon.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PantheonArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath("pantheontest", "animations/pantheon_armor.animation.json");
    }
}