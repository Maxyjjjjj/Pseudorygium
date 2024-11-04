
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.BongoEntity;
import com.pseudorygium.client.model.Modelbongo;

public class BongoRenderer extends MobRenderer<BongoEntity, Modelbongo<BongoEntity>> {
	public BongoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbongo(context.bakeLayer(Modelbongo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BongoEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/bongo_antelope_1.png");
	}
}
