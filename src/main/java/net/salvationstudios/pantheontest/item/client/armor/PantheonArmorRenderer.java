package net.salvationstudios.pantheontest.item.client.armor;

import net.salvationstudios.pantheontest.item.custom.PantheonArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class PantheonArmorRenderer extends GeoArmorRenderer<PantheonArmorItem> {
    public PantheonArmorRenderer() {
        super(new PantheonArmorModel());
    }
}