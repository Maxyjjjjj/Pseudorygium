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
public class Modelzebroid<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelzebroid"), "main");
	public final ModelPart Body;
	public final ModelPart TailA;
	public final ModelPart Leg1A;
	public final ModelPart Leg2A;
	public final ModelPart Leg3A;
	public final ModelPart Leg4A;
	public final ModelPart Head;
	public final ModelPart Ear1;
	public final ModelPart Ear2;
	public final ModelPart MuleEarL;
	public final ModelPart MuleEarR;
	public final ModelPart Neck;

	public Modelzebroid(ModelPart root) {
		this.Body = root.getChild("Body");
		this.TailA = root.getChild("TailA");
		this.Leg1A = root.getChild("Leg1A");
		this.Leg2A = root.getChild("Leg2A");
		this.Leg3A = root.getChild("Leg3A");
		this.Leg4A = root.getChild("Leg4A");
		this.Head = root.getChild("Head");
		this.Ear1 = root.getChild("Ear1");
		this.Ear2 = root.getChild("Ear2");
		this.MuleEarL = root.getChild("MuleEarL");
		this.MuleEarR = root.getChild("MuleEarR");
		this.Neck = root.getChild("Neck");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 32).addBox(-5.0F, -8.0F, -20.0F, 10.0F, 10.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, 9.0F));
		PartDefinition TailA = partdefinition.addOrReplaceChild("TailA", CubeListBuilder.create().texOffs(42, 36).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 11.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Leg1A = partdefinition.addOrReplaceChild("Leg1A", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(3.0F, 13.0F, 9.0F));
		PartDefinition Leg2A = partdefinition.addOrReplaceChild("Leg2A", CubeListBuilder.create().texOffs(48, 21).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 13.0F, 9.0F));
		PartDefinition Leg3A = partdefinition.addOrReplaceChild("Leg3A", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(3.0F, 13.0F, -9.0F));
		PartDefinition Leg4A = partdefinition.addOrReplaceChild("Leg4A", CubeListBuilder.create().texOffs(48, 21).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 13.0F, -9.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, -5.0F, -6.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(-2.0F, -5.0F, -11.0F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -11.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Ear1 = partdefinition.addOrReplaceChild("Ear1", CubeListBuilder.create().texOffs(19, 16).mirror().addBox(-0.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.0F, -8.0F, 0.5236F, 0.0F, 0.0873F));
		PartDefinition Ear2 = partdefinition.addOrReplaceChild("Ear2", CubeListBuilder.create().texOffs(19, 16).addBox(-1.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, -8.0F, 0.5236F, 0.0F, -0.0873F));
		PartDefinition MuleEarL = partdefinition.addOrReplaceChild("MuleEarL", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-3.0F, -22.0F, 2.99F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.0F, -8.0F, 0.5236F, 0.0F, 0.2618F));
		PartDefinition MuleEarR = partdefinition.addOrReplaceChild("MuleEarR", CubeListBuilder.create().texOffs(0, 12).addBox(1.0F, -22.0F, 2.99F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, -8.0F, 0.5236F, 0.0F, -0.2618F));
		PartDefinition Neck = partdefinition.addOrReplaceChild("Neck",
				CubeListBuilder.create().texOffs(0, 35).addBox(-2.0F, -11.0F, -3.0F, 4.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(56, 36).addBox(-1.0F, -16.0F, 4.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, -8.0F, 0.5236F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		TailA.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Leg1A.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Leg2A.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Leg3A.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Leg4A.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Ear1.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Ear2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		MuleEarL.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		MuleEarR.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Leg1A.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Leg3A.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Leg2A.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Leg4A.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
