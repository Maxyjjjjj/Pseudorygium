// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpallas_cat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pallas_cat"), "main");
	private final ModelPart body;
	private final ModelPart pawleftfront;
	private final ModelPart pawrightfront;
	private final ModelPart pawrightback;
	private final ModelPart pawrightback2;

	public Modelpallas_cat(ModelPart root) {
		this.body = root.getChild("body");
		this.pawleftfront = root.getChild("pawleftfront");
		this.pawrightfront = root.getChild("pawrightfront");
		this.pawrightback = root.getChild("pawrightback");
		this.pawrightback2 = root.getChild("pawrightback2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 20.25F, 0.0F));

		PartDefinition cube_r1 = body
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(23, 16).addBox(-4.0F, -7.0F, -1.0F, 8.0F, 14.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 36)
						.addBox(-3.5F, -4.0F, -5.0F, 7.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-1.5F, -1.0F, -6.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(1.0F, -5.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(-3.0F, -5.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, -7.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, -4.0F, 7.0F));

		PartDefinition cube_r2 = tail
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(20, 50).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 7.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 4.0F, 4.0F));

		PartDefinition cube_r3 = tail2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(4, 50).addBox(-1.0F, -1.0F, -0.25F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition pawleftfront = partdefinition.addOrReplaceChild("pawleftfront", CubeListBuilder.create()
				.texOffs(40, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 18.0F, -4.0F));

		PartDefinition pawrightfront = partdefinition.addOrReplaceChild("pawrightfront",
				CubeListBuilder.create().texOffs(40, 0).mirror()
						.addBox(-1.0F, -4.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 18.0F, -4.0F));

		PartDefinition pawrightback = partdefinition.addOrReplaceChild("pawrightback",
				CubeListBuilder.create().texOffs(8, 13).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 18.0F, 5.0F));

		PartDefinition pawrightback2 = partdefinition.addOrReplaceChild("pawrightback2", CubeListBuilder.create()
				.texOffs(8, 13).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 18.0F, 5.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawrightback2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.pawleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.pawrightback2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}