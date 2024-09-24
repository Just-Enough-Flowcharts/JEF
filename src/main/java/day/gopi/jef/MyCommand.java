package day.gopi.jef;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class MyCommand implements ICommand {

    @Override
    public int compareTo(ICommand arg0) {
        return 0;
    }

    @Override
    public String getName() {
        return "mycommand";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/mycommand";
    }

    @Override
    public List<String> getAliases() {
        List<String> aliases = new ArrayList<String>();
        aliases.add("mycommand");
        return aliases;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        // System.out.println("Args: " + args.toString());

        // ForgeRegistries.ITEMS.forEach(a -> System.out.println(a.getRegistryName().toString()));

        ForgeRegistries.RECIPES.forEach(a -> {
            String recipeOutput = a.getRegistryName().toString();
            String trueRecipe = a.getRecipeOutput().toString();
            // String recipeInput = "";
            System.out.println(recipeOutput + "|" + trueRecipe + " is made using: ");
            a.getIngredients().forEach(b -> {
                System.out.println(b.hashCode());
            });
        });
        
        System.out.println("Task complete!");
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args,
            @Nullable BlockPos targetPos) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }
    
}
