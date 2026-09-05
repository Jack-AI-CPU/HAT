package com.example;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

class HatModel extends GeoModel<HatEntity> {
    @Override
    public ResourceLocation getModelResource(HatEntity entity) {
        return new ResourceLocation("hatmod", "geo/Hat.geo.json");
    }
    @Override
    public ResourceLocation getTextureResource(HatEntity entity) {
        return new ResourceLocation("hatmod", "textures/entity/Hat.png");
    }
    @Override
    public ResourceLocation getAnimationResource(HatEntity entity) {
        return new ResourceLocation("hatmod", "animations/Hat.animation.json");
    }
}

public class HatRenderer extends GeoEntityRenderer<HatEntity> {
    public HatRenderer(EntityRendererProvider.Context context) {
        super(context, new HatModel());
    }
}
