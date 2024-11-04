package com.pseudorygium.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelaye_aye<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelaye_aye"), "main");
	public final ModelPart body;
	public final ModelPart armleft;
	public final ModelPart armright;
	public final ModelPart legleft;
	public final ModelPart legright;

	public Modelaye_aye(ModelPart root) {
		this.body = root.getChild("body");
		this.armleft = root.getChild("armleft");
		this.armright = root.getChild("armright");
		this.legleft = root.getChild("legleft");
		this.legright = root.getChild("legright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -8.0F, -6.0F, 7.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(25, 20).addBox(-4.0F, -4.0F, -5.0F, 8.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(-2.0F, 0.0F, -6.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, -6.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -10.0F, -4.0F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 20).addBox(-2.0F, -10.0F, -4.0F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 20).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, 6.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition armleft = partdefinition.addOrReplaceChild("armleft",
				CubeListBuilder.create().texOffs(38, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(31, 0).addBox(-1.0F, 5.0F, -4.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 19.0F, -4.0F));
		PartDefinition fingerleft = armleft.addOrReplaceChild("fingerleft", CubeListBuilder.create().texOffs(2, 7).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition armright = partdefinition.addOrReplaceChild("armright",
				CubeListBuilder.create().texOffs(36, 37).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 7).addBox(-1.0F, 5.0F, -4.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 19.0F, -4.0F));
		PartDefinition fingerright = armright.addOrReplaceChild("fingerright", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft",
				CubeListBuilder.create().texOffs(32, 5).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 20).addBox(-1.0F, 5.0F, -4.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 19.0F, 5.0F));
		PartDefinition legright = partdefinition.addOrReplaceChild("legright",
				CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(5, 7).addBox(-1.0F, 5.0F, -4.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 19.0F, 5.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		armleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		armright.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.armright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legright.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.armleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
