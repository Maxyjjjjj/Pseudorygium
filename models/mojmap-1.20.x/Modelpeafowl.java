// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpeafowl<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "peafowl"), "main");
	private final ModelPart body;
	private final ModelPart wingleft;
	private final ModelPart wingright;
	private final ModelPart legleft;
	private final ModelPart legright;

	public Modelpeafowl(ModelPart root) {
		this.body = root.getChild("body");
		this.wingleft = root.getChild("wingleft");
		this.wingright = root.getChild("wingright");
		this.legleft = root.getChild("legleft");
		this.legright = root.getChild("legright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 32).addBox(
				-3.0F, -2.0F, -4.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 28).addBox(-1.0F,
				-5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.0F));

		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.5F, -2.5F, -3.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 28)
						.addBox(-1.0F, -1.0F, -5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 4)
						.addBox(0.0F, -5.0F, -1.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));

		PartDefinition feathers = body.addOrReplaceChild("feathers", CubeListBuilder.create().texOffs(0, 23).addBox(
				-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 1.25F));

		PartDefinition feather1 = feathers.addOrReplaceChild("feather1", CubeListBuilder.create().texOffs(18, 0).addBox(
				-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, 2.0F));

		PartDefinition feather2 = feathers.addOrReplaceChild("feather2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.5F, 2.0F, 0.0F, 1.3963F, 0.0F));

		PartDefinition cube_r1 = feather2
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(18, 0).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.3963F, 0.0F));

		PartDefinition feather7 = feathers.addOrReplaceChild("feather7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.5F, 2.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r2 = feather7
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(18, 0).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition feather6 = feathers.addOrReplaceChild("feather6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.5F, 2.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r3 = feather6
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(18, 0).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition feather5 = feathers.addOrReplaceChild("feather5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.5F, 2.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r4 = feather5
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(18, 0).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition feather3 = feathers.addOrReplaceChild("feather3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.5F, 2.0F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r5 = feather3
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(18, 0).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.3963F, 0.0F));

		PartDefinition feather9 = feathers.addOrReplaceChild("feather9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.5F, 2.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r6 = feather9
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(18, 0).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition feather8 = feathers.addOrReplaceChild("feather8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.5F, 2.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r7 = feather8
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(18, 0).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition feather4 = feathers.addOrReplaceChild("feather4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.5F, 2.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r8 = feather4
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(18, 0).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition wingleft = partdefinition.addOrReplaceChild("wingleft",
				CubeListBuilder.create().texOffs(28, 36).addBox(0.0F, -1.0F, -1.0F, 1.0F, 4.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 14.0F, -2.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition wingright = partdefinition.addOrReplaceChild("wingright",
				CubeListBuilder.create().texOffs(31, 23).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 4.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 14.0F, -2.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(0, 15)
				.addBox(-1.5F, -1.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 20.0F, 0.0F));

		PartDefinition legright = partdefinition.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(0, 7)
				.addBox(-1.5F, -1.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 20.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}