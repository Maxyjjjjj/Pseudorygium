// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelleopard<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "leopard"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart pawleftfront;
	private final ModelPart pawrightfront;
	private final ModelPart pawleftback;
	private final ModelPart pawrightback;

	public Modelleopard(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.tail = this.body.getChild("tail");
		this.pawleftfront = root.getChild("pawleftfront");
		this.pawrightfront = root.getChild("pawrightfront");
		this.pawleftback = root.getChild("pawleftback");
		this.pawrightback = root.getChild("pawrightback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(19, 28)
						.addBox(-3.0F, -3.0F, -6.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(37, 28)
						.addBox(2.0F, -5.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(37, 28)
						.addBox(-3.0F, -5.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, -9.0F));

		PartDefinition cube_r1 = head
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(4, 54).addBox(-2.0F, -1.5F, -8.0F, 4.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -9.0F, 8.0F, 9.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 9.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition pawleftfront = partdefinition.addOrReplaceChild("pawleftfront", CubeListBuilder.create()
				.texOffs(34, 39).addBox(-0.5F, -3.0F, -1.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, -7.0F));

		PartDefinition pawrightfront = partdefinition.addOrReplaceChild("pawrightfront", CubeListBuilder.create()
				.texOffs(34, 0).addBox(-2.5F, -3.0F, -1.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, -7.0F));

		PartDefinition pawleftback = partdefinition.addOrReplaceChild("pawleftback", CubeListBuilder.create()
				.texOffs(0, 28).addBox(-0.5F, -2.0F, -1.5F, 3.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 7.0F));

		PartDefinition pawrightback = partdefinition.addOrReplaceChild("pawrightback", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-2.5F, -2.0F, -1.5F, 3.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 7.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.pawleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.pawrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}