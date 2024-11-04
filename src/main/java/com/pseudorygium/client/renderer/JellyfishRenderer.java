
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.JellyfishEntity;
import com.pseudorygium.client.model.Modeljellyfish;

public class JellyfishRenderer extends MobRenderer<JellyfishEntity, Modeljellyfish<JellyfishEntity>> {
	public JellyfishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljellyfish(context.bakeLayer(Modeljellyfish.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JellyfishEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/jellyfish_pink.png");
	}
}
