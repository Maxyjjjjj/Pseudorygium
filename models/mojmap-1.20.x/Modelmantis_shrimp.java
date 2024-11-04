// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmantis_shrimp<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mantis_shrimp"), "main");
	private final ModelPart Body;

	public Modelmantis_shrimp(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F, -4.0F, 4.0F, 4.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 6).addBox(-3.0F,
				-2.0F, -4.0F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body2
				.addOrReplaceChild("Body_r1",
						CubeListBuilder.create().texOffs(12, 22).addBox(-3.0F, -5.9F, -6.0F, 4.0F, 2.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F,
				-2.0F, -4.0F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body3 = Body
				.addOrReplaceChild("Body3",
						CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, -4.4F, 5.0F, 4.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition LeftArm = Body3.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 26).addBox(-2.0F, -6.0F, 13.0F, 3.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -1.0F, -6.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Body4 = Body3
				.addOrReplaceChild("Body4",
						CubeListBuilder.create().texOffs(13, 13).addBox(-3.0F, 2.7F, 6.0F, 4.0F, 4.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition Head = Body4
				.addOrReplaceChild("Head",
						CubeListBuilder.create().texOffs(17, 0).addBox(-3.5F, -6.0F, -1.0F, 5.0F, 5.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 8.0F, 12.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition RightEye = Head.addOrReplaceChild("RightEye", CubeListBuilder.create().texOffs(27, 18).addBox(
				-0.5F, -6.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftEye = Head.addOrReplaceChild("LeftEye", CubeListBuilder.create().texOffs(26, 8).addBox(-3.5F,
				-6.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Thing = Head.addOrReplaceChild("Thing",
				CubeListBuilder.create().texOffs(22, 31).addBox(-6.0F, -23.0F, -1.0F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.0F, -15.0F, -1.2217F, 0.5236F, 0.0F));

		PartDefinition Thing2 = Head.addOrReplaceChild("Thing2",
				CubeListBuilder.create().texOffs(18, 28).addBox(-2.0F, -25.0F, 2.0F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -1.0F, -14.0F, -1.2217F, -0.5236F, 0.0F));

		PartDefinition Thing3 = Body4.addOrReplaceChild("Thing3", CubeListBuilder.create(),
				PartPose.offset(3.0F, 15.0F, 25.0F));

		PartDefinition Thing_r1 = Thing3.addOrReplaceChild("Thing_r1",
				CubeListBuilder.create().texOffs(12, 28).addBox(-12.0F, -4.0F, -15.0F, 3.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, -0.1745F, 0.3927F));

		PartDefinition Thing4 = Body4.addOrReplaceChild("Thing4", CubeListBuilder.create(),
				PartPose.offset(3.0F, 15.0F, 25.0F));

		PartDefinition Thing_r2 = Thing4.addOrReplaceChild("Thing_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, -7.0F, -17.0F, 3.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.1745F, -0.3927F));

		PartDefinition RightArm = Body3.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(25, 25).addBox(3.0F, -6.0F, 13.0F, 3.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -1.0F, -6.0F, -0.3491F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}