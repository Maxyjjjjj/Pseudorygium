
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.JunglefowlEntity;
import com.pseudorygium.client.model.Modeljunglefowl;

public class JunglefowlRenderer extends MobRenderer<JunglefowlEntity, Modeljunglefowl<JunglefowlEntity>> {
	public JunglefowlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljunglefowl(context.bakeLayer(Modeljunglefowl.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JunglefowlEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/chicken2.png");
	}
}
