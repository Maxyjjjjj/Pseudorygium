// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelorca<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "orca"), "main");
	private final ModelPart body;
	private final ModelPart tail;

	public Modelorca(ModelPart root) {
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-14.0F, -15.0F, -24.0F, 28.0F, 28.0F, 48.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition cube_r1 = body
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -30.0F, -12.0F, 2.0F, 18.0F, 11.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(74, 99)
						.addBox(-13.0F, -8.0F, -28.0F, 25.0F, 19.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 127)
						.addBox(-11.5F, 11.0F, -26.5F, 22.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -4.0F, -24.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw",
				CubeListBuilder.create().texOffs(124, 48)
						.addBox(-12.0F, 0.0F, -27.0F, 23.0F, 5.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(71, 146)
						.addBox(-11.5F, -2.0F, -26.5F, 22.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 0.0F));

		PartDefinition finleft = body.addOrReplaceChild("finleft",
				CubeListBuilder.create().texOffs(0, 76).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 14.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.0F, 13.0F, -14.0F, 0.3491F, 0.0F, -0.7854F));

		PartDefinition finleft2 = body.addOrReplaceChild("finleft2",
				CubeListBuilder.create().texOffs(17, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 14.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, 13.0F, -14.0F, 0.3491F, 0.0F, 0.7854F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 76)
						.addBox(-10.0F, -10.0F, 0.0F, 20.0F, 20.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(-20.0F, -8.0F, 26.0F, 40.0F, 6.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 24.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.tail.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}