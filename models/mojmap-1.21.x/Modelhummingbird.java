// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhummingbird<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hummingbird"), "main");
	private final ModelPart body;
	private final ModelPart wingleft;
	private final ModelPart wingright;

	public Modelhummingbird(ModelPart root) {
		this.body = root.getChild("body");
		this.wingleft = root.getChild("wingleft");
		this.wingright = root.getChild("wingright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition
				.addOrReplaceChild("body",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 5.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 20.0F, 0.0F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(12, 3).addBox(-1.5F, -0.25F, 0.75F, 3.0F, 5.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.0F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(9, 11)
						.addBox(-0.5F, -1.0F, -5.25F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-1.5F, -3.0F, -2.25F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 1.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition wingleft = partdefinition
				.addOrReplaceChild("wingleft",
						CubeListBuilder.create().texOffs(9, 8).addBox(0.0F, 0.0F, 0.0F, 7.0F, 3.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.5F, 18.0F, 0.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition wingright = partdefinition.addOrReplaceChild("wingright",
				CubeListBuilder.create().texOffs(9, 0).addBox(-7.0F, 0.0F, 0.0F, 7.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 18.0F, 0.0F, 1.0036F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.wingright.yRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.wingleft.yRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
	}
}