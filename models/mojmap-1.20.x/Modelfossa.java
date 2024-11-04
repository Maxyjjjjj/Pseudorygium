// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelfossa<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "fossa"), "main");
	private final ModelPart body;
	private final ModelPart frontLegL;
	private final ModelPart frontLegR;
	private final ModelPart backLegL;
	private final ModelPart backLegR;

	public Modelfossa(ModelPart root) {
		this.body = root.getChild("body");
		this.frontLegL = root.getChild("frontLegL");
		this.frontLegR = root.getChild("frontLegR");
		this.backLegL = root.getChild("backLegL");
		this.backLegR = root.getChild("backLegR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 17.0F, 1.0F));

		PartDefinition belly = body
				.addOrReplaceChild("belly",
						CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -8.0F, -3.0F, 4.0F, 16.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(15, 17)
						.addBox(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(26, 6)
						.addBox(-1.5F, -0.0156F, -4.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-2.0F, -3.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, -10.0F));

		PartDefinition tail1 = body
				.addOrReplaceChild("tail1",
						CubeListBuilder.create().texOffs(20, 26).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 7.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1
				.addOrReplaceChild("tail2",
						CubeListBuilder.create().texOffs(16, 26).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition frontLegL = partdefinition.addOrReplaceChild("frontLegL", CubeListBuilder.create().texOffs(20, 8)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.2F, 18.0F, -4.0F));

		PartDefinition frontLegR = partdefinition.addOrReplaceChild("frontLegR", CubeListBuilder.create().texOffs(20, 0)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.2F, 18.0F, -4.0F));

		PartDefinition backLegL = partdefinition.addOrReplaceChild("backLegL", CubeListBuilder.create().texOffs(8, 24)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.1F, 18.0F, 7.0F));

		PartDefinition backLegR = partdefinition.addOrReplaceChild("backLegR", CubeListBuilder.create().texOffs(0, 22)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.1F, 18.0F, 7.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		frontLegL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		frontLegR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		backLegL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		backLegR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.backLegL.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.frontLegR.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.backLegR.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.frontLegL.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}