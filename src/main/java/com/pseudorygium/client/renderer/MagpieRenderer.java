
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MagpieEntity;
import com.pseudorygium.client.model.Modelcorvid;

public class MagpieRenderer extends MobRenderer<MagpieEntity, Modelcorvid<MagpieEntity>> {
	public MagpieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcorvid(context.bakeLayer(Modelcorvid.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(MagpieEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/magpie.png");
	}
}
