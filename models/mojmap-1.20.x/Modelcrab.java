// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcrab<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "crab"), "main");
	private final ModelPart body;
	private final ModelPart legs;
	private final ModelPart legs2;

	public Modelcrab(ModelPart root) {
		this.body = root.getChild("body");
		this.legs = root.getChild("legs");
		this.legs2 = root.getChild("legs2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -2.0F, -4.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition clawleft = body.addOrReplaceChild("clawleft",
				CubeListBuilder.create().texOffs(12, 12).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.25F, -1.0F, -5.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition clawfingerleft = clawleft.addOrReplaceChild("clawfingerleft", CubeListBuilder.create()
				.texOffs(12, 18).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition clawleft2 = body.addOrReplaceChild("clawleft2",
				CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.25F, -1.0F, 5.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition clawfingerleft2 = clawleft2.addOrReplaceChild("clawfingerleft2", CubeListBuilder.create()
				.texOffs(0, 18).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition legs = partdefinition.addOrReplaceChild("legs",
				CubeListBuilder.create().texOffs(23, 17)
						.addBox(-3.5F, -1.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 23)
						.addBox(-1.5F, -1.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 23)
						.addBox(0.5F, -1.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 23)
						.addBox(2.5F, -1.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.0F, -4.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition legs2 = partdefinition.addOrReplaceChild("legs2",
				CubeListBuilder.create().texOffs(4, 23)
						.addBox(-3.5F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-1.5F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(0.5F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.5F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.0F, 4.0F, 0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}