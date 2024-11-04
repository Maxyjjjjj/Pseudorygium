// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbactrian_camel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bactrian_camel"), "main");
	private final ModelPart root;
	private final ModelPart right_front_leg;
	private final ModelPart left_front_leg;
	private final ModelPart left_hind_leg;
	private final ModelPart right_hind_leg;

	public Modelbactrian_camel(ModelPart root) {
		this.root = root.getChild("root");
		this.right_front_leg = root.getChild("right_front_leg");
		this.left_front_leg = root.getChild("left_front_leg");
		this.left_hind_leg = root.getChild("left_hind_leg");
		this.right_hind_leg = root.getChild("right_hind_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F,
				-12.0F, -23.5F, 15.0F, 12.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -20.0F, 9.5F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(-0.5F, -9.0F, 3.5F));

		PartDefinition tail_r1 = tail
				.addOrReplaceChild("tail_r1",
						CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 39)
						.addBox(-4.0F, -5.0F, -15.0F, 7.0F, 8.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(57, 0)
						.addBox(-4.0F, -19.0F, -15.0F, 7.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(60, 67)
						.addBox(-3.0F, -19.0F, -21.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, -19.5F));

		PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(8, 40).addBox(
				0.0F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -18.0F, -9.5F));

		PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(0, 39)
				.addBox(-3.0F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, -18.0F, -9.5F));

		PartDefinition hump = body.addOrReplaceChild("hump",
				CubeListBuilder.create().texOffs(52, 53)
						.addBox(-6.0F, -5.0F, -11.0F, 11.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(33, 39)
						.addBox(-6.0F, -5.0F, 1.0F, 11.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, -9.5F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create()
				.texOffs(40, 67).addBox(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.9F, 1.0F, -10.5F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create()
				.texOffs(20, 66).addBox(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.9F, 1.0F, -10.5F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create()
				.texOffs(0, 66).addBox(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.9F, 1.0F, 9.5F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.9F, 1.0F, 9.5F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_front_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_front_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_hind_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_hind_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.right_front_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.right_hind_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_hind_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_front_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}