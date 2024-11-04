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

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelpaddlefish<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelpaddlefish"), "main");
	public final ModelPart body;
	public final ModelPart tail;

	public Modelpaddlefish(ModelPart root) {
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.0F, -8.0F, 8.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -2.5F, -6.0F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
				.addBox(-1.5F, -1.5F, -13.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(32, 10).addBox(-2.5F, -1.5F, -17.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, -8.0F));
		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(20, 34).addBox(-4.0F, 0.0F, -6.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.5F, 0.0F));
		PartDefinition finleft = body.addOrReplaceChild("finleft", CubeListBuilder.create(), PartPose.offset(4.0F, 4.0F, -5.0F));
		PartDefinition cube_r1 = finleft.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 8).addBox(0.0F, -0.5F, -1.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, -0.7854F));
		PartDefinition finright = body.addOrReplaceChild("finright", CubeListBuilder.create(), PartPose.offset(-4.0F, 4.0F, -5.0F));
		PartDefinition cube_r2 = finright.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, -0.5F, -1.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.7854F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 22).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(26, 13).addBox(0.0F, -6.0F, 9.0F, 0.0F, 12.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.0F, 8.0F));
		PartDefinition cube_r3 = tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -6.0F, 1.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.tail.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
