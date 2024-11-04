// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelrhea<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "rhea"), "main");
	private final ModelPart Head;
	private final ModelPart body;
	private final ModelPart wingleft;
	private final ModelPart wingleft2;
	private final ModelPart leg0;
	private final ModelPart leg1;

	public Modelrhea(ModelPart root) {
		this.Head = root.getChild("Head");
		this.body = root.getChild("body");
		this.wingleft = root.getChild("wingleft");
		this.wingleft2 = root.getChild("wingleft2");
		this.leg0 = root.getChild("leg0");
		this.leg1 = root.getChild("leg1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(40, 15)
						.addBox(-2.0F, -8.0F, -10.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 30)
						.addBox(-2.5F, -11.0F, -6.0F, 5.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, -5.0F));

		PartDefinition body = partdefinition
				.addOrReplaceChild("body",
						CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -7.0F, 8.0F, 15.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition wingleft = partdefinition.addOrReplaceChild("wingleft",
				CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, -2.0F, -1.0F, 1.0F, 8.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 3.0F, -6.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition wingleft2 = partdefinition.addOrReplaceChild("wingleft2",
				CubeListBuilder.create().texOffs(17, 9).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 8.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 3.0F, -6.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leg0 = partdefinition.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(0, 43).addBox(
				-1.0F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 8.0F, -0.5F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(32, 0).addBox(
				-1.0F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 8.0F, -0.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leg0.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}