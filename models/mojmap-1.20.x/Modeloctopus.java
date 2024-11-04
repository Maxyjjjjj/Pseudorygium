// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeloctopus<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "octopus"), "main");
	private final ModelPart body;
	private final ModelPart tentacles0;
	private final ModelPart tentacles1;

	public Modeloctopus(ModelPart root) {
		this.body = root.getChild("body");
		this.tentacles0 = root.getChild("tentacles0");
		this.tentacles1 = root.getChild("tentacles1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -12.0F, -4.0F, 10.0F, 14.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 22.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tentacles0 = partdefinition.addOrReplaceChild("tentacles0",
				CubeListBuilder.create().texOffs(28, 0).addBox(0.0F, -2.0F, -2.0F, 11.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r1 = tentacles0
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(28, 0).addBox(0.0F, -2.0F, -2.0F, 11.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r2 = tentacles0
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(28, 0).addBox(0.0F, -2.0F, -2.0F, 11.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r3 = tentacles0
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(28, 0).addBox(0.0F, -2.0F, -2.0F, 11.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition tentacles1 = partdefinition
				.addOrReplaceChild("tentacles1",
						CubeListBuilder.create().texOffs(28, 0).addBox(-11.0F, -2.0F, -2.0F, 11.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r4 = tentacles1
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(28, 0).addBox(-11.0F, -2.0F, -2.0F, 11.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0036F, 0.0F));

		PartDefinition cube_r5 = tentacles1
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(28, 0).addBox(-11.0F, -2.0F, -2.0F, 11.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r6 = tentacles1
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(28, 0).addBox(-11.0F, -2.0F, -2.0F, 11.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5672F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tentacles0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tentacles1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.tentacles1.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.tentacles0.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}