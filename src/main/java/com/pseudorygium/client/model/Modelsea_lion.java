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
public class Modelsea_lion extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelsea_lion"), "main");
	public final ModelPart body;
	public final ModelPart flipperleft;
	public final ModelPart flipperleft2;

	public Modelsea_lion(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.flipperleft = root.getChild("flipperleft");
		this.flipperleft2 = root.getChild("flipperleft2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -4.0F, -8.0F, 10.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition neck = body.addOrReplaceChild("neck",
				CubeListBuilder.create().texOffs(28, 33).addBox(-3.0F, -13.0F, -3.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 5).addBox(-1.5F, -10.0F, -6.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 24).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
				.addBox(1.0F, 1.0F, 9.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 1.0F, 9.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 8.0F));
		PartDefinition flipperleft = partdefinition.addOrReplaceChild("flipperleft", CubeListBuilder.create().texOffs(36, 0).addBox(0.0F, -1.0F, -1.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 24.0F, -6.0F));
		PartDefinition flipperleft2 = partdefinition.addOrReplaceChild("flipperleft2", CubeListBuilder.create().texOffs(25, 24).addBox(-6.0F, -1.0F, -1.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 24.0F, -6.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.flipperleft.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.flipperleft2.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
