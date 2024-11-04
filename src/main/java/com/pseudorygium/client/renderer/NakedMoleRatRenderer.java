
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.NakedMoleRatEntity;
import com.pseudorygium.client.model.Modelnaked_mole_rat;

public class NakedMoleRatRenderer extends MobRenderer<NakedMoleRatEntity, Modelnaked_mole_rat<NakedMoleRatEntity>> {
	public NakedMoleRatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnaked_mole_rat(context.bakeLayer(Modelnaked_mole_rat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NakedMoleRatEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/naked_mole_rat.png");
	}
}
