// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpasserine<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "passerine"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart tail;
	private final ModelPart wingleft;
	private final ModelPart wingleft2;
	private final ModelPart legleft;
	private final ModelPart legleft2;

	public Modelpasserine(ModelPart root) {
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.tail = this.body.getChild("tail");
		this.wingleft = root.getChild("wingleft");
		this.wingleft2 = root.getChild("wingleft2");
		this.legleft = root.getChild("legleft");
		this.legleft2 = root.getChild("legleft2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition
				.addOrReplaceChild("body",
						CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -5.0F, -4.0F, 6.0F, 5.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 20.0F, 0.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(20, 13)
						.addBox(-2.0F, -3.0F, -4.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(10, 18)
						.addBox(-1.0F, -0.5F, -6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, -5)
						.addBox(0.0F, -7.0F, -3.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -4.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(5, 13).addBox(-2.0F, 0.0F,
				0.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 4.0F));

		PartDefinition wingleft = partdefinition.addOrReplaceChild("wingleft",
				CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -1.0F, -1.0F, 1.0F, 5.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 15.0F, -1.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition wingleft2 = partdefinition.addOrReplaceChild("wingleft2",
				CubeListBuilder.create().texOffs(10, 18).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 5.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 15.0F, -1.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(0, 13)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.25F, 20.25F, 0.5F));

		PartDefinition legleft2 = partdefinition.addOrReplaceChild("legleft2", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 20.25F, 0.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.wingleft2.yRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.wingleft.yRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
	}
}