package T11_MoreInformations.TaskEnum.Task3;

public class Main {
    public static void main(String[] args) {
        System.out.println(getPopulationPercent(Continent.ASIA));
    }
    public static String getPopulationPercent(Continent continent) {
        String result = "Такого материка не существует.";

        switch (continent){
            case ASIA:
                result = "59.5%";
                break;
            case AFRICA:
                result = "16.9%";
                break;
            case EUROPE:
                result = "9.7%";
                break;
            case AUSTRALIA:
                result = "0.5%";
                break;
            case ANTARCTICA:
                result = "<0.1%";
                break;
            case NORTH_AMERICA:
                result = "7.7%";
                break;
            case SOUTH_AMERICA:
                result = "5.6%";
                break;
        }
        return result;
    }
}

