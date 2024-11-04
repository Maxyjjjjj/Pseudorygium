
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.JaguarEntity;
import com.pseudorygium.client.model.Modeljaguar;

public class JaguarRenderer extends MobRenderer<JaguarEntity, Modeljaguar<JaguarEntity>> {
	public JaguarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljaguar(context.bakeLayer(Modeljaguar.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JaguarEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/jaguar.png");
	}
}
