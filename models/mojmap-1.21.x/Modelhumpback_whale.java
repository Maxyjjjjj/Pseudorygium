// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhumpback_whale<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "humpback_whale"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart lower;
	private final ModelPart tail0;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart arm0;
	private final ModelPart arm1;

	public Modelhumpback_whale(ModelPart root) {
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.lower = this.head.getChild("lower");
		this.tail0 = this.body.getChild("tail0");
		this.tail1 = this.tail0.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.arm0 = this.body.getChild("arm0");
		this.arm1 = this.body.getChild("arm1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-13.0F, -18.0F, -48.0F, 26.0F, 39.0F, 81.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-9.0F, -13.0F, -13.0F, 18.0F, 17.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(133, 0)
						.addBox(-9.0F, -13.0F, -57.0F, 18.0F, 11.0F, 44.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.0F, -48.0F));

		PartDefinition lower = head.addOrReplaceChild("lower",
				CubeListBuilder.create().texOffs(148, 191)
						.addBox(-9.0F, -5.75F, -24.0F, 18.0F, 18.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(178, 120)
						.addBox(-9.0F, -5.75F, -57.0F, 18.0F, 11.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.75F, 0.0F));

		PartDefinition tail0 = body.addOrReplaceChild("tail0",
				CubeListBuilder.create().texOffs(98, 120)
						.addBox(-9.0F, -12.0F, 0.0F, 18.0F, 27.0F, 44.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-2.0F, -20.0F, -9.0F, 4.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.0F, 33.0F));

		PartDefinition tail1 = tail0.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 120).addBox(-6.0F,
				-8.0F, 0.0F, 12.0F, 16.0F, 74.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 44.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(133, 55).addBox(-25.0F,
				-3.0F, 0.0F, 48.0F, 5.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 69.0F));

		PartDefinition arm0 = body.addOrReplaceChild("arm0",
				CubeListBuilder.create().texOffs(304, 67).addBox(-2.0F, -1.0F, -5.0F, 3.0F, 32.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, 12.0F, -36.0F, 0.5672F, 0.0F, 0.5672F));

		PartDefinition arm1 = body.addOrReplaceChild("arm1",
				CubeListBuilder.create().texOffs(304, 67).mirror()
						.addBox(-1.0F, -1.0F, -5.0F, 3.0F, 32.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(12.0F, 12.0F, -36.0F, 0.5672F, 0.0F, -0.5672F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.tail0.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.tail1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.tail2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}