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
public class Modelhippopotamus extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelhippopotamus"), "main");
	public final ModelPart body;
	public final ModelPart legleftfront;
	public final ModelPart legrightfront;
	public final ModelPart legrightback;
	public final ModelPart legleftback;

	public Modelhippopotamus(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.legleftfront = root.getChild("legleftfront");
		this.legrightfront = root.getChild("legrightfront");
		this.legrightback = root.getChild("legrightback");
		this.legleftback = root.getChild("legleftback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -5.0F, -10.0F, 12.0F, 12.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(26, 41).addBox(-3.0F, -6.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-4.0F, -5.0F, -13.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 32)
						.addBox(2.0F, -8.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-4.0F, -8.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -10.0F));
		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(32, 32).addBox(-4.0F, 0.0F, -8.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(8, 12)
				.addBox(1.0F, -4.0F, -7.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(-3.0F, -4.0F, -7.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -5.0F));
		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront", CubeListBuilder.create().texOffs(45, 49).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 17.0F, -7.0F));
		PartDefinition legrightfront = partdefinition.addOrReplaceChild("legrightfront", CubeListBuilder.create().texOffs(0, 45).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 17.0F, -7.0F));
		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback", CubeListBuilder.create().texOffs(44, 0).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 17.0F, 7.0F));
		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 17.0F, 7.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
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
