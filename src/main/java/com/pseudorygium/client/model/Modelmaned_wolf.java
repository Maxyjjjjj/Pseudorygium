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

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmaned_wolf<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pseudorygium", "modelmaned_wolf"), "main");
	public final ModelPart neck;
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart upperBody;
	public final ModelPart leg0;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart tail;

	public Modelmaned_wolf(ModelPart root) {
		this.neck = root.getChild("neck");
		this.head = this.neck.getChild("head");
		this.body = root.getChild("body");
		this.upperBody = root.getChild("upperBody");
		this.leg0 = root.getChild("leg0");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition neck = partdefinition.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, 9.5F, -6.0F));
		PartDefinition neck_r1 = neck.addOrReplaceChild("neck_r1",
				CubeListBuilder.create().texOffs(23, 0).addBox(-1.5F, -5.0F, -1.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.025F)).texOffs(20, 24).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(24, 13).addBox(-3.0F, -2.0F, -4.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 3).addBox(-3.0F, -4.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.0F, -4.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(-1.5F, 0.9844F, -7.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, -1.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 13).addBox(-4.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 11.0F, 2.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition upperBody = partdefinition.addOrReplaceChild("upperBody",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 2.0F, -4.0F, 8.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(36, 23).addBox(-1.5F, 2.0F, -6.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition leg0 = partdefinition.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 14.0F, 7.0F));
		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(30, 32).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 14.0F, 7.0F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(22, 32).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 14.0F, -4.0F));
		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(14, 30).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 14.0F, -4.0F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(38, 31).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, 8.0F, 0.9599F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		upperBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leg0.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leg0.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.neck.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.neck.xRot = headPitch / (180F / (float) Math.PI);
	}
}
