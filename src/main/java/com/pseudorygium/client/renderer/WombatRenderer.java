
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.WombatEntity;
import com.pseudorygium.client.model.Modelwombat;

public class WombatRenderer extends MobRenderer<WombatEntity, Modelwombat<WombatEntity>> {
	public WombatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwombat(context.bakeLayer(Modelwombat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WombatEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/wombat.png");
	}
}
