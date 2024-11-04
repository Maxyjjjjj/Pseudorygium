
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.KakapoEntity;
import com.pseudorygium.client.model.Modelkakapo;

public class KakapoRenderer extends MobRenderer<KakapoEntity, Modelkakapo<KakapoEntity>> {
	public KakapoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkakapo(context.bakeLayer(Modelkakapo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KakapoEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/kakapo.png");
	}
}
