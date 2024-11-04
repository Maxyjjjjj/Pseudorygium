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
public class Modelfennec_fox<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelfennec_fox"), "main");
	public final ModelPart Body;
	public final ModelPart LeftBackPaw;
	public final ModelPart RightBackPaw;
	public final ModelPart RightFrontPaw;
	public final ModelPart LeftFrontPaw;

	public Modelfennec_fox(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftBackPaw = root.getChild("LeftBackPaw");
		this.RightBackPaw = root.getChild("RightBackPaw");
		this.RightFrontPaw = root.getChild("RightFrontPaw");
		this.LeftFrontPaw = root.getChild("LeftFrontPaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -12.0F, -5.0F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -9.0F, 7.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(22, 18).addBox(-1.5F, -13.0F, 9.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition Ear = Head.addOrReplaceChild("Ear", CubeListBuilder.create().texOffs(0, 29).addBox(1.0F, -14.0F, 13.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Snout_r1 = Snout.addOrReplaceChild("Snout_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -10.5F, 13.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition Ear2 = Head.addOrReplaceChild("Ear2", CubeListBuilder.create().texOffs(0, 5).addBox(-3.0F, -14.5F, 13.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Tail_r1 = Tail.addOrReplaceChild("Tail_r1", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -12.0F, -4.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition LeftBackPaw = partdefinition.addOrReplaceChild("LeftBackPaw", CubeListBuilder.create().texOffs(28, 28).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 18.0F, 4.0F));
		PartDefinition RightBackPaw = partdefinition.addOrReplaceChild("RightBackPaw", CubeListBuilder.create().texOffs(20, 28).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 18.0F, 4.0F));
		PartDefinition RightFrontPaw = partdefinition.addOrReplaceChild("RightFrontPaw", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 18.0F, -6.0F));
		PartDefinition LeftFrontPaw = partdefinition.addOrReplaceChild("LeftFrontPaw", CubeListBuilder.create().texOffs(14, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 18.0F, -6.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		LeftBackPaw.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		RightBackPaw.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		RightFrontPaw.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		LeftFrontPaw.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftFrontPaw.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftBackPaw.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightFrontPaw.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightBackPaw.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
