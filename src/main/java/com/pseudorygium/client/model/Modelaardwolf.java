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
public class Modelaardwolf<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelaardwolf"), "main");
	public final ModelPart body;
	public final ModelPart pawleftfront;
	public final ModelPart pawrightfront;
	public final ModelPart pawrightback;
	public final ModelPart pawleftback;

	public Modelaardwolf(ModelPart root) {
		this.body = root.getChild("body");
		this.pawleftfront = root.getChild("pawleftfront");
		this.pawrightfront = root.getChild("pawrightfront");
		this.pawrightback = root.getChild("pawrightback");
		this.pawleftback = root.getChild("pawleftback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(31, 0).addBox(-3.0F, -5.0F, 0.0F, 6.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(1, 0)
				.addBox(-3.0F, -5.0F, -8.0F, 6.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(18, 19).addBox(-2.0F, -7.0F, -8.25F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(38, 19).addBox(-2.0F, -3.0F, -5.0F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -1.0F, -7.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, -8.25F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(26, 0).mirror().addBox(-1.0F, -7.0F, -2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, -0.48F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(26, 0).addBox(0.0F, -7.0F, -2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.48F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 19).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 10.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition pawleftfront = partdefinition.addOrReplaceChild("pawleftfront", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 16.0F, -6.0F));
		PartDefinition pawrightfront = partdefinition.addOrReplaceChild("pawrightfront", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 16.0F, -6.0F));
		PartDefinition pawrightback = partdefinition.addOrReplaceChild("pawrightback", CubeListBuilder.create().texOffs(20, 40).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 15.0F, 7.0F));
		PartDefinition pawleftback = partdefinition.addOrReplaceChild("pawleftback", CubeListBuilder.create().texOffs(20, 40).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 15.0F, 7.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		pawleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		pawrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		pawrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		pawleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.pawleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.pawrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
