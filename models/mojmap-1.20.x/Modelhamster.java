// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhamster<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hamster"), "main");
	private final ModelPart body;
	private final ModelPart pawleftfront;
	private final ModelPart pawrightfront;
	private final ModelPart pawrightback;
	private final ModelPart pawleftback;

	public Modelhamster(ModelPart root) {
		this.body = root.getChild("body");
		this.pawleftfront = root.getChild("pawleftfront");
		this.pawrightfront = root.getChild("pawrightfront");
		this.pawrightback = root.getChild("pawrightback");
		this.pawleftback = root.getChild("pawleftback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 10)
						.addBox(-2.5F, -3.0F, -3.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 10)
						.addBox(2.5F, -1.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-4.5F, -1.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 18)
						.addBox(1.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 10)
						.addBox(-2.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition pawleftfront = partdefinition.addOrReplaceChild("pawleftfront", CubeListBuilder.create()
				.texOffs(0, 18).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 22.0F, -2.0F));

		PartDefinition pawrightfront = partdefinition.addOrReplaceChild("pawrightfront", CubeListBuilder.create()
				.texOffs(16, 15).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 22.0F, -2.0F));

		PartDefinition pawrightback = partdefinition.addOrReplaceChild("pawrightback", CubeListBuilder.create()
				.texOffs(0, 3).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 22.0F, 2.0F));

		PartDefinition pawleftback = partdefinition.addOrReplaceChild("pawleftback", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 22.0F, 2.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.pawleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.pawrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}