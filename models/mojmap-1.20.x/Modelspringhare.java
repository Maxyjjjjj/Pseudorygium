// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelspringhare<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "springhare"), "main");
	private final ModelPart body;
	private final ModelPart paws;
	private final ModelPart legs;

	public Modelspringhare(ModelPart root) {
		this.body = root.getChild("body");
		this.paws = root.getChild("paws");
		this.legs = root.getChild("legs");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 4.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 12)
						.addBox(-2.5F, -2.0F, -4.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-1.5F, 0.0F, -5.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -6.0F, -1.25F, 2.0F, 4.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r2 = head
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, -6.0F, -1.25F, 2.0F, 4.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition tail = body
				.addOrReplaceChild("tail",
						CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, 4.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2",
				CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 5.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition paws = partdefinition.addOrReplaceChild("paws", CubeListBuilder.create().texOffs(0, 20).addBox(
				-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, -3.0F));

		PartDefinition legs = partdefinition.addOrReplaceChild("legs", CubeListBuilder.create().texOffs(11, 12).addBox(
				-1.5F, 5.0F, -4.75F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 3.0F));

		PartDefinition cube_r3 = legs
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(13, 15).addBox(-1.5F, -3.0F, -5.25F, 3.0F, 4.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		paws.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legs.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}