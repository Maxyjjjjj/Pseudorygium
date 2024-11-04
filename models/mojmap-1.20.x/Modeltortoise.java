// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltortoise<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tortoise"), "main");
	private final ModelPart body;
	private final ModelPart legleftfront;
	private final ModelPart legleftback;
	private final ModelPart legrightback;
	private final ModelPart legrighttfront;

	public Modeltortoise(ModelPart root) {
		this.body = root.getChild("body");
		this.legleftfront = root.getChild("legleftfront");
		this.legleftback = root.getChild("legleftback");
		this.legrightback = root.getChild("legrightback");
		this.legrighttfront = root.getChild("legrighttfront");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-5.0F, 0.0F, -8.0F, 10.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 8.0F, -7.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r1 = neck.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 1.0F, -4.0F, 4.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -8.0F, 1.3963F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(43, 0)
						.addBox(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(23, 29)
						.addBox(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -8.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw",
				CubeListBuilder.create().texOffs(0, 26)
						.addBox(-3.5F, 0.0F, -8.0F, 7.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(32, 41)
						.addBox(-3.5F, 0.0F, -8.0F, 7.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 1.0F));

		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.0F, 19.0F, -5.0F, 0.0F, 0.0F, 1.0036F));

		PartDefinition cube_r2 = legleftfront
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(52, 9).addBox(-3.0F, -3.0F, -2.0F, 4.0F, 8.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0036F));

		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.0F, 19.0F, 6.0F, 0.0F, 0.0F, 0.9599F));

		PartDefinition cube_r3 = legleftback
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(18, 50).addBox(-3.0F, -3.0F, -4.0F, 4.0F, 8.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0036F));

		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.0F, 18.0F, 6.0F, 0.0F, 0.0F, -1.0036F));

		PartDefinition cube_r4 = legrightback
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(0, 50).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 8.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0036F));

		PartDefinition legrighttfront = partdefinition.addOrReplaceChild("legrighttfront", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.0F, 18.0F, -5.0F, 0.0F, 0.0F, -1.0036F));

		PartDefinition cube_r5 = legrighttfront
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(36, 50).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 8.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0036F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legrighttfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legrightback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legrighttfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}