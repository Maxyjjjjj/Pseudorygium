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
public class Modelkangaroo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelkangaroo"), "main");
	public final ModelPart body;
	public final ModelPart legleft;
	public final ModelPart legright;

	public Modelkangaroo(ModelPart root) {
		this.body = root.getChild("body");
		this.legleft = root.getChild("legleft");
		this.legright = root.getChild("legright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -8.0F, -2.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, -2.0F, 1.0036F, 0.0F, 0.0F));
		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(19, 43).addBox(-2.0F, -6.0F, -1.0F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, 3.0F, -1.0036F, 0.0F, 0.0F));
		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 34).addBox(-2.5F, -4.0F, -4.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 0).addBox(-2.0F, -3.0F, -8.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
						.addBox(1.0F, -7.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 34).addBox(-2.0F, -7.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition pawleft = body.addOrReplaceChild("pawleft", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.75F, -5.0F, -2.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition pawleft2 = body.addOrReplaceChild("pawleft2", CubeListBuilder.create().texOffs(34, 35).addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.75F, -5.0F, -2.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(26, 24).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 4.0F));
		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft",
				CubeListBuilder.create().texOffs(42, 21).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(-1.0F, 3.0F, 1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 15.0F, 1.0F));
		PartDefinition footleft = legleft.addOrReplaceChild("footleft", CubeListBuilder.create().texOffs(8, 24).addBox(-2.0F, 0.0F, -8.0F, 4.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 1.0F));
		PartDefinition legright = partdefinition.addOrReplaceChild("legright",
				CubeListBuilder.create().texOffs(36, 10).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, 3.0F, 1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 15.0F, 1.0F));
		PartDefinition footright = legright.addOrReplaceChild("footright", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, 0.0F, -8.0F, 4.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 1.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.legright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
