// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmaned_wolf<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "maned_wolf"), "main");
	private final ModelPart neck;
	private final ModelPart body;
	private final ModelPart upperBody;
	private final ModelPart leg0;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart tail;

	public Modelmaned_wolf(ModelPart root) {
		this.neck = root.getChild("neck");
		this.body = root.getChild("body");
		this.upperBody = root.getChild("upperBody");
		this.leg0 = root.getChild("leg0");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck = partdefinition.addOrReplaceChild("neck",
				CubeListBuilder.create().texOffs(20, 24)
						.addBox(-2.0F, -3.0F, -3.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 0)
						.addBox(-1.5F, -5.0F, -4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.5F, -6.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(24, 13)
						.addBox(-3.0F, -2.0F, -4.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-3.0F, -4.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.0F, -4.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-1.5F, 0.9844F, -7.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition body = partdefinition
				.addOrReplaceChild("body",
						CubeListBuilder.create().texOffs(0, 13).addBox(-4.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 11.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upperBody = partdefinition.addOrReplaceChild("upperBody",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, 2.0F, -4.0F, 8.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(36, 23)
						.addBox(-1.5F, 2.0F, -6.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 2.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition leg0 = partdefinition.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(0, 35).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 14.0F, 7.0F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(30, 32).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 14.0F, 7.0F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(22, 32)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 14.0F, -4.0F));

		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(14, 30).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 14.0F, -4.0F));

		PartDefinition tail = partdefinition
				.addOrReplaceChild("tail",
						CubeListBuilder.create().texOffs(38, 31).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 8.0F, 0.9599F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		upperBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leg0.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.neck.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.neck.xRot = headPitch / (180F / (float) Math.PI);
	}
}