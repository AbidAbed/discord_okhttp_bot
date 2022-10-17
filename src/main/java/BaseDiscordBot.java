package BaseDiscordBot;
class Guild{
    private String GuildId,token;
    private final String baseurl = "https://discord.com/api/v10/";

    public String getGuildId() {
        return GuildId;
    }

    public Guild(String guildId, String token) {
        GuildId = guildId;
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}