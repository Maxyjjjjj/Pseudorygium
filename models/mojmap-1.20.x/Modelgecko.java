// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgecko<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gecko"), "main");
	private final ModelPart body;
	private final ModelPart legleftfront;
	private final ModelPart legrightfront;
	private final ModelPart legleftback;
	private final ModelPart legrightback;

	public Modelgecko(ModelPart root) {
		this.body = root.getChild("body");
		this.legleftfront = root.getChild("legleftfront");
		this.legrightfront = root.getChild("legrightfront");
		this.legleftback = root.getChild("legleftback");
		this.legrightback = root.getChild("legrightback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-2.0F, -1.0F, -4.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(14, 10)
						.addBox(-2.5F, -2.0F, -3.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-1.5F, -1.0F, -5.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -4.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.15F, 0.0F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 4.0F));

		PartDefinition cube_r2 = tail
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront",
				CubeListBuilder.create().texOffs(10, 23)
						.addBox(0.0F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(1.0F, 2.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 22.0F, -2.0F));

		PartDefinition legrightfront = partdefinition.addOrReplaceChild("legrightfront",
				CubeListBuilder.create().texOffs(0, 23)
						.addBox(-3.0F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 16)
						.addBox(-5.0F, 2.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 22.0F, -2.0F));

		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback",
				CubeListBuilder.create().texOffs(20, 21)
						.addBox(0.0F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 4)
						.addBox(1.0F, 2.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 22.0F, 3.0F));

		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback",
				CubeListBuilder.create().texOffs(12, 19)
						.addBox(-3.0F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(-5.0F, 2.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 22.0F, 3.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legrightfront.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleftfront.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleftback.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legrightback.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}