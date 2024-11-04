
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SheltopusikEntity;
import com.pseudorygium.client.model.Modelsheltopusik;

public class SheltopusikRenderer extends MobRenderer<SheltopusikEntity, Modelsheltopusik<SheltopusikEntity>> {
	public SheltopusikRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsheltopusik(context.bakeLayer(Modelsheltopusik.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SheltopusikEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sheltopusik.png");
	}
}
