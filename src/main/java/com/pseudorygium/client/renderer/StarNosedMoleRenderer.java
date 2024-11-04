
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.StarNosedMoleEntity;
import com.pseudorygium.client.model.Modelstar_nased_mole;

public class StarNosedMoleRenderer extends MobRenderer<StarNosedMoleEntity, Modelstar_nased_mole<StarNosedMoleEntity>> {
	public StarNosedMoleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstar_nased_mole(context.bakeLayer(Modelstar_nased_mole.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StarNosedMoleEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/star_nosed_mole.png");
	}
}
