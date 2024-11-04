
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ReindeerEntity;
import com.pseudorygium.client.model.Modelreindeer;

public class ReindeerRenderer extends MobRenderer<ReindeerEntity, Modelreindeer<ReindeerEntity>> {
	public ReindeerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelreindeer(context.bakeLayer(Modelreindeer.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ReindeerEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/reindeer.png");
	}
}
