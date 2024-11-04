// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmandarin_duck<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mandarin_duck"), "main");
	private final ModelPart Body;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public Modelmandarin_duck(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.0F, -8.0F, -3.0F, 5.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition RightWing = Body.addOrReplaceChild("RightWing", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition RightWing_r1 = RightWing
				.addOrReplaceChild("RightWing_r1",
						CubeListBuilder.create().texOffs(0, 11).addBox(-5.0F, -8.0F, -3.0F, 1.0F, 4.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition RightWing2 = RightWing.addOrReplaceChild("RightWing2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, -0.0873F, 0.0F));

		PartDefinition LeftWing = Body.addOrReplaceChild("LeftWing", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition LeftWing_r1 = LeftWing
				.addOrReplaceChild("LeftWing_r1",
						CubeListBuilder.create().texOffs(14, 11).addBox(1.0F, -8.0F, -3.0F, 1.0F, 4.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition LeftWing2 = LeftWing.addOrReplaceChild("LeftWing2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0873F, 0.0F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create(),
				PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition Neck_r1 = Neck
				.addOrReplaceChild("Neck_r1",
						CubeListBuilder.create().texOffs(14, 21).addBox(-3.0F, -10.0F, -5.0F, 3.0F, 5.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 21).addBox(-3.0F,
				-13.0F, -4.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(22, 9).addBox(-3.0F,
				-11.0F, -6.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(),
				PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition Tail_r1 = Tail
				.addOrReplaceChild("Tail_r1",
						CubeListBuilder.create().texOffs(17, 0).addBox(-3.0F, -8.0F, 1.0F, 3.0F, 2.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(8, 11).addBox(-3.0F,
				-6.0F, 3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 11)
				.addBox(-1.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 20.0F, 1.5F));

		PartDefinition LeftFeet = LeftLeg.addOrReplaceChild("LeftFeet", CubeListBuilder.create().texOffs(25, 18).addBox(
				-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 4.0F, -1.5F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 20.0F, 1.5F));

		PartDefinition RightFeet = RightLeg.addOrReplaceChild("RightFeet", CubeListBuilder.create().texOffs(22, 12)
				.addBox(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 4.0F, -1.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}