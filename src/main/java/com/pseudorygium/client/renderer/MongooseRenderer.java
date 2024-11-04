
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MongooseEntity;
import com.pseudorygium.client.model.Modelmongoose;

public class MongooseRenderer extends MobRenderer<MongooseEntity, Modelmongoose<MongooseEntity>> {
	public MongooseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmongoose(context.bakeLayer(Modelmongoose.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MongooseEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mongoose.png");
	}
}
