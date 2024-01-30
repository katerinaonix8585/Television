import java.util.ArrayList;


public class Television {

    private String brand;
    private String model;

    private ArrayList<Channel> channels;

    public Television(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.channels = new ArrayList<>();
    }

    public void addChannel (Channel channel){
        channels.add(channel);
    }

    public String on(int channelNumber){
        return String.format("Сейчас канал №%d \"%s\" транслирует передачу %s", channels.get(channelNumber-1).getNumberChannel(),
                channels.get(channelNumber-1).getNameChannel(), channels.get(channelNumber-1).on());
    }


}
