
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ProcoptodonEntity;
import com.pseudorygium.client.model.Modelprocoptodon;

public class ProcoptodonRenderer extends MobRenderer<ProcoptodonEntity, Modelprocoptodon<ProcoptodonEntity>> {
	public ProcoptodonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprocoptodon(context.bakeLayer(Modelprocoptodon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ProcoptodonEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/procoptodon.png");
	}
}
