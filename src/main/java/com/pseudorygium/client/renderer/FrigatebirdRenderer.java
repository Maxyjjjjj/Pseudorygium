
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.FrigatebirdEntity;
import com.pseudorygium.client.model.Modelfrigatebird;

public class FrigatebirdRenderer extends MobRenderer<FrigatebirdEntity, Modelfrigatebird<FrigatebirdEntity>> {
	public FrigatebirdRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfrigatebird(context.bakeLayer(Modelfrigatebird.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FrigatebirdEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/frigatebird.png");
	}
}
