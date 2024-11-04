
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CapercaillieEntity;
import com.pseudorygium.client.model.Modelcapercaillie;

public class CapercaillieRenderer extends MobRenderer<CapercaillieEntity, Modelcapercaillie<CapercaillieEntity>> {
	public CapercaillieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcapercaillie(context.bakeLayer(Modelcapercaillie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CapercaillieEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/capercaillie.png");
	}
}
