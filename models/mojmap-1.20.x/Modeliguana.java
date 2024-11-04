// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeliguana<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "iguana"), "main");
	private final ModelPart body;
	private final ModelPart legleftfront;
	private final ModelPart legrightfront;
	private final ModelPart legrightback;
	private final ModelPart legleftback;

	public Modeliguana(ModelPart root) {
		this.body = root.getChild("body");
		this.legleftfront = root.getChild("legleftfront");
		this.legrightfront = root.getChild("legrightfront");
		this.legrightback = root.getChild("legrightback");
		this.legleftback = root.getChild("legleftback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -4.0F, -5.0F, 8.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(0.0F, -8.0F, -5.0F, 0.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(19, 20)
						.addBox(-3.5F, -2.0F, -10.0F, 7.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(0.0F, -5.0F, -10.0F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-5.0F, 0.0F, -5.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 26)
						.addBox(0.0F, 3.0F, -9.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.0F, -4.0F));

		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 27)
						.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 9.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2",
				CubeListBuilder.create().texOffs(0, 5)
						.addBox(0.0F, -5.0F, 0.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(31, 34)
						.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 7.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3",
				CubeListBuilder.create().texOffs(30, 1)
						.addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(0.0F, -4.0F, 0.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront", CubeListBuilder.create()
				.texOffs(24, 44).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 18.0F, -2.0F));

		PartDefinition legrightfront = partdefinition.addOrReplaceChild("legrightfront", CubeListBuilder.create()
				.texOffs(42, 16).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 18.0F, -2.0F));

		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback", CubeListBuilder.create()
				.texOffs(14, 38).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 18.0F, 8.0F));

		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback", CubeListBuilder.create()
				.texOffs(0, 38).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 18.0F, 8.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}