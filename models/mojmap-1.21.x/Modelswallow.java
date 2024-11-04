// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelswallow<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "swallow"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart tail_feather1;
	private final ModelPart tail_feather2;
	private final ModelPart wingleft;
	private final ModelPart wingright;
	private final ModelPart legleft;
	private final ModelPart legright;

	public Modelswallow(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.tail = this.body.getChild("tail");
		this.tail_feather1 = this.tail.getChild("tail_feather1");
		this.tail_feather2 = this.tail.getChild("tail_feather2");
		this.wingleft = root.getChild("wingleft");
		this.wingright = root.getChild("wingright");
		this.legleft = root.getChild("legleft");
		this.legright = root.getChild("legright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(18, 23)
						.addBox(-1.5F, -3.0F, -3.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-0.5F, -1.0F, -5.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, -2.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 21.0F, 0.0F));

		PartDefinition cube_r1 = body
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(18, 0).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 3.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -0.9537F, 3.3007F, -0.5672F, 0.0F, 0.0F));

		PartDefinition tail_feather1 = tail
				.addOrReplaceChild("tail_feather1",
						CubeListBuilder.create().texOffs(18, 9).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition tail_feather2 = tail
				.addOrReplaceChild("tail_feather2",
						CubeListBuilder.create().texOffs(18, 16).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition wingleft = partdefinition.addOrReplaceChild("wingleft", CubeListBuilder.create(),
				PartPose.offset(2.0F, 20.0F, -2.5F));

		PartDefinition cube_r2 = wingleft
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 9.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, 0.0002F, 0.0F));

		PartDefinition wingright = partdefinition.addOrReplaceChild("wingright", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 20.0F, -2.5F));

		PartDefinition cube_r3 = wingright
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 9.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, -0.0002F, 0.0F));

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(6, 24)
				.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 22.0F, 0.0F));

		PartDefinition legright = partdefinition.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(10, 24)
				.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 22.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.wingright.zRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.wingleft.zRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
	}
}