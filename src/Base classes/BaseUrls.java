interface BaseUrls {
    private String guildsUrl, channelsUrl, meUrl, token, guildId;

    public String getGuildsUrl();

    public BaseUrls(String guildsUrl, String channelsUrl, String meUrl,token) {
        this.guildsUrl = guildsUrl;
        this.channelsUrl = channelsUrl;
        this.meUrl = meUrl;
        this.token = token;
    }

    public BaseUrls(String guildId, token) {
        this.token = token
        this.guildsUrl = "https://discord.com/api/v10/guilds"
        this.channelsUrl = "https://discord.com/api/v9/guilds/"+guildId+"/channels";
        this.meUrl = "https://discord.com/api/v10/users/@me";
    }

    public String getChannelsUrl();

    public String getMeUrl();
}