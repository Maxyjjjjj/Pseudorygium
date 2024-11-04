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
public class Modelcapybara<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelcapybara"), "main");
	public final ModelPart body;
	public final ModelPart legleftfront;
	public final ModelPart legrightfront;
	public final ModelPart legleftback;
	public final ModelPart legrightback;

	public Modelcapybara(ModelPart root) {
		this.body = root.getChild("body");
		this.legleftfront = root.getChild("legleftfront");
		this.legrightfront = root.getChild("legrightfront");
		this.legleftback = root.getChild("legleftback");
		this.legrightback = root.getChild("legrightback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -14.0F, -11.0F, 14.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 36).addBox(-4.0F, -5.0F, -14.0F, 8.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 16).mirror()
				.addBox(4.0F, -8.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 16).addBox(-5.0F, -8.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.0F, -11.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, -1.0F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 15.0F, -9.0F));
		PartDefinition legrightfront = partdefinition.addOrReplaceChild("legrightfront", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, -1.0F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 15.0F, -9.0F));
		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback", CubeListBuilder.create().texOffs(50, 0).addBox(-3.0F, -4.0F, -1.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 17.0F, 8.0F));
		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback", CubeListBuilder.create().texOffs(50, 0).addBox(-3.0F, -4.0F, -1.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 17.0F, 8.0F));
		return LayerDefinition.create(meshdefinition, 80, 74);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.legrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
