// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhedgehog<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hedgehog"), "main");
	private final ModelPart body;

	public Modelhedgehog(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-3.0F, -7.0F, -1.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(19, 19)
						.addBox(3.0F, -6.0F, -1.0F, 1.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(19, 6)
						.addBox(-4.0F, -6.0F, -1.0F, 1.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-3.0F, -6.0F, 6.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 28)
						.addBox(-2.0F, -4.0F, -3.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
						.addBox(-1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -1.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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