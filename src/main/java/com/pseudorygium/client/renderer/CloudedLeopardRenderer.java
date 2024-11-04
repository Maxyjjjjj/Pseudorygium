
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CloudedLeopardEntity;
import com.pseudorygium.client.model.Modelclouded_leopard;

public class CloudedLeopardRenderer extends MobRenderer<CloudedLeopardEntity, Modelclouded_leopard<CloudedLeopardEntity>> {
	public CloudedLeopardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelclouded_leopard(context.bakeLayer(Modelclouded_leopard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CloudedLeopardEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/cloudedleopard.png");
	}
}
