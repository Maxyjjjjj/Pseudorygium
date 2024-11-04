// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbaboon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "baboon"), "main");
	private final ModelPart body;
	private final ModelPart armleft;
	private final ModelPart armright;
	private final ModelPart legleft;
	private final ModelPart legright;

	public Modelbaboon(ModelPart root) {
		this.body = root.getChild("body");
		this.armleft = root.getChild("armleft");
		this.armright = root.getChild("armright");
		this.legleft = root.getChild("legleft");
		this.legright = root.getChild("legright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.0F, -3.0F, -5.0F, 6.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-2.0F, -3.0F, -3.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -2.0F, -6.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 6)
						.addBox(1.75F, -2.75F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-2.75F, -2.75F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(1.0F, -4.0F, -1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 16)
						.addBox(-4.0F, -4.0F, -1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -5.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(28, 16)
						.addBox(-0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 26)
						.addBox(-0.5F, -7.0F, 0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 4.5F, -0.4363F, 0.0F, 0.0F));

		PartDefinition armleft = partdefinition.addOrReplaceChild("armleft", CubeListBuilder.create().texOffs(8, 28)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 19.0F, -3.5F));

		PartDefinition armright = partdefinition.addOrReplaceChild("armright", CubeListBuilder.create().texOffs(0, 24)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 19.0F, -3.5F));

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(22, 23)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 19.0F, 3.5F));

		PartDefinition legright = partdefinition.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(14, 23)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 19.0F, 3.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.armright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legright.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.armleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}