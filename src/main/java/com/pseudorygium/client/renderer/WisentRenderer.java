
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.WisentEntity;
import com.pseudorygium.client.model.Modelwisent;

public class WisentRenderer extends MobRenderer<WisentEntity, Modelwisent<WisentEntity>> {
	public WisentRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwisent(context.bakeLayer(Modelwisent.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WisentEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/wisent.png");
	}
}
