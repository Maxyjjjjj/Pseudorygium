// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelosprey<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "osprey"), "main");
	private final ModelPart body;
	private final ModelPart wingleft;
	private final ModelPart wingright;
	private final ModelPart legleft;
	private final ModelPart legright;

	public Modelosprey(ModelPart root) {
		this.body = root.getChild("body");
		this.wingleft = root.getChild("wingleft");
		this.wingright = root.getChild("wingright");
		this.legleft = root.getChild("legleft");
		this.legright = root.getChild("legright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.5F, -3.0F, -6.0F, 7.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(28, 19)
						.addBox(-2.5F, -8.0F, -1.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -7.0F, -4.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 5)
						.addBox(-1.0F, -5.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -6.0F));

		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(26, 0).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 6.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition wingleft = partdefinition.addOrReplaceChild("wingleft",
				CubeListBuilder.create().texOffs(14, 24).addBox(0.0F, -1.0F, -1.0F, 1.0F, 5.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 13.0F, -4.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition wingright = partdefinition.addOrReplaceChild("wingright",
				CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 5.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 13.0F, -4.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft",
				CubeListBuilder.create().texOffs(0, 19)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 7)
						.addBox(-1.0F, 3.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 31)
						.addBox(-1.5F, 5.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 18.0F, 0.0F));

		PartDefinition legright = partdefinition.addOrReplaceChild("legright",
				CubeListBuilder.create().texOffs(0, 5)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
						.addBox(-1.0F, 3.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 19)
						.addBox(-1.5F, 5.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 18.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.wingright.zRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.wingleft.zRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
	}
}