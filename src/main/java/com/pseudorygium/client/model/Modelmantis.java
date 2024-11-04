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

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmantis<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelmantis"), "main");
	public final ModelPart abdomen;
	public final ModelPart legleftmiddle;
	public final ModelPart legleftback;
	public final ModelPart legrightback;
	public final ModelPart legrightmiddle;

	public Modelmantis(ModelPart root) {
		this.abdomen = root.getChild("abdomen");
		this.legleftmiddle = root.getChild("legleftmiddle");
		this.legleftback = root.getChild("legleftback");
		this.legrightback = root.getChild("legrightback");
		this.legrightmiddle = root.getChild("legrightmiddle");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition abdomen = partdefinition.addOrReplaceChild("abdomen", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 5.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition chest = abdomen.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -10.0F, -1.0F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.7418F, 0.0F, 0.0F));
		PartDefinition legleftfront = chest.addOrReplaceChild("legleftfront", CubeListBuilder.create().texOffs(9, 5).addBox(-0.5F, 0.0F, -5.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -5.0F, -1.0F, 0.9163F, 0.0F, 0.0F));
		PartDefinition legleftfront2 = legleftfront.addOrReplaceChild("legleftfront2", CubeListBuilder.create().texOffs(9, 0).addBox(-0.5F, 0.0F, -5.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -2.3562F, 0.0F, 0.0F));
		PartDefinition handleft = legleftfront2.addOrReplaceChild("handleft", CubeListBuilder.create().texOffs(0, 28).addBox(-1.0F, -1.0F, -7.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 2.5307F, 0.0F, 0.0F));
		PartDefinition legrightfront = chest.addOrReplaceChild("legrightfront", CubeListBuilder.create().texOffs(7, 5).addBox(-0.5F, 0.0F, -5.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -5.0F, -1.0F, 0.9163F, 0.0F, 0.0F));
		PartDefinition legrightfront2 = legrightfront.addOrReplaceChild("legrightfront2", CubeListBuilder.create().texOffs(7, 0).addBox(-0.5F, 0.0F, -5.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -2.3562F, 0.0F, 0.0F));
		PartDefinition handright = legrightfront2.addOrReplaceChild("handright", CubeListBuilder.create().texOffs(17, 21).addBox(-1.0F, -1.0F, -7.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 2.5307F, 0.0F, 0.0F));
		PartDefinition head = chest.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(28, 21).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 0).addBox(0.25F, -0.75F, -2.25F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 11)
						.addBox(-3.25F, -0.75F, -2.25F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 21).addBox(-6.0F, -8.0F, -1.0F, 12.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition legleftmiddle = partdefinition.addOrReplaceChild("legleftmiddle", CubeListBuilder.create().texOffs(34, 28).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 16.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback", CubeListBuilder.create().texOffs(18, 30).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 16.0F, 2.0F, 0.4363F, 0.0F, -0.5236F));
		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 16.0F, 2.0F, 0.4363F, 0.0F, 0.5236F));
		PartDefinition legrightmiddle = partdefinition.addOrReplaceChild("legrightmiddle", CubeListBuilder.create().texOffs(26, 30).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 16.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		abdomen.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legleftmiddle.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legrightmiddle.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}
}
