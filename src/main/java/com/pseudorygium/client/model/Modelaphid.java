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
public class Modelaphid extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelaphid"), "main");
	public final ModelPart abdomen;
	public final ModelPart legsleft;
	public final ModelPart legsright;

	public Modelaphid(ModelPart root) {
		super(root);
		this.abdomen = root.getChild("abdomen");
		this.legsleft = root.getChild("legsleft");
		this.legsright = root.getChild("legsright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition abdomen = partdefinition.addOrReplaceChild("abdomen",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 6.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(18, 11).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, 0.0F));
		PartDefinition legsleft = partdefinition.addOrReplaceChild("legsleft", CubeListBuilder.create().texOffs(9, 13).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 23.0F, 1.5F));
		PartDefinition legsright = partdefinition.addOrReplaceChild("legsright", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 23.0F, 1.5F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}
