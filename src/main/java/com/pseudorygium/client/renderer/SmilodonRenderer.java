
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SmilodonEntity;
import com.pseudorygium.client.model.Modelsmilodon;

public class SmilodonRenderer extends MobRenderer<SmilodonEntity, Modelsmilodon<SmilodonEntity>> {
	public SmilodonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsmilodon(context.bakeLayer(Modelsmilodon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SmilodonEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/smilodon.png");
	}
}
