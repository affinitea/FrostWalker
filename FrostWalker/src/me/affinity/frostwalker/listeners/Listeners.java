package me.affinity.frostwalker.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Bee;
import org.bukkit.entity.Cat;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cod;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Dolphin;
import org.bukkit.entity.Donkey;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fox;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Husk;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Llama;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.Panda;
import org.bukkit.entity.Pig;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.PolarBear;
import org.bukkit.entity.PufferFish;
import org.bukkit.entity.Salmon;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Stray;
import org.bukkit.entity.TropicalFish;
import org.bukkit.entity.Turtle;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import me.affinity.frostwalker.Main;

public class Listeners implements Listener{
	
	private Main plugin;
	
	public Listeners(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void creatureSpawn(CreatureSpawnEvent event) {
		
		ItemStack boots = new ItemStack(Material.LEATHER_BOOTS); //Makes the iron helmet itemstack
		boots.addEnchantment(Enchantment.FROST_WALKER, 2);
		
		if(event.getEntityType() == EntityType.DROWNED) {
			Drowned d = (Drowned) event.getEntity();
		
			d.getEquipment().setBoots(new ItemStack(boots));
			d.getPotionEffect(PotionEffectType.FIRE_RESISTANCE);
		}
		
		if(event.getEntityType() == EntityType.ZOMBIFIED_PIGLIN) {
			PigZombie pz = (PigZombie) event.getEntity();
		
			pz.getEquipment().setBoots(new ItemStack(boots));
		}
		
		if(event.getEntityType() == EntityType.CREEPER) {
			Creeper c = (Creeper) event.getEntity();
		
			c.getEquipment().setBoots(new ItemStack(boots));
		}
		
		if(event.getEntityType() == EntityType.ZOMBIE) {
			  Zombie z = (Zombie) event.getEntity();

			  z.getEquipment().setBoots(new ItemStack(boots));
			  z.getPotionEffect(PotionEffectType.FIRE_RESISTANCE);
		}

		if(event.getEntityType() == EntityType.HUSK) {
			  Husk h = (Husk) event.getEntity();

			  h.getEquipment().setBoots(new ItemStack(boots));
		}

		if(event.getEntityType() == EntityType.SKELETON) {
			  Skeleton s = (Skeleton) event.getEntity();

			  s.getEquipment().setBoots(new ItemStack(boots));
			  s.getPotionEffect(PotionEffectType.FIRE_RESISTANCE);
		}

		if(event.getEntityType() == EntityType.SLIME) {
			  Slime sl = (Slime) event.getEntity();

			  sl.getEquipment().setBoots(new ItemStack(boots));
		}

		if(event.getEntityType() == EntityType.STRAY) {
			  Stray str = (Stray) event.getEntity();

			  str.getEquipment().setBoots(new ItemStack(boots));
			  str.getPotionEffect(PotionEffectType.FIRE_RESISTANCE);
		}
		
			if(event.getEntityType() == EntityType.BEE) {
			  Bee bee = (Bee) event.getEntity();

			  bee.getEquipment().setBoots(new ItemStack(boots));			
		}

		if(event.getEntityType() == EntityType.CAVE_SPIDER) {
			  CaveSpider cs = (CaveSpider) event.getEntity();

			  cs.getEquipment().setBoots(new ItemStack(boots));
		}
		
		if(event.getEntityType() == EntityType.DOLPHIN) {
			  Dolphin dol = (Dolphin) event.getEntity();

			  dol.getEquipment().setBoots(new ItemStack(boots));;
			}

		if(event.getEntityType() == EntityType.ENDERMAN) {
			  Enderman ender_daddy = (Enderman) event.getEntity();

			  ender_daddy.getEquipment().setBoots(new ItemStack(boots));
			  ender_daddy.getPotionEffect(PotionEffectType.FIRE_RESISTANCE);
		}

		if(event.getEntityType() == EntityType.IRON_GOLEM) {
			  IronGolem ig = (IronGolem) event.getEntity();

			  ig.getEquipment().setBoots(new ItemStack(boots));

		}

		if(event.getEntityType() == EntityType.LLAMA) {
			  Llama ll = (Llama) event.getEntity();

			  ll.getEquipment().setBoots(new ItemStack(boots));
		}

		if(event.getEntityType() == EntityType.PANDA) {
			  Panda pan = (Panda) event.getEntity();

			  pan.getEquipment().setBoots(new ItemStack(boots));
		}

		if(event.getEntityType() == EntityType.POLAR_BEAR) {
			  PolarBear pb = (PolarBear) event.getEntity();

			  pb.getEquipment().setBoots(new ItemStack(boots));
		}

		if(event.getEntityType() == EntityType.SPIDER) {
			  Spider spidey = (Spider) event.getEntity();

			  spidey.getEquipment().setBoots(new ItemStack(boots));
		}

		if(event.getEntityType() == EntityType.WOLF) {
			  Wolf w = (Wolf) event.getEntity();

			  w.getEquipment().setBoots(new ItemStack(boots));
		}

		if(event.getEntityType() == EntityType.BAT) {
			  Bat bat = (Bat) event.getEntity();

			  bat.getEquipment().setBoots(new ItemStack(boots));
		}

		if(event.getEntityType() == EntityType.CAT) {
			  Cat cat = (Cat) event.getEntity();

			  cat.getEquipment().setBoots(new ItemStack(boots));
		}

		if(event.getEntityType() == EntityType.CHICKEN) {
			  Chicken ch = (Chicken) event.getEntity();

			  ch.getEquipment().setBoots(new ItemStack(boots));
		}

		if(event.getEntityType() == EntityType.COD) {
			  Cod cod = (Cod) event.getEntity();

			  cod.getEquipment().setBoots(new ItemStack(boots));
		}

		if(event.getEntityType() == EntityType.COW) {
			  Cow cow = (Cow) event.getEntity();

			  cow.getEquipment().setBoots(new ItemStack(boots));
		}

		if(event.getEntityType() == EntityType.BAT) {
			  Bat bat = (Bat) event.getEntity();

			  bat.getEquipment().setBoots(new ItemStack(boots));
		}
		
		if(event.getEntityType() == EntityType.DONKEY) {
			  Donkey don = (Donkey) event.getEntity();

			  don.getEquipment().setBoots(new ItemStack(boots));;
		}

		if(event.getEntityType() == EntityType.FOX) {
			  Fox fox = (Fox) event.getEntity();

			  fox.getEquipment().setBoots(new ItemStack(boots));;
		}

		if(event.getEntityType() == EntityType.HORSE) {
			  Horse hor = (Horse) event.getEntity();

			  hor.getEquipment().setBoots(new ItemStack(boots));;
		}

		if(event.getEntityType() == EntityType.MUSHROOM_COW) {
			  MushroomCow mc = (MushroomCow) event.getEntity();

			  mc.getEquipment().setBoots(new ItemStack(boots));;
		}

		if(event.getEntityType() == EntityType.PIG) {
			  Pig pig = (Pig) event.getEntity();

			  pig.getEquipment().setBoots(new ItemStack(boots));;
		}

		if(event.getEntityType() == EntityType.PUFFERFISH) {
			  PufferFish puff = (PufferFish) event.getEntity();

			  puff.getEquipment().setBoots(new ItemStack(boots));;
		}

		if(event.getEntityType() == EntityType.SALMON) {
			  Salmon sal = (Salmon) event.getEntity();

			  sal.getEquipment().setBoots(new ItemStack(boots));;
		}

		if(event.getEntityType() == EntityType.SHEEP) {
			  Sheep wool = (Sheep) event.getEntity();

			  wool.getEquipment().setBoots(new ItemStack(boots));;
		}

		if(event.getEntityType() == EntityType.SQUID) {
			  Squid squidward = (Squid) event.getEntity();

			  squidward.getEquipment().setBoots(new ItemStack(boots));;
		}

		if(event.getEntityType() == EntityType.TROPICAL_FISH) {
			  TropicalFish tf = (TropicalFish) event.getEntity();

			  tf.getEquipment().setBoots(new ItemStack(boots));;
		}

		if(event.getEntityType() == EntityType.TURTLE) {
			  Turtle dave = (Turtle) event.getEntity();

			  dave.getEquipment().setBoots(new ItemStack(boots));;
		}

		if(event.getEntityType() == EntityType.VILLAGER) {
			  Villager vil = (Villager) event.getEntity();

			  vil.getEquipment().setBoots(new ItemStack(boots));;
		}
		
	}

}
