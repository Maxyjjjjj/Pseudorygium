
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.HippopotamusEntity;
import com.pseudorygium.client.model.Modelhippopotamus;

public class HippopotamusRenderer extends MobRenderer<HippopotamusEntity, Modelhippopotamus<HippopotamusEntity>> {
	public HippopotamusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhippopotamus(context.bakeLayer(Modelhippopotamus.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(HippopotamusEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/hippopotamus.png");
	}
}
