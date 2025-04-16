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
public class Modelgiraffe extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelgiraffe"), "main");
	public final ModelPart body;
	public final ModelPart legleftfront;
	public final ModelPart legleftback;
	public final ModelPart legrightfront;
	public final ModelPart legrightback;

	public Modelgiraffe(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.legleftfront = root.getChild("legleftfront");
		this.legleftback = root.getChild("legleftback");
		this.legrightfront = root.getChild("legrightfront");
		this.legrightback = root.getChild("legrightback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -5.0F, -12.0F, 12.0F, 14.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -17.0F, 0.0F));
		PartDefinition neck = body
				.addOrReplaceChild(
						"neck", CubeListBuilder.create().texOffs(0, 37).addBox(-4.5F, -30.0F, -1.0F, 10.0F, 32.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(34, 37).addBox(-3.5F, -30.5F, 2.0F, 8.0F, 32.0F, 5.0F, new CubeDeformation(0.0F))
								.texOffs(47, 9).addBox(-2.5F, -27.0F, -8.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(47, 0).addBox(-12.5F, -35.0F, 3.0F, 26.0F, 9.0F, 0.0F, new CubeDeformation(0.025F)),
						PartPose.offset(-0.5F, -2.0F, -12.0F));
		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront", CubeListBuilder.create().texOffs(46, 74).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 34.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -10.0F, -9.0F));
		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback", CubeListBuilder.create().texOffs(60, 37).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 34.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -10.0F, 8.0F));
		PartDefinition legrightfront = partdefinition.addOrReplaceChild("legrightfront", CubeListBuilder.create().texOffs(30, 74).addBox(-3.0F, 0.0F, -1.0F, 4.0F, 34.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -10.0F, -9.0F));
		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback", CubeListBuilder.create().texOffs(72, 71).addBox(-3.0F, 0.0F, -1.0F, 4.0F, 34.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -10.0F, 8.0F));
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
