// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbongo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bongo"), "main");
	private final ModelPart body;
	private final ModelPart legleftftont;
	private final ModelPart legrightftont;
	private final ModelPart legleftback;
	private final ModelPart legrightback;

	public Modelbongo(ModelPart root) {
		this.body = root.getChild("body");
		this.legleftftont = root.getChild("legleftftont");
		this.legrightftont = root.getChild("legrightftont");
		this.legleftback = root.getChild("legleftback");
		this.legrightback = root.getChild("legrightback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.5F, -6.0F, -10.0F, 9.0F, 10.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck",
				CubeListBuilder.create().texOffs(20, 47).addBox(-2.5F, -5.0F, -8.0F, 5.0F, 6.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -10.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 56)
				.addBox(-3.0F, -4.0F, -5.0F, 6.0F, 6.0F, 7.0F, new CubeDeformation(0.025F)).texOffs(56, 26)
				.addBox(-2.0F, -2.0F, -9.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 51)
				.addBox(3.0F, -4.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 51).mirror()
				.addBox(-7.0F, -4.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.0F, -8.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(62, 60).mirror()
						.addBox(-3.0F, -12.0F, -3.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(62, 60).addBox(0.0F, -12.0F, -3.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition legleftftont = partdefinition.addOrReplaceChild("legleftftont", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-3.0F, 0.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 9.0F, -7.0F));

		PartDefinition legrightftont = partdefinition.addOrReplaceChild("legrightftont",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-3.0F, 0.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 9.0F, -7.0F));

		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback", CubeListBuilder.create()
				.texOffs(46, 60).addBox(-3.0F, 0.0F, -2.0F, 4.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.5F, 7.0F, 6.0F));

		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback",
				CubeListBuilder.create().texOffs(46, 60).mirror()
						.addBox(-3.0F, 0.0F, -2.0F, 4.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.5F, 7.0F, 6.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleftftont.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legrightftont.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legrightftont.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleftftont.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}