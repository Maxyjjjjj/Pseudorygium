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
public class Modelseal<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelseal"), "main");
	public final ModelPart body;
	public final ModelPart flipperleft;
	public final ModelPart flipperleft2;

	public Modelseal(ModelPart root) {
		this.body = root.getChild("body");
		this.flipperleft = root.getChild("flipperleft");
		this.flipperleft2 = root.getChild("flipperleft2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -4.0F, -8.0F, 10.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition neck = body.addOrReplaceChild("neck",
				CubeListBuilder.create().texOffs(26, 31).addBox(-4.0F, -2.0F, -8.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 5).addBox(-2.5F, 1.0F, -10.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 24).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
				.addBox(1.0F, 1.0F, 9.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 1.0F, 9.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 8.0F));
		PartDefinition flipperleft = partdefinition.addOrReplaceChild("flipperleft", CubeListBuilder.create().texOffs(36, 0).addBox(0.0F, -1.0F, -1.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 24.0F, -6.0F));
		PartDefinition flipperleft2 = partdefinition.addOrReplaceChild("flipperleft2", CubeListBuilder.create().texOffs(25, 24).addBox(-6.0F, -1.0F, -1.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 24.0F, -6.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		flipperleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		flipperleft2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.flipperleft.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.flipperleft2.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
