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

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelstag_beetle extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelstag_beetle"), "main");
	public final ModelPart abdomen;
	public final ModelPart legleftfront;
	public final ModelPart legrightfront;
	public final ModelPart legrightmiddle;
	public final ModelPart legleftmiddle;
	public final ModelPart legleftback;
	public final ModelPart legrightback;

	public Modelstag_beetle(ModelPart root) {
		super(root);
		this.abdomen = root.getChild("abdomen");
		this.legleftfront = root.getChild("legleftfront");
		this.legrightfront = root.getChild("legrightfront");
		this.legrightmiddle = root.getChild("legrightmiddle");
		this.legleftmiddle = root.getChild("legleftmiddle");
		this.legleftback = root.getChild("legleftback");
		this.legrightback = root.getChild("legrightback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition abdomen = partdefinition.addOrReplaceChild("abdomen", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -5.0F, -7.0F, 14.0F, 8.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition head = abdomen.addOrReplaceChild("head", CubeListBuilder.create().texOffs(23, 31).addBox(-4.0F, -2.0F, -7.0F, 8.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(49, 0)
				.addBox(4.0F, -2.0F, -7.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(49, 0).addBox(-13.0F, -2.0F, -7.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition mandibleleft = head.addOrReplaceChild("mandibleleft", CubeListBuilder.create().texOffs(0, 31).addBox(-3.5F, 0.0F, -13.0F, 5.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 3.0F, -7.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition mandibleright = head.addOrReplaceChild("mandibleright", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -13.0F, 5.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.0F, -7.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront", CubeListBuilder.create().texOffs(14, 50).addBox(0.0F, -4.0F, 0.0F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 21.0F, -5.0F));
		PartDefinition legrightfront = partdefinition.addOrReplaceChild("legrightfront", CubeListBuilder.create().texOffs(46, 31).addBox(-7.0F, -4.0F, 0.0F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 21.0F, -5.0F));
		PartDefinition legrightmiddle = partdefinition.addOrReplaceChild("legrightmiddle", CubeListBuilder.create().texOffs(0, 44).addBox(-7.0F, -4.0F, 0.0F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 21.0F, 0.0F));
		PartDefinition legleftmiddle = partdefinition.addOrReplaceChild("legleftmiddle", CubeListBuilder.create().texOffs(37, 43).addBox(0.0F, -4.0F, 0.0F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 21.0F, 0.0F));
		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback", CubeListBuilder.create().texOffs(23, 43).addBox(0.0F, -4.0F, 0.0F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 21.0F, 5.0F));
		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback", CubeListBuilder.create().texOffs(0, 13).addBox(-7.0F, -4.0F, 0.0F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 21.0F, 5.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}
