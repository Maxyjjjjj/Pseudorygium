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
public class Modelwhite_shark<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelwhite_shark"), "main");
	public final ModelPart body;
	public final ModelPart tail;

	public Modelwhite_shark(ModelPart root) {
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -10.0F, -21.0F, 16.0F, 18.0F, 40.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition findorsal = body.addOrReplaceChild("findorsal", CubeListBuilder.create(), PartPose.offset(0.0F, -10.0F, -4.0F));
		PartDefinition cube_r1 = findorsal.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -10.0F, 0.0F, 2.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(72, 0).addBox(-8.0F, -10.0F, -16.0F, 16.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(44, 85).addBox(-6.0F, 0.0F, -14.0F, 12.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -21.0F));
		PartDefinition jaw = head.addOrReplaceChild("jaw",
				CubeListBuilder.create().texOffs(84, 69).addBox(-7.0F, 0.0F, -15.0F, 14.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(82, 91).addBox(-6.0F, -3.0F, -14.0F, 12.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition finleft = body.addOrReplaceChild("finleft", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, -14.0F, 0.3491F, 0.0F, -0.7854F));
		PartDefinition finright = body.addOrReplaceChild("finright", CubeListBuilder.create().texOffs(15, 12).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 8.0F, -14.0F, 0.3491F, 0.0F, 0.7854F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 58).addBox(-4.0F, -8.0F, 0.0F, 9.0F, 15.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(58, 37).addBox(0.5F, -13.0F, 20.0F, 0.0F, 27.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 11.0F, 19.0F));
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
