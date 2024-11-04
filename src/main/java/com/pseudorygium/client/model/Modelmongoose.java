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
public class Modelmongoose<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelmongoose"), "main");
	public final ModelPart Body;
	public final ModelPart LeftPawFront;
	public final ModelPart RightPawFront;
	public final ModelPart LeftPawBack;
	public final ModelPart RightPawBack;

	public Modelmongoose(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftPawFront = root.getChild("LeftPawFront");
		this.RightPawFront = root.getChild("RightPawFront");
		this.LeftPawBack = root.getChild("LeftPawBack");
		this.RightPawBack = root.getChild("RightPawBack");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -8.0F, -1.0F, 7.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, -3.0F));
		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offset(1.5F, 0.0F, 0.0F));
		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(17, 19).addBox(-4.0F, -8.0F, -8.0F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(27, 0).addBox(-4.5F, -11.0F, -8.0F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(26, 32).addBox(-3.5F, -10.0F, -13.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 3.0F));
		PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar", CubeListBuilder.create().texOffs(6, 9).addBox(0.5F, -15.0F, -9.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 3.0F));
		PartDefinition RightEar = Head.addOrReplaceChild("RightEar", CubeListBuilder.create().texOffs(0, 9).addBox(-4.5F, -15.0F, -9.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 3.0F));
		PartDefinition Tail2 = Body.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, -4.0F, -3.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition Tail_r1 = Tail2.addOrReplaceChild("Tail_r1", CubeListBuilder.create().texOffs(0, 19).addBox(-2.5F, -9.5F, 12.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition LeftPawFront = partdefinition.addOrReplaceChild("LeftPawFront", CubeListBuilder.create().texOffs(12, 34).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 18.0F, -2.25F));
		PartDefinition RightPawFront = partdefinition.addOrReplaceChild("RightPawFront", CubeListBuilder.create().texOffs(0, 34).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 18.0F, -2.25F));
		PartDefinition LeftPawBack = partdefinition.addOrReplaceChild("LeftPawBack", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 19.0F, 7.25F));
		PartDefinition RightPawBack = partdefinition.addOrReplaceChild("RightPawBack", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 19.0F, 7.25F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		LeftPawFront.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		RightPawFront.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		LeftPawBack.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		RightPawBack.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftPawFront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightPawFront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftPawBack.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightPawBack.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
