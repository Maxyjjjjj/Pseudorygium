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
public class Modelprocoptodon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelprocoptodon"), "main");
	public final ModelPart body;
	public final ModelPart legleft;
	public final ModelPart legright;

	public Modelprocoptodon(ModelPart root) {
		this.body = root.getChild("body");
		this.legleft = root.getChild("legleft");
		this.legright = root.getChild("legright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -8.0F, -2.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, -2.0F, 1.0036F, 0.0F, 0.0F));
		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(50, 43).addBox(-2.0F, -6.0F, -1.0F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, 3.0F, -1.0036F, 0.0F, 0.0F));
		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(16, 41).addBox(-2.5F, -4.0F, -4.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 24).addBox(-2.0F, -4.0F, -6.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(1.0F, -7.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, -7.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition pawleft = body.addOrReplaceChild("pawleft", CubeListBuilder.create().texOffs(30, 43).addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.75F, -5.0F, -2.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition pawleft2 = body.addOrReplaceChild("pawleft2", CubeListBuilder.create().texOffs(40, 33).addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.75F, -5.0F, -2.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 4.0F));
		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft",
				CubeListBuilder.create().texOffs(24, 24).addBox(-2.0F, -6.0F, -4.0F, 4.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(52, 24).addBox(-1.5F, 3.0F, 0.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 12.0F, 1.0F));
		PartDefinition footleft = legleft.addOrReplaceChild("footleft", CubeListBuilder.create().texOffs(36, 12).addBox(-2.0F, -2.0F, -8.0F, 4.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 1.0F));
		PartDefinition legright = partdefinition.addOrReplaceChild("legright",
				CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -6.0F, -4.0F, 4.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(16, 51).addBox(-1.5F, 3.0F, 0.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 12.0F, 1.0F));
		PartDefinition footright = legright.addOrReplaceChild("footright", CubeListBuilder.create().texOffs(36, 0).addBox(-2.0F, -2.0F, -8.0F, 4.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 1.0F));
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
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
