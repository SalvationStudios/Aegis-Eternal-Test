package net.salvationstudios.pantheontest.item.client.armor;

import net.salvationstudios.pantheontest.item.custom.PantheonArmorItem;
import net.salvationstudios.pantheontest.pantheontest;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PantheonArmorModel extends GeoModel<PantheonArmorItem> {
    @Override
    public ResourceLocation getModelResource(PantheonArmorItem animatable) {
        return new ResourceLocation(pantheontest.MOD_ID, "geo/pantheon_armor.json");
    }

    @Override
    public ResourceLocation getTextureResource(PantheonArmorItem animatable) {
        return new ResourceLocation(pantheontest.MOD_ID, "textures/armor/pantheon.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PantheonArmorItem animatable) {
        return new ResourceLocation(pantheontest.MOD_ID, "animations/pantheon_armor.animation.json");
    }
}