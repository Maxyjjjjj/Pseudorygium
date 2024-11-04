
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MonkeyEntity;
import com.pseudorygium.client.model.Modelmonkey;

public class MonkeyRenderer extends MobRenderer<MonkeyEntity, Modelmonkey<MonkeyEntity>> {
	public MonkeyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmonkey(context.bakeLayer(Modelmonkey.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(MonkeyEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/snub_nosed_monkey.png");
	}
}
