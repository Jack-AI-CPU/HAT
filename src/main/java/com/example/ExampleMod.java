package com.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ExampleMod implements ModInitializer {
    public static final String MOD_ID = "hatmod";

    public static final EntityType<HatEntity> HAT_ENTITY = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            new ResourceLocation(MOD_ID, "hat"),
            FabricEntityTypeBuilder.create(MobCategory.CREATURE, HatEntity::new)
                    .dimensions(EntityDimensions.scalable(0.6f, 0.6f)) 
                    .build()
    );

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(HAT_ENTITY, HatEntity.createMobAttributes());
    }
}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
