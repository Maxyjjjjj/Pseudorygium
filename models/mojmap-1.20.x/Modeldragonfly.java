// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldragonfly<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dragonfly"), "main");
	private final ModelPart abdomen;
	private final ModelPart wingleft;
	private final ModelPart wingleft2;
	private final ModelPart wingright;
	private final ModelPart wingright2;

	public Modeldragonfly(ModelPart root) {
		this.abdomen = root.getChild("abdomen");
		this.wingleft = root.getChild("wingleft");
		this.wingleft2 = root.getChild("wingleft2");
		this.wingright = root.getChild("wingright");
		this.wingright2 = root.getChild("wingright2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition abdomen = partdefinition.addOrReplaceChild("abdomen", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 22.5F, 0.0F));

		PartDefinition head = abdomen.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 21)
						.addBox(-2.0F, -1.5F, -3.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 21)
						.addBox(0.5F, -1.75F, -3.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, -1.75F, -3.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition wingleft = partdefinition.addOrReplaceChild("wingleft",
				CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, 0.0F, -2.0F, 10.0F, 0.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 21.5F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition wingleft2 = partdefinition.addOrReplaceChild("wingleft2",
				CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, 0.0F, -2.0F, 10.0F, 0.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 21.5F, 2.0F, 0.0F, -0.1745F, -0.1309F));

		PartDefinition wingright = partdefinition.addOrReplaceChild("wingright",
				CubeListBuilder.create().texOffs(11, 4).addBox(-10.0F, 0.0F, -2.0F, 10.0F, 0.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 21.5F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition wingright2 = partdefinition.addOrReplaceChild("wingright2",
				CubeListBuilder.create().texOffs(11, 0).addBox(-10.0F, 0.0F, -2.0F, 10.0F, 0.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 21.5F, 2.0F, 0.0F, 0.1745F, 0.1309F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		abdomen.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingright2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.wingright.zRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.wingright2.zRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.wingleft2.zRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.wingleft.zRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
	}
}