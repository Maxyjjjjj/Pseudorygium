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
public class Modelbeluga_sturgeon extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelbeluga_sturgeon"), "main");
	public final ModelPart body;
	public final ModelPart tail;

	public Modelbeluga_sturgeon(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -6.0F, -12.0F, 12.0F, 12.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(48, 0).addBox(-6.0F, -6.0F, -8.0F, 12.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 56).addBox(-4.0F, -2.0F, -16.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.5F, -11.0F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition finsleft = body.addOrReplaceChild("finsleft", CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 6.0F, -9.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition finsright = body.addOrReplaceChild("finsright", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 6.0F, -9.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(30, 36).addBox(-3.0F, -5.0F, 0.0F, 6.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(48, 9)
				.addBox(0.0F, -8.0F, 2.0F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.0F, -7.0F, 12.0F, 0.0F, 15.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 12.0F));
		PartDefinition finsleft2 = tail.addOrReplaceChild("finsleft2", CubeListBuilder.create().texOffs(0, 37).addBox(0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 5.0F, 1.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition finsright2 = tail.addOrReplaceChild("finsright2", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.2618F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.tail.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
