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
public class Modelfruit_bat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelfruit_bat"), "main");
	public final ModelPart Head;
	public final ModelPart body;
	public final ModelPart rightWing;
	public final ModelPart leftWing;

	public Modelfruit_bat(ModelPart root) {
		this.Head = root.getChild("Head");
		this.body = root.getChild("body");
		this.rightWing = root.getChild("rightWing");
		this.leftWing = root.getChild("leftWing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(18, 18).addBox(-3.0F, -5.0F, -1.0F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 10).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.0F, -2.0F));
		PartDefinition rightEar = Head.addOrReplaceChild("rightEar", CubeListBuilder.create().texOffs(30, 0).addBox(-2.5F, -7.0F, 0.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -2.0F, 0.0F));
		PartDefinition leftEar = Head.addOrReplaceChild("leftEar", CubeListBuilder.create().texOffs(26, 27).addBox(-0.1F, -6.0F, 0.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1F, -3.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 22).addBox(-3.5F, -3.0F, -1.0F, 7.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition feet = body.addOrReplaceChild("feet", CubeListBuilder.create().texOffs(22, 15).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition rightWing = partdefinition.addOrReplaceChild("rightWing", CubeListBuilder.create().texOffs(18, 27).addBox(-4.0F, -5.0F, 0.0F, 4.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 12.0F, 0.0F));
		PartDefinition rightWingTip = rightWing.addOrReplaceChild("rightWingTip", CubeListBuilder.create().texOffs(0, 11).addBox(-11.0F, -5.0F, 0.0F, 11.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.0F, 0.0F));
		PartDefinition leftWing = partdefinition.addOrReplaceChild("leftWing", CubeListBuilder.create().texOffs(22, 0).addBox(0.0F, -5.0F, 0.0F, 4.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 12.0F, 0.0F));
		PartDefinition leftWingTip = leftWing.addOrReplaceChild("leftWingTip", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -5.0F, 0.0F, 11.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		rightWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leftWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leftWing.yRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.rightWing.yRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
	}
}
