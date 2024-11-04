
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SaigaEntity;
import com.pseudorygium.client.model.Modelsaiga;

public class SaigaRenderer extends MobRenderer<SaigaEntity, Modelsaiga<SaigaEntity>> {
	public SaigaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsaiga(context.bakeLayer(Modelsaiga.LAYER_LOCATION)), 1.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(SaigaEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/saiga.png");
	}
}
