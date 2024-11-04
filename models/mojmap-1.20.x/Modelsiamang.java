// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsiamang<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "siamang"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart armleft;
	private final ModelPart armright;
	private final ModelPart legright;
	private final ModelPart legleft;

	public Modelsiamang(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.armleft = root.getChild("armleft");
		this.armright = root.getChild("armright");
		this.legright = root.getChild("legright");
		this.legleft = root.getChild("legleft");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 10)
				.addBox(-3.0F, -10.0F, -1.0F, 6.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -5.0F, -2.5F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 0)
						.addBox(-1.5F, -2.0F, -3.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition armleft = partdefinition
				.addOrReplaceChild("armleft",
						CubeListBuilder.create().texOffs(0, 23).addBox(0.0F, -1.0F, -1.0F, 3.0F, 14.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(3.0F, 8.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition armright = partdefinition
				.addOrReplaceChild("armright",
						CubeListBuilder.create().texOffs(18, 10).addBox(-3.0F, -1.0F, -1.0F, 3.0F, 14.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition legright = partdefinition.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(24, 27)
				.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 17.0F, 0.0F));

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(12, 27)
				.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 17.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.armright.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.legright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.armleft.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}