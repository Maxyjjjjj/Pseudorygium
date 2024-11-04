
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.JerboaEntity;
import com.pseudorygium.client.model.Modeljerboa;

public class JerboaRenderer extends MobRenderer<JerboaEntity, Modeljerboa<JerboaEntity>> {
	public JerboaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljerboa(context.bakeLayer(Modeljerboa.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JerboaEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/jerboa.png");
	}
}
