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
public class Modelmammoth<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelmammoth"), "main");
	public final ModelPart body;
	public final ModelPart legleftfront;
	public final ModelPart legleftback;
	public final ModelPart legrightfront;
	public final ModelPart legrightback;

	public Modelmammoth(ModelPart root) {
		this.body = root.getChild("body");
		this.legleftfront = root.getChild("legleftfront");
		this.legleftback = root.getChild("legleftback");
		this.legrightfront = root.getChild("legrightfront");
		this.legrightback = root.getChild("legrightback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 66).addBox(-11.0F, -11.0F, -17.0F, 22.0F, 22.0F, 34.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-11.5F, -11.5F, -16.75F, 23.0F, 32.0F, 34.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(78, 66).addBox(-8.0F, -8.0F, -12.0F, 16.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, -17.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(114, 29).addBox(16.5F, 2.0F, 16.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.6981F, 0.0F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(112, 94).addBox(-20.5F, 2.0F, 16.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, -0.7418F, 0.0F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(112, 114).addBox(-3.5F, 11.0F, -5.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6981F, -0.7418F, 0.0F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 122).addBox(-0.5F, 11.0F, -5.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6981F, 0.7418F, 0.0F));
		PartDefinition earleft = head.addOrReplaceChild("earleft", CubeListBuilder.create().texOffs(16, 122).addBox(-1.0F, -6.0F, 0.0F, 12.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, -3.0F, -5.0F));
		PartDefinition earright = head.addOrReplaceChild("earright", CubeListBuilder.create().texOffs(114, 49).addBox(-13.0F, -6.0F, 0.0F, 12.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -3.0F, -5.0F));
		PartDefinition trunksegment1 = head.addOrReplaceChild("trunksegment1", CubeListBuilder.create().texOffs(84, 122).addBox(-3.0F, -1.0F, -2.0F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, -12.0F));
		PartDefinition trunksegment2 = trunksegment1.addOrReplaceChild("trunksegment2", CubeListBuilder.create().texOffs(62, 122).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition trunksegment3 = trunksegment2.addOrReplaceChild("trunksegment3", CubeListBuilder.create().texOffs(122, 61).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition trunksegment4 = trunksegment3.addOrReplaceChild("trunksegment4", CubeListBuilder.create().texOffs(40, 122).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront", CubeListBuilder.create().texOffs(112, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 21.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 3.0F, -12.0F));
		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback", CubeListBuilder.create().texOffs(0, 66).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 21.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 3.0F, 12.0F));
		PartDefinition legrightfront = partdefinition.addOrReplaceChild("legrightfront", CubeListBuilder.create().texOffs(80, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 21.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 3.0F, -12.0F));
		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 21.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 3.0F, 12.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.legrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
