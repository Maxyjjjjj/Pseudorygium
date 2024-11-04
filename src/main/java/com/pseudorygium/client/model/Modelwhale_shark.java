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
public class Modelwhale_shark<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelwhale_shark"), "main");
	public final ModelPart body;
	public final ModelPart tail;

	public Modelwhale_shark(ModelPart root) {
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, -18.0F, -26.0F, 30.0F, 18.0F, 47.0F, new CubeDeformation(0.0F)).texOffs(60, 65).addBox(-14.0F, 0.0F, 1.0F, 28.0F, 9.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(107, 0)
						.addBox(-15.0F, -4.0F, -44.0F, 30.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(88, 94).addBox(-15.0F, -18.0F, -44.0F, 30.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 121)
						.addBox(10.0F, -14.0F, -43.0F, 4.0F, 10.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-14.0F, -14.0F, -43.0F, 4.0F, 10.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(107, 22).addBox(-28.0F, -6.0F, -19.0F, 19.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2182F, -0.3927F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(136, 65).addBox(9.0F, -6.0F, -19.0F, 19.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.3927F));
		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -32.0F, 3.0F, 0.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(34, 94).addBox(-7.0F, -5.0F, -7.0F, 14.0F, 18.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(88, 116)
				.addBox(-6.0F, 13.0F, -7.0F, 12.0F, 6.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(0, 35).addBox(0.0F, -15.0F, 19.0F, 0.0F, 36.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, 28.0F));
		PartDefinition cube_r4 = tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(60, 55).addBox(0.0F, -28.0F, 25.0F, 0.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -28.0F, -0.0873F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.tail.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
