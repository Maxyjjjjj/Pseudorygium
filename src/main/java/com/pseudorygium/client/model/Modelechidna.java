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

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelechidna extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelechidna"), "main");
	public final ModelPart body;
	public final ModelPart legleftfront;
	public final ModelPart legleftback;
	public final ModelPart legrightback;
	public final ModelPart legrightfront;

	public Modelechidna(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.legleftfront = root.getChild("legleftfront");
		this.legleftback = root.getChild("legleftback");
		this.legrightback = root.getChild("legrightback");
		this.legrightfront = root.getChild("legrightfront");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -12.0F, -8.0F, 12.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(-2.0F, -5.0F, -18.0F, 4.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(28, 34).addBox(1.0F, 8.0F, -3.25F, 10.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(18, 28).addBox(1.0F, 1.0F, -5.75F, 10.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, -6.0F, 1.2217F, 0.0F, 1.5708F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(38, 28).addBox(1.0F, -13.0F, -3.25F, 10.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 0).addBox(1.0F, -7.0F, -5.75F, 10.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, -6.0F, -1.2217F, 0.0F, 1.5708F));
		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(40, 6).addBox(-5.0F, -12.0F, 2.25F, 10.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 40).addBox(-5.0F, -6.0F, 0.0F, 10.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, -6.0F, -1.2217F, 0.0F, 0.0F));
		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront", CubeListBuilder.create().texOffs(16, 42).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 20.0F, -5.0F));
		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback", CubeListBuilder.create().texOffs(0, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 20.0F, 6.0F));
		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 20.0F, 6.0F));
		PartDefinition legrightfront = partdefinition.addOrReplaceChild("legrightfront", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 20.0F, -5.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.legrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
