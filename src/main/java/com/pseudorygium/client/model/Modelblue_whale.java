package com.pseudorygium.client.model;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelblue_whale extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelblue_whale"), "main");
	public final ModelPart body;
	public final ModelPart tail;

	public Modelblue_whale(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-22.0F, -24.0F, -40.0F, 44.0F, 48.0F, 80.0F, new CubeDeformation(0.0F)).texOffs(168, 0).addBox(-19.0F, -24.0F, -99.0F, 38.0F, 8.0F, 59.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition jaw = body.addOrReplaceChild("jaw",
				CubeListBuilder.create().texOffs(0, 177).addBox(-18.0F, 0.0F, -59.0F, 36.0F, 33.0F, 60.0F, new CubeDeformation(0.0F)).texOffs(192, 177).addBox(-17.0F, -4.0F, -58.5F, 34.0F, 33.0F, 58.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -16.0F, -40.0F));
		PartDefinition finleft = body.addOrReplaceChild("finleft", CubeListBuilder.create().texOffs(20, 26).addBox(-1.0F, -2.0F, -8.0F, 2.0F, 26.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.0F, 24.0F, -29.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition finright = body.addOrReplaceChild("finright", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -8.0F, 2.0F, 26.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.0F, 24.0F, -29.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(215, 68).addBox(-16.0F, -13.0F, 0.0F, 32.0F, 26.0F, 60.0F, new CubeDeformation(0.0F)).texOffs(0, 128).addBox(-43.0F, -4.0F, 39.0F, 86.0F, 6.0F, 43.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.0F, 40.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.tail.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
