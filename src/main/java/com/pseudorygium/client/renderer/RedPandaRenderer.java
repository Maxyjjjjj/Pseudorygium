
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.RedPandaEntity;
import com.pseudorygium.client.model.Modelred_panda;

public class RedPandaRenderer extends MobRenderer<RedPandaEntity, Modelred_panda<RedPandaEntity>> {
	public RedPandaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelred_panda(context.bakeLayer(Modelred_panda.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedPandaEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/red_panda.png");
	}
}
