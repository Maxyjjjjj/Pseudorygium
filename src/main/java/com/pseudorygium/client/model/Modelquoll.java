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
public class Modelquoll<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelquoll"), "main");
	public final ModelPart belly;
	public final ModelPart head;
	public final ModelPart tail1;
	public final ModelPart backLegL;
	public final ModelPart backLegR;
	public final ModelPart frontLegL;
	public final ModelPart frontLegR;

	public Modelquoll(ModelPart root) {
		this.belly = root.getChild("belly");
		this.head = root.getChild("head");
		this.tail1 = root.getChild("tail1");
		this.backLegL = root.getChild("backLegL");
		this.backLegR = root.getChild("backLegR");
		this.frontLegL = root.getChild("frontLegL");
		this.frontLegR = root.getChild("frontLegR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition belly = partdefinition.addOrReplaceChild("belly", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -8.0F, -3.0F, 4.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, 1.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(15, 17).addBox(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 0).addBox(-1.5F, -0.0156F, -4.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-2.0F, -3.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 13.0F, -9.0F));
		PartDefinition tail1 = partdefinition.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, 7.5F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition backLegL = partdefinition.addOrReplaceChild("backLegL", CubeListBuilder.create().texOffs(24, 26).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1F, 18.0F, 7.0F));
		PartDefinition backLegR = partdefinition.addOrReplaceChild("backLegR", CubeListBuilder.create().texOffs(16, 26).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.1F, 18.0F, 7.0F));
		PartDefinition frontLegL = partdefinition.addOrReplaceChild("frontLegL", CubeListBuilder.create().texOffs(26, 8).addBox(-1.0F, -0.2F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.2F, 18.0F, -4.0F));
		PartDefinition frontLegR = partdefinition.addOrReplaceChild("frontLegR", CubeListBuilder.create().texOffs(8, 24).addBox(-1.0F, -0.2F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.2F, 18.0F, -4.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		belly.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		tail1.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		backLegL.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		backLegR.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		frontLegL.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		frontLegR.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.backLegL.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.frontLegR.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.backLegR.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.frontLegL.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
