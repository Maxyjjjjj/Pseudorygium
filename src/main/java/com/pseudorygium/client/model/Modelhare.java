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

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelhare extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelhare"), "main");
	public final ModelPart body;
	public final ModelPart frontLegLeft;
	public final ModelPart backLegRight;
	public final ModelPart backLegRight2;
	public final ModelPart frontLegRight;
	public final ModelPart head;
	public final ModelPart tail;

	public Modelhare(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.frontLegLeft = root.getChild("frontLegLeft");
		this.backLegRight = root.getChild("backLegRight");
		this.backLegRight2 = root.getChild("backLegRight2");
		this.frontLegRight = root.getChild("frontLegRight");
		this.head = root.getChild("head");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, -5.0F, 6.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 3.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition frontLegLeft = partdefinition.addOrReplaceChild("frontLegLeft", CubeListBuilder.create(), PartPose.offset(2.25F, 19.0F, -1.0F));
		PartDefinition frontLegLeft_r1 = frontLegLeft.addOrReplaceChild("frontLegLeft_r1", CubeListBuilder.create().texOffs(12, 23).addBox(2.0F, -5.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 5.0F, 1.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition backLegRight = partdefinition.addOrReplaceChild("backLegRight", CubeListBuilder.create(), PartPose.offset(-2.25F, 18.0F, 7.0F));
		PartDefinition cube_r1 = backLegRight.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 30).addBox(-1.0F, 1.0F, -0.25F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition frontLegLeft_r2 = backLegRight.addOrReplaceChild("frontLegLeft_r2", CubeListBuilder.create().texOffs(18, 15).addBox(2.0F, -4.0F, -2.5F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 2.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition backLegRight2 = partdefinition.addOrReplaceChild("backLegRight2", CubeListBuilder.create(), PartPose.offset(2.25F, 18.0F, 7.0F));
		PartDefinition cube_r2 = backLegRight2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 15).addBox(-1.0F, 1.0F, -0.25F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition frontLegLeft_r3 = backLegRight2.addOrReplaceChild("frontLegLeft_r3", CubeListBuilder.create().texOffs(0, 23).addBox(2.0F, -4.0F, -2.5F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 2.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition frontLegRight = partdefinition.addOrReplaceChild("frontLegRight", CubeListBuilder.create(), PartPose.offset(-2.25F, 19.0F, -1.0F));
		PartDefinition frontLegRight_r1 = frontLegRight.addOrReplaceChild("frontLegRight_r1", CubeListBuilder.create().texOffs(20, 23).addBox(-4.0F, -5.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 5.0F, 1.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 15).addBox(-2.5F, -4.0F, -4.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 28).addBox(-1.5F, -2.0F, -5.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 30)
						.addBox(-2.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(0.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.0F, -1.0F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(28, 23).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 7.0F, 0.3491F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.backLegRight.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.frontLegLeft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.frontLegRight.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.backLegRight2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
