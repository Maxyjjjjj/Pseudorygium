// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelreindeer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "reindeer"), "main");
	private final ModelPart Body;
	private final ModelPart TailA;
	private final ModelPart Leg1A;
	private final ModelPart Leg2A;
	private final ModelPart Leg3A;
	private final ModelPart Leg4A;
	private final ModelPart Neck;

	public Modelreindeer(ModelPart root) {
		this.Body = root.getChild("Body");
		this.TailA = root.getChild("TailA");
		this.Leg1A = root.getChild("Leg1A");
		this.Leg2A = root.getChild("Leg2A");
		this.Leg3A = root.getChild("Leg3A");
		this.Leg4A = root.getChild("Leg4A");
		this.Neck = root.getChild("Neck");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.0F, -8.0F, -20.0F, 10.0F, 10.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 9.0F));

		PartDefinition TailA = partdefinition
				.addOrReplaceChild("TailA",
						CubeListBuilder.create().texOffs(42, 0).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 4.0F, 11.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Leg1A = partdefinition.addOrReplaceChild("Leg1A", CubeListBuilder.create().texOffs(30, 59)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 13.0F, 9.0F));

		PartDefinition Leg2A = partdefinition.addOrReplaceChild("Leg2A", CubeListBuilder.create().texOffs(56, 0).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 13.0F, 9.0F));

		PartDefinition Leg3A = partdefinition.addOrReplaceChild("Leg3A", CubeListBuilder.create().texOffs(50, 44)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 13.0F, -9.0F));

		PartDefinition Leg4A = partdefinition.addOrReplaceChild("Leg4A", CubeListBuilder.create().texOffs(34, 44)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, -9.0F));

		PartDefinition Neck = partdefinition
				.addOrReplaceChild("Neck",
						CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -11.0F, -3.0F, 4.0F, 12.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 7.0F, -8.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(34, 32)
						.addBox(-3.0F, -5.0F, -6.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(59, 27)
						.addBox(-2.0F, -5.0F, -11.0F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, 2.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition AntlerRight_r1 = Head.addOrReplaceChild("AntlerRight_r1",
				CubeListBuilder.create().texOffs(0, 15)
						.addBox(-1.75F, -19.0F, -7.0F, 0.0F, 15.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(1.75F, -19.0F, -7.0F, 0.0F, 15.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Ear2 = Head.addOrReplaceChild("Ear2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 10.0F, -1.0F, 0.5236F, 1.5708F, -0.0873F));

		PartDefinition Ear1 = Head.addOrReplaceChild("Ear1",
				CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 10.0F, -1.0F, 0.5236F, -1.5708F, 0.0873F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		TailA.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg1A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg2A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg3A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg4A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Leg1A.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Leg3A.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Leg2A.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Leg4A.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}