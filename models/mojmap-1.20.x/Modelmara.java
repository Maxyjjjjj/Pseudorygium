// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmara<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mara"), "main");
	private final ModelPart body;
	private final ModelPart legleftfront;
	private final ModelPart legrightfront;
	private final ModelPart legrightfront2;
	private final ModelPart legrightfront3;

	public Modelmara(ModelPart root) {
		this.body = root.getChild("body");
		this.legleftfront = root.getChild("legleftfront");
		this.legrightfront = root.getChild("legrightfront");
		this.legrightfront2 = root.getChild("legrightfront2");
		this.legrightfront3 = root.getChild("legrightfront3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition
				.addOrReplaceChild("body",
						CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, -5.0F, 5.0F, 6.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 15.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-2.0F, -4.0F, -4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-2.0F, -3.0F, -6.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 6).addBox(-0.75F, -6.0F, -2.0F, 0.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r2 = head
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(4, 6).addBox(0.75F, -6.0F, -2.0F, 0.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront", CubeListBuilder.create()
				.texOffs(12, 24).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.25F, 19.0F, -3.0F));

		PartDefinition legrightfront = partdefinition.addOrReplaceChild("legrightfront", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.25F, 19.0F, -3.0F));

		PartDefinition legrightfront2 = partdefinition.addOrReplaceChild("legrightfront2",
				CubeListBuilder.create().texOffs(28, 14)
						.addBox(-1.0F, 3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
						.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.25F, 17.0F, 5.0F));

		PartDefinition legrightfront3 = partdefinition.addOrReplaceChild("legrightfront3",
				CubeListBuilder.create().texOffs(20, 24)
						.addBox(-1.0F, 3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 16)
						.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.25F, 17.0F, 5.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legrightfront2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legrightfront3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legrightfront2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legrightfront3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}