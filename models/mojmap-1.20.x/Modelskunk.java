// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelskunk<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "skunk"), "main");
	private final ModelPart body;
	private final ModelPart pawleft;
	private final ModelPart legleft;
	private final ModelPart legright;
	private final ModelPart pawright;

	public Modelskunk(ModelPart root) {
		this.body = root.getChild("body");
		this.pawleft = root.getChild("pawleft");
		this.legleft = root.getChild("legleft");
		this.legright = root.getChild("legright");
		this.pawright = root.getChild("pawright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition
				.addOrReplaceChild("body",
						CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, -5.0F, 6.0F, 5.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 16.5F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(22, 0)
						.addBox(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 21)
						.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(2.0F, -2.25F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 7)
						.addBox(-4.0F, -2.25F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -5.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 15)
						.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(19, 19)
						.addBox(-2.0F, 4.0F, 0.0F, 4.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 5.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition pawleft = partdefinition.addOrReplaceChild("pawleft", CubeListBuilder.create().texOffs(0, 30)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 20.0F, -3.0F));

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(0, 15)
				.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 19.0F, 4.0F));

		PartDefinition legright = partdefinition.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 19.0F, 4.0F));

		PartDefinition pawright = partdefinition.addOrReplaceChild("pawright", CubeListBuilder.create().texOffs(19, 15)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 20.0F, -3.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legright.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.pawleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}