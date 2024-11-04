// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelshrimp<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "shrimp"), "main");
	private final ModelPart body;

	public Modelshrimp(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 4)
						.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 6)
						.addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 6)
						.addBox(0.0F, 0.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 9)
						.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 9)
						.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tailfin = tail
				.addOrReplaceChild("tailfin",
						CubeListBuilder.create().texOffs(21, 15).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.0F,
				-2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition antennae = head.addOrReplaceChild("antennae",
				CubeListBuilder.create().texOffs(20, 0)
						.addBox(1.0F, -1.0F, -3.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 0)
						.addBox(-1.0F, -1.0F, -3.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, -2.0F));

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