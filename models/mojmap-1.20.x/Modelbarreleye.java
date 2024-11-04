// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbarreleye<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "barreleye"), "main");
	private final ModelPart body;
	private final ModelPart tail;

	public Modelbarreleye(ModelPart root) {
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -4.0F, -5.0F, 6.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -9.0F, -2.0F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 17)
						.addBox(-3.0F, -2.0F, -8.0F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
						.addBox(0.5F, -3.0F, -7.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, -3.0F, -7.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 0)
						.addBox(-3.0F, -4.0F, -8.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition cube_r1 = body
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(23, 2).addBox(-1.8F, 3.0F, -5.0F, 0.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r2 = body
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(23, 5).addBox(1.8F, 3.0F, -5.0F, 0.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r3 = body
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(0, 14).addBox(-3.35F, -3.0F, -1.3F, 0.0F, 4.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r4 = body
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(0, 18).addBox(3.35F, -3.0F, -1.3F, 0.0F, 4.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(0.0F, -3.0F, 2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(0.0F, -5.0F, 6.0F, 0.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 6.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.tail.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}