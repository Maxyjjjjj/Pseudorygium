// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmarsupial_lion<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "marsupial_lion"), "main");
	private final ModelPart body;
	private final ModelPart pawleftfront;
	private final ModelPart pawrightfront;
	private final ModelPart pawleftback;
	private final ModelPart pawrightback;

	public Modelmarsupial_lion(ModelPart root) {
		this.body = root.getChild("body");
		this.pawleftfront = root.getChild("pawleftfront");
		this.pawrightfront = root.getChild("pawrightfront");
		this.pawleftback = root.getChild("pawleftback");
		this.pawrightback = root.getChild("pawrightback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.0F, -5.0F, -9.0F, 10.0F, 10.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(32, 28)
						.addBox(-4.0F, -6.0F, -6.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(2.0F, -8.0F, -2.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(-5.0F, -8.0F, -2.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-3.0F, -2.0F, -8.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -9.0F));

		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 28).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, 9.0F, -1.0036F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2",
				CubeListBuilder.create().texOffs(6, 48).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 3.0F, 13.0F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 12.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition pawleftfront = partdefinition.addOrReplaceChild("pawleftfront", CubeListBuilder.create()
				.texOffs(0, 44).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 16.0F, -6.0F));

		PartDefinition pawrightfront = partdefinition.addOrReplaceChild("pawrightfront", CubeListBuilder.create()
				.texOffs(28, 42).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 16.0F, -6.0F));

		PartDefinition pawleftback = partdefinition.addOrReplaceChild("pawleftback", CubeListBuilder.create()
				.texOffs(38, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 16.0F, 8.0F));

		PartDefinition pawrightback = partdefinition.addOrReplaceChild("pawrightback", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 16.0F, 8.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.pawleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.pawrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}