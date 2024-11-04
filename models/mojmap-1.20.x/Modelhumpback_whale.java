// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhumpback_whale<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "humpback_whale"), "main");
	private final ModelPart body;
	private final ModelPart tail;

	public Modelhumpback_whale(ModelPart root) {
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-22.0F, -24.0F, -40.0F, 44.0F, 48.0F, 80.0F, new CubeDeformation(0.0F)).texOffs(168, 0)
						.addBox(-19.0F, -24.0F, -99.0F, 38.0F, 8.0F, 59.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition jaw = body.addOrReplaceChild("jaw",
				CubeListBuilder.create().texOffs(184, 177)
						.addBox(-18.0F, 0.0F, -29.0F, 36.0F, 33.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(154, 240)
						.addBox(-18.0F, 0.0F, -59.0F, 36.0F, 20.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(220, 100)
						.addBox(-17.0F, -4.0F, -28.5F, 34.0F, 33.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(256, 260)
						.addBox(-17.0F, -4.0F, -58.5F, 34.0F, 19.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -16.0F, -40.0F));

		PartDefinition finleft = body.addOrReplaceChild("finleft",
				CubeListBuilder.create().texOffs(0, 231).addBox(0.0F, 0.0F, -8.0F, 0.0F, 48.0F, 32.0F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(22.0F, 24.0F, -29.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition finright = body.addOrReplaceChild("finright",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -8.0F, 0.0F, 48.0F, 32.0F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-21.0F, 24.0F, -29.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 177)
						.addBox(-16.0F, -13.0F, 0.0F, 32.0F, 26.0F, 60.0F, new CubeDeformation(0.0F)).texOffs(0, 128)
						.addBox(-43.0F, -4.0F, 39.0F, 86.0F, 6.0F, 43.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.0F, 40.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.tail.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}