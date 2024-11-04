// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelserval<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "serval"), "main");
	private final ModelPart body;
	private final ModelPart pawleftfront;
	private final ModelPart pawleftback;
	private final ModelPart pawrightback;
	private final ModelPart pawrightfront;

	public Modelserval(ModelPart root) {
		this.body = root.getChild("body");
		this.pawleftfront = root.getChild("pawleftfront");
		this.pawleftback = root.getChild("pawleftback");
		this.pawrightback = root.getChild("pawrightback");
		this.pawrightfront = root.getChild("pawrightfront");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.5F, -3.5F, -7.0F, 7.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 24)
						.addBox(-4.0F, -4.0F, -6.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-2.5F, -1.0F, -8.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 24)
						.addBox(2.5F, 0.0F, -7.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-5.5F, 0.0F, -7.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, -7.0F));

		PartDefinition cube_r1 = head
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -9.0F, -2.0F, 5.0F, 7.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r2 = head
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 8).addBox(0.0F, -9.0F, -2.0F, 5.0F, 7.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(19, 27).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 9.0F, -1.0036F, 0.0F, 0.0F));

		PartDefinition pawleftfront = partdefinition.addOrReplaceChild("pawleftfront", CubeListBuilder.create()
				.texOffs(38, 35).addBox(-1.5F, -3.0F, -2.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 11.0F, -4.0F));

		PartDefinition pawleftback = partdefinition.addOrReplaceChild("pawleftback", CubeListBuilder.create()
				.texOffs(12, 38).addBox(-1.5F, -3.0F, -2.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 11.0F, 8.0F));

		PartDefinition pawrightback = partdefinition.addOrReplaceChild("pawrightback", CubeListBuilder.create()
				.texOffs(0, 36).addBox(-1.5F, -3.0F, -2.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 11.0F, 8.0F));

		PartDefinition pawrightfront = partdefinition.addOrReplaceChild("pawrightfront", CubeListBuilder.create()
				.texOffs(24, 38).addBox(-1.5F, -3.0F, -2.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 11.0F, -4.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.pawleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.pawrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.pawrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}