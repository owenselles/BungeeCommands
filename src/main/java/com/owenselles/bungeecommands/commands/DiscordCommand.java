package com.owenselles.bungeecommands.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class DiscordCommand extends Command {

    public DiscordCommand() {
        super("discord");
    }

    @Override
    public void execute(CommandSender commandSender, String[] strings) {
        commandSender.sendMessage(new TextComponent(ChatColor.BLUE + "Join our Discord at https://discord.gg/p2TQZ4t"));
    }
}
