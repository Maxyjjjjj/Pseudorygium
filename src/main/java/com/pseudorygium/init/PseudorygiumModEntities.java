
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pseudorygium.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import com.pseudorygium.entity.ZorseEntity;
import com.pseudorygium.entity.ZonkeyEntity;
import com.pseudorygium.entity.ZebraEntity;
import com.pseudorygium.entity.YakEntity;
import com.pseudorygium.entity.WoollyRhinocerosEntity;
import com.pseudorygium.entity.WoodpeckerEntity;
import com.pseudorygium.entity.WombatEntity;
import com.pseudorygium.entity.WolverineEntity;
import com.pseudorygium.entity.WisentEntity;
import com.pseudorygium.entity.WildBoarEntity;
import com.pseudorygium.entity.WhiteSharkEntity;
import com.pseudorygium.entity.WhaleSharkEntity;
import com.pseudorygium.entity.WeaselEntity;
import com.pseudorygium.entity.WaterbuckEntity;
import com.pseudorygium.entity.WarthogEntity;
import com.pseudorygium.entity.WalrusEntity;
import com.pseudorygium.entity.VultureEntity;
import com.pseudorygium.entity.VontsiraEntity;
import com.pseudorygium.entity.TurkeyEntity;
import com.pseudorygium.entity.ToucanEntity;
import com.pseudorygium.entity.TortoiseEntity;
import com.pseudorygium.entity.TitmouseEntity;
import com.pseudorygium.entity.TigerEntity;
import com.pseudorygium.entity.ThylacineEntity;
import com.pseudorygium.entity.TerrapinEntity;
import com.pseudorygium.entity.TenrecEntity;
import com.pseudorygium.entity.TarsierEntity;
import com.pseudorygium.entity.TapirEntity;
import com.pseudorygium.entity.TanukiEntity;
import com.pseudorygium.entity.SwanEntity;
import com.pseudorygium.entity.SwallowEntity;
import com.pseudorygium.entity.SugarGliderEntity;
import com.pseudorygium.entity.StorkEntity;
import com.pseudorygium.entity.StoatEntity;
import com.pseudorygium.entity.StarNosedMoleEntity;
import com.pseudorygium.entity.StagBeetleEntity;
import com.pseudorygium.entity.SquirrelEntity;
import com.pseudorygium.entity.SpringhareEntity;
import com.pseudorygium.entity.SpoonbillEntity;
import com.pseudorygium.entity.SparrowEntity;
import com.pseudorygium.entity.SnowyOwlEntity;
import com.pseudorygium.entity.SnowLeopardEntity;
import com.pseudorygium.entity.SnakeEntity;
import com.pseudorygium.entity.SnailEntity;
import com.pseudorygium.entity.SmilodonEntity;
import com.pseudorygium.entity.SlothEntity;
import com.pseudorygium.entity.SkunkEntity;
import com.pseudorygium.entity.SitatungaEntity;
import com.pseudorygium.entity.SiskinEntity;
import com.pseudorygium.entity.SiamangEntity;
import com.pseudorygium.entity.ShrimpEntity;
import com.pseudorygium.entity.ShoebillEntity;
import com.pseudorygium.entity.SheltopusikEntity;
import com.pseudorygium.entity.ServalEntity;
import com.pseudorygium.entity.SecretarybirdEntity;
import com.pseudorygium.entity.SealEntity;
import com.pseudorygium.entity.SeahorseEntity;
import com.pseudorygium.entity.SeagullEntity;
import com.pseudorygium.entity.SeadragonEntity;
import com.pseudorygium.entity.SeaPigEntity;
import com.pseudorygium.entity.SeaOtterEntity;
import com.pseudorygium.entity.SeaLionEntity;
import com.pseudorygium.entity.SawfishEntity;
import com.pseudorygium.entity.SaolaEntity;
import com.pseudorygium.entity.SalamanderEntity;
import com.pseudorygium.entity.SaigaEntity;
import com.pseudorygium.entity.RobinEntity;
import com.pseudorygium.entity.RoadrunnerEntity;
import com.pseudorygium.entity.RhinocerosEntity;
import com.pseudorygium.entity.RheaEntity;
import com.pseudorygium.entity.ReindeerEntity;
import com.pseudorygium.entity.RedPandaEntity;
import com.pseudorygium.entity.RavenEntity;
import com.pseudorygium.entity.RattlesnakeEntity;
import com.pseudorygium.entity.RatEntity;
import com.pseudorygium.entity.RaccoonEntity;
import com.pseudorygium.entity.QuollEntity;
import com.pseudorygium.entity.QuailEntity;
import com.pseudorygium.entity.PythonEntity;
import com.pseudorygium.entity.PumaEntity;
import com.pseudorygium.entity.PuffinEntity;
import com.pseudorygium.entity.PtarmiganEntity;
import com.pseudorygium.entity.PrzevalskiHorseEntity;
import com.pseudorygium.entity.PronghornEntity;
import com.pseudorygium.entity.ProcoptodonEntity;
import com.pseudorygium.entity.ProboscisMonkeyEntity;
import com.pseudorygium.entity.PotooEntity;
import com.pseudorygium.entity.PorcupineEntity;
import com.pseudorygium.entity.PolecatEntity;
import com.pseudorygium.entity.PlatypusEntity;
import com.pseudorygium.entity.PigeonEntity;
import com.pseudorygium.entity.PhilippineEagleEntity;
import com.pseudorygium.entity.PheasantEntity;
import com.pseudorygium.entity.PenguinEntity;
import com.pseudorygium.entity.PeafowlEntity;
import com.pseudorygium.entity.PangolinEntity;
import com.pseudorygium.entity.PallasCatEntity;
import com.pseudorygium.entity.PaddlefishEntity;
import com.pseudorygium.entity.OwlEntity;
import com.pseudorygium.entity.OtterEntity;
import com.pseudorygium.entity.OstrichEntity;
import com.pseudorygium.entity.OspreyEntity;
import com.pseudorygium.entity.OryxEntity;
import com.pseudorygium.entity.OrcaEntity;
import com.pseudorygium.entity.OrangutanEntity;
import com.pseudorygium.entity.OliveBaboonEntity;
import com.pseudorygium.entity.OkapiEntity;
import com.pseudorygium.entity.OctopusEntity;
import com.pseudorygium.entity.NumbatEntity;
import com.pseudorygium.entity.NarwhalEntity;
import com.pseudorygium.entity.NakedMoleRatEntity;
import com.pseudorygium.entity.MuskDeerEntity;
import com.pseudorygium.entity.MouseLemurEntity;
import com.pseudorygium.entity.MouseEntity;
import com.pseudorygium.entity.MooseEntity;
import com.pseudorygium.entity.MonkeyEntity;
import com.pseudorygium.entity.MongooseEntity;
import com.pseudorygium.entity.MolochEntity;
import com.pseudorygium.entity.MoleEntity;
import com.pseudorygium.entity.MohoEntity;
import com.pseudorygium.entity.MeerkatEntity;
import com.pseudorygium.entity.MarsupialLionEntity;
import com.pseudorygium.entity.MarmotEntity;
import com.pseudorygium.entity.MarabouEntity;
import com.pseudorygium.entity.MaraEntity;
import com.pseudorygium.entity.MantisShrimpEntity;
import com.pseudorygium.entity.MantisEntity;
import com.pseudorygium.entity.ManedWolfEntity;
import com.pseudorygium.entity.MandarinDuckEntity;
import com.pseudorygium.entity.ManateeEntity;
import com.pseudorygium.entity.MammothEntity;
import com.pseudorygium.entity.MagpieEntity;
import com.pseudorygium.entity.LynxEntity;
import com.pseudorygium.entity.LophorinaEntity;
import com.pseudorygium.entity.LizardEntity;
import com.pseudorygium.entity.LionEntity;
import com.pseudorygium.entity.LeopardEntity;
import com.pseudorygium.entity.LemurEntity;
import com.pseudorygium.entity.LemmingEntity;
import com.pseudorygium.entity.LeafTailedGeckoEntity;
import com.pseudorygium.entity.LammergeierEntity;
import com.pseudorygium.entity.LadybugEntity;
import com.pseudorygium.entity.KomodoDragonEntity;
import com.pseudorygium.entity.KoalaEntity;
import com.pseudorygium.entity.KiwiEntity;
import com.pseudorygium.entity.KangarooEntity;
import com.pseudorygium.entity.KakapoEntity;
import com.pseudorygium.entity.KaguEntity;
import com.pseudorygium.entity.JunglefowlEntity;
import com.pseudorygium.entity.JumpingSpiderEntity;
import com.pseudorygium.entity.JerboaEntity;
import com.pseudorygium.entity.JellyfishEntity;
import com.pseudorygium.entity.JayEntity;
import com.pseudorygium.entity.JaguarEntity;
import com.pseudorygium.entity.IguanaEntity;
import com.pseudorygium.entity.IbisEntity;
import com.pseudorygium.entity.HyenaEntity;
import com.pseudorygium.entity.HumpbackWhaleEntity;
import com.pseudorygium.entity.HummingbirdEntity;
import com.pseudorygium.entity.HornbillEntity;
import com.pseudorygium.entity.HoopoeEntity;
import com.pseudorygium.entity.HoneyBadgerEntity;
import com.pseudorygium.entity.HoatzinEntity;
import com.pseudorygium.entity.HippopotamusEntity;
import com.pseudorygium.entity.HeronEntity;
import com.pseudorygium.entity.HedgehogEntity;
import com.pseudorygium.entity.HareEntity;
import com.pseudorygium.entity.HamsterEntity;
import com.pseudorygium.entity.HamadryasBaboonEntity;
import com.pseudorygium.entity.GrouseEntity;
import com.pseudorygium.entity.GrebeEntity;
import com.pseudorygium.entity.GrassSnakeEntity;
import com.pseudorygium.entity.GorillaEntity;
import com.pseudorygium.entity.GoldfinchEntity;
import com.pseudorygium.entity.GiraffeEntity;
import com.pseudorygium.entity.GibbonEntity;
import com.pseudorygium.entity.GharialEntity;
import com.pseudorygium.entity.GerenukEntity;
import com.pseudorygium.entity.GenetEntity;
import com.pseudorygium.entity.GeckoEntity;
import com.pseudorygium.entity.GazelleEntity;
import com.pseudorygium.entity.FruitBatEntity;
import com.pseudorygium.entity.FrigatebirdEntity;
import com.pseudorygium.entity.FossaEntity;
import com.pseudorygium.entity.ForestBuffaloEntity;
import com.pseudorygium.entity.FlyingSquirrelEntity;
import com.pseudorygium.entity.FlamingoEntity;
import com.pseudorygium.entity.FiddlerCrabEntity;
import com.pseudorygium.entity.FerretEntity;
import com.pseudorygium.entity.FennecFoxEntity;
import com.pseudorygium.entity.EmuEntity;
import com.pseudorygium.entity.ElephantShrewEntity;
import com.pseudorygium.entity.ElephantEntity;
import com.pseudorygium.entity.EchidnaEntity;
import com.pseudorygium.entity.EarthwormEntityEntity;
import com.pseudorygium.entity.EagleEntity;
import com.pseudorygium.entity.DuikerEntity;
import com.pseudorygium.entity.DuckEntity;
import com.pseudorygium.entity.DragonflyEntity;
import com.pseudorygium.entity.DomesticGoatEntity;
import com.pseudorygium.entity.DogEntity;
import com.pseudorygium.entity.DodoEntity;
import com.pseudorygium.entity.DeerEntity;
import com.pseudorygium.entity.CrowEntity;
import com.pseudorygium.entity.CrocodileEntity;
import com.pseudorygium.entity.CrayfishEntity;
import com.pseudorygium.entity.CraneEntity;
import com.pseudorygium.entity.CrabEntity;
import com.pseudorygium.entity.CoyoteEntity;
import com.pseudorygium.entity.CorsacFoxEntity;
import com.pseudorygium.entity.CoralSnakeEntity;
import com.pseudorygium.entity.CobraEntity;
import com.pseudorygium.entity.CloudedLeopardEntity;
import com.pseudorygium.entity.ClamEntity;
import com.pseudorygium.entity.ChiruEntity;
import com.pseudorygium.entity.ChimpanzeeEntity;
import com.pseudorygium.entity.CheetahEntity;
import com.pseudorygium.entity.ChamoisEntity;
import com.pseudorygium.entity.ChameleonEntity;
import com.pseudorygium.entity.ChaffinchEntity;
import com.pseudorygium.entity.ChacmaBaboonEntity;
import com.pseudorygium.entity.CaterpillarEntity;
import com.pseudorygium.entity.CassowaryEntity;
import com.pseudorygium.entity.CarpEntity;
import com.pseudorygium.entity.CardinalEntity;
import com.pseudorygium.entity.CaracalEntity;
import com.pseudorygium.entity.CapybaraEntity;
import com.pseudorygium.entity.CapercaillieEntity;
import com.pseudorygium.entity.CanaryEntity;
import com.pseudorygium.entity.CamelSpitEntity;
import com.pseudorygium.entity.CaecilianEntity;
import com.pseudorygium.entity.ButterflyEntity;
import com.pseudorygium.entity.BullfinchEntity;
import com.pseudorygium.entity.BuffaloEntity;
import com.pseudorygium.entity.BrownBearEntity;
import com.pseudorygium.entity.BoobyEntity;
import com.pseudorygium.entity.BongoEntity;
import com.pseudorygium.entity.BlueWhaleEntity;
import com.pseudorygium.entity.BirdOfParadiseEntity;
import com.pseudorygium.entity.BinturongEntity;
import com.pseudorygium.entity.BelugaWhaleEntity;
import com.pseudorygium.entity.BelugaSturgeonEntity;
import com.pseudorygium.entity.BellbirdEntity;
import com.pseudorygium.entity.BeeEaterEntity;
import com.pseudorygium.entity.BeaverEntity;
import com.pseudorygium.entity.BarreleyeEntity;
import com.pseudorygium.entity.BandicootEntity;
import com.pseudorygium.entity.BadgerEntity;
import com.pseudorygium.entity.BactrianCamelEntity;
import com.pseudorygium.entity.AyeAyeEntity;
import com.pseudorygium.entity.AphidEntity;
import com.pseudorygium.entity.AnteaterEntity;
import com.pseudorygium.entity.AntEntity;
import com.pseudorygium.entity.AnoleEntity;
import com.pseudorygium.entity.AgamaEntity;
import com.pseudorygium.entity.AardwolfEntity;
import com.pseudorygium.entity.AardvarkEntity;
import com.pseudorygium.PseudorygiumMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class PseudorygiumModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, PseudorygiumMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<ZebraEntity>> ZEBRA = register("zebra",
			EntityType.Builder.<ZebraEntity>of(ZebraEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.3f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<EchidnaEntity>> ECHIDNA = register("echidna",
			EntityType.Builder.<EchidnaEntity>of(EchidnaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<BrownBearEntity>> BROWN_BEAR = register("brown_bear",
			EntityType.Builder.<BrownBearEntity>of(BrownBearEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.2f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<HedgehogEntity>> HEDGEHOG = register("hedgehog",
			EntityType.Builder.<HedgehogEntity>of(HedgehogEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<DeerEntity>> DEER = register("deer",
			EntityType.Builder.<DeerEntity>of(DeerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<SquirrelEntity>> SQUIRREL = register("squirrel",
			EntityType.Builder.<SquirrelEntity>of(SquirrelEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GiraffeEntity>> GIRAFFE = register("giraffe",
			EntityType.Builder.<GiraffeEntity>of(GiraffeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 3.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<MammothEntity>> MAMMOTH = register("mammoth",
			EntityType.Builder.<MammothEntity>of(MammothEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2.1f, 3.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<PheasantEntity>> PHEASANT = register("pheasant",
			EntityType.Builder.<PheasantEntity>of(PheasantEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<PlatypusEntity>> PLATYPUS = register("platypus",
			EntityType.Builder.<PlatypusEntity>of(PlatypusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<LionEntity>> LION = register("lion",
			EntityType.Builder.<LionEntity>of(LionEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TigerEntity>> TIGER = register("tiger",
			EntityType.Builder.<TigerEntity>of(TigerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<BarreleyeEntity>> BARRELEYE = register("barreleye",
			EntityType.Builder.<BarreleyeEntity>of(BarreleyeEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElephantEntity>> ELEPHANT = register("elephant",
			EntityType.Builder.<ElephantEntity>of(ElephantEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2.1f, 3.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<CraneEntity>> CRANE = register("crane",
			EntityType.Builder.<CraneEntity>of(CraneEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SnakeEntity>> SNAKE = register("snake",
			EntityType.Builder.<SnakeEntity>of(SnakeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<StorkEntity>> STORK = register("stork",
			EntityType.Builder.<StorkEntity>of(StorkEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WoodpeckerEntity>> WOODPECKER = register("woodpecker",
			EntityType.Builder.<WoodpeckerEntity>of(WoodpeckerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BuffaloEntity>> BUFFALO = register("buffalo",
			EntityType.Builder.<BuffaloEntity>of(BuffaloEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 1.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SitatungaEntity>> SITATUNGA = register("sitatunga",
			EntityType.Builder.<SitatungaEntity>of(SitatungaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<FossaEntity>> FOSSA = register("fossa",
			EntityType.Builder.<FossaEntity>of(FossaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChamoisEntity>> CHAMOIS = register("chamois",
			EntityType.Builder.<ChamoisEntity>of(ChamoisEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<SnailEntity>> SNAIL = register("snail",
			EntityType.Builder.<SnailEntity>of(SnailEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SnowLeopardEntity>> SNOW_LEOPARD = register("snow_leopard",
			EntityType.Builder.<SnowLeopardEntity>of(SnowLeopardEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChimpanzeeEntity>> CHIMPANZEE = register("chimpanzee",
			EntityType.Builder.<ChimpanzeeEntity>of(ChimpanzeeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 1.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AyeAyeEntity>> AYE_AYE = register("aye_aye",
			EntityType.Builder.<AyeAyeEntity>of(AyeAyeEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CapybaraEntity>> CAPYBARA = register("capybara",
			EntityType.Builder.<CapybaraEntity>of(CapybaraEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.1f, 1.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SaigaEntity>> SAIGA = register("saiga",
			EntityType.Builder.<SaigaEntity>of(SaigaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MonkeyEntity>> MONKEY = register("monkey",
			EntityType.Builder.<MonkeyEntity>of(MonkeyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<MantisEntity>> MANTIS = register("mantis",
			EntityType.Builder.<MantisEntity>of(MantisEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<OstrichEntity>> OSTRICH = register("ostrich",
			EntityType.Builder.<OstrichEntity>of(OstrichEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SealEntity>> SEAL = register("seal",
			EntityType.Builder.<SealEntity>of(SealEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ReindeerEntity>> REINDEER = register("reindeer",
			EntityType.Builder.<ReindeerEntity>of(ReindeerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<LemmingEntity>> LEMMING = register("lemming",
			EntityType.Builder.<LemmingEntity>of(LemmingEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GazelleEntity>> GAZELLE = register("gazelle",
			EntityType.Builder.<GazelleEntity>of(GazelleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<CheetahEntity>> CHEETAH = register("cheetah",
			EntityType.Builder.<CheetahEntity>of(CheetahEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<HummingbirdEntity>> HUMMINGBIRD = register("hummingbird",
			EntityType.Builder.<HummingbirdEntity>of(HummingbirdEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.55f));
	public static final DeferredHolder<EntityType<?>, EntityType<SecretarybirdEntity>> SECRETARYBIRD = register("secretarybird",
			EntityType.Builder.<SecretarybirdEntity>of(SecretarybirdEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 1.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MooseEntity>> MOOSE = register("moose",
			EntityType.Builder.<MooseEntity>of(MooseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RedPandaEntity>> RED_PANDA = register("red_panda",
			EntityType.Builder.<RedPandaEntity>of(RedPandaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RaccoonEntity>> RACCOON = register("raccoon",
			EntityType.Builder.<RaccoonEntity>of(RaccoonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SlothEntity>> SLOTH = register("sloth",
			EntityType.Builder.<SlothEntity>of(SlothEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<BinturongEntity>> BINTURONG = register("binturong",
			EntityType.Builder.<BinturongEntity>of(BinturongEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BadgerEntity>> BADGER = register("badger",
			EntityType.Builder.<BadgerEntity>of(BadgerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HeronEntity>> HERON = register("heron",
			EntityType.Builder.<HeronEntity>of(HeronEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CrabEntity>> CRAB = register("crab",
			EntityType.Builder.<CrabEntity>of(CrabEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<TortoiseEntity>> TORTOISE = register("tortoise",
			EntityType.Builder.<TortoiseEntity>of(TortoiseEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<OkapiEntity>> OKAPI = register("okapi",
			EntityType.Builder.<OkapiEntity>of(OkapiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<TanukiEntity>> TANUKI = register("tanuki",
			EntityType.Builder.<TanukiEntity>of(TanukiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<KangarooEntity>> KANGAROO = register("kangaroo",
			EntityType.Builder.<KangarooEntity>of(KangarooEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<GharialEntity>> GHARIAL = register("gharial",
			EntityType.Builder.<GharialEntity>of(GharialEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<OrangutanEntity>> ORANGUTAN = register("orangutan",
			EntityType.Builder.<OrangutanEntity>of(OrangutanEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<LophorinaEntity>> LOPHORINA = register("lophorina",
			EntityType.Builder.<LophorinaEntity>of(LophorinaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AardvarkEntity>> AARDVARK = register("aardvark",
			EntityType.Builder.<AardvarkEntity>of(AardvarkEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<PangolinEntity>> PANGOLIN = register("pangolin",
			EntityType.Builder.<PangolinEntity>of(PangolinEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ButterflyEntity>> BUTTERFLY = register("butterfly",
			EntityType.Builder.<ButterflyEntity>of(ButterflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MagpieEntity>> MAGPIE = register("magpie",
			EntityType.Builder.<MagpieEntity>of(MagpieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<HippopotamusEntity>> HIPPOPOTAMUS = register("hippopotamus",
			EntityType.Builder.<HippopotamusEntity>of(HippopotamusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<TitmouseEntity>> TITMOUSE = register("titmouse",
			EntityType.Builder.<TitmouseEntity>of(TitmouseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SparrowEntity>> SPARROW = register("sparrow",
			EntityType.Builder.<SparrowEntity>of(SparrowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RobinEntity>> ROBIN = register("robin",
			EntityType.Builder.<RobinEntity>of(RobinEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChaffinchEntity>> CHAFFINCH = register("chaffinch",
			EntityType.Builder.<ChaffinchEntity>of(ChaffinchEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BullfinchEntity>> BULLFINCH = register("bullfinch",
			EntityType.Builder.<BullfinchEntity>of(BullfinchEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<KiwiEntity>> KIWI = register("kiwi",
			EntityType.Builder.<KiwiEntity>of(KiwiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<CrowEntity>> CROW = register("crow",
			EntityType.Builder.<CrowEntity>of(CrowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<RavenEntity>> RAVEN = register("raven",
			EntityType.Builder.<RavenEntity>of(RavenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<JayEntity>> JAY = register("jay", EntityType.Builder.<JayEntity>of(JayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RhinocerosEntity>> RHINOCEROS = register("rhinoceros",
			EntityType.Builder.<RhinocerosEntity>of(RhinocerosEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WaterbuckEntity>> WATERBUCK = register("waterbuck",
			EntityType.Builder.<WaterbuckEntity>of(WaterbuckEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PenguinEntity>> PENGUIN = register("penguin",
			EntityType.Builder.<PenguinEntity>of(PenguinEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PeafowlEntity>> PEAFOWL = register("peafowl",
			EntityType.Builder.<PeafowlEntity>of(PeafowlEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WalrusEntity>> WALRUS = register("walrus",
			EntityType.Builder.<WalrusEntity>of(WalrusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MeerkatEntity>> MEERKAT = register("meerkat",
			EntityType.Builder.<MeerkatEntity>of(MeerkatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<VultureEntity>> VULTURE = register("vulture",
			EntityType.Builder.<VultureEntity>of(VultureEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PigeonEntity>> PIGEON = register("pigeon",
			EntityType.Builder.<PigeonEntity>of(PigeonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BellbirdEntity>> BELLBIRD = register("bellbird",
			EntityType.Builder.<BellbirdEntity>of(BellbirdEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LemurEntity>> LEMUR = register("lemur",
			EntityType.Builder.<LemurEntity>of(LemurEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ZorseEntity>> ZORSE = register("zorse",
			EntityType.Builder.<ZorseEntity>of(ZorseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ZonkeyEntity>> ZONKEY = register("zonkey",
			EntityType.Builder.<ZonkeyEntity>of(ZonkeyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GorillaEntity>> GORILLA = register("gorilla",
			EntityType.Builder.<GorillaEntity>of(GorillaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MouseLemurEntity>> MOUSE_LEMUR = register("mouse_lemur",
			EntityType.Builder.<MouseLemurEntity>of(MouseLemurEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GibbonEntity>> GIBBON = register("gibbon",
			EntityType.Builder.<GibbonEntity>of(GibbonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<EmuEntity>> EMU = register("emu", EntityType.Builder.<EmuEntity>of(EmuEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<QuollEntity>> QUOLL = register("quoll",
			EntityType.Builder.<QuollEntity>of(QuollEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WombatEntity>> WOMBAT = register("wombat",
			EntityType.Builder.<WombatEntity>of(WombatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BandicootEntity>> BANDICOOT = register("bandicoot",
			EntityType.Builder.<BandicootEntity>of(BandicootEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NumbatEntity>> NUMBAT = register("numbat",
			EntityType.Builder.<NumbatEntity>of(NumbatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HamsterEntity>> HAMSTER = register("hamster",
			EntityType.Builder.<HamsterEntity>of(HamsterEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LynxEntity>> LYNX = register("lynx",
			EntityType.Builder.<LynxEntity>of(LynxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BactrianCamelEntity>> BACTRIAN_CAMEL = register("bactrian_camel",
			EntityType.Builder.<BactrianCamelEntity>of(BactrianCamelEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.7f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PhilippineEagleEntity>> PHILIPPINE_EAGLE = register("philippine_eagle",
			EntityType.Builder.<PhilippineEagleEntity>of(PhilippineEagleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EagleEntity>> EAGLE = register("eagle",
			EntityType.Builder.<EagleEntity>of(EagleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<OspreyEntity>> OSPREY = register("osprey",
			EntityType.Builder.<OspreyEntity>of(OspreyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MouseEntity>> MOUSE = register("mouse",
			EntityType.Builder.<MouseEntity>of(MouseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<OwlEntity>> OWL = register("owl", EntityType.Builder.<OwlEntity>of(OwlEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SnowyOwlEntity>> SNOWY_OWL = register("snowy_owl",
			EntityType.Builder.<SnowyOwlEntity>of(SnowyOwlEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PtarmiganEntity>> PTARMIGAN = register("ptarmigan",
			EntityType.Builder.<PtarmiganEntity>of(PtarmiganEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HoatzinEntity>> HOATZIN = register("hoatzin",
			EntityType.Builder.<HoatzinEntity>of(HoatzinEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DuikerEntity>> DUIKER = register("duiker",
			EntityType.Builder.<DuikerEntity>of(DuikerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WarthogEntity>> WARTHOG = register("warthog",
			EntityType.Builder.<WarthogEntity>of(WarthogEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChiruEntity>> CHIRU = register("chiru",
			EntityType.Builder.<ChiruEntity>of(ChiruEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HoneyBadgerEntity>> HONEY_BADGER = register("honey_badger",
			EntityType.Builder.<HoneyBadgerEntity>of(HoneyBadgerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MohoEntity>> MOHO = register("moho",
			EntityType.Builder.<MohoEntity>of(MohoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BongoEntity>> BONGO = register("bongo",
			EntityType.Builder.<BongoEntity>of(BongoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CaterpillarEntity>> CATERPILLAR = register("caterpillar",
			EntityType.Builder.<CaterpillarEntity>of(CaterpillarEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<OctopusEntity>> OCTOPUS = register("octopus",
			EntityType.Builder.<OctopusEntity>of(OctopusEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ClamEntity>> CLAM = register("clam",
			EntityType.Builder.<ClamEntity>of(ClamEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AphidEntity>> APHID = register("aphid",
			EntityType.Builder.<AphidEntity>of(AphidEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<JumpingSpiderEntity>> JUMPING_SPIDER = register("jumping_spider",
			EntityType.Builder.<JumpingSpiderEntity>of(JumpingSpiderEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LadybugEntity>> LADYBUG = register("ladybug",
			EntityType.Builder.<LadybugEntity>of(LadybugEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EarthwormEntityEntity>> EARTHWORM_ENTITY = register("earthworm_entity",
			EntityType.Builder.<EarthwormEntityEntity>of(EarthwormEntityEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<SheltopusikEntity>> SHELTOPUSIK = register("sheltopusik",
			EntityType.Builder.<SheltopusikEntity>of(SheltopusikEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AntEntity>> ANT = register("ant", EntityType.Builder.<AntEntity>of(AntEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.6f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<KomodoDragonEntity>> KOMODO_DRAGON = register("komodo_dragon",
			EntityType.Builder.<KomodoDragonEntity>of(KomodoDragonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SalamanderEntity>> SALAMANDER = register("salamander",
			EntityType.Builder.<SalamanderEntity>of(SalamanderEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LizardEntity>> LIZARD = register("lizard",
			EntityType.Builder.<LizardEntity>of(LizardEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<IguanaEntity>> IGUANA = register("iguana",
			EntityType.Builder.<IguanaEntity>of(IguanaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ServalEntity>> SERVAL = register("serval",
			EntityType.Builder.<ServalEntity>of(ServalEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PorcupineEntity>> PORCUPINE = register("porcupine",
			EntityType.Builder.<PorcupineEntity>of(PorcupineEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MarabouEntity>> MARABOU = register("marabou",
			EntityType.Builder.<MarabouEntity>of(MarabouEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<OryxEntity>> ORYX = register("oryx",
			EntityType.Builder.<OryxEntity>of(OryxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AardwolfEntity>> AARDWOLF = register("aardwolf",
			EntityType.Builder.<AardwolfEntity>of(AardwolfEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GerenukEntity>> GERENUK = register("gerenuk",
			EntityType.Builder.<GerenukEntity>of(GerenukEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HyenaEntity>> HYENA = register("hyena",
			EntityType.Builder.<HyenaEntity>of(HyenaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CrocodileEntity>> CROCODILE = register("crocodile",
			EntityType.Builder.<CrocodileEntity>of(CrocodileEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ForestBuffaloEntity>> FOREST_BUFFALO = register("forest_buffalo",
			EntityType.Builder.<ForestBuffaloEntity>of(ForestBuffaloEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FennecFoxEntity>> FENNEC_FOX = register("fennec_fox",
			EntityType.Builder.<FennecFoxEntity>of(FennecFoxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<KakapoEntity>> KAKAPO = register("kakapo",
			EntityType.Builder.<KakapoEntity>of(KakapoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<KaguEntity>> KAGU = register("kagu",
			EntityType.Builder.<KaguEntity>of(KaguEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RatEntity>> RAT = register("rat", EntityType.Builder.<RatEntity>of(RatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeeEaterEntity>> BEE_EATER = register("bee_eater",
			EntityType.Builder.<BeeEaterEntity>of(BeeEaterEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BirdOfParadiseEntity>> BIRD_OF_PARADISE = register("bird_of_paradise",
			EntityType.Builder.<BirdOfParadiseEntity>of(BirdOfParadiseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CassowaryEntity>> CASSOWARY = register("cassowary",
			EntityType.Builder.<CassowaryEntity>of(CassowaryEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ToucanEntity>> TOUCAN = register("toucan",
			EntityType.Builder.<ToucanEntity>of(ToucanEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GrebeEntity>> GREBE = register("grebe",
			EntityType.Builder.<GrebeEntity>of(GrebeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RheaEntity>> RHEA = register("rhea",
			EntityType.Builder.<RheaEntity>of(RheaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DuckEntity>> DUCK = register("duck",
			EntityType.Builder.<DuckEntity>of(DuckEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MandarinDuckEntity>> MANDARIN_DUCK = register("mandarin_duck",
			EntityType.Builder.<MandarinDuckEntity>of(MandarinDuckEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<JunglefowlEntity>> JUNGLEFOWL = register("junglefowl",
			EntityType.Builder.<JunglefowlEntity>of(JunglefowlEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HornbillEntity>> HORNBILL = register("hornbill",
			EntityType.Builder.<HornbillEntity>of(HornbillEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FrigatebirdEntity>> FRIGATEBIRD = register("frigatebird",
			EntityType.Builder.<FrigatebirdEntity>of(FrigatebirdEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SpoonbillEntity>> SPOONBILL = register("spoonbill",
			EntityType.Builder.<SpoonbillEntity>of(SpoonbillEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlamingoEntity>> FLAMINGO = register("flamingo",
			EntityType.Builder.<FlamingoEntity>of(FlamingoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShoebillEntity>> SHOEBILL = register("shoebill",
			EntityType.Builder.<ShoebillEntity>of(ShoebillEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrzevalskiHorseEntity>> PRZEVALSKI_HORSE = register("przevalski_horse",
			EntityType.Builder.<PrzevalskiHorseEntity>of(PrzevalskiHorseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DomesticGoatEntity>> DOMESTIC_GOAT = register("domestic_goat",
			EntityType.Builder.<DomesticGoatEntity>of(DomesticGoatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldfinchEntity>> GOLDFINCH = register("goldfinch",
			EntityType.Builder.<GoldfinchEntity>of(GoldfinchEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShrimpEntity>> SHRIMP = register("shrimp",
			EntityType.Builder.<ShrimpEntity>of(ShrimpEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<YakEntity>> YAK = register("yak", EntityType.Builder.<YakEntity>of(YakEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<IbisEntity>> IBIS = register("ibis",
			EntityType.Builder.<IbisEntity>of(IbisEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CrayfishEntity>> CRAYFISH = register("crayfish",
			EntityType.Builder.<CrayfishEntity>of(CrayfishEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<FruitBatEntity>> FRUIT_BAT = register("fruit_bat",
			EntityType.Builder.<FruitBatEntity>of(FruitBatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PallasCatEntity>> PALLAS_CAT = register("pallas_cat",
			EntityType.Builder.<PallasCatEntity>of(PallasCatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<JerboaEntity>> JERBOA = register("jerboa",
			EntityType.Builder.<JerboaEntity>of(JerboaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElephantShrewEntity>> ELEPHANT_SHREW = register("elephant_shrew",
			EntityType.Builder.<ElephantShrewEntity>of(ElephantShrewEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FerretEntity>> FERRET = register("ferret",
			EntityType.Builder.<FerretEntity>of(FerretEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<PolecatEntity>> POLECAT = register("polecat",
			EntityType.Builder.<PolecatEntity>of(PolecatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<SpringhareEntity>> SPRINGHARE = register("springhare",
			EntityType.Builder.<SpringhareEntity>of(SpringhareEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<OtterEntity>> OTTER = register("otter",
			EntityType.Builder.<OtterEntity>of(OtterEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MaraEntity>> MARA = register("mara",
			EntityType.Builder.<MaraEntity>of(MaraEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PuffinEntity>> PUFFIN = register("puffin",
			EntityType.Builder.<PuffinEntity>of(PuffinEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MarmotEntity>> MARMOT = register("marmot",
			EntityType.Builder.<MarmotEntity>of(MarmotEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BlueWhaleEntity>> BLUE_WHALE = register("blue_whale",
			EntityType.Builder.<BlueWhaleEntity>of(BlueWhaleEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(3f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<OrcaEntity>> ORCA = register("orca",
			EntityType.Builder.<OrcaEntity>of(OrcaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BelugaWhaleEntity>> BELUGA_WHALE = register("beluga_whale",
			EntityType.Builder.<BelugaWhaleEntity>of(BelugaWhaleEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BelugaSturgeonEntity>> BELUGA_STURGEON = register("beluga_sturgeon",
			EntityType.Builder.<BelugaSturgeonEntity>of(BelugaSturgeonEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SeaOtterEntity>> SEA_OTTER = register("sea_otter",
			EntityType.Builder.<SeaOtterEntity>of(SeaOtterEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SeagullEntity>> SEAGULL = register("seagull",
			EntityType.Builder.<SeagullEntity>of(SeagullEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BoobyEntity>> BOOBY = register("booby",
			EntityType.Builder.<BoobyEntity>of(BoobyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SawfishEntity>> SAWFISH = register("sawfish",
			EntityType.Builder.<SawfishEntity>of(SawfishEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<WhiteSharkEntity>> WHITE_SHARK = register("white_shark",
			EntityType.Builder.<WhiteSharkEntity>of(WhiteSharkEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PaddlefishEntity>> PADDLEFISH = register("paddlefish",
			EntityType.Builder.<PaddlefishEntity>of(PaddlefishEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<HumpbackWhaleEntity>> HUMPBACK_WHALE = register("humpback_whale",
			EntityType.Builder.<HumpbackWhaleEntity>of(HumpbackWhaleEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FiddlerCrabEntity>> FIDDLER_CRAB = register("fiddler_crab",
			EntityType.Builder.<FiddlerCrabEntity>of(FiddlerCrabEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SwanEntity>> SWAN = register("swan",
			EntityType.Builder.<SwanEntity>of(SwanEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TarsierEntity>> TARSIER = register("tarsier",
			EntityType.Builder.<TarsierEntity>of(TarsierEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ManateeEntity>> MANATEE = register("manatee",
			EntityType.Builder.<ManateeEntity>of(ManateeEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PumaEntity>> PUMA = register("puma",
			EntityType.Builder.<PumaEntity>of(PumaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CaracalEntity>> CARACAL = register("caracal",
			EntityType.Builder.<CaracalEntity>of(CaracalEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CloudedLeopardEntity>> CLOUDED_LEOPARD = register("clouded_leopard",
			EntityType.Builder.<CloudedLeopardEntity>of(CloudedLeopardEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AnteaterEntity>> ANTEATER = register("anteater",
			EntityType.Builder.<AnteaterEntity>of(AnteaterEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<JaguarEntity>> JAGUAR = register("jaguar",
			EntityType.Builder.<JaguarEntity>of(JaguarEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlyingSquirrelEntity>> FLYING_SQUIRREL = register("flying_squirrel",
			EntityType.Builder.<FlyingSquirrelEntity>of(FlyingSquirrelEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SeahorseEntity>> SEAHORSE = register("seahorse",
			EntityType.Builder.<SeahorseEntity>of(SeahorseEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SeadragonEntity>> SEADRAGON = register("seadragon",
			EntityType.Builder.<SeadragonEntity>of(SeadragonEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SugarGliderEntity>> SUGAR_GLIDER = register("sugar_glider",
			EntityType.Builder.<SugarGliderEntity>of(SugarGliderEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MoleEntity>> MOLE = register("mole",
			EntityType.Builder.<MoleEntity>of(MoleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<JellyfishEntity>> JELLYFISH = register("jellyfish",
			EntityType.Builder.<JellyfishEntity>of(JellyfishEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyEntity>> DRAGONFLY = register("dragonfly",
			EntityType.Builder.<DragonflyEntity>of(DragonflyEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ProboscisMonkeyEntity>> PROBOSCIS_MONKEY = register("proboscis_monkey",
			EntityType.Builder.<ProboscisMonkeyEntity>of(ProboscisMonkeyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HamadryasBaboonEntity>> HAMADRYAS_BABOON = register("hamadryas_baboon",
			EntityType.Builder.<HamadryasBaboonEntity>of(HamadryasBaboonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChacmaBaboonEntity>> CHACMA_BABOON = register("chacma_baboon",
			EntityType.Builder.<ChacmaBaboonEntity>of(ChacmaBaboonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<OliveBaboonEntity>> OLIVE_BABOON = register("olive_baboon",
			EntityType.Builder.<OliveBaboonEntity>of(OliveBaboonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SiamangEntity>> SIAMANG = register("siamang",
			EntityType.Builder.<SiamangEntity>of(SiamangEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<StagBeetleEntity>> STAG_BEETLE = register("stag_beetle",
			EntityType.Builder.<StagBeetleEntity>of(StagBeetleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GeckoEntity>> GECKO = register("gecko",
			EntityType.Builder.<GeckoEntity>of(GeckoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<MantisShrimpEntity>> MANTIS_SHRIMP = register("mantis_shrimp",
			EntityType.Builder.<MantisShrimpEntity>of(MantisShrimpEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NakedMoleRatEntity>> NAKED_MOLE_RAT = register("naked_mole_rat",
			EntityType.Builder.<NakedMoleRatEntity>of(NakedMoleRatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PotooEntity>> POTOO = register("potoo",
			EntityType.Builder.<PotooEntity>of(PotooEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TenrecEntity>> TENREC = register("tenrec",
			EntityType.Builder.<TenrecEntity>of(TenrecEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<StarNosedMoleEntity>> STAR_NOSED_MOLE = register("star_nosed_mole",
			EntityType.Builder.<StarNosedMoleEntity>of(StarNosedMoleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CaecilianEntity>> CAECILIAN = register("caecilian",
			EntityType.Builder.<CaecilianEntity>of(CaecilianEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SeaPigEntity>> SEA_PIG = register("sea_pig",
			EntityType.Builder.<SeaPigEntity>of(SeaPigEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<VontsiraEntity>> VONTSIRA = register("vontsira",
			EntityType.Builder.<VontsiraEntity>of(VontsiraEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CobraEntity>> COBRA = register("cobra",
			EntityType.Builder.<CobraEntity>of(CobraEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MongooseEntity>> MONGOOSE = register("mongoose",
			EntityType.Builder.<MongooseEntity>of(MongooseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RattlesnakeEntity>> RATTLESNAKE = register("rattlesnake",
			EntityType.Builder.<RattlesnakeEntity>of(RattlesnakeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NarwhalEntity>> NARWHAL = register("narwhal",
			EntityType.Builder.<NarwhalEntity>of(NarwhalEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SeaLionEntity>> SEA_LION = register("sea_lion",
			EntityType.Builder.<SeaLionEntity>of(SeaLionEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CoyoteEntity>> COYOTE = register("coyote",
			EntityType.Builder.<CoyoteEntity>of(CoyoteEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PythonEntity>> PYTHON = register("python",
			EntityType.Builder.<PythonEntity>of(PythonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WisentEntity>> WISENT = register("wisent",
			EntityType.Builder.<WisentEntity>of(WisentEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RoadrunnerEntity>> ROADRUNNER = register("roadrunner",
			EntityType.Builder.<RoadrunnerEntity>of(RoadrunnerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GenetEntity>> GENET = register("genet",
			EntityType.Builder.<GenetEntity>of(GenetEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CapercaillieEntity>> CAPERCAILLIE = register("capercaillie",
			EntityType.Builder.<CapercaillieEntity>of(CapercaillieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GrouseEntity>> GROUSE = register("grouse",
			EntityType.Builder.<GrouseEntity>of(GrouseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TapirEntity>> TAPIR = register("tapir",
			EntityType.Builder.<TapirEntity>of(TapirEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TurkeyEntity>> TURKEY = register("turkey",
			EntityType.Builder.<TurkeyEntity>of(TurkeyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LammergeierEntity>> LAMMERGEIER = register("lammergeier",
			EntityType.Builder.<LammergeierEntity>of(LammergeierEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HoopoeEntity>> HOOPOE = register("hoopoe",
			EntityType.Builder.<HoopoeEntity>of(HoopoeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DodoEntity>> DODO = register("dodo",
			EntityType.Builder.<DodoEntity>of(DodoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WoollyRhinocerosEntity>> WOOLLY_RHINOCEROS = register("woolly_rhinoceros",
			EntityType.Builder.<WoollyRhinocerosEntity>of(WoollyRhinocerosEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SmilodonEntity>> SMILODON = register("smilodon",
			EntityType.Builder.<SmilodonEntity>of(SmilodonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ProcoptodonEntity>> PROCOPTODON = register("procoptodon",
			EntityType.Builder.<ProcoptodonEntity>of(ProcoptodonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MarsupialLionEntity>> MARSUPIAL_LION = register("marsupial_lion",
			EntityType.Builder.<MarsupialLionEntity>of(MarsupialLionEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThylacineEntity>> THYLACINE = register("thylacine",
			EntityType.Builder.<ThylacineEntity>of(ThylacineEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WildBoarEntity>> WILD_BOAR = register("wild_boar",
			EntityType.Builder.<WildBoarEntity>of(WildBoarEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WolverineEntity>> WOLVERINE = register("wolverine",
			EntityType.Builder.<WolverineEntity>of(WolverineEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<StoatEntity>> STOAT = register("stoat",
			EntityType.Builder.<StoatEntity>of(StoatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WeaselEntity>> WEASEL = register("weasel",
			EntityType.Builder.<WeaselEntity>of(WeaselEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<CorsacFoxEntity>> CORSAC_FOX = register("corsac_fox",
			EntityType.Builder.<CorsacFoxEntity>of(CorsacFoxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkunkEntity>> SKUNK = register("skunk",
			EntityType.Builder.<SkunkEntity>of(SkunkEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<ManedWolfEntity>> MANED_WOLF = register("maned_wolf",
			EntityType.Builder.<ManedWolfEntity>of(ManedWolfEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<MuskDeerEntity>> MUSK_DEER = register("musk_deer",
			EntityType.Builder.<MuskDeerEntity>of(MuskDeerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<QuailEntity>> QUAIL = register("quail",
			EntityType.Builder.<QuailEntity>of(QuailEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WhaleSharkEntity>> WHALE_SHARK = register("whale_shark",
			EntityType.Builder.<WhaleSharkEntity>of(WhaleSharkEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.8f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<TerrapinEntity>> TERRAPIN = register("terrapin",
			EntityType.Builder.<TerrapinEntity>of(TerrapinEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<AnoleEntity>> ANOLE = register("anole",
			EntityType.Builder.<AnoleEntity>of(AnoleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<AgamaEntity>> AGAMA = register("agama",
			EntityType.Builder.<AgamaEntity>of(AgamaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<MolochEntity>> MOLOCH = register("moloch",
			EntityType.Builder.<MolochEntity>of(MolochEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<LeafTailedGeckoEntity>> LEAF_TAILED_GECKO = register("leaf_tailed_gecko",
			EntityType.Builder.<LeafTailedGeckoEntity>of(LeafTailedGeckoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChameleonEntity>> CHAMELEON = register("chameleon",
			EntityType.Builder.<ChameleonEntity>of(ChameleonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<CarpEntity>> CARP = register("carp",
			EntityType.Builder.<CarpEntity>of(CarpEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<CamelSpitEntity>> CAMEL_SPIT = register("camel_spit",
			EntityType.Builder.<CamelSpitEntity>of(CamelSpitEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<LeopardEntity>> LEOPARD = register("leopard",
			EntityType.Builder.<LeopardEntity>of(LeopardEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SaolaEntity>> SAOLA = register("saola",
			EntityType.Builder.<SaolaEntity>of(SaolaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PronghornEntity>> PRONGHORN = register("pronghorn",
			EntityType.Builder.<PronghornEntity>of(PronghornEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<DogEntity>> DOG = register("dog", EntityType.Builder.<DogEntity>of(DogEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SwallowEntity>> SWALLOW = register("swallow",
			EntityType.Builder.<SwallowEntity>of(SwallowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.3f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeaverEntity>> BEAVER = register("beaver",
			EntityType.Builder.<BeaverEntity>of(BeaverEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GrassSnakeEntity>> GRASS_SNAKE = register("grass_snake",
			EntityType.Builder.<GrassSnakeEntity>of(GrassSnakeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CoralSnakeEntity>> CORAL_SNAKE = register("coral_snake",
			EntityType.Builder.<CoralSnakeEntity>of(CoralSnakeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SiskinEntity>> SISKIN = register("siskin",
			EntityType.Builder.<SiskinEntity>of(SiskinEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CardinalEntity>> CARDINAL = register("cardinal",
			EntityType.Builder.<CardinalEntity>of(CardinalEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CanaryEntity>> CANARY = register("canary",
			EntityType.Builder.<CanaryEntity>of(CanaryEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<KoalaEntity>> KOALA = register("koala",
			EntityType.Builder.<KoalaEntity>of(KoalaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HareEntity>> HARE = register("hare",
			EntityType.Builder.<HareEntity>of(HareEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		ZebraEntity.init(event);
		EchidnaEntity.init(event);
		BrownBearEntity.init(event);
		HedgehogEntity.init(event);
		DeerEntity.init(event);
		SquirrelEntity.init(event);
		GiraffeEntity.init(event);
		MammothEntity.init(event);
		PheasantEntity.init(event);
		PlatypusEntity.init(event);
		LionEntity.init(event);
		TigerEntity.init(event);
		BarreleyeEntity.init(event);
		ElephantEntity.init(event);
		CraneEntity.init(event);
		SnakeEntity.init(event);
		StorkEntity.init(event);
		WoodpeckerEntity.init(event);
		BuffaloEntity.init(event);
		SitatungaEntity.init(event);
		FossaEntity.init(event);
		ChamoisEntity.init(event);
		SnailEntity.init(event);
		SnowLeopardEntity.init(event);
		ChimpanzeeEntity.init(event);
		AyeAyeEntity.init(event);
		CapybaraEntity.init(event);
		SaigaEntity.init(event);
		MonkeyEntity.init(event);
		MantisEntity.init(event);
		OstrichEntity.init(event);
		SealEntity.init(event);
		ReindeerEntity.init(event);
		LemmingEntity.init(event);
		GazelleEntity.init(event);
		CheetahEntity.init(event);
		HummingbirdEntity.init(event);
		SecretarybirdEntity.init(event);
		MooseEntity.init(event);
		RedPandaEntity.init(event);
		RaccoonEntity.init(event);
		SlothEntity.init(event);
		BinturongEntity.init(event);
		BadgerEntity.init(event);
		HeronEntity.init(event);
		CrabEntity.init(event);
		TortoiseEntity.init(event);
		OkapiEntity.init(event);
		TanukiEntity.init(event);
		KangarooEntity.init(event);
		GharialEntity.init(event);
		OrangutanEntity.init(event);
		LophorinaEntity.init(event);
		AardvarkEntity.init(event);
		PangolinEntity.init(event);
		ButterflyEntity.init(event);
		MagpieEntity.init(event);
		HippopotamusEntity.init(event);
		TitmouseEntity.init(event);
		SparrowEntity.init(event);
		RobinEntity.init(event);
		ChaffinchEntity.init(event);
		BullfinchEntity.init(event);
		KiwiEntity.init(event);
		CrowEntity.init(event);
		RavenEntity.init(event);
		JayEntity.init(event);
		RhinocerosEntity.init(event);
		WaterbuckEntity.init(event);
		PenguinEntity.init(event);
		PeafowlEntity.init(event);
		WalrusEntity.init(event);
		MeerkatEntity.init(event);
		VultureEntity.init(event);
		PigeonEntity.init(event);
		BellbirdEntity.init(event);
		LemurEntity.init(event);
		ZorseEntity.init(event);
		ZonkeyEntity.init(event);
		GorillaEntity.init(event);
		MouseLemurEntity.init(event);
		GibbonEntity.init(event);
		EmuEntity.init(event);
		QuollEntity.init(event);
		WombatEntity.init(event);
		BandicootEntity.init(event);
		NumbatEntity.init(event);
		HamsterEntity.init(event);
		LynxEntity.init(event);
		BactrianCamelEntity.init(event);
		PhilippineEagleEntity.init(event);
		EagleEntity.init(event);
		OspreyEntity.init(event);
		MouseEntity.init(event);
		OwlEntity.init(event);
		SnowyOwlEntity.init(event);
		PtarmiganEntity.init(event);
		HoatzinEntity.init(event);
		DuikerEntity.init(event);
		WarthogEntity.init(event);
		ChiruEntity.init(event);
		HoneyBadgerEntity.init(event);
		MohoEntity.init(event);
		BongoEntity.init(event);
		CaterpillarEntity.init(event);
		OctopusEntity.init(event);
		ClamEntity.init(event);
		AphidEntity.init(event);
		JumpingSpiderEntity.init(event);
		LadybugEntity.init(event);
		EarthwormEntityEntity.init(event);
		SheltopusikEntity.init(event);
		AntEntity.init(event);
		KomodoDragonEntity.init(event);
		SalamanderEntity.init(event);
		LizardEntity.init(event);
		IguanaEntity.init(event);
		ServalEntity.init(event);
		PorcupineEntity.init(event);
		MarabouEntity.init(event);
		OryxEntity.init(event);
		AardwolfEntity.init(event);
		GerenukEntity.init(event);
		HyenaEntity.init(event);
		CrocodileEntity.init(event);
		ForestBuffaloEntity.init(event);
		FennecFoxEntity.init(event);
		KakapoEntity.init(event);
		KaguEntity.init(event);
		RatEntity.init(event);
		BeeEaterEntity.init(event);
		BirdOfParadiseEntity.init(event);
		CassowaryEntity.init(event);
		ToucanEntity.init(event);
		GrebeEntity.init(event);
		RheaEntity.init(event);
		DuckEntity.init(event);
		MandarinDuckEntity.init(event);
		JunglefowlEntity.init(event);
		HornbillEntity.init(event);
		FrigatebirdEntity.init(event);
		SpoonbillEntity.init(event);
		FlamingoEntity.init(event);
		ShoebillEntity.init(event);
		PrzevalskiHorseEntity.init(event);
		DomesticGoatEntity.init(event);
		GoldfinchEntity.init(event);
		ShrimpEntity.init(event);
		YakEntity.init(event);
		IbisEntity.init(event);
		CrayfishEntity.init(event);
		FruitBatEntity.init(event);
		PallasCatEntity.init(event);
		JerboaEntity.init(event);
		ElephantShrewEntity.init(event);
		FerretEntity.init(event);
		PolecatEntity.init(event);
		SpringhareEntity.init(event);
		OtterEntity.init(event);
		MaraEntity.init(event);
		PuffinEntity.init(event);
		MarmotEntity.init(event);
		BlueWhaleEntity.init(event);
		OrcaEntity.init(event);
		BelugaWhaleEntity.init(event);
		BelugaSturgeonEntity.init(event);
		SeaOtterEntity.init(event);
		SeagullEntity.init(event);
		BoobyEntity.init(event);
		SawfishEntity.init(event);
		WhiteSharkEntity.init(event);
		PaddlefishEntity.init(event);
		HumpbackWhaleEntity.init(event);
		FiddlerCrabEntity.init(event);
		SwanEntity.init(event);
		TarsierEntity.init(event);
		ManateeEntity.init(event);
		PumaEntity.init(event);
		CaracalEntity.init(event);
		CloudedLeopardEntity.init(event);
		AnteaterEntity.init(event);
		JaguarEntity.init(event);
		FlyingSquirrelEntity.init(event);
		SeahorseEntity.init(event);
		SeadragonEntity.init(event);
		SugarGliderEntity.init(event);
		MoleEntity.init(event);
		JellyfishEntity.init(event);
		DragonflyEntity.init(event);
		ProboscisMonkeyEntity.init(event);
		HamadryasBaboonEntity.init(event);
		ChacmaBaboonEntity.init(event);
		OliveBaboonEntity.init(event);
		SiamangEntity.init(event);
		StagBeetleEntity.init(event);
		GeckoEntity.init(event);
		MantisShrimpEntity.init(event);
		NakedMoleRatEntity.init(event);
		PotooEntity.init(event);
		TenrecEntity.init(event);
		StarNosedMoleEntity.init(event);
		CaecilianEntity.init(event);
		SeaPigEntity.init(event);
		VontsiraEntity.init(event);
		CobraEntity.init(event);
		MongooseEntity.init(event);
		RattlesnakeEntity.init(event);
		NarwhalEntity.init(event);
		SeaLionEntity.init(event);
		CoyoteEntity.init(event);
		PythonEntity.init(event);
		WisentEntity.init(event);
		RoadrunnerEntity.init(event);
		GenetEntity.init(event);
		CapercaillieEntity.init(event);
		GrouseEntity.init(event);
		TapirEntity.init(event);
		TurkeyEntity.init(event);
		LammergeierEntity.init(event);
		HoopoeEntity.init(event);
		DodoEntity.init(event);
		WoollyRhinocerosEntity.init(event);
		SmilodonEntity.init(event);
		ProcoptodonEntity.init(event);
		MarsupialLionEntity.init(event);
		ThylacineEntity.init(event);
		WildBoarEntity.init(event);
		WolverineEntity.init(event);
		StoatEntity.init(event);
		WeaselEntity.init(event);
		CorsacFoxEntity.init(event);
		SkunkEntity.init(event);
		ManedWolfEntity.init(event);
		MuskDeerEntity.init(event);
		QuailEntity.init(event);
		WhaleSharkEntity.init(event);
		TerrapinEntity.init(event);
		AnoleEntity.init(event);
		AgamaEntity.init(event);
		MolochEntity.init(event);
		LeafTailedGeckoEntity.init(event);
		ChameleonEntity.init(event);
		CarpEntity.init(event);
		LeopardEntity.init(event);
		SaolaEntity.init(event);
		PronghornEntity.init(event);
		DogEntity.init(event);
		SwallowEntity.init(event);
		BeaverEntity.init(event);
		GrassSnakeEntity.init(event);
		CoralSnakeEntity.init(event);
		SiskinEntity.init(event);
		CardinalEntity.init(event);
		CanaryEntity.init(event);
		KoalaEntity.init(event);
		HareEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ZEBRA.get(), ZebraEntity.createAttributes().build());
		event.put(ECHIDNA.get(), EchidnaEntity.createAttributes().build());
		event.put(BROWN_BEAR.get(), BrownBearEntity.createAttributes().build());
		event.put(HEDGEHOG.get(), HedgehogEntity.createAttributes().build());
		event.put(DEER.get(), DeerEntity.createAttributes().build());
		event.put(SQUIRREL.get(), SquirrelEntity.createAttributes().build());
		event.put(GIRAFFE.get(), GiraffeEntity.createAttributes().build());
		event.put(MAMMOTH.get(), MammothEntity.createAttributes().build());
		event.put(PHEASANT.get(), PheasantEntity.createAttributes().build());
		event.put(PLATYPUS.get(), PlatypusEntity.createAttributes().build());
		event.put(LION.get(), LionEntity.createAttributes().build());
		event.put(TIGER.get(), TigerEntity.createAttributes().build());
		event.put(BARRELEYE.get(), BarreleyeEntity.createAttributes().build());
		event.put(ELEPHANT.get(), ElephantEntity.createAttributes().build());
		event.put(CRANE.get(), CraneEntity.createAttributes().build());
		event.put(SNAKE.get(), SnakeEntity.createAttributes().build());
		event.put(STORK.get(), StorkEntity.createAttributes().build());
		event.put(WOODPECKER.get(), WoodpeckerEntity.createAttributes().build());
		event.put(BUFFALO.get(), BuffaloEntity.createAttributes().build());
		event.put(SITATUNGA.get(), SitatungaEntity.createAttributes().build());
		event.put(FOSSA.get(), FossaEntity.createAttributes().build());
		event.put(CHAMOIS.get(), ChamoisEntity.createAttributes().build());
		event.put(SNAIL.get(), SnailEntity.createAttributes().build());
		event.put(SNOW_LEOPARD.get(), SnowLeopardEntity.createAttributes().build());
		event.put(CHIMPANZEE.get(), ChimpanzeeEntity.createAttributes().build());
		event.put(AYE_AYE.get(), AyeAyeEntity.createAttributes().build());
		event.put(CAPYBARA.get(), CapybaraEntity.createAttributes().build());
		event.put(SAIGA.get(), SaigaEntity.createAttributes().build());
		event.put(MONKEY.get(), MonkeyEntity.createAttributes().build());
		event.put(MANTIS.get(), MantisEntity.createAttributes().build());
		event.put(OSTRICH.get(), OstrichEntity.createAttributes().build());
		event.put(SEAL.get(), SealEntity.createAttributes().build());
		event.put(REINDEER.get(), ReindeerEntity.createAttributes().build());
		event.put(LEMMING.get(), LemmingEntity.createAttributes().build());
		event.put(GAZELLE.get(), GazelleEntity.createAttributes().build());
		event.put(CHEETAH.get(), CheetahEntity.createAttributes().build());
		event.put(HUMMINGBIRD.get(), HummingbirdEntity.createAttributes().build());
		event.put(SECRETARYBIRD.get(), SecretarybirdEntity.createAttributes().build());
		event.put(MOOSE.get(), MooseEntity.createAttributes().build());
		event.put(RED_PANDA.get(), RedPandaEntity.createAttributes().build());
		event.put(RACCOON.get(), RaccoonEntity.createAttributes().build());
		event.put(SLOTH.get(), SlothEntity.createAttributes().build());
		event.put(BINTURONG.get(), BinturongEntity.createAttributes().build());
		event.put(BADGER.get(), BadgerEntity.createAttributes().build());
		event.put(HERON.get(), HeronEntity.createAttributes().build());
		event.put(CRAB.get(), CrabEntity.createAttributes().build());
		event.put(TORTOISE.get(), TortoiseEntity.createAttributes().build());
		event.put(OKAPI.get(), OkapiEntity.createAttributes().build());
		event.put(TANUKI.get(), TanukiEntity.createAttributes().build());
		event.put(KANGAROO.get(), KangarooEntity.createAttributes().build());
		event.put(GHARIAL.get(), GharialEntity.createAttributes().build());
		event.put(ORANGUTAN.get(), OrangutanEntity.createAttributes().build());
		event.put(LOPHORINA.get(), LophorinaEntity.createAttributes().build());
		event.put(AARDVARK.get(), AardvarkEntity.createAttributes().build());
		event.put(PANGOLIN.get(), PangolinEntity.createAttributes().build());
		event.put(BUTTERFLY.get(), ButterflyEntity.createAttributes().build());
		event.put(MAGPIE.get(), MagpieEntity.createAttributes().build());
		event.put(HIPPOPOTAMUS.get(), HippopotamusEntity.createAttributes().build());
		event.put(TITMOUSE.get(), TitmouseEntity.createAttributes().build());
		event.put(SPARROW.get(), SparrowEntity.createAttributes().build());
		event.put(ROBIN.get(), RobinEntity.createAttributes().build());
		event.put(CHAFFINCH.get(), ChaffinchEntity.createAttributes().build());
		event.put(BULLFINCH.get(), BullfinchEntity.createAttributes().build());
		event.put(KIWI.get(), KiwiEntity.createAttributes().build());
		event.put(CROW.get(), CrowEntity.createAttributes().build());
		event.put(RAVEN.get(), RavenEntity.createAttributes().build());
		event.put(JAY.get(), JayEntity.createAttributes().build());
		event.put(RHINOCEROS.get(), RhinocerosEntity.createAttributes().build());
		event.put(WATERBUCK.get(), WaterbuckEntity.createAttributes().build());
		event.put(PENGUIN.get(), PenguinEntity.createAttributes().build());
		event.put(PEAFOWL.get(), PeafowlEntity.createAttributes().build());
		event.put(WALRUS.get(), WalrusEntity.createAttributes().build());
		event.put(MEERKAT.get(), MeerkatEntity.createAttributes().build());
		event.put(VULTURE.get(), VultureEntity.createAttributes().build());
		event.put(PIGEON.get(), PigeonEntity.createAttributes().build());
		event.put(BELLBIRD.get(), BellbirdEntity.createAttributes().build());
		event.put(LEMUR.get(), LemurEntity.createAttributes().build());
		event.put(ZORSE.get(), ZorseEntity.createAttributes().build());
		event.put(ZONKEY.get(), ZonkeyEntity.createAttributes().build());
		event.put(GORILLA.get(), GorillaEntity.createAttributes().build());
		event.put(MOUSE_LEMUR.get(), MouseLemurEntity.createAttributes().build());
		event.put(GIBBON.get(), GibbonEntity.createAttributes().build());
		event.put(EMU.get(), EmuEntity.createAttributes().build());
		event.put(QUOLL.get(), QuollEntity.createAttributes().build());
		event.put(WOMBAT.get(), WombatEntity.createAttributes().build());
		event.put(BANDICOOT.get(), BandicootEntity.createAttributes().build());
		event.put(NUMBAT.get(), NumbatEntity.createAttributes().build());
		event.put(HAMSTER.get(), HamsterEntity.createAttributes().build());
		event.put(LYNX.get(), LynxEntity.createAttributes().build());
		event.put(BACTRIAN_CAMEL.get(), BactrianCamelEntity.createAttributes().build());
		event.put(PHILIPPINE_EAGLE.get(), PhilippineEagleEntity.createAttributes().build());
		event.put(EAGLE.get(), EagleEntity.createAttributes().build());
		event.put(OSPREY.get(), OspreyEntity.createAttributes().build());
		event.put(MOUSE.get(), MouseEntity.createAttributes().build());
		event.put(OWL.get(), OwlEntity.createAttributes().build());
		event.put(SNOWY_OWL.get(), SnowyOwlEntity.createAttributes().build());
		event.put(PTARMIGAN.get(), PtarmiganEntity.createAttributes().build());
		event.put(HOATZIN.get(), HoatzinEntity.createAttributes().build());
		event.put(DUIKER.get(), DuikerEntity.createAttributes().build());
		event.put(WARTHOG.get(), WarthogEntity.createAttributes().build());
		event.put(CHIRU.get(), ChiruEntity.createAttributes().build());
		event.put(HONEY_BADGER.get(), HoneyBadgerEntity.createAttributes().build());
		event.put(MOHO.get(), MohoEntity.createAttributes().build());
		event.put(BONGO.get(), BongoEntity.createAttributes().build());
		event.put(CATERPILLAR.get(), CaterpillarEntity.createAttributes().build());
		event.put(OCTOPUS.get(), OctopusEntity.createAttributes().build());
		event.put(CLAM.get(), ClamEntity.createAttributes().build());
		event.put(APHID.get(), AphidEntity.createAttributes().build());
		event.put(JUMPING_SPIDER.get(), JumpingSpiderEntity.createAttributes().build());
		event.put(LADYBUG.get(), LadybugEntity.createAttributes().build());
		event.put(EARTHWORM_ENTITY.get(), EarthwormEntityEntity.createAttributes().build());
		event.put(SHELTOPUSIK.get(), SheltopusikEntity.createAttributes().build());
		event.put(ANT.get(), AntEntity.createAttributes().build());
		event.put(KOMODO_DRAGON.get(), KomodoDragonEntity.createAttributes().build());
		event.put(SALAMANDER.get(), SalamanderEntity.createAttributes().build());
		event.put(LIZARD.get(), LizardEntity.createAttributes().build());
		event.put(IGUANA.get(), IguanaEntity.createAttributes().build());
		event.put(SERVAL.get(), ServalEntity.createAttributes().build());
		event.put(PORCUPINE.get(), PorcupineEntity.createAttributes().build());
		event.put(MARABOU.get(), MarabouEntity.createAttributes().build());
		event.put(ORYX.get(), OryxEntity.createAttributes().build());
		event.put(AARDWOLF.get(), AardwolfEntity.createAttributes().build());
		event.put(GERENUK.get(), GerenukEntity.createAttributes().build());
		event.put(HYENA.get(), HyenaEntity.createAttributes().build());
		event.put(CROCODILE.get(), CrocodileEntity.createAttributes().build());
		event.put(FOREST_BUFFALO.get(), ForestBuffaloEntity.createAttributes().build());
		event.put(FENNEC_FOX.get(), FennecFoxEntity.createAttributes().build());
		event.put(KAKAPO.get(), KakapoEntity.createAttributes().build());
		event.put(KAGU.get(), KaguEntity.createAttributes().build());
		event.put(RAT.get(), RatEntity.createAttributes().build());
		event.put(BEE_EATER.get(), BeeEaterEntity.createAttributes().build());
		event.put(BIRD_OF_PARADISE.get(), BirdOfParadiseEntity.createAttributes().build());
		event.put(CASSOWARY.get(), CassowaryEntity.createAttributes().build());
		event.put(TOUCAN.get(), ToucanEntity.createAttributes().build());
		event.put(GREBE.get(), GrebeEntity.createAttributes().build());
		event.put(RHEA.get(), RheaEntity.createAttributes().build());
		event.put(DUCK.get(), DuckEntity.createAttributes().build());
		event.put(MANDARIN_DUCK.get(), MandarinDuckEntity.createAttributes().build());
		event.put(JUNGLEFOWL.get(), JunglefowlEntity.createAttributes().build());
		event.put(HORNBILL.get(), HornbillEntity.createAttributes().build());
		event.put(FRIGATEBIRD.get(), FrigatebirdEntity.createAttributes().build());
		event.put(SPOONBILL.get(), SpoonbillEntity.createAttributes().build());
		event.put(FLAMINGO.get(), FlamingoEntity.createAttributes().build());
		event.put(SHOEBILL.get(), ShoebillEntity.createAttributes().build());
		event.put(PRZEVALSKI_HORSE.get(), PrzevalskiHorseEntity.createAttributes().build());
		event.put(DOMESTIC_GOAT.get(), DomesticGoatEntity.createAttributes().build());
		event.put(GOLDFINCH.get(), GoldfinchEntity.createAttributes().build());
		event.put(SHRIMP.get(), ShrimpEntity.createAttributes().build());
		event.put(YAK.get(), YakEntity.createAttributes().build());
		event.put(IBIS.get(), IbisEntity.createAttributes().build());
		event.put(CRAYFISH.get(), CrayfishEntity.createAttributes().build());
		event.put(FRUIT_BAT.get(), FruitBatEntity.createAttributes().build());
		event.put(PALLAS_CAT.get(), PallasCatEntity.createAttributes().build());
		event.put(JERBOA.get(), JerboaEntity.createAttributes().build());
		event.put(ELEPHANT_SHREW.get(), ElephantShrewEntity.createAttributes().build());
		event.put(FERRET.get(), FerretEntity.createAttributes().build());
		event.put(POLECAT.get(), PolecatEntity.createAttributes().build());
		event.put(SPRINGHARE.get(), SpringhareEntity.createAttributes().build());
		event.put(OTTER.get(), OtterEntity.createAttributes().build());
		event.put(MARA.get(), MaraEntity.createAttributes().build());
		event.put(PUFFIN.get(), PuffinEntity.createAttributes().build());
		event.put(MARMOT.get(), MarmotEntity.createAttributes().build());
		event.put(BLUE_WHALE.get(), BlueWhaleEntity.createAttributes().build());
		event.put(ORCA.get(), OrcaEntity.createAttributes().build());
		event.put(BELUGA_WHALE.get(), BelugaWhaleEntity.createAttributes().build());
		event.put(BELUGA_STURGEON.get(), BelugaSturgeonEntity.createAttributes().build());
		event.put(SEA_OTTER.get(), SeaOtterEntity.createAttributes().build());
		event.put(SEAGULL.get(), SeagullEntity.createAttributes().build());
		event.put(BOOBY.get(), BoobyEntity.createAttributes().build());
		event.put(SAWFISH.get(), SawfishEntity.createAttributes().build());
		event.put(WHITE_SHARK.get(), WhiteSharkEntity.createAttributes().build());
		event.put(PADDLEFISH.get(), PaddlefishEntity.createAttributes().build());
		event.put(HUMPBACK_WHALE.get(), HumpbackWhaleEntity.createAttributes().build());
		event.put(FIDDLER_CRAB.get(), FiddlerCrabEntity.createAttributes().build());
		event.put(SWAN.get(), SwanEntity.createAttributes().build());
		event.put(TARSIER.get(), TarsierEntity.createAttributes().build());
		event.put(MANATEE.get(), ManateeEntity.createAttributes().build());
		event.put(PUMA.get(), PumaEntity.createAttributes().build());
		event.put(CARACAL.get(), CaracalEntity.createAttributes().build());
		event.put(CLOUDED_LEOPARD.get(), CloudedLeopardEntity.createAttributes().build());
		event.put(ANTEATER.get(), AnteaterEntity.createAttributes().build());
		event.put(JAGUAR.get(), JaguarEntity.createAttributes().build());
		event.put(FLYING_SQUIRREL.get(), FlyingSquirrelEntity.createAttributes().build());
		event.put(SEAHORSE.get(), SeahorseEntity.createAttributes().build());
		event.put(SEADRAGON.get(), SeadragonEntity.createAttributes().build());
		event.put(SUGAR_GLIDER.get(), SugarGliderEntity.createAttributes().build());
		event.put(MOLE.get(), MoleEntity.createAttributes().build());
		event.put(JELLYFISH.get(), JellyfishEntity.createAttributes().build());
		event.put(DRAGONFLY.get(), DragonflyEntity.createAttributes().build());
		event.put(PROBOSCIS_MONKEY.get(), ProboscisMonkeyEntity.createAttributes().build());
		event.put(HAMADRYAS_BABOON.get(), HamadryasBaboonEntity.createAttributes().build());
		event.put(CHACMA_BABOON.get(), ChacmaBaboonEntity.createAttributes().build());
		event.put(OLIVE_BABOON.get(), OliveBaboonEntity.createAttributes().build());
		event.put(SIAMANG.get(), SiamangEntity.createAttributes().build());
		event.put(STAG_BEETLE.get(), StagBeetleEntity.createAttributes().build());
		event.put(GECKO.get(), GeckoEntity.createAttributes().build());
		event.put(MANTIS_SHRIMP.get(), MantisShrimpEntity.createAttributes().build());
		event.put(NAKED_MOLE_RAT.get(), NakedMoleRatEntity.createAttributes().build());
		event.put(POTOO.get(), PotooEntity.createAttributes().build());
		event.put(TENREC.get(), TenrecEntity.createAttributes().build());
		event.put(STAR_NOSED_MOLE.get(), StarNosedMoleEntity.createAttributes().build());
		event.put(CAECILIAN.get(), CaecilianEntity.createAttributes().build());
		event.put(SEA_PIG.get(), SeaPigEntity.createAttributes().build());
		event.put(VONTSIRA.get(), VontsiraEntity.createAttributes().build());
		event.put(COBRA.get(), CobraEntity.createAttributes().build());
		event.put(MONGOOSE.get(), MongooseEntity.createAttributes().build());
		event.put(RATTLESNAKE.get(), RattlesnakeEntity.createAttributes().build());
		event.put(NARWHAL.get(), NarwhalEntity.createAttributes().build());
		event.put(SEA_LION.get(), SeaLionEntity.createAttributes().build());
		event.put(COYOTE.get(), CoyoteEntity.createAttributes().build());
		event.put(PYTHON.get(), PythonEntity.createAttributes().build());
		event.put(WISENT.get(), WisentEntity.createAttributes().build());
		event.put(ROADRUNNER.get(), RoadrunnerEntity.createAttributes().build());
		event.put(GENET.get(), GenetEntity.createAttributes().build());
		event.put(CAPERCAILLIE.get(), CapercaillieEntity.createAttributes().build());
		event.put(GROUSE.get(), GrouseEntity.createAttributes().build());
		event.put(TAPIR.get(), TapirEntity.createAttributes().build());
		event.put(TURKEY.get(), TurkeyEntity.createAttributes().build());
		event.put(LAMMERGEIER.get(), LammergeierEntity.createAttributes().build());
		event.put(HOOPOE.get(), HoopoeEntity.createAttributes().build());
		event.put(DODO.get(), DodoEntity.createAttributes().build());
		event.put(WOOLLY_RHINOCEROS.get(), WoollyRhinocerosEntity.createAttributes().build());
		event.put(SMILODON.get(), SmilodonEntity.createAttributes().build());
		event.put(PROCOPTODON.get(), ProcoptodonEntity.createAttributes().build());
		event.put(MARSUPIAL_LION.get(), MarsupialLionEntity.createAttributes().build());
		event.put(THYLACINE.get(), ThylacineEntity.createAttributes().build());
		event.put(WILD_BOAR.get(), WildBoarEntity.createAttributes().build());
		event.put(WOLVERINE.get(), WolverineEntity.createAttributes().build());
		event.put(STOAT.get(), StoatEntity.createAttributes().build());
		event.put(WEASEL.get(), WeaselEntity.createAttributes().build());
		event.put(CORSAC_FOX.get(), CorsacFoxEntity.createAttributes().build());
		event.put(SKUNK.get(), SkunkEntity.createAttributes().build());
		event.put(MANED_WOLF.get(), ManedWolfEntity.createAttributes().build());
		event.put(MUSK_DEER.get(), MuskDeerEntity.createAttributes().build());
		event.put(QUAIL.get(), QuailEntity.createAttributes().build());
		event.put(WHALE_SHARK.get(), WhaleSharkEntity.createAttributes().build());
		event.put(TERRAPIN.get(), TerrapinEntity.createAttributes().build());
		event.put(ANOLE.get(), AnoleEntity.createAttributes().build());
		event.put(AGAMA.get(), AgamaEntity.createAttributes().build());
		event.put(MOLOCH.get(), MolochEntity.createAttributes().build());
		event.put(LEAF_TAILED_GECKO.get(), LeafTailedGeckoEntity.createAttributes().build());
		event.put(CHAMELEON.get(), ChameleonEntity.createAttributes().build());
		event.put(CARP.get(), CarpEntity.createAttributes().build());
		event.put(LEOPARD.get(), LeopardEntity.createAttributes().build());
		event.put(SAOLA.get(), SaolaEntity.createAttributes().build());
		event.put(PRONGHORN.get(), PronghornEntity.createAttributes().build());
		event.put(DOG.get(), DogEntity.createAttributes().build());
		event.put(SWALLOW.get(), SwallowEntity.createAttributes().build());
		event.put(BEAVER.get(), BeaverEntity.createAttributes().build());
		event.put(GRASS_SNAKE.get(), GrassSnakeEntity.createAttributes().build());
		event.put(CORAL_SNAKE.get(), CoralSnakeEntity.createAttributes().build());
		event.put(SISKIN.get(), SiskinEntity.createAttributes().build());
		event.put(CARDINAL.get(), CardinalEntity.createAttributes().build());
		event.put(CANARY.get(), CanaryEntity.createAttributes().build());
		event.put(KOALA.get(), KoalaEntity.createAttributes().build());
		event.put(HARE.get(), HareEntity.createAttributes().build());
	}
}
