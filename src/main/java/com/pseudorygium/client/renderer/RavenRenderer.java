
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.RavenEntity;
import com.pseudorygium.client.model.Modelcorvid;

public class RavenRenderer extends MobRenderer<RavenEntity, Modelcorvid<RavenEntity>> {
	public RavenRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcorvid(context.bakeLayer(Modelcorvid.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(RavenEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/raven.png");
	}
}
