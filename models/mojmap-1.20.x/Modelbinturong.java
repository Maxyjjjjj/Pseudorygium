// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbinturong<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "binturong"), "main");
	private final ModelPart body;
	private final ModelPart pawleft;
	private final ModelPart pawright;
	private final ModelPart legright;
	private final ModelPart legleft;

	public Modelbinturong(ModelPart root) {
		this.body = root.getChild("body");
		this.pawleft = root.getChild("pawleft");
		this.pawright = root.getChild("pawright");
		this.legright = root.getChild("legright");
		this.legleft = root.getChild("legleft");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(32, 0)
						.addBox(-3.0F, -3.0F, -4.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-2.0F, 0.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 10)
						.addBox(3.0F, -3.0F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 24)
						.addBox(-5.0F, -3.0F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, -8.0F));

		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(21, 27).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 8.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition tail2 = tail
				.addOrReplaceChild("tail2",
						CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 3.0F, 13.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.0F, 13.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition pawleft = partdefinition.addOrReplaceChild("pawleft", CubeListBuilder.create().texOffs(21, 24)
				.addBox(-2.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 19.0F, -5.0F));

		PartDefinition pawright = partdefinition.addOrReplaceChild("pawright", CubeListBuilder.create().texOffs(0, 24)
				.addBox(-2.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 19.0F, -5.0F));

		PartDefinition legright = partdefinition.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(0, 8)
				.addBox(-2.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 19.0F, 6.0F));

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-2.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 19.0F, 6.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legright.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.pawleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}