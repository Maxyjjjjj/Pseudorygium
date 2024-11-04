package com.pseudorygium.client.model;

import net.minecraft.world.entity.Entity;
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
public class Modelcrayfish<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelcrayfish"), "main");
	public final ModelPart body;

	public Modelcrayfish(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, -7.0F, 6.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-4.0F, 2.0F, -4.5F, 8.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(15, 0).addBox(-5.0F, -1.0F, -10.75F, 10.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition clawsleft = body.addOrReplaceChild("clawsleft", CubeListBuilder.create().texOffs(24, 9).addBox(0.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 30)
				.addBox(3.0F, -0.5F, -3.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(31, 11).addBox(3.0F, -0.5F, -8.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -0.5F, -3.0F, 0.3491F, 0.0F, 0.3054F));
		PartDefinition clawleft = clawsleft.addOrReplaceChild("clawleft", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 0.5F, -3.5F));
		PartDefinition clawsright = body.addOrReplaceChild("clawsright", CubeListBuilder.create().texOffs(0, 10).addBox(-4.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
				.addBox(-5.0F, -0.5F, -3.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 30).addBox(-5.0F, -0.5F, -8.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -0.5F, -3.0F, 0.3491F, 0.0F, -0.3054F));
		PartDefinition clawright = clawsright.addOrReplaceChild("clawright", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 0.5F, -3.5F));
		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(25, 18).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(-4.5F, 3.0F, 6.0F, 9.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 5.0F, -0.1745F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
