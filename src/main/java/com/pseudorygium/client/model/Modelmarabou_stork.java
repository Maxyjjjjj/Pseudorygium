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
public class Modelmarabou_stork<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelmarabou_stork"), "main");
	public final ModelPart body;
	public final ModelPart wingright;
	public final ModelPart wingleft;
	public final ModelPart legleft;
	public final ModelPart legright;

	public Modelmarabou_stork(ModelPart root) {
		this.body = root.getChild("body");
		this.wingright = root.getChild("wingright");
		this.wingleft = root.getChild("wingleft");
		this.legleft = root.getChild("legleft");
		this.legright = root.getChild("legright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, -3.5F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
				.addBox(-2.5F, -4.0F, -3.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(25, 8).addBox(-1.0F, -2.0F, -5.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(30, 20).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -5.5F, -0.3054F, 0.0F, 0.0F));
		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, -3.0F, -4.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(45, 10).addBox(0.0F, -2.0F, -10.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 2.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition wingright = partdefinition.addOrReplaceChild("wingright", CubeListBuilder.create(), PartPose.offset(-3.0F, 8.0F, -1.0F));
		PartDefinition cube_r1 = wingright.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -1.0F, -1.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition wingleft = partdefinition.addOrReplaceChild("wingleft", CubeListBuilder.create(), PartPose.offset(2.0F, 8.0F, -1.0F));
		PartDefinition cube_r2 = wingleft.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(40, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 13.0F, 0.0F));
		PartDefinition legright = partdefinition.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(40, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 13.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		wingright.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		wingleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.legright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
