
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SlothEntity;
import com.pseudorygium.client.model.Modelsloth;

public class SlothRenderer extends MobRenderer<SlothEntity, Modelsloth<SlothEntity>> {
	public SlothRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsloth(context.bakeLayer(Modelsloth.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SlothEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sloth.png");
	}
}
