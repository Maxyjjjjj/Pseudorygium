
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SecretarybirdEntity;
import com.pseudorygium.client.model.Modelsecretarybird;

public class SecretarybirdRenderer extends MobRenderer<SecretarybirdEntity, Modelsecretarybird<SecretarybirdEntity>> {
	public SecretarybirdRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsecretarybird(context.bakeLayer(Modelsecretarybird.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(SecretarybirdEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/secretarybird.png");
	}
}
