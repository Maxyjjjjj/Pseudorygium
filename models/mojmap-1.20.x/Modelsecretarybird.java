// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsecretarybird<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "secretarybird"), "main");
	private final ModelPart body;
	private final ModelPart wingleft;
	private final ModelPart wingleft2;
	private final ModelPart legleft;
	private final ModelPart legleft2;

	public Modelsecretarybird(ModelPart root) {
		this.body = root.getChild("body");
		this.wingleft = root.getChild("wingleft");
		this.wingleft2 = root.getChild("wingleft2");
		this.legleft = root.getChild("legleft");
		this.legleft2 = root.getChild("legleft2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.0F, -6.0F, -5.0F, 6.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 13.0F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -8.0F,
				-1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, -5.0F));

		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(29, 29)
						.addBox(-1.5F, -2.0F, -3.75F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-1.0F, 0.0F, -5.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-1.0F, 1.0F, -5.75F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition cube_r1 = head
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(24, 16).addBox(-2.0F, -2.5F, 0.0F, 4.0F, 4.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition tail = body
				.addOrReplaceChild("tail",
						CubeListBuilder.create().texOffs(22, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 9.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -5.0F, 5.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition wingleft = partdefinition.addOrReplaceChild("wingleft", CubeListBuilder.create().texOffs(12, 20)
				.addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 7.0F, -4.0F));

		PartDefinition wingleft2 = partdefinition.addOrReplaceChild("wingleft2", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 7.0F, -4.0F));

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(8, 34)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 13.0F, 0.0F));

		PartDefinition legleft2 = partdefinition.addOrReplaceChild("legleft2", CubeListBuilder.create().texOffs(0, 30)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 13.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legleft2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}