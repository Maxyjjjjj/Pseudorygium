package com.pseudorygium.client.model;

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

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelant extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelant"), "main");
	public final ModelPart abdomen;
	public final ModelPart thorax;
	public final ModelPart head;
	public final ModelPart legs0;
	public final ModelPart legs1;

	public Modelant(ModelPart root) {
		super(root);
		this.abdomen = root.getChild("abdomen");
		this.thorax = this.abdomen.getChild("thorax");
		this.head = this.thorax.getChild("head");
		this.legs0 = root.getChild("legs0");
		this.legs1 = root.getChild("legs1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition abdomen = partdefinition.addOrReplaceChild("abdomen", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -3.0F, 0.0F, 7.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 1.0F));
		PartDefinition thorax = abdomen.addOrReplaceChild("thorax", CubeListBuilder.create().texOffs(17, 14).addBox(-3.0F, -1.0F, -2.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head = thorax.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 14).addBox(-3.0F, -2.0F, -5.0F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(17, 35).addBox(-3.0F, 1.0F, -7.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(33, 4).mirror().addBox(0.0F, -8.0F, -3.5F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(33, 4).addBox(-3.0F, -8.0F, -3.5F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition legs0 = partdefinition.addOrReplaceChild("legs0", CubeListBuilder.create(), PartPose.offset(3.0F, 22.0F, 0.0F));
		PartDefinition cube_r2 = legs0.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 3).addBox(0.0F, 0.5F, -1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, -0.7854F));
		PartDefinition cube_r3 = legs0.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(5, 3).addBox(0.0F, 0.5F, 0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, -0.7854F));
		PartDefinition cube_r4 = legs0.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(5, 3).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition legs1 = partdefinition.addOrReplaceChild("legs1", CubeListBuilder.create(), PartPose.offset(-3.0F, 22.0F, 0.0F));
		PartDefinition cube_r5 = legs1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(5, 3).addBox(0.0F, 0.5F, -1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.7854F));
		PartDefinition cube_r6 = legs1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(5, 3).addBox(0.0F, 0.5F, 0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.7854F));
		PartDefinition cube_r7 = legs1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(5, 3).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		return LayerDefinition.create(meshdefinition, 90, 90);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
	}
}
