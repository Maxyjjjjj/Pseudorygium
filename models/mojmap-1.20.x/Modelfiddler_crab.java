// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelfiddler_crab<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "fiddler_crab"), "main");
	private final ModelPart body;
	private final ModelPart legs;
	private final ModelPart legs2;

	public Modelfiddler_crab(ModelPart root) {
		this.body = root.getChild("body");
		this.legs = root.getChild("legs");
		this.legs2 = root.getChild("legs2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(5, 34).addBox(0.0F, 0.0F, -3.0F, 0.0F, 5.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition clawleft = body.addOrReplaceChild("clawleft",
				CubeListBuilder.create().texOffs(0, 48).addBox(-3.0F, -4.0F, -1.0F, 6.0F, 4.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -5.0F, -12.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition clawfinger = clawleft.addOrReplaceChild("clawfinger", CubeListBuilder.create().texOffs(48, 0)
				.addBox(-3.0F, -2.0F, -1.0F, 6.0F, 4.0F, 8.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition clawright = body.addOrReplaceChild("clawright",
				CubeListBuilder.create().texOffs(28, 48).addBox(-4.0F, -3.0F, -3.0F, 5.0F, 5.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, -4.0F, 8.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition legs = partdefinition.addOrReplaceChild("legs",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -2.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -2.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.0F, -2.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, -2.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 19.0F, -8.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition legs2 = partdefinition.addOrReplaceChild("legs2", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(-7.0F, -2.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(-3.0F, -2.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(1.0F, -2.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 0).mirror()
				.addBox(5.0F, -2.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 19.0F, 8.0F, 0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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