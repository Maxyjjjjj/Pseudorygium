// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbuffalo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "buffalo"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart leg0;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;

	public Modelbuffalo(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.leg0 = root.getChild("leg0");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition
				.addOrReplaceChild("body",
						CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 5.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 28).addBox(
				-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, -8.0F));

		PartDefinition head_r1 = head
				.addOrReplaceChild("head_r1",
						CubeListBuilder.create().texOffs(44, 7).addBox(-15.0F, -21.0F, -13.0F, 4.0F, 1.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 20.0F, 8.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(44, 7).addBox(15.0F, -18.0F, -13.0F, 4.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.0F, 8.0F, 0.0F, 0.0F, -0.9599F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(34, 7).addBox(-3.0F, -22.0F, -13.0F, 4.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.0F, 8.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition head_r4 = head
				.addOrReplaceChild("head_r4",
						CubeListBuilder.create().texOffs(44, 21).addBox(-1.0F, -22.0F, -13.0F, 4.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 20.0F, 8.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5",
				CubeListBuilder.create().texOffs(44, 14).addBox(11.0F, -21.0F, -13.0F, 4.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.0F, 8.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition head_r6 = head
				.addOrReplaceChild("head_r6",
						CubeListBuilder.create().texOffs(44, 14).addBox(-19.0F, -18.0F, -13.0F, 4.0F, 4.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 20.0F, 8.0F, 0.0F, 0.0F, 0.9599F));

		PartDefinition leg0 = partdefinition.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(16, 42).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 12.0F, 7.0F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(0, 42).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 12.0F, 7.0F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(40, 40)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 12.0F, -5.0F));

		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(28, 28).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 12.0F, -5.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leg0.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}