
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.AphidEntity;
import com.pseudorygium.client.model.Modelaphid;

public class AphidRenderer extends MobRenderer<AphidEntity, Modelaphid<AphidEntity>> {
	public AphidRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelaphid(context.bakeLayer(Modelaphid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AphidEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/aphid.png");
	}
}
