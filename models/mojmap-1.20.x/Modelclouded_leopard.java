// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelclouded_leopard<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "clouded_leopard"), "main");
	private final ModelPart body;
	private final ModelPart pawleftfront;
	private final ModelPart pawrightfront;
	private final ModelPart pawrightback;
	private final ModelPart pawleftfront2;

	public Modelclouded_leopard(ModelPart root) {
		this.body = root.getChild("body");
		this.pawleftfront = root.getChild("pawleftfront");
		this.pawrightfront = root.getChild("pawrightfront");
		this.pawrightback = root.getChild("pawrightback");
		this.pawleftfront2 = root.getChild("pawleftfront2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.5F, -3.5F, -7.5F, 7.0F, 7.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.5F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 23)
						.addBox(-4.0F, -3.0F, -6.0F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
						.addBox(1.0F, -5.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 0).addBox(-3.0F, -5.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(30, 0).addBox(-2.0F, 1.0F, -9.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.5F, -7.5F));

		PartDefinition tail = body
				.addOrReplaceChild("tail",
						CubeListBuilder.create().texOffs(24, 43).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -3.0F, 7.5F, -0.829F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2",
				CubeListBuilder.create().texOffs(27, 52).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 7.0F,
						new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 6.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition pawleftfront = partdefinition.addOrReplaceChild("pawleftfront", CubeListBuilder.create()
				.texOffs(0, 40).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 18.0F, -5.0F));

		PartDefinition pawrightfront = partdefinition.addOrReplaceChild("pawrightfront",
				CubeListBuilder.create().texOffs(0, 40).mirror()
						.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 18.0F, -5.0F));

		PartDefinition pawrightback = partdefinition.addOrReplaceChild("pawrightback",
				CubeListBuilder.create().texOffs(0, 40).mirror()
						.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 18.0F, 5.0F));

		PartDefinition pawleftfront2 = partdefinition.addOrReplaceChild("pawleftfront2", CubeListBuilder.create()
				.texOffs(0, 40).addBox(-1.5F, 0.0F, 8.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 18.0F, -5.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawleftfront2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.pawleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.pawleftfront2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}