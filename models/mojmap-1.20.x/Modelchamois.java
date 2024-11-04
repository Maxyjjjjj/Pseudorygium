// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelchamois<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "chamois"), "main");
	private final ModelPart left_back_leg;
	private final ModelPart right_back_leg;
	private final ModelPart right_front_leg;
	private final ModelPart left_front_leg;
	private final ModelPart body;
	private final ModelPart Head;

	public Modelchamois(ModelPart root) {
		this.left_back_leg = root.getChild("left_back_leg");
		this.right_back_leg = root.getChild("right_back_leg");
		this.right_front_leg = root.getChild("right_front_leg");
		this.left_front_leg = root.getChild("left_front_leg");
		this.body = root.getChild("body");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition left_back_leg = partdefinition.addOrReplaceChild("left_back_leg", CubeListBuilder.create()
				.texOffs(39, 37).addBox(0.0F, 0.0F, -1.5F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 14.0F, 5.5F));

		PartDefinition right_back_leg = partdefinition.addOrReplaceChild("right_back_leg", CubeListBuilder.create()
				.texOffs(34, 0).addBox(0.0F, 0.0F, -1.5F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 14.0F, 5.5F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create()
				.texOffs(30, 27).addBox(0.0F, 0.0F, -1.5F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 14.0F, -4.5F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create()
				.texOffs(0, 0).addBox(0.0F, 0.0F, -1.5F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 14.0F, -4.5F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -17.0F, -7.0F, 9.0F, 11.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(20, 27)
						.addBox(-2.99F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-0.01F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 13)
						.addBox(2.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-6.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 14.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(0, 27).addBox(-3.0F, -4.0F, -8.0F, 5.0F, 7.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, -8.0F, 0.9599F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		left_back_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_back_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_front_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_front_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.right_front_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_back_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.right_back_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_front_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}