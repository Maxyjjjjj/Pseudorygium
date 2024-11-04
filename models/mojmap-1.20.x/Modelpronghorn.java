// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpronghorn<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pronghorn"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart earleft;
	private final ModelPart earleft2;
	private final ModelPart legleftfront;
	private final ModelPart legrightfront;
	private final ModelPart legleftback;
	private final ModelPart legrightback;

	public Modelpronghorn(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.earleft = root.getChild("earleft");
		this.earleft2 = root.getChild("earleft2");
		this.legleftfront = root.getChild("legleftfront");
		this.legrightfront = root.getChild("legrightfront");
		this.legleftback = root.getChild("legleftback");
		this.legrightback = root.getChild("legrightback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-2.0F, -3.0F, -5.0F, 6.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 13.0F, -1.0F));

		PartDefinition cube_r1 = body
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(28, 19).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, -2.0F, 8.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 19)
						.addBox(-2.0F, -10.0F, -3.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-2.0F, -9.0F, -6.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 19)
						.addBox(1.0F, -15.0F, -1.0F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(13, 14)
						.addBox(-1.0F, -15.0F, -1.0F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.5F, -8.0F, -2.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0F, -3.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition earleft = head.addOrReplaceChild("earleft", CubeListBuilder.create().texOffs(25, 9).addBox(0.0F,
				-1.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -10.0F, 1.0F));

		PartDefinition earleft2 = head.addOrReplaceChild("earleft2", CubeListBuilder.create().texOffs(25, 6).addBox(
				-4.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -10.0F, 1.0F));

		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront", CubeListBuilder.create()
				.texOffs(16, 29).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 16.0F, -4.5F));

		PartDefinition legrightfront = partdefinition.addOrReplaceChild("legrightfront", CubeListBuilder.create()
				.texOffs(8, 28).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 16.0F, -4.5F));

		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback", CubeListBuilder.create()
				.texOffs(0, 28).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 16.0F, 5.5F));

		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback", CubeListBuilder.create()
				.texOffs(26, 27).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 16.0F, 5.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.legrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}