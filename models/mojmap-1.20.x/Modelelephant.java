// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelelephant<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "elephant"), "main");
	private final ModelPart body;
	private final ModelPart legleftfront;
	private final ModelPart legrightfront;
	private final ModelPart legrightback;
	private final ModelPart legleftback;

	public Modelelephant(ModelPart root) {
		this.body = root.getChild("body");
		this.legleftfront = root.getChild("legleftfront");
		this.legrightfront = root.getChild("legrightfront");
		this.legrightback = root.getChild("legrightback");
		this.legleftback = root.getChild("legleftback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-10.0F, -11.0F, -17.0F, 20.0F, 22.0F, 34.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 56).addBox(-7.0F,
				-8.0F, -12.0F, 14.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, -17.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(102, 0)
						.addBox(-6.5F, 8.0F, 22.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 100)
						.addBox(2.5F, 8.0F, 22.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(28, 84)
						.addBox(2.5F, 11.0F, -5.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 83)
						.addBox(-6.5F, 11.0F, -5.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition earleft = head.addOrReplaceChild("earleft", CubeListBuilder.create().texOffs(-2, 82)
				.addBox(-3.0F, -6.0F, 0.0F, 14.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, -3.0F, -5.0F));

		PartDefinition earright = head.addOrReplaceChild("earright", CubeListBuilder.create().texOffs(78, 54)
				.addBox(-13.0F, -6.0F, 0.0F, 14.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, -3.0F, -5.0F));

		PartDefinition trunksegment1 = head.addOrReplaceChild("trunksegment1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 4.0F, -12.0F));

		PartDefinition cube_r3 = trunksegment1
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(93, 99).addBox(-3.0F, -1.0F, -2.0F, 6.0F, 7.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition trunksegment2 = trunksegment1.addOrReplaceChild("trunksegment2", CubeListBuilder.create()
				.texOffs(98, 87).addBox(-3.0F, -1.0F, -4.0F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition trunksegment3 = trunksegment2.addOrReplaceChild("trunksegment3", CubeListBuilder.create()
				.texOffs(98, 75).addBox(-3.0F, -1.0F, -4.0F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition trunksegment4 = trunksegment3.addOrReplaceChild("trunksegment4", CubeListBuilder.create()
				.texOffs(97, 22).addBox(-3.0F, -1.0F, -4.0F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront", CubeListBuilder.create()
				.texOffs(78, 0).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.0F, 3.0F, -13.0F));

		PartDefinition legrightfront = partdefinition.addOrReplaceChild("legrightfront", CubeListBuilder.create()
				.texOffs(74, 77).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, 3.0F, -13.0F));

		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback", CubeListBuilder.create()
				.texOffs(56, 56).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, 3.0F, 13.0F));

		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.0F, 3.0F, 13.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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