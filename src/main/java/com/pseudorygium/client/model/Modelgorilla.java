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

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelgorilla extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelgorilla"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart arm1;
	public final ModelPart arm0;
	public final ModelPart leg0;
	public final ModelPart leg1;

	public Modelgorilla(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.arm1 = root.getChild("arm1");
		this.arm0 = root.getChild("arm0");
		this.leg0 = root.getChild("leg0");
		this.leg1 = root.getChild("leg1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -6.5F, -20.0F, 18.0F, 11.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-5.0F, -6.0F, -7.5F, 10.0F, 11.0F, 9.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 8.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(46, 24).addBox(-4.0F, -6.0F, -6.0F, 8.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(29, 23).addBox(-2.5F, -2.0F, -8.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(49, 98)
						.addBox(-3.0F, -8.0F, -5.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 78).addBox(-6.0F, -10.0F, -9.0F, 12.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -19.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition arm1 = partdefinition.addOrReplaceChild("arm1", CubeListBuilder.create().texOffs(93, 89).addBox(-2.0F, -8.0F, -3.0F, 4.0F, 28.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 4.0F, -8.0F));
		PartDefinition arm0 = partdefinition.addOrReplaceChild("arm0", CubeListBuilder.create().texOffs(0, 52).addBox(-2.0F, -8.0F, -3.0F, 4.0F, 28.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, 4.0F, -8.0F));
		PartDefinition leg0 = partdefinition.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(60, 0).addBox(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 11.0F, 9.0F));
		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(52, 39).addBox(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 11.0F, 9.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg0.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.arm1.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.arm0.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
