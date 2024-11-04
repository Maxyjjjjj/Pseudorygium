// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelorangutan<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "orangutan"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart armleft;
	private final ModelPart armright;
	private final ModelPart legleft;
	private final ModelPart legright;

	public Modelorangutan(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.armleft = root.getChild("armleft");
		this.armright = root.getChild("armright");
		this.legleft = root.getChild("legleft");
		this.legright = root.getChild("legright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 14.0F, 5.0F));

		PartDefinition cube_r1 = body
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -13.0F, -2.0F, 12.0F, 14.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9163F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 22)
						.addBox(-4.0F, -2.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(52, 42)
						.addBox(-2.0F, 2.0F, -17.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 57)
						.addBox(-5.0F, 0.0F, -15.0F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 7.0F));

		PartDefinition armleft = partdefinition.addOrReplaceChild("armleft", CubeListBuilder.create().texOffs(0, 38)
				.addBox(-2.0F, 0.0F, -5.0F, 4.0F, 22.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 2.0F, 0.0F));

		PartDefinition armright = partdefinition.addOrReplaceChild("armright", CubeListBuilder.create().texOffs(32, 22)
				.addBox(-2.0F, 0.0F, -5.0F, 4.0F, 22.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 2.0F, 0.0F));

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(16, 38)
				.addBox(-2.0F, -3.0F, 5.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 14.0F, 0.0F));

		PartDefinition legright = partdefinition.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(16, 38)
				.addBox(-2.0F, -3.0F, 5.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 14.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.armright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legright.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.armleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}