package net.salvationstudios.pantheontest.item.custom;

import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class PantheonArmorRenderer extends GeoArmorRenderer<PantheonArmorItem> {
    public PantheonArmorRenderer() {
        super(new PantheonArmorModel());
    }
}