// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelkomodo_dragon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "komodo_dragon"), "main");
	private final ModelPart body;
	private final ModelPart legleftfront;
	private final ModelPart legrightfront;
	private final ModelPart legrightback;
	private final ModelPart legleftback;

	public Modelkomodo_dragon(ModelPart root) {
		this.body = root.getChild("body");
		this.legleftfront = root.getChild("legleftfront");
		this.legrightfront = root.getChild("legrightfront");
		this.legrightback = root.getChild("legrightback");
		this.legleftback = root.getChild("legleftback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 22)
						.addBox(-4.0F, -4.0F, -5.0F, 8.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(40, 38)
						.addBox(-4.0F, -4.0F, -9.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(26, 0).addBox(-3.5F, -2.0F, -9.0F, 7.0F, 3.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -8.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(30, 22).addBox(-3.0F, 0.0F,
				-9.0F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition tongue = jaw.addOrReplaceChild("tongue",
				CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, 0.0F, -6.0F, 3.0F, 0.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 18.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 9.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront", CubeListBuilder.create()
				.texOffs(14, 42).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 18.0F, -2.0F));

		PartDefinition legrightfront = partdefinition.addOrReplaceChild("legrightfront", CubeListBuilder.create()
				.texOffs(0, 42).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 18.0F, -2.0F));

		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback", CubeListBuilder.create()
				.texOffs(0, 22).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 18.0F, 8.0F));

		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 18.0F, 8.0F));

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
		this.legrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}