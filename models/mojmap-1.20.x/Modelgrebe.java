// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgrebe<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "grebe"), "main");
	private final ModelPart body;
	private final ModelPart legleft;
	private final ModelPart legright;
	private final ModelPart wingleft;
	private final ModelPart wingright;

	public Modelgrebe(ModelPart root) {
		this.body = root.getChild("body");
		this.legleft = root.getChild("legleft");
		this.legright = root.getChild("legright");
		this.wingleft = root.getChild("wingleft");
		this.wingright = root.getChild("wingright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition
				.addOrReplaceChild("body",
						CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, -4.0F, 6.0F, 5.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition neck = body
				.addOrReplaceChild("neck",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(20, 0)
						.addBox(-1.5F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 13)
						.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 18)
						.addBox(-0.5F, -1.5F, -6.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-1.5F, -5.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(11, 13)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 20.0F, 2.0F));

		PartDefinition legright = partdefinition.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(0, 13)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 20.0F, 2.0F));

		PartDefinition wingleft = partdefinition.addOrReplaceChild("wingleft",
				CubeListBuilder.create().texOffs(11, 17).addBox(0.0F, -0.5F, -0.5F, 1.0F, 4.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 14.0F, -3.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition wingright = partdefinition.addOrReplaceChild("wingright",
				CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 4.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 14.0F, -3.0F, -0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}