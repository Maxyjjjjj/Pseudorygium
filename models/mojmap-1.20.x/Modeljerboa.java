// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeljerboa<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "jerboa"), "main");
	private final ModelPart body;
	private final ModelPart legs;

	public Modeljerboa(ModelPart root) {
		this.body = root.getChild("body");
		this.legs = root.getChild("legs");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 15)
						.addBox(-2.5F, -2.0F, -4.0F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-4.0F, -6.0F, -6.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(-2.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 2).addBox(-4.5F, -6.0F, -2.0F, 4.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.3927F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 6).addBox(0.5F, -6.0F, -2.0F, 4.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, -0.3927F, 0.0F));

		PartDefinition tail = body
				.addOrReplaceChild("tail",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition arms = body.addOrReplaceChild("arms",
				CubeListBuilder.create().texOffs(0, 15)
						.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 10)
						.addBox(-2.0F, 0.0F, -6.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, -1.0F));

		PartDefinition legs = partdefinition.addOrReplaceChild("legs", CubeListBuilder.create().texOffs(0, 0).addBox(
				-2.0F, 5.5F, -4.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.5F, 3.0F));

		PartDefinition cube_r3 = legs
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(16, 0).addBox(-2.0F, 0.0F, -5.25F, 4.0F, 3.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6981F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legs.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}