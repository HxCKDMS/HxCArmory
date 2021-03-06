package HxCKDMS.HxCTools.Handling;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.List;

public class CraftingRecipes {
	public static void createRecipes() {
        List RecipeList = CraftingManager.getInstance().getRecipeList();
		//Aventurine
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.AventurineAxe, new String[]
				{" GG", " SG", " S "},
				'G', "gemAventurine", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.AventurineSword, new String[]
				{" G ", " G ", " S "},
				'G', "gemAventurine", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.AventurinePickaxe, new String[]
				{"GGG", " S ", " S "},
				'G', "gemAventurine", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.AventurineSpade, new String[]
				{" G ", " S ", " S "},
				'G', "gemAventurine", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.AventurineHoe, new String[]
				{" GG", " S ", " S "},
				'G', "gemAventurine", 'S', "stick"
		));
		
		//Sapphire
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.SapphireAxe, new String[]
				{" GG", " SG", " S "},
				'G', "gemSapphire", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.SapphireSword, new String[]
				{" G ", " G ", " S "},
				'G', "gemSapphire", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.SapphirePickaxe, new String[]
				{"GGG", " S ", " S "},
				'G', "gemSapphire", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.SapphireSpade, new String[]
				{" G ", " S ", " S "},
				'G', "gemSapphire", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.SapphireHoe, new String[]
				{" GG", " S ", " S "},
				'G', "gemSapphire", 'S', "stick"
		));
		
		//Ruby
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.RubyAxe, new String[]
				{" GG", " SG", " S "},
				'G', "gemRuby", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.RubySword, new String[]
				{" G ", " G ", " S "},
				'G', "gemRuby", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.RubyPickaxe, new String[]
				{"GGG", " S ", " S "},
				'G', "gemRuby", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.RubySpade, new String[]
				{" G ", " S ", " S "},
				'G', "gemRuby", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.RubyHoe, new String[]
				{" GG", " S ", " S "},
				'G', "gemRuby", 'S', "stick"
		));

		//Obsidian
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.ObsidianAxe, new String[]
				{" OO", " SO", " S "},
				'O', "obsidian", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.ObsidianSword, new String[]
				{" O ", " O ", " S "},
				'O', "obsidian", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.ObsidianPickaxe, new String[]
				{"OOO", " S ", " S "},
				'O', "obsidian", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.ObsidianSpade, new String[]
				{" O ", " S ", " S "},
				'O', "obsidian", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.ObsidianHoe, new String[]
				{" OO", " S ", " S "},
				'O', "obsidian", 'S', "stick"
		));

		//Steel
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.SteelAxe, new String[]
				{" II", " SI", " S "},
				'I', "ingotSteel", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.SteelSword, new String[]
				{" I ", " I ", " S "},
				'I', "ingotSteel", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.SteelPickaxe, new String[]
				{"III", " S ", " S "},
				'I', "ingotSteel", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.SteelSpade, new String[]
				{" I ", " S ", " S "},
				'I', "ingotSteel", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.SteelHoe, new String[]
				{" II", " S ", " S "},
				'I', "ingotSteel", 'S', "stick"
		));

		//Titanium
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.TitaniumAxe, new String[]
				{" II", " SI", " S "},
				'I', "ingotTitanium", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.TitaniumSword, new String[]
				{" I ", " I ", " S "},
				'I', "ingotTitanium", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.TitaniumPickaxe, new String[]
				{"III", " S ", " S "},
				'I', "ingotTitanium", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.TitaniumSpade, new String[]
				{" I ", " S ", " S "},
				'I', "ingotTitanium", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.TitaniumHoe, new String[]
				{" II", " S ", " S "},
				'I', "ingotTitanium", 'S', "stick"
		));
		
		//Bronze
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.BronzeAxe, new String[]
				{" II", " SI", " S "},
				'I', "ingotBronze", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.BronzeSword, new String[]
				{" I ", " I ", " S "},
				'I', "ingotBronze", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.BronzePickaxe, new String[]
				{"III", " S ", " S "},
				'I', "ingotBronze", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.BronzeSpade, new String[]
				{" I ", " S ", " S "},
				'I', "ingotBronze", 'S', "stick"
		));
		RecipeList.add(new ShapedOreRecipe(ContentRegistry.BronzeHoe, new String[]
				{" II", " S ", " S "},
				'I', "ingotBronze", 'S', "stick"
		));

        GameRegistry.addShapedRecipe(new ItemStack(Blocks.obsidian, 4), new Object[]{
                " H ", " O ", " O ", 'O', Blocks.stone, 'H', ContentRegistry.Hammer});
	}
}