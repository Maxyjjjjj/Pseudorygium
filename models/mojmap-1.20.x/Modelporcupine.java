// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelporcupine<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "porcupine"), "main");
	private final ModelPart body;
	private final ModelPart legleftfront;
	private final ModelPart legleftback;
	private final ModelPart legrightfront;
	private final ModelPart legrightback;

	public Modelporcupine(ModelPart root) {
		this.body = root.getChild("body");
		this.legleftfront = root.getChild("legleftfront");
		this.legleftback = root.getChild("legleftback");
		this.legrightfront = root.getChild("legrightfront");
		this.legrightback = root.getChild("legrightback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -6.0F, -5.0F, 8.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(21, 30)
						.addBox(-3.0F, -5.0F, -5.0F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -3.0F, -6.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-1.0F, -1.0F, -6.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -4.0F));

		PartDefinition quills0 = body.addOrReplaceChild("quills0",
				CubeListBuilder.create().texOffs(0, 16).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 0.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, -4.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition quills1 = body.addOrReplaceChild("quills1",
				CubeListBuilder.create().texOffs(0, 16).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 0.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, -3.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition quills2 = body.addOrReplaceChild("quills2",
				CubeListBuilder.create().texOffs(0, 16).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 0.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, -2.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition quills3 = body.addOrReplaceChild("quills3",
				CubeListBuilder.create().texOffs(0, 16).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 0.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, -1.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition quills4 = body
				.addOrReplaceChild("quills4",
						CubeListBuilder.create().texOffs(0, 16).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 0.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition quills5 = body
				.addOrReplaceChild("quills5",
						CubeListBuilder.create().texOffs(0, 16).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 0.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -6.0F, 1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition quills6 = body
				.addOrReplaceChild("quills6",
						CubeListBuilder.create().texOffs(0, 16).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 0.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -6.0F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition quills7 = body
				.addOrReplaceChild("quills7",
						CubeListBuilder.create().texOffs(0, 16).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 0.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -6.0F, 3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition quills8 = body
				.addOrReplaceChild("quills8",
						CubeListBuilder.create().texOffs(0, 16).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 0.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -6.0F, 4.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition legleftfront = partdefinition.addOrReplaceChild("legleftfront", CubeListBuilder.create()
				.texOffs(24, 39).addBox(-2.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 21.0F, -3.0F));

		PartDefinition legleftback = partdefinition.addOrReplaceChild("legleftback", CubeListBuilder.create()
				.texOffs(38, 36).addBox(-2.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 21.0F, 3.0F));

		PartDefinition legrightfront = partdefinition.addOrReplaceChild("legrightfront", CubeListBuilder.create()
				.texOffs(12, 37).addBox(-2.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 21.0F, -3.0F));

		PartDefinition legrightback = partdefinition.addOrReplaceChild("legrightback", CubeListBuilder.create()
				.texOffs(0, 37).addBox(-2.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 21.0F, 3.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legrightfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legrightback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}