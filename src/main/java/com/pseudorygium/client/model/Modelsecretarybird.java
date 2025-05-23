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
public class Modelsecretarybird extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelsecretarybird"), "main");
	public final ModelPart body;
	public final ModelPart tail;
	public final ModelPart neck;
	public final ModelPart head;
	public final ModelPart wingleft;
	public final ModelPart wingleft2;
	public final ModelPart thighleft;
	public final ModelPart legleft;
	public final ModelPart footleft;
	public final ModelPart thighright;
	public final ModelPart legright;
	public final ModelPart footright;

	public Modelsecretarybird(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.tail = this.body.getChild("tail");
		this.neck = this.body.getChild("neck");
		this.head = this.neck.getChild("head");
		this.wingleft = this.body.getChild("wingleft");
		this.wingleft2 = this.body.getChild("wingleft2");
		this.thighleft = root.getChild("thighleft");
		this.legleft = this.thighleft.getChild("legleft");
		this.footleft = this.legleft.getChild("footleft");
		this.thighright = root.getChild("thighright");
		this.legright = this.thighright.getChild("legright");
		this.footright = this.legright.getChild("footright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 12).addBox(-3.0F, -2.5F, -5.0F, 6.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 5.0F));
		PartDefinition cube_r2 = tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 12).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r3 = tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 27).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(38, 20).addBox(-1.5F, -7.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -5.0F));
		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(17, 33).addBox(-1.5F, -3.0F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 27)
				.addBox(-0.5F, -2.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 24).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition wingleft = body.addOrReplaceChild("wingleft", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -2.5F, -4.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r5 = wingleft.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 6).addBox(0.0F, -0.9881F, -3.8918F, 18.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.0119F, -0.1082F, 0.0F, -1.5708F, 1.5708F));
		PartDefinition wingleft2 = body.addOrReplaceChild("wingleft2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -2.5F, -4.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r6 = wingleft2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, -0.9881F, -3.8918F, 18.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.0119F, -0.1082F, 0.0F, 1.5708F, -1.5708F));
		PartDefinition thighleft = partdefinition.addOrReplaceChild("thighleft", CubeListBuilder.create().texOffs(22, 12).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 13.0F, 3.0F));
		PartDefinition legleft = thighleft.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(8, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));
		PartDefinition footleft = legleft.addOrReplaceChild("footleft", CubeListBuilder.create().texOffs(33, 33).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition thighright = partdefinition.addOrReplaceChild("thighright", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 13.0F, 3.0F));
		PartDefinition legright = thighright.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));
		PartDefinition footright = legright.addOrReplaceChild("footright", CubeListBuilder.create().texOffs(0, 34).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.thighleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.thighright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.neck.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.neck.xRot = headPitch / (180F / (float) Math.PI);
	}
}
