
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.BinturongEntity;
import com.pseudorygium.client.model.Modelbinturong;

public class BinturongRenderer extends MobRenderer<BinturongEntity, Modelbinturong<BinturongEntity>> {
	public BinturongRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbinturong(context.bakeLayer(Modelbinturong.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BinturongEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/binturong.png");
	}
}
