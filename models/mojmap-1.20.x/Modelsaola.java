// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsaola<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "saola"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart tail;
	private final ModelPart legleftfront;
	private final ModelPart legrightfront;
	private final ModelPart legrightback;
	private final ModelPart legleftback;

	public Modelsaola(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.tail = root.getChild("tail");
		this.legleftfront = root.getChild("legleftfront");
		this.legrightfront = root.getChild("legrightfront");
		this.legrightback = root.getChild("legrightback");
		this.legleftback = root.getChild("legleftback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -3.0F, -7.0F, 8.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(12, 32)
						.addBox(-1.5F, -6.0F, -1.75F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-2.0F, -9.75F, -3.75F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(11, 22)
						.addBox(-1.5F, -9.75F, -6.75F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 24)
						.addBox(1.5F, -10.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 22)
						.addBox(-3.5F, -10.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -5.25F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 22)
						.addBox(-1.5F, -3.75F, 1.75F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(20, 22)
						.addBox(0.5F, -3.75F, 1.75F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 7.0F));

		PartDefinition cube_r2 = tail
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront", CubeListBuilder.create()
				.texOffs(38, 29).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 15.0F, -5.0F));

		PartDefinition legrightfront = partdefinition.addOrReplaceChild("legrightfront", CubeListBuilder.create()
				.texOffs(26, 32).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 15.0F, -5.0F));

		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback", CubeListBuilder.create()
				.texOffs(0, 32).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 15.0F, 6.0F));

		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 15.0F, 6.0F));

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
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.legrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}