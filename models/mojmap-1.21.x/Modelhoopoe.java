// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhoopoe<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hoopoe"), "main");
	private final ModelPart body;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart feather;
	private final ModelPart feather2;
	private final ModelPart feather3;
	private final ModelPart feather4;
	private final ModelPart feather5;
	private final ModelPart feather6;
	private final ModelPart tail;
	private final ModelPart wingleft;
	private final ModelPart wingright;
	private final ModelPart legleft;
	private final ModelPart legright;

	public Modelhoopoe(ModelPart root) {
		this.body = root.getChild("body");
		this.neck = this.body.getChild("neck");
		this.head = this.neck.getChild("head");
		this.feather = this.head.getChild("feather");
		this.feather2 = this.head.getChild("feather2");
		this.feather3 = this.head.getChild("feather3");
		this.feather4 = this.head.getChild("feather4");
		this.feather5 = this.head.getChild("feather5");
		this.feather6 = this.head.getChild("feather6");
		this.tail = this.body.getChild("tail");
		this.wingleft = root.getChild("wingleft");
		this.wingright = root.getChild("wingright");
		this.legleft = root.getChild("legleft");
		this.legright = root.getChild("legright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 19.0F, 0.0F));

		PartDefinition cube_r1 = body
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.0F, -3.0F, 3.0F, 3.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F,
				-2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, -1.0F));

		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(16, 12)
						.addBox(-1.5F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 18)
						.addBox(-0.5F, -1.5F, -6.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition feather = head.addOrReplaceChild("feather", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -3.0F, -1.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r2 = feather.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 18).addBox(0.5F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -1.1345F, 0.0F, 0.0F));

		PartDefinition feather2 = head.addOrReplaceChild("feather2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -3.0F, -1.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r3 = feather2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 18).addBox(0.5F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition feather3 = head.addOrReplaceChild("feather3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -3.0F, -0.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = feather3
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(0, 18).addBox(0.5F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -1.309F, 0.0F, 0.0F));

		PartDefinition feather4 = head.addOrReplaceChild("feather4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = feather4.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 18).addBox(0.5F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -1.3963F, 0.0F, 0.0F));

		PartDefinition feather5 = head.addOrReplaceChild("feather5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = feather5.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 18).addBox(0.5F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -1.4835F, 0.0F, 0.0F));

		PartDefinition feather6 = head.addOrReplaceChild("feather6", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.0F, 1.0F));

		PartDefinition cube_r7 = feather6.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 18).addBox(0.5F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.5F, 3.5F));

		PartDefinition cube_r8 = tail
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(7, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition wingleft = partdefinition.addOrReplaceChild("wingleft", CubeListBuilder.create(),
				PartPose.offset(1.0F, 17.0F, -1.0F));

		PartDefinition cube_r9 = wingleft
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(11, 2).addBox(0.0F, -1.0F, -1.0F, 1.0F, 3.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition wingright = partdefinition.addOrReplaceChild("wingright", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 17.0F, -1.0F));

		PartDefinition cube_r10 = wingright
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 3.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(0, 9)
				.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 21.0F, 0.5F));

		PartDefinition legright = partdefinition.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 21.0F, 0.5F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.wingright.xRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.wingleft.xRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
	}
}