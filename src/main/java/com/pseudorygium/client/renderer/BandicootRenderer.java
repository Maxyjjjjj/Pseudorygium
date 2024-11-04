
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.BandicootEntity;
import com.pseudorygium.client.model.Modelbandicoot;

public class BandicootRenderer extends MobRenderer<BandicootEntity, Modelbandicoot<BandicootEntity>> {
	public BandicootRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbandicoot(context.bakeLayer(Modelbandicoot.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BandicootEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/bandicoot.png");
	}
}
