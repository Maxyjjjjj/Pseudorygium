
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.KoalaEntity;
import com.pseudorygium.client.model.Modelkoala;

public class KoalaRenderer extends MobRenderer<KoalaEntity, Modelkoala<KoalaEntity>> {
	public KoalaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkoala(context.bakeLayer(Modelkoala.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KoalaEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/koala.png");
	}
}
