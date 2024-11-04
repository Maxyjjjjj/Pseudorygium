// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelproboscis_monkey<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "proboscis_monkey"), "main");
	private final ModelPart body;
	private final ModelPart armleft;
	private final ModelPart armright;
	private final ModelPart legleft;
	private final ModelPart legleft2;

	public Modelproboscis_monkey(ModelPart root) {
		this.body = root.getChild("body");
		this.armleft = root.getChild("armleft");
		this.armright = root.getChild("armright");
		this.legleft = root.getChild("legleft");
		this.legleft2 = root.getChild("legleft2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 14.0F, 0.0F));

		PartDefinition cube_r1 = body
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -3.0F, 8.0F, 14.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 20)
						.addBox(-3.0F, -6.0F, -4.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 14)
						.addBox(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -7.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, -2.0F, 7.0F));

		PartDefinition cube_r2 = tail
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(12, 34).addBox(-1.0F, -14.0F, 0.0F, 2.0F, 14.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.1817F, 0.0F, 0.0F));

		PartDefinition armleft = partdefinition.addOrReplaceChild("armleft", CubeListBuilder.create().texOffs(24, 30)
				.addBox(-2.5F, -1.0F, -1.5F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 15.0F, -5.0F));

		PartDefinition armright = partdefinition.addOrReplaceChild("armright", CubeListBuilder.create().texOffs(0, 34)
				.addBox(-0.5F, -1.0F, -1.5F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 15.0F, -5.0F));

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(28, 0)
				.addBox(-1.5F, -3.0F, -2.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 17.0F, 4.0F));

		PartDefinition legleft2 = partdefinition.addOrReplaceChild("legleft2", CubeListBuilder.create().texOffs(24, 16)
				.addBox(-0.5F, -3.0F, -2.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 17.0F, 4.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.armright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.armleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleft2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}