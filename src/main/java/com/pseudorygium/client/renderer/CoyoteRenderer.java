
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CoyoteEntity;
import com.pseudorygium.client.model.Modelcoyote;

public class CoyoteRenderer extends MobRenderer<CoyoteEntity, Modelcoyote<CoyoteEntity>> {
	public CoyoteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcoyote(context.bakeLayer(Modelcoyote.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CoyoteEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/eastern-coyote-on-planetminecraft-com.png");
	}
}
