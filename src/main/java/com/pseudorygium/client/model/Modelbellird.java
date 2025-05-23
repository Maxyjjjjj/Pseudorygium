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
public class Modelbellird extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelbellird"), "main");
	public final ModelPart body;
	public final ModelPart wingleft;
	public final ModelPart wingleft2;
	public final ModelPart legleft;
	public final ModelPart legleft2;

	public Modelbellird(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.wingleft = root.getChild("wingleft");
		this.wingleft2 = root.getChild("wingleft2");
		this.legleft = root.getChild("legleft");
		this.legleft2 = root.getChild("legleft2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -5.0F, -4.0F, 7.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.0F, 1.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(30, 12).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, -3.5F, 0.3927F, 0.0F, 0.0F));
		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(24, 0).addBox(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(-1.0F, 0.0F, -7.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition wattle = head.addOrReplaceChild("wattle", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0F, -5.0F));
		PartDefinition cube_r1 = wattle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 21).addBox(0.0F, 0.0F, -1.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 6.0F));
		PartDefinition wingleft = partdefinition.addOrReplaceChild("wingleft", CubeListBuilder.create().texOffs(21, 22).addBox(0.0F, -1.0F, -1.0F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 14.0F, -1.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition wingleft2 = partdefinition.addOrReplaceChild("wingleft2", CubeListBuilder.create().texOffs(9, 17).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 14.0F, -1.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.25F, 19.25F, 2.5F));
		PartDefinition legleft2 = partdefinition.addOrReplaceChild("legleft2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.75F, 19.25F, 2.5F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.wingleft2.zRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.wingleft.zRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
	}
}
