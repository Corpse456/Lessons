package lesson41.EnumGrafic.enums;

public enum SeasonEnum {

    WINTER("december"), SPRING("march"), SUMMER, AUTUMN;
    String firstMonth;
    
    SeasonEnum(String firstMonth) { //private по умолчанию
	this.firstMonth = firstMonth;
    }
    
    SeasonEnum() { //private по умолчанию
	firstMonth = "Unknown";
    }

    public String sayWeather() {
	switch (this) {
	case WINTER:
	    return "cold";
	case SPRING:
	    return "rainy";
	case SUMMER:
	    return "hot";
	case AUTUMN:
	    return "rise";
	default:
	    return "";
	}
    }
}
