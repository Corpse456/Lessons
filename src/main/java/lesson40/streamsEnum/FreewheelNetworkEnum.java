package lesson40.streamsEnum;

public enum FreewheelNetworkEnum {

    NETWORK_TEST("freewheel-test-network"), NETWORK_LIVE("freewheel-live-network"), NETWORK_INTL(
	    "freewheel-intl-network");

    /**
     * name of the network used at configuration properties, which is mapped to
     * this Enum
     */
    private final String configurationProperty;

    FreewheelNetworkEnum(String configurationProperty) {
	this.configurationProperty = configurationProperty;
    }

    /**
     * @return the Title value at Feed Configuration at Arc response, which is
     *         mapped to this Enum
     */
    public String getArcTitleTagValue() {
	return configurationProperty;
    }

    public static FreewheelNetworkEnum fromConfigProperty(String configProperty) {
	for (FreewheelNetworkEnum e : FreewheelNetworkEnum.values()) {
	    if (e.configurationProperty.equals(configProperty)) {
		return e;
	    }
	}
	throw new IllegalArgumentException("No freewheel network mapped to the property = " + configProperty);
    }

    public FreewheelNetworkEnum fromArcTitleTagValue(String arcTag) {
	return fromConfigProperty(arcTag);
    }

}
