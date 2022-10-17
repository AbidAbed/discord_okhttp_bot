class BaseUrls {
    private String guildsUrl, channelsUrl, meUrl, token, guildId;

    public String getGuildsUrl() {
        return guildsUrl;
    }

    public BaseUrls(String guildsUrl, String channelsUrl, String meUrl) {
        this.guildsUrl = guildsUrl;
        this.channelsUrl = channelsUrl;
        this.meUrl = meUrl;
        this.token = "Bot OTgwMTk1NjU4NDI4NDY1MTYz.GYNn9J.PNtTODXGj55m69feaOI2W8oXPtxboV6HZ3kC7g";
    }

    public BaseUrls(String guildId) {
        this.token = "Bot OTgwMTk1NjU4NDI4NDY1MTYz.GYNn9J.PNtTODXGj55m69feaOI2W8oXPtxboV6HZ3kC7g";
        this.guildsUrl = "https://discord.com/api/v10/guilds"
        this.channelsUrl = "https://discord.com/api/v9/guilds/"+guildId+"/channels";
        this.meUrl = "https://discord.com/api/v10/users/@me";
    }

    public String getChannelsUrl() {
        return channelsUrl;
    }

    public String getMeUrl() {
        return meUrl;
    }
}