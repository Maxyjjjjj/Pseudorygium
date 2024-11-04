// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsloth<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sloth"), "main");
	private final ModelPart body;
	private final ModelPart armleft;
	private final ModelPart legleft;
	private final ModelPart armright;
	private final ModelPart legright;

	public Modelsloth(ModelPart root) {
		this.body = root.getChild("body");
		this.armleft = root.getChild("armleft");
		this.legleft = root.getChild("legleft");
		this.armright = root.getChild("armright");
		this.legright = root.getChild("legright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-6.0F, -3.0F, -7.0F, 12.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 20).addBox(-5.0F,
				-4.0F, -6.0F, 10.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -7.0F));

		PartDefinition armleft = partdefinition.addOrReplaceChild("armleft",
				CubeListBuilder.create().texOffs(20, 35)
						.addBox(0.0F, -2.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 37)
						.addBox(8.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 24.0F, -4.0F));

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft",
				CubeListBuilder.create().texOffs(0, 33)
						.addBox(0.0F, -2.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(8.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 24.0F, 4.0F));

		PartDefinition armright = partdefinition.addOrReplaceChild("armright",
				CubeListBuilder.create().texOffs(28, 29)
						.addBox(-8.0F, -2.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 6)
						.addBox(-12.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 24.0F, -4.0F));

		PartDefinition legright = partdefinition.addOrReplaceChild("legright",
				CubeListBuilder.create().texOffs(26, 20)
						.addBox(-8.0F, -2.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(-12.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 24.0F, 4.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.armright.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legright.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.armleft.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleft.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}