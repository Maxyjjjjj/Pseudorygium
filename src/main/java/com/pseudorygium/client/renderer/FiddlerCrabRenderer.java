
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.FiddlerCrabEntity;
import com.pseudorygium.client.model.Modelfiddler_crab;

public class FiddlerCrabRenderer extends MobRenderer<FiddlerCrabEntity, Modelfiddler_crab<FiddlerCrabEntity>> {
	public FiddlerCrabRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfiddler_crab(context.bakeLayer(Modelfiddler_crab.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FiddlerCrabEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/carb_with_claw.png");
	}
}
