package mattparks.mods.venus.world.gen;

import mattparks.mods.venus.entities.GCVenusEntityEvolvedBlaze;
import micdoodle8.mods.galacticraft.core.entities.GCCoreEntityCreeper;
import micdoodle8.mods.galacticraft.core.entities.GCCoreEntitySpider;
import micdoodle8.mods.galacticraft.core.entities.GCCoreEntityZombie;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;

public class GCVenusBiomeGenBase extends BiomeGenBase
{
	public static final BiomeGenBase venusFlat = new GCVenusBiomeGenFlat(103).setBiomeName("venusFlat");

	@SuppressWarnings("unchecked")
	public GCVenusBiomeGenBase(int var1)
	{
		super(var1);
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.add(new SpawnListEntry(GCCoreEntityZombie.class, 5, 1, 1));
		this.spawnableMonsterList.add(new SpawnListEntry(GCCoreEntitySpider.class, 3, 1, 1));
		this.spawnableMonsterList.add(new SpawnListEntry(GCCoreEntityCreeper.class, 2, 1, 1));
		this.spawnableMonsterList.add(new SpawnListEntry(GCVenusEntityEvolvedBlaze.class, 4, 1, 1));
		this.rainfall = 0F;
	}

	@Override
	public GCVenusBiomeGenBase setColor(int var1)
	{
		return (GCVenusBiomeGenBase) super.setColor(var1);
	}

	@Override
	public float getSpawningChance()
	{
		return 0.01F;
	}
}
