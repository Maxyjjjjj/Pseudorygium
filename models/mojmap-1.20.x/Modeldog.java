// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldog<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "dog"),
			"main");
	private final ModelPart body;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart pawleftfront;
	private final ModelPart pawrightfront;
	private final ModelPart pawrightback;
	private final ModelPart pawleftback;

	public Modeldog(ModelPart root) {
		this.body = root.getChild("body");
		this.neck = root.getChild("neck");
		this.head = root.getChild("head");
		this.tail = root.getChild("tail");
		this.tail2 = root.getChild("tail2");
		this.pawleftfront = root.getChild("pawleftfront");
		this.pawrightfront = root.getChild("pawrightfront");
		this.pawrightback = root.getChild("pawrightback");
		this.pawleftback = root.getChild("pawleftback");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 15)
						.addBox(-3.0F, -3.0F, -4.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, -2.95F, -1.0F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.0F, -2.5F));

		PartDefinition cube_r1 = neck
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(35, 20).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 4.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(16, 31)
						.addBox(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-1.0F, 1.0F, -7.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.025F)),
				PartPose.offset(0.0F, -3.0F, -2.0F));

		PartDefinition cube_r2 = head
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(4, 21).addBox(-0.5F, -0.5F, -7.6F, 1.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = head
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(32, 31).addBox(-1.0F, -0.5F, -7.5F, 2.0F, 1.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = head
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(20, 3).addBox(-4.0F, -4.0F, -1.0F, 3.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r5 = head
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(20, 0).addBox(1.0F, -4.0F, -1.0F, 3.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition tail = body
				.addOrReplaceChild("tail",
						CubeListBuilder.create().texOffs(22, 23).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -3.0F, 9.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2",
				CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -1.11F, -0.0639F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.11F, 5.3139F, 0.6981F, 0.0F, 0.0F));

		PartDefinition pawleftfront = partdefinition.addOrReplaceChild("pawleftfront", CubeListBuilder.create()
				.texOffs(12, 39).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 18.0F, -2.5F));

		PartDefinition pawrightfront = partdefinition.addOrReplaceChild("pawrightfront", CubeListBuilder.create()
				.texOffs(38, 37).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 18.0F, -2.5F));

		PartDefinition pawrightback = partdefinition.addOrReplaceChild("pawrightback", CubeListBuilder.create()
				.texOffs(12, 39).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 17.0F, 7.5F));

		PartDefinition pawleftback = partdefinition.addOrReplaceChild("pawleftback", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 17.0F, 7.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawleftfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawrightfront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawrightback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pawleftback.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.pawleftback.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawleftfront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.tail.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.pawrightfront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pawrightback.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}