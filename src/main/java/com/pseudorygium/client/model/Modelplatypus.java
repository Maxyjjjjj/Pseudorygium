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
public class Modelplatypus<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelplatypus"), "main");
	public final ModelPart body;
	public final ModelPart legleftfront;
	public final ModelPart legrightfront;
	public final ModelPart legrightback;
	public final ModelPart legleftback;

	public Modelplatypus(ModelPart root) {
		this.body = root.getChild("body");
		this.legleftfront = root.getChild("legleftfront");
		this.legrightfront = root.getChild("legrightfront");
		this.legrightback = root.getChild("legrightback");
		this.legleftback = root.getChild("legleftback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, -7.0F, 6.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(16, 18).addBox(-2.0F, 0.0F, -13.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(20, 25)
						.addBox(-2.0F, -5.05F, -6.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 0).addBox(-5.0F, -2.05F, -9.0F, 10.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 22.0F, 0.0F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 7.0F));
		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront",
				CubeListBuilder.create().texOffs(30, 18).addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(2.0F, 0.0F, -1.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 24.0F, -4.0F));
		PartDefinition legrightfront = partdefinition.addOrReplaceChild("legrightfront",
				CubeListBuilder.create().texOffs(10, 28).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(-6.0F, 0.0F, -1.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 24.0F, -4.0F));
		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback",
				CubeListBuilder.create().texOffs(0, 28).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 3).addBox(-6.0F, 0.0F, -1.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 24.0F, 4.0F));
		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback",
				CubeListBuilder.create().texOffs(26, 10).addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(2.0F, 0.0F, -1.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 24.0F, 4.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.legrightfront.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleftfront.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleftback.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legrightback.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
