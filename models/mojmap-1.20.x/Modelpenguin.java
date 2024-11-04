// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpenguin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "penguin"), "main");
	private final ModelPart body;
	private final ModelPart legleft;
	private final ModelPart legleft2;

	public Modelpenguin(ModelPart root) {
		this.body = root.getChild("body");
		this.legleft = root.getChild("legleft");
		this.legleft2 = root.getChild("legleft2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -3.5F, 8.0F, 16.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 23)
						.addBox(-3.0F, -6.0F, -4.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 15)
						.addBox(-1.0F, -4.0F, -10.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.0F, 1.0F));

		PartDefinition tail = body
				.addOrReplaceChild("tail",
						CubeListBuilder.create().texOffs(34, 23).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 2.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 7.0F, 3.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition wingleft = body.addOrReplaceChild("wingleft", CubeListBuilder.create().texOffs(30, 0).addBox(
				0.0F, 0.0F, -1.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -7.0F, 0.0F));

		PartDefinition wingright = body.addOrReplaceChild("wingright", CubeListBuilder.create().texOffs(24, 23).addBox(
				-1.0F, 0.0F, -1.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -7.0F, 0.0F));

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(0, 35)
				.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 22.0F, 0.0F));

		PartDefinition legleft2 = partdefinition.addOrReplaceChild("legleft2", CubeListBuilder.create().texOffs(29, 33)
				.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 22.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legleft2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}