
package com.questapi.restassured;

public class QuestCPIApps
{
    private String icon_url;

    private String developer_name;

    private String[] game_play_preference;

    private String cloud_supported;

    private String app_name;

    private String game_name;

    private String cloud_app_url;

    private String download_url;

    private String platform_name;

    private String package_name;

    private String action;

    private String is_nowgg_login_required;

    private String action_value;

    private String banner_url;

    private String id;

    private String button_text;

    private String app_pkg;
    
    private String data_type;

    public String getData_type() {
		return data_type;
	}

	public void setData_type(String data_type) {
		this.data_type = data_type;
	}

	private Bsx_version_min_max_range_list[] bsx_version_min_max_range_list;

    private String hash_tags;

    private String campaign_id;

    public String getIcon_url ()
    {
        return icon_url;
    }

    public void setIcon_url (String icon_url)
    {
        this.icon_url = icon_url;
    }

    public String getDeveloper_name ()
    {
        return developer_name;
    }

    public void setDeveloper_name (String developer_name)
    {
        this.developer_name = developer_name;
    }

    public String[] getGame_play_preference ()
    {
        return game_play_preference;
    }

    public void setGame_play_preference (String[] game_play_preference)
    {
        this.game_play_preference = game_play_preference;
    }

    public String getCloud_supported ()
    {
        return cloud_supported;
    }

    public void setCloud_supported (String cloud_supported)
    {
        this.cloud_supported = cloud_supported;
    }

    public String getApp_name ()
    {
        return app_name;
    }

    public void setApp_name (String app_name)
    {
        this.app_name = app_name;
    }

    public String getGame_name ()
    {
        return game_name;
    }

    public void setGame_name (String game_name)
    {
        this.game_name = game_name;
    }

    public String getCloud_app_url ()
    {
        return cloud_app_url;
    }

    public void setCloud_app_url (String cloud_app_url)
    {
        this.cloud_app_url = cloud_app_url;
    }

    public String getDownload_url ()
    {
        return download_url;
    }

    public void setDownload_url (String download_url)
    {
        this.download_url = download_url;
    }

    public String getPlatform_name ()
    {
        return platform_name;
    }

    public void setPlatform_name (String platform_name)
    {
        this.platform_name = platform_name;
    }

    public String getPackage_name ()
    {
        return package_name;
    }

    public void setPackage_name (String package_name)
    {
        this.package_name = package_name;
    }

    public String getAction ()
    {
        return action;
    }

    public void setAction (String action)
    {
        this.action = action;
    }

    public String getIs_nowgg_login_required ()
    {
        return is_nowgg_login_required;
    }

    public void setIs_nowgg_login_required (String is_nowgg_login_required)
    {
        this.is_nowgg_login_required = is_nowgg_login_required;
    }

    public String getAction_value ()
    {
        return action_value;
    }

    public void setAction_value (String action_value)
    {
        this.action_value = action_value;
    }

    public String getBanner_url ()
    {
        return banner_url;
    }

    public void setBanner_url (String banner_url)
    {
        this.banner_url = banner_url;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getButton_text ()
    {
        return button_text;
    }

    public void setButton_text (String button_text)
    {
        this.button_text = button_text;
    }

    public String getApp_pkg ()
    {
        return app_pkg;
    }

    public void setApp_pkg (String app_pkg)
    {
        this.app_pkg = app_pkg;
    }

    public Bsx_version_min_max_range_list[] getBsx_version_min_max_range_list ()
    {
        return bsx_version_min_max_range_list;
    }

    public void setBsx_version_min_max_range_list (Bsx_version_min_max_range_list[] bsx_version_min_max_range_list)
    {
        this.bsx_version_min_max_range_list = bsx_version_min_max_range_list;
    }

    public String getHash_tags ()
    {
        return hash_tags;
    }

    public void setHash_tags (String hash_tags)
    {
        this.hash_tags = hash_tags;
    }

    public String getCampaign_id ()
    {
        return campaign_id;
    }

    public void setCampaign_id (String campaign_id)
    {
        this.campaign_id = campaign_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [icon_url = "+icon_url+", developer_name = "+developer_name+", game_play_preference = "+game_play_preference+", cloud_supported = "+cloud_supported+", app_name = "+app_name+", game_name = "+game_name+", cloud_app_url = "+cloud_app_url+", download_url = "+download_url+", platform_name = "+platform_name+", package_name = "+package_name+", action = "+action+", is_nowgg_login_required = "+is_nowgg_login_required+", action_value = "+action_value+", banner_url = "+banner_url+", id = "+id+", button_text = "+button_text+", app_pkg = "+app_pkg+", bsx_version_min_max_range_list = "+bsx_version_min_max_range_list+", hash_tags = "+hash_tags+", campaign_id = "+campaign_id+"]";
    }
}