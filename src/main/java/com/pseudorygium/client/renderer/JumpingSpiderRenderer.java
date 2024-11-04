
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.JumpingSpiderEntity;
import com.pseudorygium.client.model.Modeljumping_spider;

public class JumpingSpiderRenderer extends MobRenderer<JumpingSpiderEntity, Modeljumping_spider<JumpingSpiderEntity>> {
	public JumpingSpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljumping_spider(context.bakeLayer(Modeljumping_spider.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JumpingSpiderEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/jumping_spider.png");
	}
}
