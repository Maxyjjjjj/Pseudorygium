// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsaiga<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "saiga"), "main");
	private final ModelPart body;
	private final ModelPart legleftfront;
	private final ModelPart legrightfront;
	private final ModelPart legleftback;
	private final ModelPart legleftback2;

	public Modelsaiga(ModelPart root) {
		this.body = root.getChild("body");
		this.legleftfront = root.getChild("legleftfront");
		this.legrightfront = root.getChild("legrightfront");
		this.legleftback = root.getChild("legleftback");
		this.legleftback2 = root.getChild("legleftback2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.0F, -5.0F, -9.0F, 10.0F, 10.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 11.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -9.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 28).addBox(-3.0F, -3.0F, -7.0F, 6.0F, 5.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(21, 28)
						.addBox(0.5F, -2.0F, 1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(32, 30)
						.addBox(-2.5F, -2.0F, 1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition earleft = head.addOrReplaceChild("earleft", CubeListBuilder.create().texOffs(38, 14).addBox(0.0F,
				-2.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -2.0F, 1.0F));

		PartDefinition earleft2 = head.addOrReplaceChild("earleft2", CubeListBuilder.create().texOffs(0, 15).addBox(
				-4.0F, -2.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -2.0F, 1.0F));

		PartDefinition snout = head.addOrReplaceChild("snout",
				CubeListBuilder.create().texOffs(12, 42).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail = body
				.addOrReplaceChild("tail",
						CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -5.0F, 9.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront", CubeListBuilder.create()
				.texOffs(0, 42).addBox(-1.0F, 0.0F, -3.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 13.0F, -5.5F));

		PartDefinition legrightfront = partdefinition.addOrReplaceChild("legrightfront", CubeListBuilder.create()
				.texOffs(39, 39).addBox(-1.0F, 0.0F, -3.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 13.0F, -5.5F));

		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback", CubeListBuilder.create()
				.texOffs(27, 39).addBox(-1.0F, 0.0F, -3.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 13.0F, 8.5F));

		PartDefinition legleftback2 = partdefinition.addOrReplaceChild("legleftback2", CubeListBuilder.create()
				.texOffs(38, 0).addBox(-1.0F, 0.0F, -3.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 13.0F, 8.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleftback2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleftback2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}