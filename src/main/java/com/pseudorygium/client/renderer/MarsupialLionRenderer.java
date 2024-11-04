
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MarsupialLionEntity;
import com.pseudorygium.client.model.Modelmarsupial_lion;

public class MarsupialLionRenderer extends MobRenderer<MarsupialLionEntity, Modelmarsupial_lion<MarsupialLionEntity>> {
	public MarsupialLionRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmarsupial_lion(context.bakeLayer(Modelmarsupial_lion.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MarsupialLionEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/marsupial_lion.png");
	}
}
