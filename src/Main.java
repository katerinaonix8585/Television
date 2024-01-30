public class Main {
    public static void main(String[] args) {
        Television newTelevision = new Television("SONY", "MP150000");

        Channel channel_1 = new Channel(1, "First Channel");
        channel_1.addProgram(new Program("News"));
        channel_1.addProgram(new Program("About Movie"));
        channel_1.addProgram(new Program("Cartoons"));

        Channel channel_2 = new Channel(2, "Second Channel");
        channel_2.addProgram(new Program("News"));
        channel_2.addProgram(new Program("About Movie"));
        channel_2.addProgram(new Program("Cartoons"));

        Channel channel_3 = new Channel(3, "Third Channel");
        channel_3.addProgram(new Program("News"));
        channel_3.addProgram(new Program("About Movie"));
        channel_3.addProgram(new Program("Cartoons"));

        newTelevision.addChannel(channel_1);
        newTelevision.addChannel(channel_2);
        newTelevision.addChannel(channel_3);

        System.out.println(newTelevision.on(1));

    }
}





 /*
 * Реализовать класс "Телевизор" - TV
 * В телевизоре предусмотреть массив "Канал" - Channel
 * В каждом канале предусмотреть массив телепередач - Program
 * В канал можно добавить программу (по аналогии с добавлением пассажира в автобус)
 * В телевизор можно добавить канал (по аналогии с добавлением пассажира в автобус)
 * У программы есть название
 * В main создать телевизор.
 * Создать три канала, в каждый положить три программы
 * Все три канала положить в телевизор
 * В телевизоре предусмотреть метод on(int channelNumber) - он у канала с номером channelNumber показывает случайную передачу
  * **/