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
public class Modelkagu<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelkagu"), "main");
	public final ModelPart body;
	public final ModelPart wingleft;
	public final ModelPart wingright;
	public final ModelPart legleft;
	public final ModelPart legright;

	public Modelkagu(ModelPart root) {
		this.body = root.getChild("body");
		this.wingleft = root.getChild("wingleft");
		this.wingright = root.getChild("wingright");
		this.legleft = root.getChild("legleft");
		this.legright = root.getChild("legright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.0F, 0.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(12, 30).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 10).addBox(-1.5F, -6.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 25)
						.addBox(-1.0F, -4.5F, -6.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 2).addBox(-1.5F, -11.0F, -2.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(11, 0)
						.addBox(-2.5F, -6.0F, -3.0F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 17).addBox(-2.0F, -6.0F, 2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(24, 25).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 1.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition wingleft = partdefinition.addOrReplaceChild("wingleft", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, -1.0F, -2.0F, 1.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 11.0F, -0.5F, 0.3054F, 0.0F, 0.0F));
		PartDefinition wingright = partdefinition.addOrReplaceChild("wingright", CubeListBuilder.create().texOffs(11, 7).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 11.0F, -0.5F, 0.3054F, 0.0F, 0.0F));
		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(6, 30).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 18.0F, 0.0F));
		PartDefinition legright = partdefinition.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 18.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		wingleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		wingright.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.legright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
