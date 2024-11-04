// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsea_otter<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sea_otter"), "main");
	private final ModelPart body;
	private final ModelPart lefleftfront;
	private final ModelPart lefrightfront;
	private final ModelPart lefrightback;
	private final ModelPart lefleftback;

	public Modelsea_otter(ModelPart root) {
		this.body = root.getChild("body");
		this.lefleftfront = root.getChild("lefleftfront");
		this.lefrightfront = root.getChild("lefrightfront");
		this.lefrightback = root.getChild("lefrightback");
		this.lefleftback = root.getChild("lefleftback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.5F, -5.0F, -7.0F, 7.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -1.8478F, -0.7654F, 2.0F, 2.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 7.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(15, 20)
						.addBox(-2.5F, -3.0F, -5.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-1.5F, -1.0F, -6.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, -7.0F));

		PartDefinition lefleftfront = partdefinition.addOrReplaceChild("lefleftfront", CubeListBuilder.create()
				.texOffs(28, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 20.0F, -5.0F));

		PartDefinition lefrightfront = partdefinition.addOrReplaceChild("lefrightfront", CubeListBuilder.create()
				.texOffs(0, 20).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 20.0F, -5.0F));

		PartDefinition lefrightback = partdefinition.addOrReplaceChild("lefrightback", CubeListBuilder.create()
				.texOffs(0, 6).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 20.0F, 6.0F));

		PartDefinition lefleftback = partdefinition.addOrReplaceChild("lefleftback", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 20.0F, 6.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lefleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lefrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lefrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lefleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.lefleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.lefrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.lefleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.lefrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}