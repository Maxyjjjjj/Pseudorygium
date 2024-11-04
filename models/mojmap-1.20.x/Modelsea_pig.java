// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsea_pig<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sea_pig"), "main");
	private final ModelPart body;

	public Modelsea_pig(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.5F, -4.0F, -1.0F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(10, 10)
						.addBox(-1.5F, -3.0F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 4)
						.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 14)
						.addBox(1.5F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(-5.5F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = body
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 5).addBox(0.0F, -4.0F, -7.0F, 0.0F, 3.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r2 = body
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 8).addBox(0.0F, -4.0F, -7.0F, 0.0F, 3.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r3 = body
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(0, 16).addBox(-1.5F, -2.75F, -3.0F, 3.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}