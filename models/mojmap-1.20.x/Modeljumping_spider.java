// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeljumping_spider<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "jumping_spider"), "main");
	private final ModelPart abdomen;
	private final ModelPart leg0;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;
	private final ModelPart leg5;
	private final ModelPart leg6;
	private final ModelPart leg7;

	public Modeljumping_spider(ModelPart root) {
		this.abdomen = root.getChild("abdomen");
		this.leg0 = root.getChild("leg0");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
		this.leg5 = root.getChild("leg5");
		this.leg6 = root.getChild("leg6");
		this.leg7 = root.getChild("leg7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition abdomen = partdefinition
				.addOrReplaceChild("abdomen",
						CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -5.0F, 0.0F, 5.0F, 5.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 21.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head = abdomen
				.addOrReplaceChild("head",
						CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(22, 6)
						.addBox(-2.5F, -0.5F, -5.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(0.5F, -0.5F, -5.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leg0 = partdefinition.addOrReplaceChild("leg0",
				CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 21.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1",
				CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 21.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition leg2 = partdefinition
				.addOrReplaceChild("leg2",
						CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 21.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition leg3 = partdefinition
				.addOrReplaceChild("leg3",
						CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 21.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4",
				CubeListBuilder.create().texOffs(0, 19).mirror()
						.addBox(-6.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 21.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition leg5 = partdefinition.addOrReplaceChild("leg5",
				CubeListBuilder.create().texOffs(0, 19).mirror()
						.addBox(-6.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 21.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition leg6 = partdefinition.addOrReplaceChild("leg6",
				CubeListBuilder.create().texOffs(0, 19).mirror()
						.addBox(-6.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 21.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition leg7 = partdefinition.addOrReplaceChild("leg7",
				CubeListBuilder.create().texOffs(0, 19).mirror()
						.addBox(-6.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 21.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		abdomen.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}