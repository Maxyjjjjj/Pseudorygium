// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelseadragon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "seadragon"), "main");
	private final ModelPart body;

	public Modelseadragon(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition
				.addOrReplaceChild("body",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 3.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 11)
						.addBox(0.0F, 2.0F, -1.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(12, 11)
						.addBox(0.0F, -7.0F, -1.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 11)
						.addBox(0.0F, 2.0F, -1.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(12, 11)
						.addBox(0.0F, -7.0F, -1.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 5.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r3 = tail.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(10, 19)
						.addBox(0.0F, -7.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 6)
						.addBox(0.0F, 2.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r4 = tail.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(10, 19)
						.addBox(0.0F, -7.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 6)
						.addBox(0.0F, 2.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 2.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition tail2 = tail
				.addOrReplaceChild("tail2",
						CubeListBuilder.create().texOffs(22, 25).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.5F, 4.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F,
				-1.5F, 0.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, 4.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(24, 16)
						.addBox(-1.0F, -3.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 29)
						.addBox(-1.0F, -6.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 22)
						.addBox(-0.5F, -2.0F, -7.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(0.0F, -1.0F, -6.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -2.75F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, -9.5F, -1.75F, 0.0F, 6.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

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