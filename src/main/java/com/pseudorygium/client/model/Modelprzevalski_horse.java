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
public class Modelprzevalski_horse extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelprzevalski_horse"), "main");
	public final ModelPart Body;
	public final ModelPart TailA;
	public final ModelPart Leg1A;
	public final ModelPart Leg2A;
	public final ModelPart Leg3A;
	public final ModelPart Leg4A;
	public final ModelPart Neck;

	public Modelprzevalski_horse(ModelPart root) {
		super(root);
		this.Body = root.getChild("Body");
		this.TailA = root.getChild("TailA");
		this.Leg1A = root.getChild("Leg1A");
		this.Leg2A = root.getChild("Leg2A");
		this.Leg3A = root.getChild("Leg3A");
		this.Leg4A = root.getChild("Leg4A");
		this.Neck = root.getChild("Neck");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -8.0F, -20.0F, 10.0F, 10.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, 9.0F));
		PartDefinition TailA = partdefinition.addOrReplaceChild("TailA", CubeListBuilder.create().texOffs(26, 32).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 11.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Leg1A = partdefinition.addOrReplaceChild("Leg1A", CubeListBuilder.create().texOffs(36, 47).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 13.0F, 9.0F));
		PartDefinition Leg2A = partdefinition.addOrReplaceChild("Leg2A", CubeListBuilder.create().texOffs(0, 44).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 13.0F, 9.0F));
		PartDefinition Leg3A = partdefinition.addOrReplaceChild("Leg3A", CubeListBuilder.create().texOffs(42, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 13.0F, -9.0F));
		PartDefinition Leg4A = partdefinition.addOrReplaceChild("Leg4A", CubeListBuilder.create().texOffs(40, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 13.0F, -9.0F));
		PartDefinition Neck = partdefinition.addOrReplaceChild("Neck",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -11.0F, -3.0F, 4.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(52, 47).addBox(-1.0F, -16.0F, 4.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, -8.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Head = Neck.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -5.0F, -6.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(16, 50).addBox(-2.0F, -5.0F, -11.0F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -11.0F, 3.0F));
		PartDefinition Ear2 = Head.addOrReplaceChild("Ear2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0F, -3.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition Ear1 = Head.addOrReplaceChild("Ear1", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0F, -3.0F, 0.0F, 0.0F, 0.0873F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.Leg1A.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Leg3A.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Leg2A.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Leg4A.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
