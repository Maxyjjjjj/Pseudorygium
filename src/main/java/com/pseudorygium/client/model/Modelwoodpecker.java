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
public class Modelwoodpecker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelwoodpecker"), "main");
	public final ModelPart Body;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart LeftWing;
	public final ModelPart RightWing;

	public Modelwoodpecker(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftWing = root.getChild("LeftWing");
		this.RightWing = root.getChild("RightWing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -11.0F, -1.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 24.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(20, 0).addBox(-3.0F, -14.0F, -3.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 13).addBox(-4.0F, -17.0F, -3.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(22, 25).addBox(-2.0F, -19.0F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(22, 14).addBox(-2.0F, -14.0F, -9.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Tail_r1 = Tail.addOrReplaceChild("Tail_r1", CubeListBuilder.create().texOffs(15, 7).addBox(-3.0F, -6.0F, -1.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 20.0F, -1.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition LeftLeg_r1 = LeftLeg.addOrReplaceChild("LeftLeg_r1", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 20.0F, 0.0F));
		PartDefinition LeftWing = partdefinition.addOrReplaceChild("LeftWing", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 13.75F, -1.0F, 0.4363F, 0.0F, -0.1745F));
		PartDefinition LeftWing_r1 = LeftWing.addOrReplaceChild("LeftWing_r1", CubeListBuilder.create().texOffs(0, 22).addBox(2.0F, -11.0F, 0.0F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 9.5F, -4.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition RightWing = partdefinition.addOrReplaceChild("RightWing", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 13.5F, -0.5F, 0.4363F, 0.0F, 0.1745F));
		PartDefinition RightWing_r1 = RightWing.addOrReplaceChild("RightWing_r1", CubeListBuilder.create().texOffs(15, 17).addBox(-6.0F, -10.0F, 0.0F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, 8.5F, -4.5F, -0.1309F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		LeftWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		RightWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftWing.zRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.RightWing.zRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
	}
}
